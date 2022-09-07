package ec.com.todocompu.ShrimpSoftUtils;

import java.io.Serializable;

public class ColumnModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String header;
	private String property;

	public ColumnModel(String header, String property) {
		this.header = header.toUpperCase();
		this.property = property;
	}

	public String getHeader() {
		return header;
	}

	public String getProperty() {
		return property;
	}
}
