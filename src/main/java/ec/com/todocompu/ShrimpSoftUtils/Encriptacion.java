package ec.com.todocompu.ShrimpSoftUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Random;

public class Encriptacion {

	int tamPrimo;
	BigInteger n, q, p;
	BigInteger totient;
	BigInteger e, d;
	// Sha256
	private StringBuffer sb;
	private MessageDigest encriptador;

	public Encriptacion() {
		this.tamPrimo = 10;
		generaPrimos();
		generaClaves();
	}

	public String sha256(String password) {
		sb = new StringBuffer();
		try {
			encriptador = MessageDigest.getInstance("SHA-256");
			encriptador.update(password.toString().getBytes());
			byte datos[] = encriptador.digest();
			for (byte recogerDatos : datos) {
				sb.append(Integer.toString((recogerDatos & 0xff) + 0x100, 16).substring(1));
			}

		} catch (Exception ex) {
			System.out.println("error al generar la password");
		}
		return sb.toString();
	}

	private void generaPrimos() {
		p = new BigInteger(tamPrimo, 10, new Random());
		do {
			q = new BigInteger(tamPrimo, 10, new Random());
		} while (q.compareTo(p) == 0);
	}

	private void generaClaves() {
		n = p.multiply(q);
		totient = p.subtract(BigInteger.valueOf(1));
		totient = totient.multiply(q.subtract(BigInteger.valueOf(1)));
		do {
			e = new BigInteger(2 * tamPrimo, new Random());
		} while ((e.compareTo(totient) != -1) || (e.gcd(totient).compareTo(BigInteger.valueOf(1)) != 0));
		d = e.modInverse(totient);
	}

	public BigInteger[] encripta(String mensaje) {
		int i;
		byte[] temp = new byte[1];
		byte[] digitos = mensaje.getBytes();
		BigInteger[] bigdigitos = new BigInteger[digitos.length];

		for (i = 0; i < bigdigitos.length; i++) {
			temp[0] = digitos[i];
			bigdigitos[i] = new BigInteger(temp);
		}

		BigInteger[] encriptado = new BigInteger[bigdigitos.length];

		for (i = 0; i < bigdigitos.length; i++) {
			encriptado[i] = bigdigitos[i].modPow(e, n);
		}

		return (encriptado);
	}

	public BigInteger damep() {
		return (p);
	}

	public BigInteger dameq() {
		return (q);
	}

	public BigInteger dametotient() {
		return (totient);
	}

	public BigInteger damen() {
		return (n);
	}

	public BigInteger damee() {
		return (e);
	}

	public BigInteger damed() {
		return (d);
	}
}
