/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.pedidos.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author developer3
 */
@Entity
public class InvPedidoTO implements Serializable{

    @Id
    private Integer index;
    private String pedidonumero;
    private String codigoempresa;
    private String codigosector;
    private String nombresector;
    private String codigomotivo;
    private String detallemotivo;
    private Date pedfechaemision;
    private boolean pedpendiente;
    private boolean pedaprobado;
    private boolean pedejecutado;
    private boolean pedanulado;
    private BigDecimal pedmontototal;
    private Date usrfechainserta;
    private Date usrfechaaprobada;
    private String obsregistra;
    private String obsaprueba;
    private String obsejecuta;
    private String aprobador;
    private String ejecutor;
    private String estado;
    private String registrador;

    public InvPedidoTO() {
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    
    public String getPedidonumero() {
        return pedidonumero;
    }

    public void setPedidonumero(String pedidonumero) {
        this.pedidonumero = pedidonumero;
    }

    public String getCodigoempresa() {
        return codigoempresa;
    }

    public void setCodigoempresa(String codigoempresa) {
        this.codigoempresa = codigoempresa;
    }

    public String getCodigomotivo() {
        return codigomotivo;
    }

    public void setCodigomotivo(String codigomotivo) {
        this.codigomotivo = codigomotivo;
    }

    public String getCodigosector() {
        return codigosector;
    }

    public void setCodigosector(String codigosector) {
        this.codigosector = codigosector;
    }

    public String getNombresector() {
        return nombresector;
    }

    public void setNombresector(String nombresector) {
        this.nombresector = nombresector;
    }

    public String getDetallemotivo() {
        return detallemotivo;
    }

    public void setDetallemotivo(String detallemotivo) {
        this.detallemotivo = detallemotivo;
    }

    public Date getPedfecha() {
        return pedfechaemision;
    }

    public void setPedfecha(Date pedfecha) {
        this.pedfechaemision = pedfecha;
    }

    public boolean isPedpendiente() {
        return pedpendiente;
    }

    public void setPedpendiente(boolean pedpendiente) {
        this.pedpendiente = pedpendiente;
    }

    public boolean isPedaprobado() {
        return pedaprobado;
    }

    public void setPedaprobado(boolean pedaprobado) {
        this.pedaprobado = pedaprobado;
    }

    public boolean isPedejecutado() {
        return pedejecutado;
    }

    public void setPedejecutado(boolean pedejecutado) {
        this.pedejecutado = pedejecutado;
    }

    public boolean isPedanulado() {
        return pedanulado;
    }

    public void setPedanulado(boolean pedanulado) {
        this.pedanulado = pedanulado;
    }

    public BigDecimal getPedmontototal() {
        return pedmontototal;
    }

    public void setPedmontototal(BigDecimal pedmontototal) {
        this.pedmontototal = pedmontototal;
    }

    public Date getUsrfechainserta() {
        return usrfechainserta;
    }

    public void setUsrfechainserta(Date usrfechainserta) {
        this.usrfechainserta = usrfechainserta;
    }

    public String getObsregistra() {
        return obsregistra;
    }

    public void setObsregistra(String obsregistra) {
        this.obsregistra = obsregistra;
    }

    public String getObsaprueba() {
        return obsaprueba;
    }

    public void setObsaprueba(String obsaprueba) {
        this.obsaprueba = obsaprueba;
    }

    public String getObsejecuta() {
        return obsejecuta;
    }

    public void setObsejecuta(String obsejecuta) {
        this.obsejecuta = obsejecuta;
    }

    public String getAprobador() {
        return aprobador;
    }

    public void setAprobador(String aprobador) {
        this.aprobador = aprobador;
    }

    public String getEjecutor() {
        return ejecutor;
    }

    public void setEjecutor(String ejecutor) {
        this.ejecutor = ejecutor;
    }

    public String getRegistrador() {
        return registrador;
    }

    public void setRegistrador(String registrador) {
        this.registrador = registrador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Date getUsrfechaaprobada() {
        return usrfechaaprobada;
    }

    public void setUsrfechaaprobada(Date usrfechaaprobada) {
        this.usrfechaaprobada = usrfechaaprobada;
    }
    

}
