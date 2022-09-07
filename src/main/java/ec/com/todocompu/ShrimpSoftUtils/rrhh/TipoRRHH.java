/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh;

/**
 *
 * @author Developer0
 */
public enum TipoRRHH {
    ANTICIPO(1, "Anticipo", "recursoshumanos.rh_anticipo"),
    BONO(2, "Bono", "recursoshumanos.rh_bono"),
    PRESTAMO(3, "Prestamo", "recursoshumanos.rh_prestamo"),
    ROL(4, "Rol", "recursoshumanos.rh_rol"),
    UTILIDAD(5, "Utilidad", "recursoshumanos.rh_utilidades"),
    XIIISUELDO(6, "XIII Sueldo", "recursoshumanos.rh_xiii_sueldo"),
    XIVSUELDO(7, "XIV Sueldo", "recursoshumanos.rh_xiv_sueldo"),
    PROVISIONES(8, "Provisiones", "recursoshumanos.rh_provisiones"),
    VACACIONES(9, "Vacaciones", "recursoshumanos.rh_vacaciones"),
    LIQUIDACION(10, "Liquidacion", "recursoshumanos.rh_liquidacion"),
    HORAS_EXTRAS(11, "Horas Extras", "recursoshumanos.rh_horas_extras");

    private Integer id;
    private String nombre;
    private String tabla;

    private TipoRRHH(Integer id, String nombre, String tabla) {
        this.id = id;
        this.nombre = nombre;
        this.tabla = tabla;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTabla() {
        return tabla;
    }

    public static TipoRRHH getTipoRRHH(String tabla) {
        for (TipoRRHH tipoRRHH : values()) {
            if (tipoRRHH.getTabla().equalsIgnoreCase(tabla)) {
                return tipoRRHH;
            }
        }
        return null;
    }
}
