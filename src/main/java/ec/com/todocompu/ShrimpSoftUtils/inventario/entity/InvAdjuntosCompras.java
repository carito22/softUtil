package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "inv_compras_datos_adjuntos", schema = "inventario")
public class InvAdjuntosCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;

    @Column(name = "adj_tipo")
    private String adjTipo;
    
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "adj_archivo")
    private byte[] adjArchivo;

    @JoinColumns({
    @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa"),
    @JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo"),
    @JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo"),
    @JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero")})
    @ManyToOne(optional = false)
    private InvCompras invCompras;
    
    @Column(name = "adj_url_archivo")
    private String adjUrlArchivo;
    @Column(name = "adj_clave_archivo")
    private String adjClaveArchivo;
    @Column(name = "adj_bucket")
    private String adjBucket;
    @Column(name = "adj_verificado")
    private boolean adjVerificado;

    public InvAdjuntosCompras() {
    }

    public InvAdjuntosCompras(Integer adjSecuencial, String adjTipo, byte[] adjArchivo, InvCompras invCompras) {
        this.adjSecuencial = adjSecuencial;
        this.adjTipo = adjTipo;
        this.adjArchivo = adjArchivo;
        this.invCompras = invCompras;
    }
    
    public Integer getAdjSecuencial() {
        return adjSecuencial;
    }

    public void setAdjSecuencial(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public String getAdjTipo() {
        return adjTipo;
    }

    public void setAdjTipo(String adjTipo) {
        this.adjTipo = adjTipo;
    }

    public byte[] getAdjArchivo() {
        return adjArchivo;
    }

    public void setAdjArchivo(byte[] adjArchivo) {
        this.adjArchivo = adjArchivo;
    }

    public InvCompras getInvCompras() {
        return invCompras;
    }

    public void setInvCompras(InvCompras invCompras) {
        this.invCompras = invCompras;
    }

    public String getAdjUrlArchivo() {
        return adjUrlArchivo;
    }

    public void setAdjUrlArchivo(String adjUrlArchivo) {
        this.adjUrlArchivo = adjUrlArchivo;
    }

    public String getAdjClaveArchivo() {
        return adjClaveArchivo;
    }

    public void setAdjClaveArchivo(String adjClaveArchivo) {
        this.adjClaveArchivo = adjClaveArchivo;
    }

    public String getAdjBucket() {
        return adjBucket;
    }

    public void setAdjBucket(String adjBucket) {
        this.adjBucket = adjBucket;
    }

    public boolean isAdjVerificado() {
        return adjVerificado;
    }

    public void setAdjVerificado(boolean adjVerificado) {
        this.adjVerificado = adjVerificado;
    }
    
}
