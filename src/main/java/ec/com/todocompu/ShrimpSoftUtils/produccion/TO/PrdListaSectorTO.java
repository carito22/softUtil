package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdListaSectorTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "sec_nombre")
    private String nomSector;
    @Column(name = "sec_latitud")
    private String secLatitud;
    @Column(name = "sec_longitud")
    private String secLongitud;
    @Column(name = "sec_activo")
    private Boolean secActivo;
    @Column(name = "sec_direccion")
    private String secDireccion;
    @Column(name = "sec_telefono")
    private String secTelefono;
    @Column(name = "sec_actividad")
    private String secActividad;

    public PrdListaSectorTO() {
    }

    public PrdListaSectorTO(String secCodigo, String nomSector, String secLatitud, String secLongitud,
            Boolean secActivo) {
        this.secCodigo = secCodigo;
        this.nomSector = nomSector;
        this.secLatitud = secLatitud;
        this.secLongitud = secLongitud;
        this.secActivo = secActivo;
    }

    public Boolean getSecActivo() {
        return secActivo;
    }

    public void setSecActivo(Boolean secActivo) {
        this.secActivo = secActivo;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getSecLatitud() {
        return secLatitud;
    }

    public void setSecLatitud(String secLatitud) {
        this.secLatitud = secLatitud;
    }

    public String getSecLongitud() {
        return secLongitud;
    }

    public void setSecLongitud(String secLongitud) {
        this.secLongitud = secLongitud;
    }

    public String getSecNombre() {
        return nomSector;
    }

    public void setSecNombre(String nomSector) {
        this.nomSector = nomSector;
    }

    public String getNomSector() {
        return nomSector;
    }

    public void setNomSector(String nomSector) {
        this.nomSector = nomSector;
    }

    public String getSecDireccion() {
        return secDireccion;
    }

    public void setSecDireccion(String secDireccion) {
        this.secDireccion = secDireccion;
    }

    public String getSecTelefono() {
        return secTelefono;
    }

    public void setSecTelefono(String secTelefono) {
        this.secTelefono = secTelefono;
    }

    public String getSecActividad() {
        return secActividad;
    }

    public void setSecActividad(String secActividad) {
        this.secActividad = secActividad;
    }

    @Override
    public String toString() {
        return this.secCodigo + " " + this.nomSector;
    }

    public void convertirObjeto(PrdSector prdSector) {
        if (prdSector != null) {
            this.secActivo = prdSector.getSecActivo();
            this.nomSector = prdSector.getSecNombre();
            this.secCodigo = prdSector.getPrdSectorPK().getSecCodigo();
            this.secLatitud = prdSector.getSecLatitud();
            this.secLongitud = prdSector.getSecLongitud();
            this.secDireccion = prdSector.getSecDireccion();
            this.secTelefono = prdSector.getSecTelefono();

        }
    }

}
