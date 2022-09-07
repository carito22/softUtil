/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.web;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author developer3
 */
public class EmpresaPermisoTO {
    
    private List<Object> lista;
    private List<Object> listaSimple;
    private List<Object> listaSimple1;
    private List<Object> listaSimple2;
    private String mensajerespuesta;
    private String tiempo;
    private String filas;
    private String rutaPdf;
    private int numeroContable;
    private int columnasEstadosFinancieros;

    private BigDecimal datos;

    public EmpresaPermisoTO() {
        lista = new ArrayList<Object>();
    }

    public List<Object> getListaSimple() {
        return listaSimple;
    }

    public int getColumnasEstadosFinancieros() {
        return columnasEstadosFinancieros;
    }

    public void setColumnasEstadosFinancieros(int columnasEstadosFinancieros) {
        this.columnasEstadosFinancieros = columnasEstadosFinancieros;
    }

    public void setListaSimple(List<Object> listaSimple) {
        this.listaSimple = listaSimple;
    }

    public List<Object> getLista() {
        return lista;
    }

    public void setLista(List<Object> lista) {
        this.lista = lista;
    }

    public String getTiempo() {
        return tiempo;
    }

    //voy a dejar hasta mientras el mismo metodo pero sobrecargado este que recibe un STRING, no borrar
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    //voy a dejar hasta mientras el mismo metodo pero sobrecargado este que recibe un LONG, no borrar
    public void setTiempo(long tiempo) {
        double tiempo2 = tiempo / 1000.0;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.UP);
        this.tiempo = df.format(tiempo2).replace(",", ".");
    }

    public String getFilas() {
        return filas;
    }

    public void setFilas(String filas) {
        this.filas = filas;
    }

    public String getrutaPdf() {
        return rutaPdf;
    }

    public void setrutaPdf(String rutaPdf) {
        this.rutaPdf = rutaPdf;
    }

    public BigDecimal getDatos() {
        return datos;
    }

    public void setDatos(BigDecimal datos) {
        this.datos = datos;
    }

    public String getMensajerespuesta() {
        return mensajerespuesta;
    }

    public void setMensajerespuesta(String mensajerespuesta) {
        this.mensajerespuesta = mensajerespuesta;
    }

    public int getNumeroContable() {
        return numeroContable;
    }

    public void setNumeroContable(int numeroContable) {
       
        this.numeroContable = numeroContable;
    }

    public List<Object> getListaSimple1() {
        return listaSimple1;
    }

    public void setListaSimple1(List<Object> listaSimple1) {
        this.listaSimple1 = listaSimple1;
    }

    public List<Object> getListaSimple2() {
        return listaSimple2;
    }

    public void setListaSimple2(List<Object> listaSimple2) {
        this.listaSimple2 = listaSimple2;
    }
    
}
