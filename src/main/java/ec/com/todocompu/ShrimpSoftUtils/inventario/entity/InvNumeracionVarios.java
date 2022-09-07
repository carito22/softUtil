package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inv_numeracion_varios", schema = "inventario")
public class InvNumeracionVarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "num_empresa")
    private String numEmpresa;
    @Column(name = "num_clientes")
    private String numClientes;
    @Column(name = "num_proveedores")
    private String numProveedores;
    @Column(name = "num_productos")
    private String numProductos;
    @Column(name = "num_transportistas")
    private String numTransportistas;
    @Column(name = "emp_codigo")
    private String empCodigo;

    public InvNumeracionVarios() {
    }

    public InvNumeracionVarios(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public InvNumeracionVarios(String numEmpresa, String numClientes, String numProveedores, String numProductos, String empCodigo) {
        this.numEmpresa = numEmpresa;
        this.numClientes = numClientes;
        this.numProveedores = numProveedores;
        this.numProductos = numProductos;
        this.empCodigo = empCodigo;
    }

    public InvNumeracionVarios(String numEmpresa, String numClientes, String numProveedores, String numProductos, String numTransportistas, String empCodigo) {
        this.numEmpresa = numEmpresa;
        this.numClientes = numClientes;
        this.numProveedores = numProveedores;
        this.numProductos = numProductos;
        this.numTransportistas = numTransportistas;
        this.empCodigo = empCodigo;
    }

    public String getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public String getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(String numClientes) {
        this.numClientes = numClientes;
    }

    public String getNumProveedores() {
        return numProveedores;
    }

    public void setNumProveedores(String numProveedores) {
        this.numProveedores = numProveedores;
    }

    public String getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(String numProductos) {
        this.numProductos = numProductos;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getNumTransportistas() {
        return numTransportistas;
    }

    public void setNumTransportistas(String numTransportistas) {
        this.numTransportistas = numTransportistas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numEmpresa != null ? numEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvNumeracionVarios)) {
            return false;
        }
        InvNumeracionVarios other = (InvNumeracionVarios) object;
        if ((this.numEmpresa == null && other.numEmpresa != null)
                || (this.numEmpresa != null && !this.numEmpresa.equals(other.numEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvNumeracionVarios[ numEmpresa=" + numEmpresa + " ]";
    }

}
