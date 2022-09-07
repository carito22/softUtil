package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SisSucesoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "sus_secuencia")
    private Integer susSecuencia;

    @Column(name = "sus_tabla")
    private String susTabla;

    @Column(name = "sus_clave")
    private String susClave;

    @Column(name = "sus_suceso")
    private String susSuceso;

    @Column(name = "sus_detalle")
    private String susDetalle;

    @Column(name = "sus_mac")
    private String sus_mac;

    @Column(name = "det_empresa")
    private String usrEmpresa;

    @Column(name = "det_usuario")
    private String usrCodigo;

    @Column(name = "sus_fecha")
    private String susFecha;

    public SisSucesoTO() {
    }

    public SisSucesoTO(Integer susSecuencia, String susTabla, String susClave, String susSuceso, String susDetalle,
            String sus_mac, String usrEmpresa, String usrCodigo, String susFecha) {
        this.susSecuencia = susSecuencia;
        this.susTabla = susTabla;
        this.susClave = susClave;
        this.susSuceso = susSuceso;
        this.susDetalle = susDetalle;
        this.sus_mac = sus_mac;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.susFecha = susFecha;
    }

    public String getSus_mac() {
        return sus_mac;
    }

    public void setSus_mac(String sus_mac) {
        this.sus_mac = sus_mac;
    }

    public String getSusClave() {
        return susClave;
    }

    public void setSusClave(String susClave) {
        this.susClave = susClave;
    }

    public String getSusDetalle() {
        return susDetalle;
    }

    public void setSusDetalle(String susDetalle) {
        this.susDetalle = susDetalle;
    }

    public String getSusFecha() {
        return susFecha;
    }

    public void setSusFecha(String susFecha) {
        this.susFecha = susFecha;
    }

    public Integer getSusSecuencia() {
        return susSecuencia;
    }

    public void setSusSecuencia(Integer susSecuencia) {
        this.susSecuencia = susSecuencia;
    }

    public String getSusSuceso() {
        return susSuceso;
    }

    public void setSusSuceso(String susSuceso) {
        this.susSuceso = susSuceso;
    }

    public String getSusTabla() {
        return susTabla;
    }

    public void setSusTabla(String susTabla) {
        this.susTabla = susTabla;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }
}
