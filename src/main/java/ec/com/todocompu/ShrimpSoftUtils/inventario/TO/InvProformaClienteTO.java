/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class InvProformaClienteTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "prof_empresa")
    private String profEmpresa;

    @Column(name = "prof_periodo")
    private String profPeriodo;

    @Column(name = "prof_motivo")
    private String profMotivo;

    @Column(name = "prof_numero")
    private String profNumero;

    @Column(name = "prof_fecha")
    private String profFecha;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "cli_razon_social")
    private String cliRazonSocial;

    public InvProformaClienteTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfEmpresa() {
        return profEmpresa;
    }

    public void setProfEmpresa(String profEmpresa) {
        this.profEmpresa = profEmpresa;
    }

    public String getProfPeriodo() {
        return profPeriodo;
    }

    public void setProfPeriodo(String profPeriodo) {
        this.profPeriodo = profPeriodo;
    }

    public String getProfMotivo() {
        return profMotivo;
    }

    public void setProfMotivo(String profMotivo) {
        this.profMotivo = profMotivo;
    }

    public String getProfNumero() {
        return profNumero;
    }

    public void setProfNumero(String profNumero) {
        this.profNumero = profNumero;
    }

    public String getProfFecha() {
        return profFecha;
    }

    public void setProfFecha(String profFecha) {
        this.profFecha = profFecha;
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

}
