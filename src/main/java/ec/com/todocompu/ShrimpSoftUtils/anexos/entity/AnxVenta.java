package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_venta", schema = "anexo")
@XmlRootElement
public class AnxVenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected AnxVentaPK anxVentaPK;
    @Column(name = "ven_retencionnumero")
    private String venRetencionnumero;
    @Column(name = "ven_retencionautorizacion")
    private String venRetencionautorizacion;
    @Column(name = "ven_retencionfechaemision")
    @Temporal(TemporalType.DATE)
    private Date venRetencionfechaemision;
    @Column(name = "ven_base0")
    private BigDecimal venBase0;
    @Column(name = "ven_baseimponible")
    private BigDecimal venBaseimponible;
    @Column(name = "ven_basenoobjetoiva")
    private BigDecimal venBasenoobjetoiva;
    @Column(name = "ven_montoiva")
    private BigDecimal venMontoiva;
    @Column(name = "ven_valorretenidoiva")
    private BigDecimal venValorretenidoiva;
    @Column(name = "ven_valorretenidorenta")
    private BigDecimal venValorretenidorenta;
    @Column(name = "con_empresa")
    private String conEmpresa;
    @Column(name = "con_periodo")
    private String conPeriodo;
    @Column(name = "con_tipo")
    private String conTipo;
    @Column(name = "con_numero")
    private String conNumero;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "fecha_ultima_validacion_sri")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaValidacionSri;

    public AnxVenta() {
    }

    public AnxVenta(AnxVentaPK anxVentaPK) {
        this.anxVentaPK = anxVentaPK;
    }

    public AnxVenta(AnxVentaPK anxVentaPK, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.anxVentaPK = anxVentaPK;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public AnxVenta(String venEmpresa, String venPeriodo, String venMotivo, String venNumero) {
        this.anxVentaPK = new AnxVentaPK(venEmpresa, venPeriodo, venMotivo, venNumero);
    }

    public AnxVentaPK getAnxVentaPK() {
        return anxVentaPK;
    }

    public void setAnxVentaPK(AnxVentaPK anxVentaPK) {
        this.anxVentaPK = anxVentaPK;
    }

    public String getVenRetencionnumero() {
        return venRetencionnumero;
    }

    public void setVenRetencionnumero(String venRetencionnumero) {
        this.venRetencionnumero = venRetencionnumero;
    }

    public String getVenRetencionautorizacion() {
        return venRetencionautorizacion;
    }

    public void setVenRetencionautorizacion(String venRetencionautorizacion) {
        this.venRetencionautorizacion = venRetencionautorizacion;
    }

    public Date getVenRetencionfechaemision() {
        return venRetencionfechaemision;
    }

    public void setVenRetencionfechaemision(Date venRetencionfechaemision) {
        this.venRetencionfechaemision = venRetencionfechaemision;
    }

    public BigDecimal getVenBase0() {
        return venBase0;
    }

    public void setVenBase0(BigDecimal venBase0) {
        this.venBase0 = venBase0;
    }

    public BigDecimal getVenBaseimponible() {
        return venBaseimponible;
    }

    public void setVenBaseimponible(BigDecimal venBaseimponible) {
        this.venBaseimponible = venBaseimponible;
    }

    public BigDecimal getVenBasenoobjetoiva() {
        return venBasenoobjetoiva;
    }

    public void setVenBasenoobjetoiva(BigDecimal venBasenoobjetoiva) {
        this.venBasenoobjetoiva = venBasenoobjetoiva;
    }

    public BigDecimal getVenMontoiva() {
        return venMontoiva;
    }

    public void setVenMontoiva(BigDecimal venMontoiva) {
        this.venMontoiva = venMontoiva;
    }

    public BigDecimal getVenValorretenidoiva() {
        return venValorretenidoiva;
    }

    public void setVenValorretenidoiva(BigDecimal venValorretenidoiva) {
        this.venValorretenidoiva = venValorretenidoiva;
    }

    public BigDecimal getVenValorretenidorenta() {
        return venValorretenidorenta;
    }

    public void setVenValorretenidorenta(BigDecimal venValorretenidorenta) {
        this.venValorretenidorenta = venValorretenidorenta;
    }

    public String getConEmpresa() {
        return conEmpresa;
    }

    public void setConEmpresa(String conEmpresa) {
        this.conEmpresa = conEmpresa;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public Date getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(Date fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (anxVentaPK != null ? anxVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AnxVenta)) {
            return false;
        }
        AnxVenta other = (AnxVenta) object;
        if ((this.anxVentaPK == null && other.anxVentaPK != null)
                || (this.anxVentaPK != null && !this.anxVentaPK.equals(other.anxVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anexos.entity.AnxVenta[ anxVentaPK=" + anxVentaPK + " ]";
    }

}
