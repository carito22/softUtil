package ec.com.todocompu.ShrimpSoftUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class UtilFile {

	private static FileInputStream in;

	public static void crearXmlFromByte(String nombreArchivo, byte[] contenidoByte) {
		String ruta = System.setProperty("java.io.tmpdir", "/comprobantes") + "/" + nombreArchivo.trim() + ".xml";
		File xmlFile = new File(ruta);
		BufferedWriter contenidoString;
		try {
			contenidoString = new BufferedWriter(new FileWriter(xmlFile));
			contenidoString.write(new String(contenidoByte));
			contenidoString.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void crearZip(String nombreZip, List<String> archivos) {

		try {
			FileOutputStream out = new FileOutputStream(
					System.setProperty("java.io.tmpdir", "/comprobantes") + "/" + nombreZip.trim() + ".zip");
			ZipOutputStream zipOut = new ZipOutputStream(out);

			for (String archivo : archivos) {
				// AGREGAR EL XML
				byte b[] = new byte[2048];
				String inputFile = System.setProperty("java.io.tmpdir", "/comprobantes") + "/" + archivo.trim()
						+ ".xml";
				in = new FileInputStream(inputFile);
				ZipEntry entry = new ZipEntry(inputFile);
				zipOut.putNextEntry(entry);
				int len = 0;
				while ((len = in.read(b)) != -1) {
					zipOut.write(b, 0, len);
				}

				// AGREGAR EL PDF
				b = new byte[2048];
				inputFile = System.setProperty("java.io.tmpdir", "/comprobantes") + "/" + archivo.trim() + ".pdf";
				in = new FileInputStream(inputFile);
				entry = new ZipEntry(inputFile);
				zipOut.putNextEntry(entry);
				len = 0;
				while ((len = in.read(b)) != -1) {
					zipOut.write(b, 0, len);
				}
			}
			zipOut.closeEntry();
			zipOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// public static void generarComprobantePdfFromXml(String empresa,
	// String claveAcceso, String numeroAutorizacion,
	// String fechaAutorizacion) {
	//
	// Node contenidoComprobanteXml;
	// try {
	// contenidoComprobanteXml = DocumentBuilderFactory
	// .newInstance()
	// .newDocumentBuilder()
	// .parse(new File(System.setProperty("java.io.tmpdir",
	// "/comprobantes")
	// + "/"
	// + claveAcceso.trim()
	// + ".xml")).getElementsByTagName("comprobante")
	// .item(0);
	//
	// GenerarReporteComprobanteElectronico.generarReporteElectronico(
	// empresa, claveAcceso, numeroAutorizacion,
	// fechaAutorizacion, contenidoComprobanteXml);
	// } catch (SAXException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// } catch (ParserConfigurationException e) {
	// e.printStackTrace();
	// }
	//
	// }
}