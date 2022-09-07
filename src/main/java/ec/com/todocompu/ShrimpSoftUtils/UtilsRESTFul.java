package ec.com.todocompu.ShrimpSoftUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class UtilsRESTFul {
	private static RestTemplate restTemplate = new RestTemplate();

	public static String postForFile(String url, Map<String, Object> map, String archivo) {
		try {
			byte[] bFile = restTemplate.postForObject(url, UtilsJSON.objetoToJson(map), byte[].class);

			File carpeta = new File("tmp/");
			if (!carpeta.exists())
				carpeta.mkdir();
			archivo = "tmp/" + archivo;
			File fileReport = new File(archivo);
			if (fileReport.exists())
				archivo = archivo.replaceAll(".jrprint", "") + generaNumeroAleatorio(1, 100) + ".jrprint";

			FileOutputStream output = new FileOutputStream(archivo);
			output.write(bFile);
			output.close();

			return archivo;
		} catch (RestClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public static int generaNumeroAleatorio(int minimo, int maximo) {
		return (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
	}

}