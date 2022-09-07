/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class InvProveedorSinMovimientoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "prov_secuencial")
    private Integer id;
    @Column(name = "prov_empresa")
    private String provEmpresa;
    @Column(name = "prov_codigo")
    private String provCodigo;
    @Column(name = "prov_id_numero")
    private String provIdNumero;
    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    public InvProveedorSinMovimientoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvEmpresa() {
        return provEmpresa;
    }

    public void setProvEmpresa(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvIdNumero() {
        return provIdNumero;
    }

    public void setProvIdNumero(String provIdNumero) {
        this.provIdNumero = provIdNumero;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

}
