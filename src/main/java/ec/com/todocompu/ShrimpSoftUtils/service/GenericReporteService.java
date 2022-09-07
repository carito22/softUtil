package ec.com.todocompu.ShrimpSoftUtils.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.UsuarioEmpresaReporteTO;
import ec.com.todocompu.ShrimpSoftUtils.web.ArchivoTO;
import net.sf.jasperreports.engine.JasperPrint;

public interface GenericReporteService {

    public <T> byte[] generarReporte(String modulo, String nombreReporte,
            UsuarioEmpresaReporteTO usuarioEmpresaReporteTO, Map<String, Object> parametros, List<T> list);

    public <T> File generarReporteRIDECorreo(String modulo, String nombreReporte, Map<String, Object> parametros,
            List<T> list);

    public void respondeServidor(JasperPrint jasperPrint, String nombreReporte, HttpServletResponse response);

    public void generarReporteXLSAngular(String nombreReporte, HttpServletResponse response);

    public <T> File generarFile(String modulo, String nombreReporte,
            UsuarioEmpresaReporteTO usuarioEmpresaReporteTO, Map<String, Object> parametros, List<T> list);

    public File respondeServidorCorreo(File jasperPrint, String nombreReporte);

    public File respondeServidorXML(String contenido) throws Exception;

    public void generarZip(String nombreZip, List<ArchivoTO> archivos, HttpServletResponse response) throws Exception;

    public void generarXML(String nombre, File archivo, HttpServletResponse response) throws Exception;

    public void generarXMLComprimido(String nombre, File archivo, HttpServletResponse response) throws Exception;

}
