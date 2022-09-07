/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.enums;

/**
 *
 * @author Developer0
 */
public enum TipoNotificacion {
    NOTIFICAR_VENTA_ELECTRONICA_EMITIDA(1, "1"),
    NOTIFICAR_COMPRA_ELECTRONICA_EMITIDA(2, "2"),
    NOTIFICAR_PROVEEDOR_ORDEN_COMPRA(3, "3"),
    NOTIFICAR_VENTA_RECURRENTE_ERROR(4, "4"),
    NOTIFICAR_VENTA_NO_AUTORIZADA(5, "5"),
    NOTIFICAR_CUENTAS_POR_COBRAR(6, "6"),
    NOTIFICAR_CONTABLE_ERRORES(7, "7"),
    NOTIFICAR_COMPROBANTES_RECIBIDOS(8, "8"),
    NOTIFICAR_ROL_PAGOS(9, "9");

    private final Integer id;
    private final String nombre;

    private TipoNotificacion(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public static TipoNotificacion getTipoNotificacion(String nombre) {
        for (TipoNotificacion tipo : values()) {
            if (tipo.getNombre().equalsIgnoreCase(nombre)) {
                return tipo;
            }
        }
        return null;
    }

}
