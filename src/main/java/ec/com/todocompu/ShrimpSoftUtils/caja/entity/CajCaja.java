package ec.com.todocompu.ShrimpSoftUtils.caja.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProducto;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "caj_caja", schema = "caja")
public class CajCaja implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CajCajaPK cajCajaPK;
    @Column(name = "permiso_secuencial_facturas")
    private String permisoSecuencialFacturas;
    @Column(name = "permiso_secuencial_notas_credito")
    private String permisoSecuencialNotasCredito;
    @Column(name = "permiso_secuencial_notas_debito")
    private String permisoSecuencialNotasDebito;
    @Column(name = "permiso_secuencial_retenciones")
    private String permisoSecuencialRetenciones;
    @Column(name = "permiso_secuencial_guias")
    private String permisoSecuencialGuias;
    @Column(name = "permiso_secuencial_liquidacion_compras")
    private String permisoSecuencialLiquidacionCompras;
    @Column(name = "permiso_motivo_permitido")
    private String permisoMotivoPermitido;
    @Column(name = "permiso_bodega_permitida")
    private String permisoBodegaPermitida;
    @Column(name = "permiso_documento_permitido")
    private String permisoDocumentoPermitido;
    @Column(name = "permiso_forma_pago_permitida")
    private String permisoFormaPagoPermitida;

    @Column(name = "permiso_cambiar_fecha_venta")
    private boolean permisoCambiarFechaVenta;
    @Column(name = "permiso_cambiar_fecha_retencion")
    private boolean permisoCambiarFechaRetencion;

    @Column(name = "permiso_cambiar_precio")
    private boolean permisoCambiarPrecio;
    @Column(name = "permiso_aplicar_descuentos")
    private boolean permisoAplicarDescuentos;
    @Column(name = "permiso_eliminar_filas")
    private boolean permisoEliminarFilas;
    @Column(name = "permiso_cliente_crear")
    private boolean permisoClienteCrear;
    @Column(name = "permiso_cliente_credito")
    private boolean permisoClienteCredito;
    @Column(name = "permiso_cliente_precio_permitido")
    private Integer permisoClientePrecioPermitido;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "firma_secuencial")
    private Integer firmaSecuencial;

    @Column(name = "permiso_utiliza_codigo_barra")
    private boolean permisoUtilizaCodigoBarra;
    @Column(name = "permiso_agrupar_productos")
    private boolean permisoAgruparProductos;

    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = true)
    private InvProducto invProducto;

    public CajCaja() {
    }

    public CajCaja(CajCajaPK cajCajaPK) {
        this.cajCajaPK = cajCajaPK;
    }

    public CajCaja(String cajaEmpresa, String cajaCodigo) {
        this.cajCajaPK = new CajCajaPK(cajaEmpresa, cajaCodigo);
    }

    public CajCajaPK getCajCajaPK() {
        return cajCajaPK;
    }

    public void setCajCajaPK(CajCajaPK cajCajaPK) {
        this.cajCajaPK = cajCajaPK;
    }

    public String getPermisoSecuencialFacturas() {
        return permisoSecuencialFacturas;
    }

    public void setPermisoSecuencialFacturas(String permisoSecuencialFacturas) {
        this.permisoSecuencialFacturas = permisoSecuencialFacturas;
    }

    public String getPermisoSecuencialNotasCredito() {
        return permisoSecuencialNotasCredito;
    }

    public void setPermisoSecuencialNotasCredito(String permisoSecuencialNotasCredito) {
        this.permisoSecuencialNotasCredito = permisoSecuencialNotasCredito;
    }

    public String getPermisoSecuencialNotasDebito() {
        return permisoSecuencialNotasDebito;
    }

    public void setPermisoSecuencialNotasDebito(String permisoSecuencialNotasDebito) {
        this.permisoSecuencialNotasDebito = permisoSecuencialNotasDebito;
    }

    public String getPermisoSecuencialRetenciones() {
        return permisoSecuencialRetenciones;
    }

    public void setPermisoSecuencialRetenciones(String permisoSecuencialRetenciones) {
        this.permisoSecuencialRetenciones = permisoSecuencialRetenciones;
    }

    public String getPermisoSecuencialGuias() {
        return permisoSecuencialGuias;
    }

    public void setPermisoSecuencialGuias(String permisoSecuencialGuias) {
        this.permisoSecuencialGuias = permisoSecuencialGuias;
    }

    public String getPermisoSecuencialLiquidacionCompras() {
        return permisoSecuencialLiquidacionCompras;
    }

    public void setPermisoSecuencialLiquidacionCompras(String permisoSecuencialLiquidacionCompras) {
        this.permisoSecuencialLiquidacionCompras = permisoSecuencialLiquidacionCompras;
    }

    public String getPermisoMotivoPermitido() {
        return permisoMotivoPermitido;
    }

    public void setPermisoMotivoPermitido(String permisoMotivoPermitido) {
        this.permisoMotivoPermitido = permisoMotivoPermitido;
    }

    public String getPermisoBodegaPermitida() {
        return permisoBodegaPermitida;
    }

    public void setPermisoBodegaPermitida(String permisoBodegaPermitida) {
        this.permisoBodegaPermitida = permisoBodegaPermitida;
    }

    public String getPermisoDocumentoPermitido() {
        return permisoDocumentoPermitido;
    }

    public void setPermisoDocumentoPermitido(String permisoDocumentoPermitido) {
        this.permisoDocumentoPermitido = permisoDocumentoPermitido;
    }

    public String getPermisoFormaPagoPermitida() {
        return permisoFormaPagoPermitida;
    }

    public void setPermisoFormaPagoPermitida(String permisoFormaPagoPermitida) {
        this.permisoFormaPagoPermitida = permisoFormaPagoPermitida;
    }

    public boolean isPermisoCambiarFechaVenta() {
        return permisoCambiarFechaVenta;
    }

    public void setPermisoCambiarFechaVenta(boolean permisoCambiarFechaVenta) {
        this.permisoCambiarFechaVenta = permisoCambiarFechaVenta;
    }

    public boolean isPermisoCambiarFechaRetencion() {
        return permisoCambiarFechaRetencion;
    }

    public void setPermisoCambiarFechaRetencion(boolean permisoCambiarFechaRetencion) {
        this.permisoCambiarFechaRetencion = permisoCambiarFechaRetencion;
    }

    public boolean isPermisoCambiarPrecio() {
        return permisoCambiarPrecio;
    }

    public void setPermisoCambiarPrecio(boolean permisoCambiarPrecio) {
        this.permisoCambiarPrecio = permisoCambiarPrecio;
    }

    public boolean isPermisoAplicarDescuentos() {
        return permisoAplicarDescuentos;
    }

    public void setPermisoAplicarDescuentos(boolean permisoAplicarDescuentos) {
        this.permisoAplicarDescuentos = permisoAplicarDescuentos;
    }

    public boolean isPermisoEliminarFilas() {
        return permisoEliminarFilas;
    }

    public void setPermisoEliminarFilas(boolean permisoEliminarFilas) {
        this.permisoEliminarFilas = permisoEliminarFilas;
    }

    public boolean isPermisoClienteCrear() {
        return permisoClienteCrear;
    }

    public void setPermisoClienteCrear(boolean permisoClienteCrear) {
        this.permisoClienteCrear = permisoClienteCrear;
    }

    public boolean isPermisoClienteCredito() {
        return permisoClienteCredito;
    }

    public void setPermisoClienteCredito(boolean permisoClienteCredito) {
        this.permisoClienteCredito = permisoClienteCredito;
    }

    public Integer getPermisoClientePrecioPermitido() {
        return permisoClientePrecioPermitido;
    }

    public void setPermisoClientePrecioPermitido(Integer permisoClientePrecioPermitido) {
        this.permisoClientePrecioPermitido = permisoClientePrecioPermitido;
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

    public Integer getFirmaSecuencial() {
        return firmaSecuencial;
    }

    public void setFirmaSecuencial(Integer firmaSecuencial) {
        this.firmaSecuencial = firmaSecuencial;
    }

    public boolean isPermisoUtilizaCodigoBarra() {
        return permisoUtilizaCodigoBarra;
    }

    public void setPermisoUtilizaCodigoBarra(boolean permisoUtilizaCodigoBarra) {
        this.permisoUtilizaCodigoBarra = permisoUtilizaCodigoBarra;
    }

    public boolean isPermisoAgruparProductos() {
        return permisoAgruparProductos;
    }

    public void setPermisoAgruparProductos(boolean permisoAgruparProductos) {
        this.permisoAgruparProductos = permisoAgruparProductos;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajCajaPK != null ? cajCajaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CajCaja)) {
            return false;
        }
        CajCaja other = (CajCaja) object;
        if ((this.cajCajaPK == null && other.cajCajaPK != null)
                || (this.cajCajaPK != null && !this.cajCajaPK.equals(other.cajCajaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caja.entity.CajCaja[ cajCajaPK=" + cajCajaPK + " ]";
    }

}
