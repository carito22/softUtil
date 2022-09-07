package ec.com.todocompu.ShrimpSoftUtils.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import ec.com.todocompu.ShrimpSoftUtils.UtilsArchivos;
import ec.com.todocompu.ShrimpSoftUtils.UtilsValidacion;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.UsuarioEmpresaReporteTO;
import ec.com.todocompu.ShrimpSoftUtils.web.ArchivoTO;
import java.io.*;
import java.util.zip.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import org.apache.commons.io.FileUtils;

@Service
public class GenericReporteServiceImpl implements GenericReporteService {

    @Override
    public <T> byte[] generarReporte(String modulo, String nombreReporte,
            UsuarioEmpresaReporteTO usuarioEmpresaReporteTO, Map<String, Object> parametros, List<T> list) {
        try {
            String rutaReportes;
            String rutaReportesPersonalizados = UtilsArchivos.getRutaReportes() + modulo + UtilsArchivos.sep
                    + usuarioEmpresaReporteTO.getEmpRutaReportes() + UtilsArchivos.sep;
            File archivoPersonalizado = new File(rutaReportesPersonalizados + nombreReporte);
            if (archivoPersonalizado.exists()) {
                rutaReportes = rutaReportesPersonalizados;
                System.out.println("Ruta reportes: " + rutaReportes + nombreReporte);
            } else {
                rutaReportes = UtilsArchivos.getRutaReportes() + modulo + UtilsArchivos.sep;
                System.out.println("Ruta reportes: " + rutaReportes + nombreReporte);
                File archivoGenerico = new File(rutaReportes + nombreReporte);
                if (!archivoGenerico.exists()) {
                    System.out.println("No se encontro el archivo del reporte!");
                    return null;
                }
            }

            String rutaReporteCabecera = UtilsArchivos.getRutaReportes() + "subreportes-cabeceras" + UtilsArchivos.sep;
            String rutaReporteCabeceraPersonalizado = rutaReporteCabecera + usuarioEmpresaReporteTO.getEmpRutaReportes() + UtilsArchivos.sep;
            File cabeceraPersonalizada = new File(rutaReporteCabeceraPersonalizado + "reportCabeceraGeneral.jasper");

            parametros.put("SUBREPORT_DIR", cabeceraPersonalizada.exists() ? rutaReporteCabeceraPersonalizado : rutaReporteCabecera);
            if (usuarioEmpresaReporteTO != null) {
                if (usuarioEmpresaReporteTO.getEmpCodigo().equals("HX07")) {
                    parametros.put("p_empresa_nombre", usuarioEmpresaReporteTO.getEmpRazonSocial());
                } else {
                    parametros.put("p_empresa_nombre", usuarioEmpresaReporteTO.getEmpNombre());
                }
                parametros.put("p_empresa_ruc", usuarioEmpresaReporteTO.getEmpRuc());
                parametros.put("p_empresa_direccion", usuarioEmpresaReporteTO.getEmpDireccion());
                parametros.put("p_empresa_telefono", usuarioEmpresaReporteTO.getEmpTelefono());
                parametros.put("p_empresa_email", usuarioEmpresaReporteTO.getEmpEmail());
                parametros.put("p_ruta_subreportes", rutaReportes);
                parametros.put("p_usuario_nick", usuarioEmpresaReporteTO.getUsrNick());
                parametros.put("p_fecha_hora", UtilsValidacion.fechaSistema());
                parametros.put("p_logo", UtilsArchivos.getRutaImagen() + usuarioEmpresaReporteTO.getEmpRutaLogo() + ".jpg");
            }
            File file = File.createTempFile(nombreReporte.replaceAll(".jrxml", ""), ".jrprint");
            System.out.println(file.getPath());

            JasperFillManager.fillReportToFile(
                    JasperCompileManager.compileReport(JRXmlLoader.load(rutaReportes + nombreReporte)), file.getPath(),
                    parametros, new JRBeanCollectionDataSource(list));

            byte[] bytes = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytes);
            fileInputStream.close();
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public <T> File generarFile(String modulo, String nombreReporte,
            UsuarioEmpresaReporteTO usuarioEmpresaReporteTO, Map<String, Object> parametros, List<T> list) {
        try {
            String rutaReportes;
            String rutaReportesPersonalizados = UtilsArchivos.getRutaReportes() + modulo + UtilsArchivos.sep
                    + usuarioEmpresaReporteTO.getEmpRutaReportes() + UtilsArchivos.sep;
            File archivoPersonalizado = new File(rutaReportesPersonalizados + nombreReporte);
            if (archivoPersonalizado.exists()) {
                rutaReportes = rutaReportesPersonalizados;
                System.out.println("Ruta reportes: " + rutaReportes + nombreReporte);
            } else {
                rutaReportes = UtilsArchivos.getRutaReportes() + modulo + UtilsArchivos.sep;
                System.out.println("Ruta reportes: " + rutaReportes + nombreReporte);
                File archivoGenerico = new File(rutaReportes + nombreReporte);
                if (!archivoGenerico.exists()) {
                    System.out.println("No se encontro el archivo del reporte!");
                    return null;
                }
            }

            String rutaReporteCabecera = UtilsArchivos.getRutaReportes() + "subreportes-cabeceras" + UtilsArchivos.sep;
            String rutaReporteCabeceraPersonalizado = rutaReporteCabecera + usuarioEmpresaReporteTO.getEmpRutaReportes() + UtilsArchivos.sep;
            File cabeceraPersonalizada = new File(rutaReporteCabeceraPersonalizado + "reportCabeceraGeneral.jasper");

            parametros.put("SUBREPORT_DIR", cabeceraPersonalizada.exists() ? rutaReporteCabeceraPersonalizado : rutaReporteCabecera);
            if (usuarioEmpresaReporteTO != null) {
                if (usuarioEmpresaReporteTO.getEmpCodigo().equals("HX07")) {
                    parametros.put("p_empresa_nombre", usuarioEmpresaReporteTO.getEmpRazonSocial());
                } else {
                    parametros.put("p_empresa_nombre", usuarioEmpresaReporteTO.getEmpNombre());
                }
                parametros.put("p_empresa_ruc", usuarioEmpresaReporteTO.getEmpRuc());
                parametros.put("p_empresa_direccion", usuarioEmpresaReporteTO.getEmpDireccion());
                parametros.put("p_empresa_telefono", usuarioEmpresaReporteTO.getEmpTelefono());
                parametros.put("p_usuario_nick", usuarioEmpresaReporteTO.getUsrNick());
                parametros.put("p_fecha_hora", UtilsValidacion.fechaSistema());
                parametros.put("p_logo", UtilsArchivos.getRutaImagen() + usuarioEmpresaReporteTO.getEmpRutaLogo() + ".jpg");
            }
            File file = File.createTempFile(nombreReporte.replaceAll(".jrxml", ""), ".jrprint");
            System.out.println(file.getPath());

            JasperFillManager.fillReportToFile(
                    JasperCompileManager.compileReport(JRXmlLoader.load(rutaReportes + nombreReporte)), file.getPath(),
                    parametros, new JRBeanCollectionDataSource(list));

            byte[] bytes = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytes);
            fileInputStream.close();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> void generarReporte(String modulo, String nombreReporte, UsuarioEmpresaReporteTO usuarioEmpresaReporteTO,
            Map<String, Object> parametros, List<T> list, HttpServletResponse response) {
        try {
            String rutaReportes = UtilsArchivos.getRutaReportes() + modulo + UtilsArchivos.sep;
            System.out.println("Ruta reportes: " + rutaReportes + nombreReporte);
            parametros.put("SUBREPORT_DIR", rutaReportes);
            if (usuarioEmpresaReporteTO != null) {
                if (usuarioEmpresaReporteTO.getEmpCodigo().equals("HX07")) {
                    parametros.put("p_empresa_nombre", usuarioEmpresaReporteTO.getEmpRazonSocial());
                } else {
                    parametros.put("p_empresa_nombre", usuarioEmpresaReporteTO.getEmpNombre());
                }
                parametros.put("p_empresa_ruc", usuarioEmpresaReporteTO.getEmpRuc());
                parametros.put("p_empresa_direccion", usuarioEmpresaReporteTO.getEmpDireccion());
                parametros.put("p_empresa_telefono", usuarioEmpresaReporteTO.getEmpTelefono());
                parametros.put("p_usuario_nick", usuarioEmpresaReporteTO.getUsrNick());
                parametros.put("p_fecha_hora", UtilsValidacion.fechaSistema());
                parametros.put("p_logo", UtilsArchivos.getRutaImagen() + usuarioEmpresaReporteTO.getEmpRutaLogo() + ".jpg");
            }

            respondeServidor(JasperFillManager.fillReport(
                    JasperCompileManager.compileReport(JRXmlLoader.load(rutaReportes + nombreReporte)), parametros,
                    new JRBeanCollectionDataSource(list)), nombreReporte, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public <T> File generarReporteRIDECorreo(String modulo, String nombreReporte, Map<String, Object> parametros,
            List<T> list) {
        try {
            String rutaReportes = UtilsArchivos.getRutaReportes() + modulo + UtilsArchivos.sep;
            return respondeServidorCorreo(JasperFillManager.fillReport(
                    JasperCompileManager.compileReport(JRXmlLoader.load(rutaReportes + nombreReporte)), parametros,
                    new JRBeanCollectionDataSource(list)), nombreReporte);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public File respondeServidorCorreo(JasperPrint jasperPrint, String nombreReporte) {
        try {
            File file = File.createTempFile(nombreReporte, ".pdf");
            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(file));
            SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
            exporter.setConfiguration(configuration);
            exporter.exportReport();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public File respondeServidorCorreo(File jasperPrint, String nombreReporte) {
        try {
            File file = File.createTempFile(nombreReporte, ".pdf");
            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(file));
            SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
            exporter.setConfiguration(configuration);
            exporter.exportReport();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void respondeServidor(JasperPrint jasperPrint, String nombreReporte, HttpServletResponse response) {
        try {
            response.setContentType("application/pdf");
            response.addHeader("Content-disposition",
                    "attachment; filename=" + nombreReporte.replaceAll(".jrxml", "") + ".pdf");
            System.out.println("nombreReporte  " + nombreReporte);
            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(response.getOutputStream()));
            SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
            exporter.setConfiguration(configuration);
            exporter.exportReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generarReporteXLSAngular(String nombreReporte, HttpServletResponse response) {
        try {
            if (nombreReporte != null) {
                System.out.println(nombreReporte);
                response.setContentType("application/vnd.ms-excel");
                response.addHeader("Content-disposition", "attachment; filename=" + nombreReporte);
                ServletOutputStream servletStream = response.getOutputStream();
                File f = new File(nombreReporte);
                InputStream in = new FileInputStream(f);
                int bit = 256;
                while (bit >= 0) {
                    bit = in.read();
                    servletStream.write(bit);
                }
                servletStream.flush();
                servletStream.close();
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    @Override
    public File respondeServidorXML(String contenido) throws Exception {
        try {
            File archivoCreado = File.createTempFile("xxx", ".xml");
            FileOutputStream fos = new FileOutputStream(archivoCreado);
            OutputStreamWriter out = new OutputStreamWriter(fos, "UTF-8");
            for (int i = 0; i < contenido.length(); i++) {
                out.write(contenido.charAt(i));
            }
            out.close();
            fos.close();
            return archivoCreado;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void generarZip(String nombreZip, List<ArchivoTO> archivos, HttpServletResponse response) throws Exception {
        response.setContentType("application/zip");
        response.addHeader("Content-disposition", "inline; filename=" + nombreZip + ".zip");
        try (ServletOutputStream servletStream = response.getOutputStream()) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ZipOutputStream zos = new ZipOutputStream(baos);
            byte bytes[] = new byte[2048];
            for (ArchivoTO archivo : archivos) {
                FileInputStream fis = new FileInputStream(archivo.getContenido());
                BufferedInputStream bis = new BufferedInputStream(fis);
                zos.putNextEntry(new ZipEntry(archivo.getNombre().concat(".xml")));
                int bytesRead;
                while ((bytesRead = bis.read(bytes)) != -1) {
                    zos.write(bytes, 0, bytesRead);
                }
                zos.closeEntry();
                bis.close();
                fis.close();
            }
            zos.flush();
            baos.flush();
            zos.close();
            baos.close();
            servletStream.write(baos.toByteArray());
            servletStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generarXML(String nombre, File archivo, HttpServletResponse response) throws Exception {
        response.setContentType("text/xml");
        response.addHeader("Content-disposition", "attachment; filename=" + nombre + ".xml");
        ServletOutputStream servletStream = response.getOutputStream();
        FileInputStream bis = new FileInputStream(archivo);
        int bytesRead;
        while ((bytesRead = bis.read()) != -1) {
            servletStream.write(bytesRead);
        }
        servletStream.flush();
        servletStream.close();
        bis.close();
    }

    @Override
    public void generarXMLComprimido(String nombre, File archivo, HttpServletResponse response) throws Exception {
        response.setContentType("text/xml");
        response.addHeader("Content-disposition", "attachment; filename=" + nombre + ".xml");
        ServletOutputStream servletStream = response.getOutputStream();

        //filename is filepath string
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            sb.append(line.trim());
        }
        
        String xml = sb.toString();
        xml = xml.replaceAll("\n", "");
        xml = xml.replaceAll("\t", "");

        FileUtils.writeStringToFile(archivo, xml, "UTF-8");

        FileInputStream bis = new FileInputStream(archivo);
        int bytesRead;
        while ((bytesRead = bis.read()) != -1) {
            servletStream.write(bytesRead);
        }
        servletStream.flush();
        servletStream.close();
        bis.close();
    }

}
