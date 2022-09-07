package ec.com.todocompu.ShrimpSoftUtils.sri.util;

public enum TipoAmbienteEnum {

	PRODUCCION("2"), PRUEBAS("1");
	private String code;

	private TipoAmbienteEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
