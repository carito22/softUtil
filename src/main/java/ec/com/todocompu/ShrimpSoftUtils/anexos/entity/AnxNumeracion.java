package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresaNotificaciones;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_numeracion", schema = "anexo")
@XmlRootElement
public class AnxNumeracion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "num_secuencial")
    private Integer numSecuencial;
    @Column(name = "num_empresa")
    private String numEmpresa;
    @Column(name = "num_comprobante")
    private String numComprobante;
    @Column(name = "num_desde")
    private String numDesde;
    @Column(name = "num_hasta")
    private String numHasta;
    @Column(name = "num_autorizacion")
    private String numAutorizacion;
    @Column(name = "num_caduca")
    private String numCaduca;
    @Column(name = "num_lineas")
    private Short numLineas;
    @Column(name = "num_formato_pos")
    private boolean numFormatoPos;
    @Column(name = "num_documento_electronico")
    private boolean numDocumentoElectronico;
    @Column(name = "num_ambiente_produccion")
    private boolean numAmbienteProduccion;
    @Column(name = "num_autorizacion_automatica")
    private boolean numAutorizacionAutomatica;
    @Column(name = "num_mostrar_dialogo_impresion")
    private boolean numMostrarDialogoImpresion;
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumn(name = "id_notificaciones", referencedColumnName = "id")
    @ManyToOne(optional = true)
    private SisEmpresaNotificaciones idNotificaciones;
    @Column(name = "num_observacion")
    private String numObservacion;

    public AnxNumeracion() {
    }

    public AnxNumeracion(Integer numSecuencial) {
        this.numSecuencial = numSecuencial;
    }

    public AnxNumeracion(Integer numSecuencial, String numEmpresa, String numComprobante, String numDesde,
            String numHasta, boolean numFormatoPos, boolean numDocumentoElectronico, boolean numAmbienteProduccion,
            boolean numAutorizacionAutomatica, boolean numMostrarDialogoImpresion, String secEmpresa, String secCodigo, String usrEmpresa,
            String usrCodigo, Date usrFechaInserta, String numObservacion) {
        this.numSecuencial = numSecuencial;
        this.numEmpresa = numEmpresa;
        this.numComprobante = numComprobante;
        this.numDesde = numDesde;
        this.numHasta = numHasta;
        this.numFormatoPos = numFormatoPos;
        this.numDocumentoElectronico = numDocumentoElectronico;
        this.numAmbienteProduccion = numAmbienteProduccion;
        this.numAutorizacionAutomatica = numAutorizacionAutomatica;
        this.numMostrarDialogoImpresion = numMostrarDialogoImpresion;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.numObservacion = numObservacion;
    }

    public Integer getNumSecuencial() {
        return numSecuencial;
    }

    public void setNumSecuencial(Integer numSecuencial) {
        this.numSecuencial = numSecuencial;
    }

    public String getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public String getNumDesde() {
        return numDesde;
    }

    public void setNumDesde(String numDesde) {
        this.numDesde = numDesde;
    }

    public String getNumHasta() {
        return numHasta;
    }

    public void setNumHasta(String numHasta) {
        this.numHasta = numHasta;
    }

    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    public String getNumCaduca() {
        return numCaduca;
    }

    public void setNumCaduca(String numCaduca) {
        this.numCaduca = numCaduca;
    }

    public Short getNumLineas() {
        return numLineas;
    }

    public void setNumLineas(Short numLineas) {
        this.numLineas = numLineas;
    }

    public boolean getNumFormatoPos() {
        return numFormatoPos;
    }

    public void setNumFormatoPos(boolean numFormatoPos) {
        this.numFormatoPos = numFormatoPos;
    }

    public boolean getNumDocumentoElectronico() {
        return numDocumentoElectronico;
    }

    public void setNumDocumentoElectronico(boolean numDocumentoElectronico) {
        this.numDocumentoElectronico = numDocumentoElectronico;
    }

    public boolean getNumAmbienteProduccion() {
        return numAmbienteProduccion;
    }

    public void setNumAmbienteProduccion(boolean numAmbienteProduccion) {
        this.numAmbienteProduccion = numAmbienteProduccion;
    }

    public boolean isNumAutorizacionAutomatica() {
        return numAutorizacionAutomatica;
    }

    public void setNumAutorizacionAutomatica(boolean numAutorizacionAutomatica) {
        this.numAutorizacionAutomatica = numAutorizacionAutomatica;
    }

    public boolean getNumMostrarDialogoImpresion() {
        return numMostrarDialogoImpresion;
    }

    public void setNumMostrarDialogoImpresion(boolean numMostrarDialogoImpresion) {
        this.numMostrarDialogoImpresion = numMostrarDialogoImpresion;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numSecuencial != null ? numSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AnxNumeracion)) {
            return false;
        }
        AnxNumeracion other = (AnxNumeracion) object;
        if ((this.numSecuencial == null && other.numSecuencial != null)
                || (this.numSecuencial != null && !this.numSecuencial.equals(other.numSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anexos.entity.AnxNumeracion[ numSecuencial=" + numSecuencial + " ]";
    }

    public SisEmpresaNotificaciones getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(SisEmpresaNotificaciones idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

    public String getNumObservacion() {
        return numObservacion;
    }

    public void setNumObservacion(String numObservacion) {
        this.numObservacion = numObservacion;
    }

}
