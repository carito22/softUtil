/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhXivSueldo;
import java.math.BigDecimal;

/**
 *
 * @author Developer0
 */
public class RhXivSueldoXivSueldoCalcular {

    private RhXivSueldo rhXivSueldo;
    //Variables para la inserción
    private RhComboFormaPagoBeneficioSocialTO formaPago;
    private Integer diasLaborados;
    private boolean isFormaPagoValido;
    private boolean isValorValido;
    private boolean errorEnDocumento;
    private boolean documentoRepetido;
    private java.math.BigDecimal xivSalarioMinimoVital;

    public RhXivSueldoXivSueldoCalcular() {
    }

    public Integer getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(Integer diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public boolean isIsFormaPagoValido() {
        return isFormaPagoValido;
    }

    public void setIsFormaPagoValido(boolean isFormaPagoValido) {
        this.isFormaPagoValido = isFormaPagoValido;
    }

    public boolean isIsValorValido() {
        return isValorValido;
    }

    public void setIsValorValido(boolean isValorValido) {
        this.isValorValido = isValorValido;
    }

    public boolean isErrorEnDocumento() {
        return errorEnDocumento;
    }

    public void setErrorEnDocumento(boolean errorEnDocumento) {
        this.errorEnDocumento = errorEnDocumento;
    }

    public boolean isDocumentoRepetido() {
        return documentoRepetido;
    }

    public void setDocumentoRepetido(boolean documentoRepetido) {
        this.documentoRepetido = documentoRepetido;
    }

    public RhXivSueldo getRhXivSueldo() {
        return rhXivSueldo;
    }

    public void setRhXivSueldo(RhXivSueldo rhXivSueldo) {
        this.rhXivSueldo = rhXivSueldo;
    }

    public RhComboFormaPagoBeneficioSocialTO getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(RhComboFormaPagoBeneficioSocialTO formaPago) {
        this.formaPago = formaPago;
    }

    public BigDecimal getXivSalarioMinimoVital() {
        return xivSalarioMinimoVital;
    }

    public void setXivSalarioMinimoVital(BigDecimal xivSalarioMinimoVital) {
        this.xivSalarioMinimoVital = xivSalarioMinimoVital;
    }

}
