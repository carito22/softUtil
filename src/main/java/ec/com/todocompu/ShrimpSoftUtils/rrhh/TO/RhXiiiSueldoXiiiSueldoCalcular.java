package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhXiiiSueldo;
import java.math.BigDecimal;

public class RhXiiiSueldoXiiiSueldoCalcular {

    private RhXiiiSueldo rhXiiiSueldo;
    private RhComboFormaPagoBeneficioSocialTO formaPago;
    private BigDecimal ingresosCalculados;
    private boolean isFormaPagoValido;
    private boolean isValorValido;
    private boolean errorEnDocumento;
    private boolean documentoRepetido;

    public RhXiiiSueldoXiiiSueldoCalcular() {
    }

    public RhComboFormaPagoBeneficioSocialTO getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(RhComboFormaPagoBeneficioSocialTO formaPago) {
        this.formaPago = formaPago;
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

    public RhXiiiSueldo getRhXiiiSueldo() {
        return rhXiiiSueldo;
    }

    public void setRhXiiiSueldo(RhXiiiSueldo rhXiiiSueldo) {
        this.rhXiiiSueldo = rhXiiiSueldo;
    }

    public BigDecimal getIngresosCalculados() {
        return ingresosCalculados;
    }

    public void setIngresosCalculados(BigDecimal ingresosCalculados) {
        this.ingresosCalculados = ingresosCalculados;
    }
}
