package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProducto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prd_talla", schema = "produccion")
public class PrdTalla implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrdTallaPK prdLiquidacionTallaPK;
    private String tallaDetalle;
    private String tallaDescripcion;
    private BigDecimal tallaGramosDesde;
    private BigDecimal tallaGramosHasta;
    private BigDecimal tallaPrecio;
    private String tallaUnidadMedida;
    private boolean tallaInactivo;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;
    private InvProducto invProducto;

    public PrdTalla() {
    }

    public PrdTalla(PrdTallaPK prdLiquidacionTallaPK) {
        this.prdLiquidacionTallaPK = prdLiquidacionTallaPK;
    }

    public PrdTalla(PrdTallaPK prdLiquidacionTallaPK, String tallaDetalle, BigDecimal tallaGramosDesde,
            BigDecimal tallaGramosHasta, BigDecimal tallaPrecio, String tallaUnidadMedida, boolean tallaInactivo, String usrEmpresa,
            String usrCodigo, Timestamp usrFechaInserta) {
        this.prdLiquidacionTallaPK = prdLiquidacionTallaPK;
        this.tallaDetalle = tallaDetalle;
        this.tallaGramosDesde = tallaGramosDesde;
        this.tallaGramosHasta = tallaGramosHasta;
        this.tallaPrecio = tallaPrecio;
        this.tallaUnidadMedida = tallaUnidadMedida;
        this.tallaInactivo = tallaInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdTalla(String tallaEmpresa, String tallaCodigo) {
        this.prdLiquidacionTallaPK = new PrdTallaPK(tallaEmpresa, tallaCodigo);
    }

    @EmbeddedId
    public PrdTallaPK getPrdLiquidacionTallaPK() {
        return prdLiquidacionTallaPK;
    }

    public void setPrdLiquidacionTallaPK(PrdTallaPK prdLiquidacionTallaPK) {
        this.prdLiquidacionTallaPK = prdLiquidacionTallaPK;
    }

    @Column(name = "talla_detalle")
    public String getTallaDetalle() {
        return tallaDetalle;
    }

    public void setTallaDetalle(String tallaDetalle) {
        this.tallaDetalle = tallaDetalle;
    }

    @Column(name = "talla_unidad_medida")
    public String getTallaUnidadMedida() {
        return tallaUnidadMedida;
    }

    public void setTallaUnidadMedida(String tallaUnidadMedida) {
        this.tallaUnidadMedida = tallaUnidadMedida;
    }

    @Column(name = "talla_descripcion")
    public String getTallaDescripcion() {
        return tallaDescripcion;
    }

    public void setTallaDescripcion(String tallaDescripcion) {
        this.tallaDescripcion = tallaDescripcion;
    }

    @Column(name = "talla_inactivo")
    public boolean getTallaInactivo() {
        return tallaInactivo;
    }

    public void setTallaInactivo(boolean tallaInactivo) {
        this.tallaInactivo = tallaInactivo;
    }

    @Column(name = "usr_empresa")
    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    @Column(name = "usr_codigo")
    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Column(name = "talla_gramos_desde")
    public BigDecimal getTallaGramosDesde() {
        return tallaGramosDesde;
    }

    public void setTallaGramosDesde(BigDecimal tallaGramosDesde) {
        this.tallaGramosDesde = tallaGramosDesde;
    }

    @Column(name = "talla_gramos_hasta")
    public BigDecimal getTallaGramosHasta() {
        return tallaGramosHasta;
    }

    public void setTallaGramosHasta(BigDecimal tallaGramosHasta) {
        this.tallaGramosHasta = tallaGramosHasta;
    }

    @Column(name = "talla_precio")
    public BigDecimal getTallaPrecio() {
        return tallaPrecio;
    }

    public void setTallaPrecio(BigDecimal tallaPrecio) {
        this.tallaPrecio = tallaPrecio;
    }

    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        ,@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = true)
    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdLiquidacionTallaPK != null ? prdLiquidacionTallaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdTalla)) {
            return false;
        }
        PrdTalla other = (PrdTalla) object;
        if ((this.prdLiquidacionTallaPK == null && other.prdLiquidacionTallaPK != null)
                || (this.prdLiquidacionTallaPK != null
                && !this.prdLiquidacionTallaPK.equals(other.prdLiquidacionTallaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdLiquidacionTalla[ prdLiquidacionTallaPK=" + prdLiquidacionTallaPK + " ]";
    }

}
