package ec.com.todocompu.ShrimpSoftUtils;

import java.math.BigInteger;

public class Desencriptar {

	public String desencriptarMod(String cadenaEncriptada) {
            String mensaje=null;
            try {
                
                if (cadenaEncriptada!=null) {
                    String cadenaAux1 = "";
                    String cadenaTemp = "";
                    BigInteger numN = new BigInteger("16");
                    BigInteger numD;
                    int cont = 0;
                    String n = "";
                    String d = "";

                    BigInteger[] bigInteger = new BigInteger[20];

                    n = n + cadenaEncriptada.charAt(0);

                    d = d + cadenaEncriptada.charAt(cadenaEncriptada.length() - 1);

                    numN = new BigInteger(cadenaEncriptada.substring(1, Integer.parseInt(n) + 1), 16);

                    numD = new BigInteger(cadenaEncriptada.substring((cadenaEncriptada.length() - 1) - Integer.parseInt(d),
                                    cadenaEncriptada.length() - 1), 16);

                    cadenaAux1 = cadenaEncriptada.substring(Integer.parseInt(n) + 1,
                                    (cadenaEncriptada.length() - 1) - Integer.parseInt(d));

                    for (int a = 0; a < cadenaAux1.length(); a++) {
                            if (cadenaAux1.charAt(a) == 'G') {
                                    bigInteger[cont] = new BigInteger(cadenaTemp, 16);
                                    cadenaTemp = "";
                                    cont++;
                            } else {
                                    cadenaTemp = cadenaTemp + cadenaAux1.charAt(a);
                            }
                    }
                    mensaje = desencripta(bigInteger, numD, numN, cont);		
                }
            } catch (Exception e) {
                mensaje=null;
            }
            return mensaje;
	}

	private String desencripta(BigInteger[] encriptado, BigInteger d, BigInteger n, int contador) {
		BigInteger[] desencriptado = new BigInteger[contador];
		for (int i = 0; i < contador; i++)
			desencriptado[i] = encriptado[i].modPow(d, n);

		char[] charArray = new char[contador];

		for (int i = 0; i < charArray.length; i++)
			charArray[i] = (char) (desencriptado[i].intValue());

		return (new String(charArray));
	}

	public static String desencriptar(String cadenaEncriptada) {
		String cadenaAux1 = "";
		String cadenaTemp = "";
		BigInteger numN = new BigInteger("16");
		BigInteger numD;
		int cont = 0;
		String n = "";
		String d = "";

		BigInteger[] bigInteger = new BigInteger[20];

		n = n + cadenaEncriptada.charAt(0);

		d = d + cadenaEncriptada.charAt(cadenaEncriptada.length() - 1);

		numN = new BigInteger(cadenaEncriptada.substring(1, Integer.parseInt(n) + 1), 16);

		numD = new BigInteger(cadenaEncriptada.substring((cadenaEncriptada.length() - 1) - Integer.parseInt(d),
				cadenaEncriptada.length() - 1), 16);

		cadenaAux1 = cadenaEncriptada.substring(Integer.parseInt(n) + 1,
				(cadenaEncriptada.length() - 1) - Integer.parseInt(d));

		for (int a = 0; a < cadenaAux1.length(); a++) {
			if (cadenaAux1.charAt(a) == 'G') {
				bigInteger[cont] = new BigInteger(cadenaTemp, 16);
				cadenaTemp = "";
				cont++;
			} else {
				cadenaTemp = cadenaTemp + cadenaAux1.charAt(a);
			}
		}

		BigInteger[] desencriptado = new BigInteger[cont];
		for (int i = 0; i < cont; i++)
			desencriptado[i] = bigInteger[i].modPow(numD, numN);

		char[] charArray = new char[cont];

		for (int i = 0; i < charArray.length; i++)
			charArray[i] = (char) (desencriptado[i].intValue());

		return (new String(charArray));

	}

}
