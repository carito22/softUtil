/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author developer3
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvPedidosConfiguracionTO implements Serializable {

    private List<InvPedidosMotivoDetalleRegistradoresTO> listRegistradores;
    private List<InvPedidosMotivoDetalleAprobadoresTO> listAprobadores;
    private List<InvPedidosMotivoDetalleEjecutoresTO> listEjecutores;

    public InvPedidosConfiguracionTO() {
        listRegistradores = new ArrayList<>();
        listAprobadores=new ArrayList<>();
        listEjecutores=new ArrayList<>();
    }

    public List<InvPedidosMotivoDetalleRegistradoresTO> getListRegistradores() {
        return listRegistradores;
    }

    public void setListRegistradores(List<InvPedidosMotivoDetalleRegistradoresTO> listRegistradores) {
        this.listRegistradores = listRegistradores;
    }

    public List<InvPedidosMotivoDetalleAprobadoresTO> getListAprobadores() {
        return listAprobadores;
    }

    public void setListAprobadores(List<InvPedidosMotivoDetalleAprobadoresTO> listAprobadores) {
        this.listAprobadores = listAprobadores;
    }

    public List<InvPedidosMotivoDetalleEjecutoresTO> getListEjecutores() {
        return listEjecutores;
    }

    public void setListEjecutores(List<InvPedidosMotivoDetalleEjecutoresTO> listEjecutores) {
        this.listEjecutores = listEjecutores;
    }


}
