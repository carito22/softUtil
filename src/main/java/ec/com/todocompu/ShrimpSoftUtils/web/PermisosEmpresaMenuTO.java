/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.web;

import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisGrupoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresa;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresaParametros;
import java.util.List;

/**
 *
 * @author Desarrollador1
 */
public class PermisosEmpresaMenuTO extends SisEmpresa {

    private SisGrupoTO listaSisPermisoTO;
    private List<SisEmpresaParametros> parametros;

    public PermisosEmpresaMenuTO() {
    }

    public SisGrupoTO getListaSisPermisoTO() {
        return listaSisPermisoTO;
    }

    public void setListaSisPermisoTO(SisGrupoTO listaSisPermisoTO) {
        this.listaSisPermisoTO = listaSisPermisoTO;
    }

    public List<SisEmpresaParametros> getParametros() {
        return parametros;
    }

    public void setParametros(List<SisEmpresaParametros> parametros) {
        this.parametros = parametros;
    }
    
    

}
