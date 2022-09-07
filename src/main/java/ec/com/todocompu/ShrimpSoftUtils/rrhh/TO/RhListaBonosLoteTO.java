/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaPiscinaTO;
import java.util.List;

/**
 *
 * @author User
 */
public class RhListaBonosLoteTO {

    public RhListaEmpleadoLoteTO rhListaEmpleadoLoteTO;
    //NUEVOS CAMPOS
    private RhListaBonoConceptoTO concepto;
    private PrdListaPiscinaTO piscina;
    private String observacion;
    private boolean deducible;
    private boolean isConceptoValido;
    private boolean isValorValido;
    private List<PrdListaPiscinaTO> listaPiscinas;

    //Variables propias de RhBono
    private Integer bonoSecuencial;
    private boolean bonoAuxiliar;

    public RhListaBonosLoteTO() {
        this.concepto = null;
        this.piscina = null;
        this.deducible = true;
        this.isConceptoValido = true;
        this.bonoAuxiliar = true;
    }

    public RhListaEmpleadoLoteTO getRhListaEmpleadoLoteTO() {
        return rhListaEmpleadoLoteTO;
    }

    public void setRhListaEmpleadoLoteTO(RhListaEmpleadoLoteTO rhListaEmpleadoLoteTO) {
        this.rhListaEmpleadoLoteTO = rhListaEmpleadoLoteTO;
    }

    public RhListaBonoConceptoTO getConcepto() {
        return concepto;
    }

    public void setConcepto(RhListaBonoConceptoTO concepto) {
        this.concepto = concepto;
    }

    public PrdListaPiscinaTO getPiscina() {
        return piscina;
    }

    public void setPiscina(PrdListaPiscinaTO piscina) {
        this.piscina = piscina;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean isDeducible() {
        return deducible;
    }

    public void setDeducible(boolean deducible) {
        this.deducible = deducible;
    }

    public boolean isIsConceptoValido() {
        return isConceptoValido;
    }

    public void setIsConceptoValido(boolean isConceptoValido) {
        this.isConceptoValido = isConceptoValido;
    }

    public boolean isIsValorValido() {
        return isValorValido;
    }

    public void setIsValorValido(boolean isValorValido) {
        this.isValorValido = isValorValido;
    }

    public Integer getBonoSecuencial() {
        return bonoSecuencial;
    }

    public void setBonoSecuencial(Integer bonoSecuencial) {
        this.bonoSecuencial = bonoSecuencial;
    }

    public boolean isBonoAuxiliar() {
        return bonoAuxiliar;
    }

    public void setBonoAuxiliar(boolean bonoAuxiliar) {
        this.bonoAuxiliar = bonoAuxiliar;
    }

    public List<PrdListaPiscinaTO> getListaPiscinas() {
        return listaPiscinas;
    }

    public void setListaPiscinas(List<PrdListaPiscinaTO> listaPiscinas) {
        this.listaPiscinas = listaPiscinas;
    }

}
