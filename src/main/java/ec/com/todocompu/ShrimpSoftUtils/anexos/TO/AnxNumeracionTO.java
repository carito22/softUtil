package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxNumeracionTO implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "num_secuencial")
    private Integer numSecuencial;
    @Column(name = "num_empresa")
    private String numEmpresa;
    @Column(name = "num_comprobante")
    private String numComprobante;
    @Column(name = "fp_codigo")
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
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;
    @Column(name = "id_notificaciones")
    private int idNotificaciones;
    @Column(name = "num_observacion")
    private String numObservacion;

    public AnxNumeracionTO(Integer numSecuencial, String numEmpresa, String numComprobante, String numDesde, String numHasta, String numAutorizacion, String numCaduca, Short numLineas, boolean numFormatoPos, boolean numDocumentoElectronico, boolean numAmbienteProduccion, boolean numAutorizacionAutomatica, boolean numMostrarDialogoImpresion, String secCodigo, String usrCodigo, String usrFechaInserta, String numObservacion) {
        this.numSecuencial = numSecuencial;
        this.numEmpresa = numEmpresa;
        this.numComprobante = numComprobante;
        this.numDesde = numDesde;
        this.numHasta = numHasta;
        this.numAutorizacion = numAutorizacion;
        this.numCaduca = numCaduca;
        this.numLineas = numLineas;
        this.numFormatoPos = numFormatoPos;
        this.numDocumentoElectronico = numDocumentoElectronico;
        this.numAmbienteProduccion = numAmbienteProduccion;
        this.numAutorizacionAutomatica = numAutorizacionAutomatica;
        this.numMostrarDialogoImpresion = numMostrarDialogoImpresion;
        this.secCodigo = secCodigo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.numObservacion = numObservacion;
    }

    public AnxNumeracionTO() {
    }

    public boolean isNumAmbienteProduccion() {
        return numAmbienteProduccion;
    }

    public void setNumAmbienteProduccion(boolean numAmbienteProduccion) {
        this.numAmbienteProduccion = numAmbienteProduccion;
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

    public boolean isNumDocumentoElectronico() {
        return numDocumentoElectronico;
    }

    public void setNumDocumentoElectronico(boolean numDocumentoElectronico) {
        this.numDocumentoElectronico = numDocumentoElectronico;
    }

    public String getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public boolean isNumFormatoPos() {
        return numFormatoPos;
    }

    public void setNumFormatoPos(boolean numFormatoPos) {
        this.numFormatoPos = numFormatoPos;
    }

    public String getNumHasta() {
        return numHasta;
    }

    public void setNumHasta(String numHasta) {
        this.numHasta = numHasta;
    }

    public Short getNumLineas() {
        return numLineas;
    }

    public void setNumLineas(Short numLineas) {
        this.numLineas = numLineas;
    }

    public boolean isNumAutorizacionAutomatica() {
        return numAutorizacionAutomatica;
    }

    public void setNumAutorizacionAutomatica(boolean numAutorizacionAutomatica) {
        this.numAutorizacionAutomatica = numAutorizacionAutomatica;
    }

    public boolean isNumMostrarDialogoImpresion() {
        return numMostrarDialogoImpresion;
    }

    public void setNumMostrarDialogoImpresion(boolean numMostrarDialogoImpresion) {
        this.numMostrarDialogoImpresion = numMostrarDialogoImpresion;
    }

    public Integer getNumSecuencial() {
        return numSecuencial;
    }

    public void setNumSecuencial(Integer numSecuencial) {
        this.numSecuencial = numSecuencial;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String establecimientoPtoEmisionDesde() {
        return numDesde.split("-")[0] + "-" + numDesde.split("-")[1];
    }

    public int secuenciaDesde() {
        return Integer.parseInt(numDesde.split("-")[2]);
    }

    public String establecimientoPtoEmisionHasta() {
        return numHasta.split("-")[0] + "-" + numHasta.split("-")[1];
    }

    public int secuenciaHasta() {
        return Integer.parseInt(numHasta.split("-")[2]);
    }

    public int getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(int idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

    public String getNumObservacion() {
        return numObservacion;
    }

    public void setNumObservacion(String numObservacion) {
        this.numObservacion = numObservacion;
    }

}
