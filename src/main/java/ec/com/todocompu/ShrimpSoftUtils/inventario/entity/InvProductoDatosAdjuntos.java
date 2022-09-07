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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author User
 */
@Entity
@Table(name = "inv_producto_datos_adjuntos", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvProductoDatosAdjuntos.findAll", query = "SELECT i FROM InvProductoDatosAdjuntos i")})
public class InvProductoDatosAdjuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;
    
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "adj_archivo")
    private byte[] adjArchivo;

    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa") , 
        @JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;
    
    @Column(name = "adj_url_archivo")
    private String adjUrlArchivo;
    @Column(name = "adj_clave_archivo")
    private String adjClaveArchivo;
    @Column(name = "adj_bucket")
    private String adjBucket;
    @Column(name = "adj_verificado")
    private boolean adjVerificado;

    public InvProductoDatosAdjuntos() {
    }

    public InvProductoDatosAdjuntos(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public InvProductoDatosAdjuntos(Integer adjSecuencial, byte[] adjArchivo) {
        this.adjSecuencial = adjSecuencial;
        this.adjArchivo = adjArchivo;
    }

    public Integer getAdjSecuencial() {
        return adjSecuencial;
    }

    public void setAdjSecuencial(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public byte[] getAdjArchivo() {
        return adjArchivo;
    }

    public void setAdjArchivo(byte[] adjArchivo) {
        this.adjArchivo = adjArchivo;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adjSecuencial != null ? adjSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvProductoDatosAdjuntos)) {
            return false;
        }
        InvProductoDatosAdjuntos other = (InvProductoDatosAdjuntos) object;
        if ((this.adjSecuencial == null && other.adjSecuencial != null) || (this.adjSecuencial != null && !this.adjSecuencial.equals(other.adjSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProductoDatosAdjuntos[ adjSecuencial=" + adjSecuencial + " ]";
    }

}
