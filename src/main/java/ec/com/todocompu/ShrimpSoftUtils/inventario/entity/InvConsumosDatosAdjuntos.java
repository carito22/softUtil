/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "inv_consumos_datos_adjuntos", schema = "inventario")
public class InvConsumosDatosAdjuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "adj_tipo")
    private String adjTipo;
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "adj_archivo")
    private byte[] adjArchivo;
    @JoinColumns({
        @JoinColumn(name = "cons_empresa", referencedColumnName = "cons_empresa")
        , @JoinColumn(name = "cons_periodo", referencedColumnName = "cons_periodo")
        , @JoinColumn(name = "cons_motivo", referencedColumnName = "cons_motivo")
        , @JoinColumn(name = "cons_numero", referencedColumnName = "cons_numero")})
    @ManyToOne(optional = false)
    private InvConsumos invConsumos;

    @Column(name = "adj_url_archivo")
    private String adjUrlArchivo;
    @Column(name = "adj_clave_archivo")
    private String adjClaveArchivo;
    @Column(name = "adj_bucket")
    private String adjBucket;

    public InvConsumosDatosAdjuntos() {
    }

    public InvConsumosDatosAdjuntos(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public InvConsumosDatosAdjuntos(Integer adjSecuencial, String adjTipo, byte[] adjArchivo) {
        this.adjSecuencial = adjSecuencial;
        this.adjTipo = adjTipo;
        this.adjArchivo = adjArchivo;
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

    public InvConsumos getInvConsumos() {
        return invConsumos;
    }

    public void setInvConsumos(InvConsumos invConsumos) {
        this.invConsumos = invConsumos;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adjSecuencial != null ? adjSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvConsumosDatosAdjuntos)) {
            return false;
        }
        InvConsumosDatosAdjuntos other = (InvConsumosDatosAdjuntos) object;
        if ((this.adjSecuencial == null && other.adjSecuencial != null) || (this.adjSecuencial != null && !this.adjSecuencial.equals(other.adjSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvConsumosDatosAdjuntos[ adjSecuencial=" + adjSecuencial + " ]";
    }

}
