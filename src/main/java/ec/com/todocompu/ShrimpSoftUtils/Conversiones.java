package ec.com.todocompu.ShrimpSoftUtils;

import org.apache.commons.codec.binary.Hex;

public class Conversiones {

	public static String convierteArrayByte_HexadecimalString(byte[] mac) {
		String retorno = "";
		int cont = 0;
		for (int i = 0; i < mac.length; i++) {
			cont += 1;
			retorno += String.valueOf(Hex.encodeHex(new byte[] { mac[i] }));
			if (cont < mac.length) {
				retorno += "-";
			}
		}
		return retorno;
	}

}
