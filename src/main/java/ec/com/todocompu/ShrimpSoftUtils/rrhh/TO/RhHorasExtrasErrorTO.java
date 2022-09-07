package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Trabajo
 */
public class RhHorasExtrasErrorTO implements Serializable {

    private String empId;
    private String mensaje;
    private RhListaEmpleadoLoteTO datosEmpleado;

    public RhHorasExtrasErrorTO() {
    }

    public RhHorasExtrasErrorTO(String empId, String mensaje, RhListaEmpleadoLoteTO datosEmpleado) {
        this.empId = empId;
        this.mensaje = mensaje;
        this.datosEmpleado = datosEmpleado;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public RhListaEmpleadoLoteTO getDatosEmpleado() {
        return datosEmpleado;
    }

    public void setDatosEmpleado(RhListaEmpleadoLoteTO datosEmpleado) {
        this.datosEmpleado = datosEmpleado;
    }

}
