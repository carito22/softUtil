/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCuentasPorCobrarTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CarolValdiviezo
 */
public class InvClienteCuentasCobrarTO implements Serializable {

    String cliEmail;
    String cliNroIdentificador;
    String cliCodigo;
    String cliRazonSocial;
    List<CarCuentasPorCobrarTO> listaCuentas;

    public InvClienteCuentasCobrarTO() {
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliNroIdentificador() {
        return cliNroIdentificador;
    }

    public void setCliNroIdentificador(String cliNroIdentificador) {
        this.cliNroIdentificador = cliNroIdentificador;
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

    public List<CarCuentasPorCobrarTO> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<CarCuentasPorCobrarTO> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

}
