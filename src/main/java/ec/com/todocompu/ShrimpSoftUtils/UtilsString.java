package ec.com.todocompu.ShrimpSoftUtils;

import ec.com.todocompu.ShrimpSoftUtils.web.ComboGenericoTO;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.apache.commons.io.FilenameUtils;

public class UtilsString {

    public static String rellenarCeros(int totalCaracteres, int numeroRellenar) {
        String rellenarConCeros = "";
        for (int i = 0; i < totalCaracteres - String.valueOf(numeroRellenar).length(); i++) {
            rellenarConCeros += "0";
        }
        return rellenarConCeros + numeroRellenar;
    }

    public static String convertirByteString(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String generarNombreAmazonS3() {
        String nombre = UtilsDate.timestamp() + "";
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            nombre += (char) (rnd.nextInt(26) + 'a');
        }
        nombre = nombre.replace("-", "").replace(":", "").replace(" ", ".").replace(".", "");
        return nombre;
    }

    public static ComboGenericoTO completarDatosAmazon(String claveArchivo, String imagenString) {
        String extension = "jpg";
        String tipo = "image/jpeg";
        if (claveArchivo != null && !claveArchivo.isEmpty()) {
            extension = FilenameUtils.getExtension(claveArchivo);
        } else {
            if (imagenString != null && !imagenString.isEmpty()) {
                String dataParte1 = imagenString.split(";")[0];
                tipo = dataParte1.split(":")[1];
                extension = tipo.split("/")[1];
                switch (extension) {
                    case "vnd.ms-excel":
                        extension = "xls";
                        break;
                    case "vnd.openxmlformats-officedocument.spreadsheetml.sheet":
                        extension = "xlsx";
                        break;
                }
            }
        }
        ComboGenericoTO combo = new ComboGenericoTO(extension, tipo);
        return combo;
    }

}
