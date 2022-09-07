package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvClienteRecurrenteTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "vr_codigo")
    private String vrCodigo;
    @Column(name = "vr_id")
    private String vrId;
    @Column(name = "vr_razon_social")
    private String vrRazonSocial;
    @Column(name = "vr_grupo_empresarial")
    private String vrGrupoEmpresarial;
    @Column(name = "vr_categoria")
    private String vrCategoria;
    @Column(name = "vr_ciudad")
    private String vrCiudad;
    @Column(name = "vr_dias_credito")
    private Integer vrDiasCredito;
    @Column(name = "vr_total_venta")
    private Integer vrTotalVenta;
    @Column(name = "vr_observaciones")
    private String vrObservaciones;
    @Column(name = "vr_tipo_documento")
    private String vrTipoDocumento;
    @Column(name = "vr_grupo")
    private Integer vrGrupo;
    @Column(name = "vr_contrato")
    private Integer vrContrato;
    @Column(name = "vr_punto_emision")
    private String vrPuntoEmision;

    public InvClienteRecurrenteTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVrCodigo() {
        return vrCodigo;
    }

    public void setVrCodigo(String vrCodigo) {
        this.vrCodigo = vrCodigo;
    }

    public String getVrId() {
        return vrId;
    }

    public void setVrId(String vrId) {
        this.vrId = vrId;
    }

    public String getVrRazonSocial() {
        return vrRazonSocial;
    }

    public void setVrRazonSocial(String vrRazonSocial) {
        this.vrRazonSocial = vrRazonSocial;
    }

    public String getVrGrupoEmpresarial() {
        return vrGrupoEmpresarial;
    }

    public void setVrGrupoEmpresarial(String vrGrupoEmpresarial) {
        this.vrGrupoEmpresarial = vrGrupoEmpresarial;
    }

    public String getVrCategoria() {
        return vrCategoria;
    }

    public void setVrCategoria(String vrCategoria) {
        this.vrCategoria = vrCategoria;
    }

    public String getVrCiudad() {
        return vrCiudad;
    }

    public void setVrCiudad(String vrCiudad) {
        this.vrCiudad = vrCiudad;
    }

    public Integer getVrDiasCredito() {
        return vrDiasCredito;
    }

    public void setVrDiasCredito(Integer vrDiasCredito) {
        this.vrDiasCredito = vrDiasCredito;
    }

    public String getVrObservaciones() {
        return vrObservaciones;
    }

    public void setVrObservaciones(String vrObservaciones) {
        this.vrObservaciones = vrObservaciones;
    }

    public String getVrTipoDocumento() {
        return vrTipoDocumento;
    }

    public void setVrTipoDocumento(String vrTipoDocumento) {
        this.vrTipoDocumento = vrTipoDocumento;
    }

    public Integer getVrTotalVenta() {
        return vrTotalVenta;
    }

    public void setVrTotalVenta(Integer vrTotalVenta) {
        this.vrTotalVenta = vrTotalVenta;
    }

    public Integer getVrGrupo() {
        return vrGrupo;
    }

    public void setVrGrupo(Integer vrGrupo) {
        this.vrGrupo = vrGrupo;
    }

    public Integer getVrContrato() {
        return vrContrato;
    }

    public void setVrContrato(Integer vrContrato) {
        this.vrContrato = vrContrato;
    }

    public String getVrPuntoEmision() {
        return vrPuntoEmision;
    }

    public void setVrPuntoEmision(String vrPuntoEmision) {
        this.vrPuntoEmision = vrPuntoEmision;
    }

}
