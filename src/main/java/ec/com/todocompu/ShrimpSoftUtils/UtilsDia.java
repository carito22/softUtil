package ec.com.todocompu.ShrimpSoftUtils;

public enum UtilsDia {

	D1(1, "LUNES"), D2(2, "MARTES"), D3(3, "MIERCOLES"), D4(4, "JUEVES"), D5(5, "VIERNES"), D6(6, "SABADO"), D7(7,
			"DOMINGO");

	private final Integer id;
	private final String nombre;

	private UtilsDia(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
}