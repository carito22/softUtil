package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarListaMayorAuxiliarClienteProveedorTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "map_contable")
    private String maContable;
    @Column(name = "map_fecha")
    private String maFecha;
    @Column(name = "map_clave_principal")
    private String maClavePrincipal;
    @Column(name = "map_cp")
    private String maCp;
    @Column(name = "map_documento")
    private String maDocumento;
    @Column(name = "map_debe")
    private BigDecimal maDebe;
    @Column(name = "map_haber")
    private BigDecimal maHaber;
    @Column(name = "map_saldo")
    private BigDecimal maSaldo;
    @Column(name = "map_observaciones")
    private String maObservaciones;
    @Column(name = "map_grupo_empresarial")
    private String mapGrupoEmpresarial;
    @Column(name = "map_individuo")
    private String mapIndividuo;
    @Column(name = "map_orden")
    private Integer maOrden;

    public CarListaMayorAuxiliarClienteProveedorTO() {
    }

    public CarListaMayorAuxiliarClienteProveedorTO(Integer id, String maContable, String maFecha, String maClavePrincipal, String maCp, String maDocumento, BigDecimal maDebe, BigDecimal maHaber, BigDecimal maSaldo, String maObservaciones, String mapGrupoEmpresarial, Integer maOrden) {
        this.id = id;
        this.maContable = maContable;
        this.maFecha = maFecha;
        this.maClavePrincipal = maClavePrincipal;
        this.maCp = maCp;
        this.maDocumento = maDocumento;
        this.maDebe = maDebe;
        this.maHaber = maHaber;
        this.maSaldo = maSaldo;
        this.maObservaciones = maObservaciones;
        this.mapGrupoEmpresarial = mapGrupoEmpresarial;
        this.maOrden = maOrden;
    }

    public String getMapGrupoEmpresarial() {
        return mapGrupoEmpresarial;
    }

    public void setMapGrupoEmpresarial(String mapGrupoEmpresarial) {
        this.mapGrupoEmpresarial = mapGrupoEmpresarial;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaClavePrincipal() {
        return maClavePrincipal;
    }

    public void setMaClavePrincipal(String maClavePrincipal) {
        this.maClavePrincipal = maClavePrincipal;
    }

    public String getMaContable() {
        return maContable;
    }

    public void setMaContable(String maContable) {
        this.maContable = maContable;
    }

    public String getMaCp() {
        return maCp;
    }

    public void setMaCp(String maCp) {
        this.maCp = maCp;
    }

    public BigDecimal getMaDebe() {
        return maDebe;
    }

    public void setMaDebe(BigDecimal maDebe) {
        this.maDebe = maDebe;
    }

    public String getMaDocumento() {
        return maDocumento;
    }

    public void setMaDocumento(String maDocumento) {
        this.maDocumento = maDocumento;
    }

    public String getMaFecha() {
        return maFecha;
    }

    public void setMaFecha(String maFecha) {
        this.maFecha = maFecha;
    }

    public BigDecimal getMaHaber() {
        return maHaber;
    }

    public void setMaHaber(BigDecimal maHaber) {
        this.maHaber = maHaber;
    }

    public String getMaObservaciones() {
        return maObservaciones;
    }

    public void setMaObservaciones(String maObservaciones) {
        this.maObservaciones = maObservaciones;
    }

    public Integer getMaOrden() {
        return maOrden;
    }

    public void setMaOrden(Integer maOrden) {
        this.maOrden = maOrden;
    }

    public BigDecimal getMaSaldo() {
        return maSaldo;
    }

    public void setMaSaldo(BigDecimal maSaldo) {
        this.maSaldo = maSaldo;
    }

    public String getMapIndividuo() {
        return mapIndividuo;
    }

    public void setMapIndividuo(String mapIndividuo) {
        this.mapIndividuo = mapIndividuo;
    }

}
