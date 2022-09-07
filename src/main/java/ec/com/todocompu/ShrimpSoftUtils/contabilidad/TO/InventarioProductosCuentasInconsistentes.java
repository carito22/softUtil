/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos
 */
@Entity
public class InventarioProductosCuentasInconsistentes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "error_producto_codigo")
    private String errorProductoCodigo;
    @Column(name = "error_producto_nombre")
    private String errorProductoNombre;
    @Column(name = "error_producto_tipo")
    private String errorProductoTipo;
    @Column(name = "error_cuenta_codigo")
    private String errorCuentaCodigo;
    @Column(name = "error_cuenta_descripcion")
    private String errorCuentaDescripcion;

    public InventarioProductosCuentasInconsistentes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getErrorProductoCodigo() {
        return errorProductoCodigo;
    }

    public void setErrorProductoCodigo(String errorProductoCodigo) {
        this.errorProductoCodigo = errorProductoCodigo;
    }

    public String getErrorProductoNombre() {
        return errorProductoNombre;
    }

    public void setErrorProductoNombre(String errorProductoNombre) {
        this.errorProductoNombre = errorProductoNombre;
    }

    public String getErrorProductoTipo() {
        return errorProductoTipo;
    }

    public void setErrorProductoTipo(String errorProductoTipo) {
        this.errorProductoTipo = errorProductoTipo;
    }

    public String getErrorCuentaCodigo() {
        return errorCuentaCodigo;
    }

    public void setErrorCuentaCodigo(String errorCuentaCodigo) {
        this.errorCuentaCodigo = errorCuentaCodigo;
    }

    public String getErrorCuentaDescripcion() {
        return errorCuentaDescripcion;
    }

    public void setErrorCuentaDescripcion(String errorCuentaDescripcion) {
        this.errorCuentaDescripcion = errorCuentaDescripcion;
    }

}
