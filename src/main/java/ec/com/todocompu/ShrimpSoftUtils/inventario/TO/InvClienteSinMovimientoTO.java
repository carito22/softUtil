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
public class InvClienteSinMovimientoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cli_secuencial")
    private Integer id;
    @Column(name = "cli_empresa")
    private String cliEmpresa;
    @Column(name = "cli_codigo")
    private String cliCodigo;
    @Column(name = "cli_id_numero")
    private String cliIdNumero;
    @Column(name = "cli_razon_social")
    private String cliRazonSocial;

    public InvClienteSinMovimientoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }

    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliIdNumero() {
        return cliIdNumero;
    }

    public void setCliIdNumero(String cliIdNumero) {
        this.cliIdNumero = cliIdNumero;
    }

}
