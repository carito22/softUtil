package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdCorridasInconsistentesTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "error_origen_sector")
    private String errorOrigenSector;
    @Column(name = "error_origen_piscina")
    private String errorOrigenPiscina;
    @Column(name = "error_origen_corrida")
    private String errorOrigenCorrida;
    @Column(name = "error_origen_cierre")
    private String errorOrigenCierre;
    @Column(name = "error_destino_sector")
    private String errorDestinoSector;
    @Column(name = "error_destino_piscina")
    private String errorDestinoPiscina;
    @Column(name = "error_destino_corrida")
    private String errorDestinoCorrida;
    @Column(name = "error_destino_siembra")
    private String errorDestinoSiembra;
    @Column(name = "error_porcentaje")
    private String errorPorcentaje;
    @Column(name = "error_observaciones")
    private String errorObservaciones;

    public PrdCorridasInconsistentesTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getErrorOrigenSector() {
        return errorOrigenSector;
    }

    public void setErrorOrigenSector(String errorOrigenSector) {
        this.errorOrigenSector = errorOrigenSector;
    }

    public String getErrorOrigenPiscina() {
        return errorOrigenPiscina;
    }

    public void setErrorOrigenPiscina(String errorOrigenPiscina) {
        this.errorOrigenPiscina = errorOrigenPiscina;
    }

    public String getErrorOrigenCorrida() {
        return errorOrigenCorrida;
    }

    public void setErrorOrigenCorrida(String errorOrigenCorrida) {
        this.errorOrigenCorrida = errorOrigenCorrida;
    }

    public String getErrorOrigenCierre() {
        return errorOrigenCierre;
    }

    public void setErrorOrigenCierre(String errorOrigenCierre) {
        this.errorOrigenCierre = errorOrigenCierre;
    }

    public String getErrorDestinoSector() {
        return errorDestinoSector;
    }

    public void setErrorDestinoSector(String errorDestinoSector) {
        this.errorDestinoSector = errorDestinoSector;
    }

    public String getErrorDestinoPiscina() {
        return errorDestinoPiscina;
    }

    public void setErrorDestinoPiscina(String errorDestinoPiscina) {
        this.errorDestinoPiscina = errorDestinoPiscina;
    }

    public String getErrorDestinoCorrida() {
        return errorDestinoCorrida;
    }

    public void setErrorDestinoCorrida(String errorDestinoCorrida) {
        this.errorDestinoCorrida = errorDestinoCorrida;
    }

    public String getErrorDestinoSiembra() {
        return errorDestinoSiembra;
    }

    public void setErrorDestinoSiembra(String errorDestinoSiembra) {
        this.errorDestinoSiembra = errorDestinoSiembra;
    }

    public String getErrorPorcentaje() {
        return errorPorcentaje;
    }

    public void setErrorPorcentaje(String errorPorcentaje) {
        this.errorPorcentaje = errorPorcentaje;
    }

    public String getErrorObservaciones() {
        return errorObservaciones;
    }

    public void setErrorObservaciones(String errorObservaciones) {
        this.errorObservaciones = errorObservaciones;
    }

}
