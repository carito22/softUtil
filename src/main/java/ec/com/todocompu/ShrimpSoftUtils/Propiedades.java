package ec.com.todocompu.ShrimpSoftUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Properties;

public class Propiedades {

	private static Properties propPrincipal;
	private String ip;
	private String mac;
	private String host;
	private InetAddress direccionLocal;

	public Propiedades() {
		try {
			estableceInterfaz();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void estableceInterfaz() throws Exception {
		for (Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces(); e.hasMoreElements();) {
			NetworkInterface ni = (NetworkInterface) e.nextElement();
			for (Enumeration<InetAddress> ee = ni.getInetAddresses(); ee.hasMoreElements();) {
				direccionLocal = (InetAddress) ee.nextElement();
				if (!ni.isLoopback()) {
					if (ni.isUp()) {
						if (direccionLocal.getHostAddress().trim().length() < 17) {
							ip = direccionLocal.getHostAddress();
							mac = Conversiones.convierteArrayByte_HexadecimalString(ni.getHardwareAddress());
						}
					}
				}
			}
		}
	}

	public String getIp() {
		return ip;
	}

	public String getHost() {
		return host;
	}

	public String getMac() {
		return mac;
	}

	public static Properties readPropiedades() throws IOException, Exception {
		if (propPrincipal == null) {
			propPrincipal = new Properties();
			InputStream is = null;
			try {
				is = new FileInputStream(Propiedades.class.getResource("/PropiedadesPrincipales.properties").getPath());
			} catch (Exception e) {
				is = new FileInputStream("PropiedadesPrincipales.properties");
			}
			propPrincipal.load(is);
		}
		return propPrincipal;
	}

}