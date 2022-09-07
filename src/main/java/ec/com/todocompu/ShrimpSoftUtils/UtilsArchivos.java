package ec.com.todocompu.ShrimpSoftUtils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;

public class UtilsArchivos {

    private static final Properties p = System.getProperties();
    public static final String sep = p.getProperty("file.separator");
    private static final String rutaRaiz = (p.getProperty("os.name").compareToIgnoreCase("linux") == 0 ? "/opt"
            : p.getProperty("user.home")) + sep + "shrimp" + sep;

    // devuelve la ruta y si no existe la crea
    public static String crearRuta(String ruta) {
        File directorio = new File(ruta);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
        return ruta;
    }

    // devuelve true si elimina el archivo
    public static boolean eliminarArchivo(String archivo) {
        File directorio = new File(archivo);
        return directorio.delete();
    }

    // devuelve una lista de archivos que contiene
    public static List<String> getlistArchivos(String directorio) {
        File f = new File(directorio);
        List<String> list = new ArrayList<String>();
        for (String archivo : f.list()) {
            if (archivo.endsWith(".xml")) {
                list.add(archivo);
            }
        }
        return list;
    }

    public static String getRutaRaiz() {
        return crearRuta(rutaRaiz);
    }

    public static String getRutaReportes() {
        return crearRuta(getRutaRaiz() + "reportes" + sep);
    }

    public static String getRutaReportesRide(String directorio) {
        return crearRuta(getRutaReportes() + "ride" + sep + directorio + sep);
    }

    public static String getRutaDocumentosElectronicos() {
        return crearRuta(getRutaRaiz() + "documentosElectronicos" + sep);
    }

    public static String getRutaCertificadosWebServiceSRI() {
        return crearRuta(getRutaDocumentosElectronicos() + "certificados" + sep);
    }

    public static String getRutaComprobnate() {
        return crearRuta(getRutaDocumentosElectronicos() + "comprobante" + sep);
    }

    public static String getRutaFirmaDigital() {
        return crearRuta(getRutaDocumentosElectronicos() + "firmaDigital" + sep);
    }

    public static String getRutaImagen() {
        return crearRuta(getRutaRaiz() + "imagenes" + sep);
    }

    public static String getRutaImagenEmpleado() {
        return crearRuta(getRutaImagen() + "empleados" + sep);
    }

    public static String getRutaImagenUsuario() {
        return crearRuta(getRutaImagen() + "usuarios" + sep);
    }

    public static String getRutaImagenProducto() {
        return crearRuta(getRutaImagen() + "productos" + sep);
    }

    public static String getRutaLogo() {
        return crearRuta(getRutaImagen() + "logos" + sep);
    }

    public static String getRutaCompra() {
        return crearRuta(getRutaImagen() + "compras" + sep);
    }

    // guarda la imagen en una ruta especifica y si el ancho y alto es diferente
    // de cero la redimenciona a la imagen
    public static String guardarArchivo(byte[] archivo, String nombreArchivo) {
        String mensaje = "";
        try {
            File file = new File(getRutaFirmaDigital() + nombreArchivo);
            if (file.exists()) {
                mensaje = "FEl archivo " + nombreArchivo + " ya existe porfavor intente con otro nombre de archivo";
            } else {
                try (OutputStream out = new FileOutputStream(file)) {
                    out.write(archivo);
                }
                mensaje = "TEl archivo se guardo correctamente";
            }

        } catch (IOException e) {
            e.printStackTrace();
            mensaje = "Error al crear el archivo";
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            mensaje = "No se permite ese archivo";
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    public static String guardarImagen(String ruta, byte[] imagen, String nombreImagen, int ancho, int alto) {
        String mensaje = "";
        try {
            BufferedImage biImagen = ImageIO.read(new ByteArrayInputStream(imagen));
            if (ancho != 0 && alto != 0) {
                biImagen = redimencionarImagen(biImagen, ancho, alto);
            }
            ImageIO.write(biImagen, "jpg", new File(ruta + sep + nombreImagen + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            mensaje = "Error al crear el archivo";
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            mensaje = "No se permite ese archivo";
        }
        return mensaje;
    }

    public static String guardarImagenCalidad(String ruta, String subCarpetaEmpresa, byte[] imagen, String nombreImagen) {
        String mensaje = "";
        int contador = 0;
        try {
            boolean auxiliar = true;
            File subcarpeta = new File(ruta + sep + subCarpetaEmpresa);
            if (!subcarpeta.exists()) {
                subcarpeta.mkdir();
            }
            do {
                File file = new File(ruta + sep + subCarpetaEmpresa + sep + nombreImagen + "_" + contador);
                if (file.exists()) {
                    contador++;
                } else {
                    try (OutputStream out = new FileOutputStream(file)) {
                        out.write(imagen);
                        auxiliar = false;
                    }
                }
            } while (auxiliar);
            mensaje = "TEl archivo se guardo correctamente";
        } catch (IOException e) {
            e.printStackTrace();
            mensaje = "Error al crear el archivo";
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            mensaje = "No se permite ese archivo";
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    public static List<String> obtenerImagenCalidad(String ruta, String subCarpetaEmpresa, String nombreImagen) {
        int contador = 0;
        List<String> listaImagenes = new ArrayList<String>();
        try {
            boolean auxiliar = true;
            File subcarpeta = new File(ruta + sep + subCarpetaEmpresa);
            if (subcarpeta.exists()) {
                do {
                    File file = new File(ruta + sep + subCarpetaEmpresa + sep + nombreImagen + "_" + contador);
                    if (file.exists()) {
                        byte[] data = null;
                        FileInputStream fis = new FileInputStream(file);
                        data = new byte[(int) file.length()];
                        fis.read(data);
                        fis.close();
                        listaImagenes.add(new String(data, "UTF-8"));
                        contador++;
                    } else {
                        auxiliar = false;
                    }

                } while (auxiliar);
            }
            return listaImagenes;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaImagenes;
    }

    public static String eliminarImagenCalidad(String ruta, String subCarpetaEmpresa, String nombreImagen) {
        int contador = 0;
        String mensaje = "";
        try {
            boolean auxiliar = true;
            File subcarpeta = new File(ruta + sep + subCarpetaEmpresa);
            if (subcarpeta.exists()) {
                do {
                    File file = new File(ruta + sep + subCarpetaEmpresa + sep + nombreImagen + "_" + contador);
                    if (file.exists()) {
                        file.delete();
                    } else {
                        auxiliar = false;
                    }
                    contador++;
                } while (auxiliar);
            }
            mensaje = "TEl archivo se elimino correctamente";
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            mensaje = "No se permite ese archivo";
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    public static String eliminarImagen(String ruta, String nombreImagen) {
        String mensaje = "";
        try {
            File file = new File(ruta + sep + nombreImagen + ".jpg");
            if (file.exists()) {
                file.delete();
            }
            mensaje = "TEl archivo se eliminó correctamente";
        } catch (IllegalArgumentException e) {
            mensaje = "No se permite ese archivo";
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    // lee la imagen entrante y la devuelve como BufferedImage
    public static BufferedImage leerImagen(URL ruta) {
        try {
            return ImageIO.read(ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // lee la imagen entrante y la devuelve como BufferedImage
    public static BufferedImage leerImagen(InputStream imagen, String ruta) {
        try {
            if (imagen != null) {
                return ImageIO.read(imagen);
            }
            File directorio = new File(ruta);
            if (directorio.exists()) {
                return ImageIO.read(directorio);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    // lee la imagen entrante y la devuelve como BufferedImage
    public static InputStream leerImagen(String ruta) {
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            BufferedImage bi = leerImagen(null, ruta);
            if (bi != null) {
                ImageIO.write(bi, "png", os);
            }
            return new ByteArrayInputStream(os.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean moverArchivo(String archivo, String archivoFinal) {
        File a = new File(archivo);
        return a.renameTo(new File(archivoFinal));
    }

    // redimenciona a la imagen
    public static BufferedImage redimencionarImagen(BufferedImage imagen, int ancho, int alto) {
        Image img = imagen.getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING);
        BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null),
                BufferedImage.TYPE_INT_RGB);
        bufferedImage.getGraphics().drawImage(img, 0, 0, null);
        return bufferedImage;
    }

    public static File stringToArchivo(String rutaArchivo, String contenidoArchivo) {
        FileOutputStream fos = null;
        File archivoCreado = null;
        int i = 0;
        try {
            System.out.println("" + rutaArchivo);
            fos = new FileOutputStream(rutaArchivo);
            OutputStreamWriter out = new OutputStreamWriter(fos, "UTF-8");
            for (i = 0; i < contenidoArchivo.length(); i++) {
                out.write(contenidoArchivo.charAt(i));
            }
            out.close();
            // archivoCreado = new File(rutaArchivo);
            archivoCreado = File.createTempFile(rutaArchivo, ".xml");
        } catch (Exception ex) {
            Logger.getLogger(UtilsArchivos.class.getName()).log(Level.SEVERE, null, ex);
            i = 0;
            return null;
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception ex) {
                Logger.getLogger(UtilsArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return archivoCreado;
    }

    public static File crearZip(String nombreZip, List<File> archivos) {
        try {
            File file = File.createTempFile(nombreZip + ".zip", ".zip");
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(file));

            for (File archivo : archivos) {
                // AGREGAR EL XML
                byte b[] = new byte[2048];
                FileInputStream in = new FileInputStream(archivo);
                ZipEntry entry = new ZipEntry(archivo.getName());
                zipOut.putNextEntry(entry);
                int len = 0;
                while ((len = in.read(b)) != -1) {
                    zipOut.write(b, 0, len);
                }
            }
            zipOut.closeEntry();
            zipOut.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
