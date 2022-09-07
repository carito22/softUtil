package ec.com.todocompu.ShrimpSoftUtils;

public enum UtilsAnio {

	A0000("0000", "AÑO"), A2015("2015", "2015"), A2016("2016", "2016"), A2017("2017", "2017"), A2018("2018",
			"2018"), A2019("2019", "2019"), A2020("2020", "2020");

	private final String id;
	private final String nombre;

	private UtilsAnio(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
}