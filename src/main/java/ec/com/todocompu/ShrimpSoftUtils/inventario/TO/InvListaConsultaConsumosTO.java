/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvListaConsultaConsumosTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cons_status")
    private String consStatus;

    @Column(name = "cons_fecha")
    private String consFecha;

    @Column(name = "cons_observaciones")
    private String consObservaciones;

    @Column(name = "cons_numero")
    private String consNumero;

    @Column(name = "cons_cliente")
    private String consCliente;

    @Column(name = "cons_datos_adjuntos")
    private boolean consDatosAdjuntos;

    public InvListaConsultaConsumosTO() {
    }

    public InvListaConsultaConsumosTO(String consStatus, String consFecha, String consObservaciones, String consNumero,
            Integer id) {
        this.consStatus = consStatus;
        this.consFecha = consFecha;
        this.consObservaciones = consObservaciones;
        this.consNumero = consNumero;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsFecha() {
        return consFecha;
    }

    public void setConsFecha(String consFecha) {
        this.consFecha = consFecha;
    }

    public String getConsNumero() {
        return consNumero;
    }

    public void setConsNumero(String consNumero) {
        this.consNumero = consNumero;
    }

    public String getConsObservaciones() {
        return consObservaciones;
    }

    public void setConsObservaciones(String consObservaciones) {
        this.consObservaciones = consObservaciones;
    }

    public String getConsStatus() {
        return consStatus;
    }

    public void setConsStatus(String consStatus) {
        this.consStatus = consStatus;
    }

    public String getConsCliente() {
        return consCliente;
    }

    public void setConsCliente(String consCliente) {
        this.consCliente = consCliente;
    }

    public boolean isConsDatosAdjuntos() {
        return consDatosAdjuntos;
    }

    public void setConsDatosAdjuntos(boolean consDatosAdjuntos) {
        this.consDatosAdjuntos = consDatosAdjuntos;
    }

}
