/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

/**
 *
 * @author tabango94
 */
public class ChequeNoImpresoTO extends BanListaChequesNoImpresosTO {

    private String valorChequeLetras;
    private ConsultaDatosBancoCuentaTO datosBancoCuentaTO;
    private boolean isChequeCruzado;
    private boolean isChequeValido;
    private boolean isChequeDiferente;

    public ChequeNoImpresoTO() {
    }

    public ChequeNoImpresoTO(String valorChequeLetras, ConsultaDatosBancoCuentaTO datosBancoCuentaTO, boolean isChequeCruzado, boolean isChequeValido, boolean isChequeDiferente) {
        this.valorChequeLetras = valorChequeLetras;
        this.datosBancoCuentaTO = datosBancoCuentaTO;
        this.isChequeCruzado = isChequeCruzado;
        this.isChequeValido = isChequeValido;
        this.isChequeDiferente = isChequeDiferente;
    }

    public String getValorChequeLetras() {
        return valorChequeLetras;
    }

    public void setValorChequeLetras(String valorChequeLetras) {
        this.valorChequeLetras = valorChequeLetras;
    }

    public ConsultaDatosBancoCuentaTO getDatosBancoCuentaTO() {
        return datosBancoCuentaTO;
    }

    public void setDatosBancoCuentaTO(ConsultaDatosBancoCuentaTO datosBancoCuentaTO) {
        this.datosBancoCuentaTO = datosBancoCuentaTO;
    }

    public boolean isIsChequeCruzado() {
        return isChequeCruzado;
    }

    public void setIsChequeCruzado(boolean isChequeCruzado) {
        this.isChequeCruzado = isChequeCruzado;
    }

    public boolean isIsChequeValido() {
        return isChequeValido;
    }

    public void setIsChequeValido(boolean isChequeValido) {
        this.isChequeValido = isChequeValido;
    }

    public boolean isIsChequeDiferente() {
        return isChequeDiferente;
    }

    public void setIsChequeDiferente(boolean isChequeDiferente) {
        this.isChequeDiferente = isChequeDiferente;
    }


}
