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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "inv_clientes_direcciones", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvClientesDirecciones.findAll", query = "SELECT i FROM InvClientesDirecciones i")})
public class InvClientesDirecciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dir_secuencial")
    private Integer dirSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "dir_codigo_establecimiento")
    private String dirCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "dir_detalle")
    private String dirDetalle;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        , @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne(optional = false)
    private InvCliente invCliente;

    public InvClientesDirecciones() {
    }

    public InvClientesDirecciones(Integer dirSecuencial) {
        this.dirSecuencial = dirSecuencial;
    }

    public Integer getDirSecuencial() {
        return dirSecuencial;
    }

    public void setDirSecuencial(Integer dirSecuencial) {
        this.dirSecuencial = dirSecuencial;
    }

    public String getDirCodigo() {
        return dirCodigo;
    }

    public void setDirCodigo(String dirCodigo) {
        this.dirCodigo = dirCodigo;
    }
    
    public String getDirDetalle() {
        return dirDetalle;
    }

    public void setDirDetalle(String dirDetalle) {
        this.dirDetalle = dirDetalle;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

}
