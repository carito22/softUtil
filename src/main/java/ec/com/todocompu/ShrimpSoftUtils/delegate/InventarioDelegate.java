package ec.com.todocompu.ShrimpSoftUtils.delegate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import ec.com.todocompu.ShrimpSoftUtils.MensajeTO;
import ec.com.todocompu.ShrimpSoftUtils.Propiedades;
import ec.com.todocompu.ShrimpSoftUtils.RetornoTO;
import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.UtilsRESTFul;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraDetalleTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraFormaPagoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraReembolsoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxVentaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.entity.AnxPorcentajeIce;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContablePK;
import ec.com.todocompu.ShrimpSoftUtils.inventario.TO.*;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvAdjuntosCompras;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvBodega;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvCliente;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvComprasMotivoAnulacion;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvComprasPK;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvConsumos;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvConsumosDetalle;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvConsumosMotivo;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvConsumosMotivoAnulacion;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProducto;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProveedor;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvTransferenciasMotivoAnulacion;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvVentasMotivoAnulacion;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.DatoFunListaProductosImpresionPlaca;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.InvListaConsultaCompra;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.InvListaConsultaConsumo;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.InvListaConsultaTransferencia;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.InvListaConsultaVenta;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.ReporteCompraDetalle;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.ReporteProformaDetalle;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.ReporteVentaDetalle;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class InventarioDelegate {

    private static InventarioDelegate inventarioDelegate;
    private RestTemplate restTemplate = new RestTemplate();
    private String conexionWS;

    private InventarioDelegate() throws Exception {
        Properties propSistema = Propiedades.readPropiedades();
        conexionWS = propSistema.getProperty("servidor.ip") + ":"
                + propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
                + "/todocompuWS/inventarioController";
    }

    public static InventarioDelegate getInstance() {
        if (inventarioDelegate == null) {
            try {
                inventarioDelegate = new InventarioDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return inventarioDelegate;
    }

    public String accionInvProveedorCategoria(InvProveedorCategoriaTO invProveedorCategoriaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProveedorCategoriaTO", invProveedorCategoriaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvProveedorCategoria", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProveedorCategoriaTO> getInvProveedorCategoria(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvProveedorCategoriaTO",
                    UtilsJSON.objetoToJson(map), InvProveedorCategoriaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvClienteCategoria(InvClienteCategoriaTO invClienteCategoriaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invClienteCategoriaTO", invClienteCategoriaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvClienteCategoria", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Object[] getCompra(String empresa, String perCodigo, String motCodigo, String compNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("perCodigo", perCodigo);
            map.put("motCodigo", motCodigo);
            map.put("compNumero", compNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getCompra", UtilsJSON.objetoToJson(map), Object[].class,
                    map);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Object[] getVenta(String empresa, String perCodigo, String motCodigo, String compNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("perCodigo", perCodigo);
            map.put("motCodigo", motCodigo);
            map.put("compNumero", compNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getVenta", UtilsJSON.objetoToJson(map), Object[].class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvClienteCategoriaTO> getInvClienteCategoriaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvClienteCategoriaTO",
                    UtilsJSON.objetoToJson(map), InvClienteCategoriaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvProductoCategoria(InvProductoCategoriaTO invProductoCategoriaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoCategoriaTO", invProductoCategoriaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvProductoCategoria", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoCategoriaTO> getInvProductoCategoria(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvProductoCategoriaTO",
                    UtilsJSON.objetoToJson(map), InvProductoCategoriaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvProductoMedida(InvProductoMedidaTO invProductoMedidaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoMedidaTO", invProductoMedidaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvProductoMedida", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoMedidaTO> getInvProductoMedidaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvProductoMedidaTO",
                    UtilsJSON.objetoToJson(map), InvProductoMedidaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvProductoDAOTO buscarInvProductoDAOTO(String empresa, String codigoProducto, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoProducto", codigoProducto);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/buscarInvProductoDAOTO", UtilsJSON.objetoToJson(map),
                    InvProductoDAOTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaProductosTO> getListaProductosTO(String empresa, String busqueda, String bodega,
            String categoria, String fecha, boolean incluirInactivos, boolean limite, boolean codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("busqueda", busqueda);
            map.put("bodega", bodega);
            map.put("categoria", categoria);
            map.put("fecha", fecha.trim().isEmpty() ? null : "'" + fecha + "'");
            map.put("incluirInactivos", incluirInactivos);
            map.put("limite", limite);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<InvListaProductosTO>(
                    Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaProductosTO",
                            UtilsJSON.objetoToJson(map), InvListaProductosTO[].class, map)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaClienteTO> getListaClienteTO(String empresa, String busqueda, boolean activo_Cliente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("busqueda", busqueda);
            map.put("activo_Cliente", activo_Cliente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaClienteTO",
                    UtilsJSON.objetoToJson(map), InvListaClienteTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaProveedoresTO> getListaProveedoresTO(String empresa, String busqueda, boolean activoProveedor, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("busqueda", busqueda);
            map.put("activoProveedor", activoProveedor);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaProveedoresTO",
                    UtilsJSON.objetoToJson(map), InvListaProveedoresTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaBodegasTO> getListaBodegasTO(String empresa, boolean inactivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("inactivo", inactivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBodegasTO",
                    UtilsJSON.objetoToJson(map), InvListaBodegasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvComboBodegaTO> getInvComboBodegaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvComboBodegaTO",
                    UtilsJSON.objetoToJson(map), InvComboBodegaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvCategoriaComboProductoTO> getListaCategoriaComboTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaCategoriaComboTO",
                    UtilsJSON.objetoToJson(map), InvCategoriaComboProductoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoMarcaComboListadoTO> getInvMarcaComboListadoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvMarcaComboListadoTO",
                    UtilsJSON.objetoToJson(map), InvProductoMarcaComboListadoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public List<AnxPorcentajeIce> listarPorcentajesIce(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/listarPorcentajesIce",
                    UtilsJSON.objetoToJson(map), AnxPorcentajeIce[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvProductoMarcaTO(InvProductoMarcaTO invProductoMarcaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoMarcaTO", invProductoMarcaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvProductoMarcaTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvVendedorTO(InvVendedorTO invVendedorTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invVendedorTO", invVendedorTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvVendedorTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoPresentacionUnidadesComboListadoTO> getListaPresentacionUnidadComboTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPresentacionUnidadComboTO",
                    UtilsJSON.objetoToJson(map), InvProductoPresentacionUnidadesComboListadoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvProductoPresentacionUnidadesTO(
            InvProductoPresentacionUnidadesTO invProductoPresentacionUnidadesTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoPresentacionUnidadesTO", invProductoPresentacionUnidadesTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvProductoPresentacionUnidadesTO",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoPresentacionCajasComboListadoTO> getListaPresentacionCajaComboTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPresentacionCajaComboTO",
                    UtilsJSON.objetoToJson(map), InvProductoPresentacionCajasComboListadoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvProductoPresentacionCajasTO(InvProductoPresentacionCajasTO invProductoPresentacionCajasTO,
            char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoPresentacionCajasTO", invProductoPresentacionCajasTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvProductoPresentacionCajasTO",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvCompraMotivoComboTO> getListaCompraMotivoComboto(String empresa, Boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaCompraMotivoComboTO",
                    UtilsJSON.objetoToJson(map), InvCompraMotivoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvVentaMotivoComboTO> getListaVentaMotivoComboTO(String empresa, Boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaVentaMotivoComboTO",
                    UtilsJSON.objetoToJson(map), InvVentaMotivoComboTO[].class, map));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProformaMotivoComboTO> getListaProformaMotivoComboto(String empresa, boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaProformaMotivoComboTO",
                    UtilsJSON.objetoToJson(map), InvProformaMotivoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvCategoriaProveedorComboTO> getListaCategoriaProveedorComboTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaCategoriaProveedorComboTO",
                    UtilsJSON.objetoToJson(map), InvCategoriaProveedorComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvCategoriaClienteComboTO> getListaCategoriaClienteComboTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaCategoriaClienteComboTO",
                    UtilsJSON.objetoToJson(map), InvCategoriaClienteComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoTO> getProductoTO(String empresa, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getProductoTO", UtilsJSON.objetoToJson(map),
                    InvProductoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvClienteTO> getClienteTO(String empresa, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getClienteTO", UtilsJSON.objetoToJson(map),
                    InvClienteTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProveedorTO> getProveedorTO(String empresa, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getProveedorTO", UtilsJSON.objetoToJson(map),
                    InvProveedorTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvProveedorTO getBuscaCedulaProveedorTO(String empresa, String cedRuc, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cedRuc", cedRuc);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getBuscaCedulaProveedorTO", UtilsJSON.objetoToJson(map),
                    InvProveedorTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean comprobarInvAplicaRetencionIva(String empresa, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/comprobarInvAplicaRetencionIva",
                    UtilsJSON.objetoToJson(map), boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }
    // </editor-fold>

    public String insertarProductoTO(InvProductoTO invProductoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoTO", invProductoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);

            return restTemplate.postForObject(conexionWS + "/insertarProductoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean productoRepetidoCodigoBarra(String empresa, String barras, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("barras", barras);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/productoRepetidoCodigoBarra", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String modificarProductoTO(InvProductoTO invProductoTO, String codigoCambiarLlave, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoTO", invProductoTO);
            map.put("codigoCambiarLlave", codigoCambiarLlave);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarProductoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvBodegaTO> getBodegaTO(String empresa, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBodegaTO", UtilsJSON.objetoToJson(map),
                    InvBodegaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvComboFormaPagoTO> getComboFormaPagoCompra(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboFormaPagoCompra",
                    UtilsJSON.objetoToJson(map), InvComboFormaPagoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteCompraDetalleImprimir(List<ReporteCompraDetalle> reporteCompraDetalles,
            String cmFormaImprimir, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("reporteCompraDetalles", reporteCompraDetalles);
            map.put("cmFormaImprimir", cmFormaImprimir);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reporteCompraDetalleImprimir.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCompraDetalleImprimir", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarInvProductoTO(InvProductoTO invProductoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoTO", invProductoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarInvProductoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarClienteTO(InvClienteTO invClienteTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invClienteTO", invClienteTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarClienteTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO modificarClienteTO(InvClienteTO invClienteTO, String codigoAnterior, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invClienteTO", invClienteTO);
            map.put("codigoAnterior", codigoAnterior);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarClienteTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO eliminarInvClienteTO(InvClienteTO invClienteTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invClienteTO", invClienteTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarInvClienteTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getClienteRepetido(String empresa, String codigo, String id, String nombre, String razonSocial, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("id", id);
            map.put("nombre", nombre);
            map.put("razonSocial", razonSocial);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getClienteRepetido", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarProveedorTO(InvProveedorTO invProveedorTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProveedorTO", invProveedorTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarProveedorTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO modificarProveedorTO(InvProveedorTO invProveedorTO, String codigoAnterior, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProveedorTO", invProveedorTO);
            map.put("codigoAnterior", codigoAnterior);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarProveedorTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO eliminarInvProveedorTO(InvProveedorTO invProveedorTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProveedorTO", invProveedorTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarInvProveedorTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarBodegaTO(InvBodegaTO invBodegaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invBodegaTO", invBodegaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarBodegaTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarBodegaTO(InvBodegaTO invBodegaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invBodegaTO", invBodegaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarBodegaTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarBodegaTO(InvBodegaTO invBodegaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invBodegaTO", invBodegaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarBodegaTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarInvComprasTO(InvComprasTO invComprasTO, List<InvComprasDetalleTO> listaInvComprasDetalleTO,
            AnxCompraTO anxCompraTO, List<AnxCompraDetalleTO> anxCompraDetalleTO,
            List<AnxCompraReembolsoTO> anxCompraReembolsoTO, List<AnxCompraFormaPagoTO> anxCompraFormaPagoTO,
            List<InvAdjuntosCompras> listImagen, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasTO", invComprasTO);
            map.put("listaInvComprasDetalleTO", listaInvComprasDetalleTO);
            map.put("anxCompraTO", anxCompraTO);
            map.put("anxCompraDetalleTO", anxCompraDetalleTO);
            map.put("anxCompraReembolsoTO", anxCompraReembolsoTO);
            map.put("anxCompraFormaPagoTO", anxCompraFormaPagoTO);
            map.put("listImagen", listImagen);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvComprasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarInvVentasTO(InvVentasTO invVentasTO, List<InvVentasDetalleTO> listaInvVentasDetalleTO,
            AnxVentaTO anxVentasTO, String tipoDocumentoComplemento, String numeroDocumentoComplemento,
            Boolean isComprobanteElectronica, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invVentasTO", invVentasTO);
            map.put("listaInvVentasDetalleTO", listaInvVentasDetalleTO);
            map.put("anxVentasTO", anxVentasTO);
            map.put("tipoDocumentoComplemento", tipoDocumentoComplemento);
            map.put("numeroDocumentoComplemento", numeroDocumentoComplemento);
            map.put("isComprobanteElectronica", isComprobanteElectronica);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvVentasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getConteoNumeroFacturaVenta(String empresaCodigo, String compDocumentoTipo,
            String compDocumentoNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresaCodigo", empresaCodigo);
            map.put("compDocumentoTipo", compDocumentoTipo);
            map.put("compDocumentoNumero", compDocumentoNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getConteoNumeroFacturaVenta", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarInvProformasTO(InvProformasTO invProformasTO,
            List<InvProformasDetalleTO> listaInvProformasDetalleTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProformasTO", invProformasTO);
            map.put("listaInvProformasDetalleTO", listaInvProformasDetalleTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvProformasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO validarInvContableComprasDetalleTO(String empresa, String periodo, String motivo,
            String compraNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("compraNumero", compraNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/validarInvContableComprasDetalleTO",
                    UtilsJSON.objetoToJson(map), MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarInvContableComprasTO(String empresa, String periodo, String motivo, String compraNumero,
            String codigoUsuario, boolean recontabilizar, String conNumero, boolean recontabilizarSinPendiente,
            String tipCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("compraNumero", compraNumero);
            map.put("codigoUsuario", codigoUsuario);
            map.put("recontabilizar", recontabilizar);
            map.put("conNumero", conNumero);
            map.put("recontabilizarSinPendiente", recontabilizarSinPendiente);
            map.put("tipCodigo", tipCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvContableComprasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarInvContableVentasTO(String empresa, String periodo, String motivo, String ventaNumero,
            String codigoUsuario, boolean recontabilizar, String conNumero, String tipCodigo, SisInfoTO sisInfoTO) {
        // MensajeTO mensajeTO1 = new MensajeTO();
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("ventaNumero", ventaNumero);
            map.put("codigoUsuario", codigoUsuario);
            map.put("recontabilizar", recontabilizar);
            map.put("conNumero", conNumero);
            map.put("tipCodigo", tipCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvContableVentasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvCompraCabeceraTO getInvCompraCabeceraTO(String empresa, String codigoPeriodo, String motivo,
            String numeroCompra, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoPeriodo", codigoPeriodo);
            map.put("motivo", motivo);
            map.put("numeroCompra", numeroCompra);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvCompraCabeceraTO", UtilsJSON.objetoToJson(map),
                    InvCompraCabeceraTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvVentaCabeceraTO getInvVentaCabeceraTO(String empresa, String codigoPeriodo, String motivo,
            String numeroVenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoPeriodo", codigoPeriodo);
            map.put("motivo", motivo);
            map.put("numeroVenta", numeroVenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvVentaCabeceraTO", UtilsJSON.objetoToJson(map),
                    InvVentaCabeceraTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvProformaCabeceraTO getInvProformaCabeceraTO(String empresa, String codigoPeriodo, String motivo,
            String numeroProforma, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoPeriodo", codigoPeriodo);
            map.put("motivo", motivo);
            map.put("numeroProforma", numeroProforma);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvProformaCabeceraTO", UtilsJSON.objetoToJson(map),
                    InvProformaCabeceraTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvConsumosTO getInvConsumoCabeceraTO(String empresa, String codigoPeriodo, String motivo,
            String numeroConsumo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoPeriodo", codigoPeriodo);
            map.put("motivo", motivo);
            map.put("numeroConsumo", numeroConsumo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvConsumoCabeceraTO", UtilsJSON.objetoToJson(map),
                    InvConsumosTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvCompraTotalesTO getCompraTotalesTO(String empresa, String comPeriodo, String comMotivo,
            String ComNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("comPeriodo", comPeriodo);
            map.put("comMotivo", comMotivo);
            map.put("ComNumero", ComNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getCompraTotalesTO", UtilsJSON.objetoToJson(map),
                    InvCompraTotalesTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaDetalleComprasTO> getListaInvCompraDetalleTO(String empresa, String periodo, String motivo,
            String numeroCompra, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroCompra", numeroCompra);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvCompraDetalleTO",
                    UtilsJSON.objetoToJson(map), InvListaDetalleComprasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaDetalleVentasTO> getListaInvVentasDetalleTO(String empresa, String periodo, String motivo,
            String numeroVentas, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroVentas", numeroVentas);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvVentasDetalleTO",
                    UtilsJSON.objetoToJson(map), InvListaDetalleVentasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaDetalleProformasTO> getListaInvProformasDetalleTO(String empresa, String periodo, String motivo,
            String numeroProformas, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroProformas", numeroProformas);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvProformasDetalleTO",
                    UtilsJSON.objetoToJson(map), InvListaDetalleProformasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaDetalleConsumoTO> getListaInvConsumoDetalleTO(String empresa, String periodo, String motivo,
            String numeroConsumo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroConsumo", numeroConsumo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsumoDetalleTO",
                    UtilsJSON.objetoToJson(map), InvListaDetalleConsumoTO[].class, map));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO modificarInvComprasTO(InvComprasTO invComprasTO,
            List<InvComprasDetalleTO> listaInvComprasDetalleTO,
            List<InvComprasDetalleTO> listaInvComprasEliminarDetalleTO, AnxCompraTO anxCompraTO,
            List<AnxCompraDetalleTO> anxCompraDetalleTO, List<AnxCompraDetalleTO> anxCompraDetalleEliminarTO,
            List<AnxCompraReembolsoTO> anxCompraReembolsoTO, List<AnxCompraReembolsoTO> anxCompraReembolsoEliminarTO,
            List<AnxCompraFormaPagoTO> anxCompraFormaPagoTO, List<AnxCompraFormaPagoTO> anxCompraFormaPagoEliminarTO,
            boolean desmayorizar, boolean quitarAnulado, InvComprasMotivoAnulacion invComprasMotivoAnulacion,
            List<InvAdjuntosCompras> listImagen, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasTO", invComprasTO);
            map.put("listaInvComprasDetalleTO", listaInvComprasDetalleTO);
            map.put("listaInvComprasEliminarDetalleTO", listaInvComprasEliminarDetalleTO);
            map.put("anxCompraTO", anxCompraTO);
            map.put("anxCompraDetalleTO", anxCompraDetalleTO);
            map.put("anxCompraDetalleEliminarTO", anxCompraDetalleEliminarTO);
            map.put("anxCompraReembolsoTO", anxCompraReembolsoTO);
            map.put("anxCompraReembolsoEliminarTO", anxCompraReembolsoEliminarTO);
            map.put("anxCompraFormaPagoTO", anxCompraFormaPagoTO);
            map.put("anxCompraFormaPagoEliminarTO", anxCompraFormaPagoEliminarTO);
            map.put("desmayorizar", desmayorizar);
            map.put("quitarAnulado", quitarAnulado);
            map.put("invComprasMotivoAnulacion", invComprasMotivoAnulacion);
            map.put("listImagen", listImagen);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvComprasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO modificarInvVentasTO(InvVentasTO invVentasTO, List<InvVentasDetalleTO> listaInvVentasDetalleTO,
            List<InvVentasDetalleTO> listaInvVentasEliminarDetalleTO, boolean desmayorizar, AnxVentaTO anxVentasTO,
            boolean quitarAnulado, String tipoDocumentoComplemento, String numeroDocumentoComplemento,
            InvVentasMotivoAnulacion invVentasMotivoAnulacion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invVentasTO", invVentasTO);
            map.put("listaInvVentasDetalleTO", listaInvVentasDetalleTO);
            map.put("listaInvVentasEliminarDetalleTO", listaInvVentasEliminarDetalleTO);
            map.put("desmayorizar", desmayorizar);
            map.put("anxVentasTO", anxVentasTO);
            map.put("quitarAnulado", quitarAnulado);
            map.put("tipoDocumentoComplemento", tipoDocumentoComplemento);
            map.put("numeroDocumentoComplemento", numeroDocumentoComplemento);
            map.put("invVentasMotivoAnulacion", invVentasMotivoAnulacion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvVentasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO modificarInvProformasTO(InvProformasTO invProformasTO,
            List<InvProformasDetalleTO> listaInvProformasDetalleTO,
            List<InvProformasDetalleTO> listaInvProfromasEliminarDetalleTO, boolean quitarAnulado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProformasTO", invProformasTO);
            map.put("listaInvProformasDetalleTO", listaInvProformasDetalleTO);
            map.put("listaInvProfromasEliminarDetalleTO", listaInvProfromasEliminarDetalleTO);
            map.put("quitarAnulado", quitarAnulado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvProformasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO modificarInvConsumosTO(InvConsumosTO invConsumosTO,
            List<InvConsumosDetalleTO> listaInvConsumosDetalleTO,
            List<InvConsumosDetalleTO> listaInvConsumosEliminarDetalleTO, boolean desmayorizar,
            InvConsumosMotivoAnulacion invConsumosMotivoAnulacion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invConsumosTO", invConsumosTO);
            map.put("listaInvConsumosDetalleTO", listaInvConsumosDetalleTO);
            map.put("listaInvConsumosEliminarDetalleTO", listaInvConsumosEliminarDetalleTO);
            map.put("desmayorizar", desmayorizar);
            map.put("invConsumosMotivoAnulacion", invConsumosMotivoAnulacion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvConsumosTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getConteoNumeroFacturaCompra(String empresaCodigo, String provCodigo, String compDocumentoTipo,
            String compDocumentoNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresaCodigo", empresaCodigo);
            map.put("provCodigo", provCodigo);
            map.put("compDocumentoTipo", compDocumentoTipo);
            map.put("compDocumentoNumero", compDocumentoNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getConteoNumeroFacturaCompra", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvComboFormaPagoTO> getComboFormaPagoVenta(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboFormaPagoVenta",
                    UtilsJSON.objetoToJson(map), InvComboFormaPagoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaCompraTO> getFunComprasListado(String empresa, String fechaDesde, String fechaHasta,
            String status, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("status", status);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunComprasListado",
                    UtilsJSON.objetoToJson(map), InvListaConsultaCompraTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaCompraTO> getListaInvConsultaCompra(String empresa, String periodo, String motivo,
            String busqueda, String nRegistros, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("busqueda", busqueda);
            map.put("nRegistros", nRegistros);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsultaCompra",
                    UtilsJSON.objetoToJson(map), InvListaConsultaCompraTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaVentaTO> getFunVentasListado(String empresa, String fechaDesde, String fechaHasta,
            String status, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("status", status);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunVentasListado",
                    UtilsJSON.objetoToJson(map), InvListaConsultaVentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaVentaTO> getListaInvConsultaVenta(String empresa, String periodo, String motivo,
            String busqueda, String nRegistros, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("busqueda", busqueda);
            map.put("nRegistros", nRegistros);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsultaVenta",
                    UtilsJSON.objetoToJson(map), InvListaConsultaVentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaVentaTO> getListaInvConsultaVentaFiltrado(String empresa, String periodo, String motivo,
            String busqueda, String nRegistros, String tipoDocumento, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("busqueda", busqueda);
            map.put("nRegistros", nRegistros);
            map.put("tipoDocumento", tipoDocumento);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsultaVentaFiltrado",
                    UtilsJSON.objetoToJson(map), InvListaConsultaVentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaProformaTO> getListaInvConsultaProforma(String empresa, String periodo, String motivo,
            String busqueda, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("busqueda", busqueda);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsultaProforma",
                    UtilsJSON.objetoToJson(map), InvListaConsultaProformaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaConsumosTO> getFunConsumosListado(String empresa, String fechaDesde, String fechaHasta,
            String status, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("status", status);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunConsumosListado",
                    UtilsJSON.objetoToJson(map), InvListaConsultaConsumosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaConsumosTO> getListaInvConsultaConsumos(String empresa, String periodo, String motivo,
            String busqueda, String nRegistros, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("busqueda", busqueda);
            map.put("nRegistros", nRegistros);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsultaConsumos",
                    UtilsJSON.objetoToJson(map), InvListaConsultaConsumosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvConsumosImportarExportarTO> getListaInvConsumosImportarExportarTO(String empresa, String desde,
            String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsumosImportarExportarTO",
                    UtilsJSON.objetoToJson(map), InvConsumosImportarExportarTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvConsumosMotivoComboTO> getListaConsumosMotivoComboTO(String empresa, boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConsumosMotivoComboTO",
                    UtilsJSON.objetoToJson(map), InvConsumosMotivoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarInvConsumosTO(InvConsumosTO invConsumosTO,
            List<InvConsumosDetalleTO> listaInvConsumosDetalleTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invConsumosTO", invConsumosTO);
            map.put("listaInvConsumosDetalleTO", listaInvConsumosDetalleTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvConsumosTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvMedidaComboTO> getListaInvMedidaTablaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvMedidaTablaTO",
                    UtilsJSON.objetoToJson(map), InvMedidaComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarInvComprasMotivoTO(InvComprasMotivoTO invCompraMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invCompraMotivoTO", invCompraMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvComprasMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarInvComprasMotivoTO(InvComprasMotivoTO invCompraMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invCompraMotivoTO", invCompraMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvComprasMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarInvComprasMotivoTO(InvComprasMotivoTO invCompraMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invCompraMotivoTO", invCompraMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarInvComprasMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvCompraMotivoTablaTO> getListaInvComprasMotivoTablaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvComprasMotivoTablaTO",
                    UtilsJSON.objetoToJson(map), InvCompraMotivoTablaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvComprasMotivoTO getInvComprasMotivoTO(String empresa, String cmCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cmCodigo", cmCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvComprasMotivoTO", UtilsJSON.objetoToJson(map),
                    InvComprasMotivoTO.class, map);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarInvVentasMotivoTO(InvVentaMotivoTO invVentaMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invVentaMotivoTO", invVentaMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvVentasMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarInvVentasMotivoTO(InvVentaMotivoTO invVentaMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invVentaMotivoTO", invVentaMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvVentasMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarInvVentaMotivoTO(InvVentaMotivoTO invVentaMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invVentaMotivoTO", invVentaMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarInvVentaMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarInvProformaMotivoTO(InvProformaMotivoTO invProformaMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProformaMotivoTO", invProformaMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvProformaMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarInvProformaMotivoTO(InvProformaMotivoTO invProformaMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProformaMotivoTO", invProformaMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarInvProformaMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvVentaMotivoTablaTO> getListaInvVentaMotivoTablaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvVentasMotivoTablaTO",
                    UtilsJSON.objetoToJson(map), InvVentaMotivoTablaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvVentaMotivoTO getInvVentasMotivoTO(String empresa, String vmCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("vmCodigo", vmCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvVentasMotivoTO", UtilsJSON.objetoToJson(map),
                    InvVentaMotivoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarInvProformaMotivoTO(InvProformaMotivoTO invProformaMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProformaMotivoTO", invProformaMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvProformaMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProformaMotivoTablaTO> getListaInvProformaMotivoTablaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvProformaMotivoTablaTO",
                    UtilsJSON.objetoToJson(map), InvProformaMotivoTablaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvProformaMotivoTO getInvProformasMotivoTO(String empresa, String pmCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("pmCodigo", pmCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvProformasMotivoTO", UtilsJSON.objetoToJson(map),
                    InvProformaMotivoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvConsumosMotivo(InvConsumosMotivoTO invConsumosMotivoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invConsumosMotivoTO", invConsumosMotivoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvConsumosMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsumosMotivoTO> getInvListaConsumosMotivoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvListaConsumosMotivoTO",
                    UtilsJSON.objetoToJson(map), InvListaConsumosMotivoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvConsumosMotivoTO getInvConsumoMotivoTO(String empresa, String cmCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cmCodigo", cmCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvConsumoMotivoTO", UtilsJSON.objetoToJson(map),
                    InvConsumosMotivoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvNumeracionCompraTO> getListaInvNumeracionCompraTO(String empresa, String periodo, String motivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvNumeracionCompraTO",
                    UtilsJSON.objetoToJson(map), InvNumeracionCompraTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvNumeracionVentaTO> getListaInvNumeracionVentaTO(String empresa, String periodo, String motivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvNumeracionVentaTO",
                    UtilsJSON.objetoToJson(map), InvNumeracionVentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvNumeracionConsumoTO> getListaInvNumeracionConsumoTO(String empresa, String periodo, String motivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvNumeracionConsumoTO",
                    UtilsJSON.objetoToJson(map), InvNumeracionConsumoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaComprasFormaPagoTO> getInvListaComprasPagosFormaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvListaComprasFormaPagoTO",
                    UtilsJSON.objetoToJson(map), InvListaComprasFormaPagoTO[].class, map));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvComprasPagosForma(InvComprasFormaPagoTO invComprasFormaPagoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasFormaPagoTO", invComprasFormaPagoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvComprasPagosForma", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaVentasFormaPagoTO> getInvListaVentasPagosFormaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvListaVentasFormaPagoTO",
                    UtilsJSON.objetoToJson(map), InvListaVentasFormaPagoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvVentasPagosForma(InvVentasFormaPagoTO invVentasFormaPagoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invVentasFormaPagoTO", invVentasFormaPagoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvVentasPagosForma", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvKardexTO> getListaInvKardexTO(String empresa, String bodega, String producto, String desde,
            String hasta, String promedio, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("bodega", bodega);
            map.put("producto", producto);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("promedio", promedio);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvKardexTO",
                    UtilsJSON.objetoToJson(map), InvKardexTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SaldoBodegaTO> getListaSaldoBodegaTO(String empresa, String bodega, String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("bodega", bodega);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSaldoBodegaTO",
                    UtilsJSON.objetoToJson(map), SaldoBodegaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarModificarComprasRecepcionTO(InvComprasRecepcionTO invComprasRecepcionTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasRecepcionTO", invComprasRecepcionTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarComprasRecepcionTO",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvComprasRecepcionTO getInvComprasRecepcionTO(String empresa, String periodo, String motivo,
            String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvComprasRecepcionTO", UtilsJSON.objetoToJson(map),
                    InvComprasRecepcionTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductosConErrorTO> getListadoProductosConError(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListadoProductosConError",
                    UtilsJSON.objetoToJson(map), InvProductosConErrorTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Boolean getPrecioFijoCategoriaProducto(String empresa, String codigoCategoria, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoCategoria", codigoCategoria);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPrecioFijoCategoriaProducto",
                    UtilsJSON.objetoToJson(map), Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarInvTransferenciaTO(InvTransferenciasTO invTransferenciasTO,
            List<InvTransferenciasDetalleTO> listaInvTransferenciasDetalleTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invTransferenciasTO", invTransferenciasTO);
            map.put("listaInvTransferenciasDetalleTO", listaInvTransferenciasDetalleTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvTransferenciaTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaTransferenciaMotivoTO> getInvListaTransferenciaMotivoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvListaTransferenciaMotivoTO",
                    UtilsJSON.objetoToJson(map), InvListaTransferenciaMotivoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvTransferenciaMotivoTO getInvTransferenciaMotivoTO(String empresa, String tmCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("tmCodigo", tmCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvTransferenciaMotivoTO", UtilsJSON.objetoToJson(map),
                    InvTransferenciaMotivoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvTransferenciasMotivo(InvTransferenciaMotivoTO invTransferenciaMotivoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invTransferenciaMotivoTO", invTransferenciaMotivoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvTransferenciaMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvTransferenciaMotivoComboTO> getListaTransferenciasMotivoComboTO(String empresa,
            boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaTransferenciaMotivoComboTO",
                    UtilsJSON.objetoToJson(map), InvTransferenciaMotivoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaDetalleTransferenciaTO> getListaInvTransferenciasDetalleTO(String empresa, String periodo,
            String motivo, String numeroTransferencia, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroTransferencia", numeroTransferencia);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvTransferenciasDetalleTO",
                    UtilsJSON.objetoToJson(map), InvListaDetalleTransferenciaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvTransferenciasTO getInvTransferenciasCabeceraTO(String empresa, String codigoPeriodo, String motivo,
            String numeroTransferencia, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoPeriodo", codigoPeriodo);
            map.put("motivo", motivo);
            map.put("numeroTransferencia", numeroTransferencia);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvTransferenciasCabeceraTO",
                    UtilsJSON.objetoToJson(map), InvTransferenciasTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO modificarInvTransferenciasTO(InvTransferenciasTO invTransferenciasTO,
            List<InvTransferenciasDetalleTO> listaInvTransferenciasDetalleTO,
            List<InvTransferenciasDetalleTO> listaInvTransferenciasEliminarDetalleTO, boolean desmayorizar,
            InvTransferenciasMotivoAnulacion invTransferenciasMotivoAnulacion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invTransferenciasTO", invTransferenciasTO);
            map.put("listaInvTransferenciasDetalleTO", listaInvTransferenciasDetalleTO);
            map.put("listaInvTransferenciasEliminarDetalleTO", listaInvTransferenciasEliminarDetalleTO);
            map.put("desmayorizar", desmayorizar);
            map.put("invTransferenciasMotivoAnulacion", invTransferenciasMotivoAnulacion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvTransferenciasTO", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaTransferenciaTO> getFunListadoTransferencias(String empresa, String fechaDesde,
            String fechaHasta, String status, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("status", status);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunListadoTransferencias",
                    UtilsJSON.objetoToJson(map), InvListaConsultaTransferenciaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaConsultaTransferenciaTO> getListaInvConsultaTransferencias(String empresa, String periodo,
            String motivo, String busqueda, String nRegistros, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("busqueda", busqueda);
            map.put("nRegistros", nRegistros);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvConsultaTransferencias",
                    UtilsJSON.objetoToJson(map), InvListaConsultaTransferenciaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaProductosCambiarPrecioTO> getListaProductosCambiarPrecioTO(String empresa, String busqueda,
            String bodega, String fecha, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("busqueda", busqueda);
            map.put("bodega", bodega);
            map.put("fecha", fecha);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaProductosCambiarPrecioTO",
                    UtilsJSON.objetoToJson(map), InvListaProductosCambiarPrecioTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaProductosCambiarPrecioCantidadTO> getListaProductosCambiarPrecioCantidadTO(String empresa,
            String busqueda, String bodega, String fecha, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("busqueda", busqueda);
            map.put("bodega", bodega);
            map.put("fecha", fecha);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaProductosCambiarPrecioCantidadTO",
                    UtilsJSON.objetoToJson(map), InvListaProductosCambiarPrecioCantidadTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO invCambiarPrecioProducto(String empresa, String usuario,
            List<InvListaProductosCambiarPrecioTO> invListaProductosCambiarPrecioTOs, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("usuario", usuario);
            map.put("invListaProductosCambiarPrecioTOs", invListaProductosCambiarPrecioTOs);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/invCambiarPrecioProducto", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO invCambiarPrecioCantidadProducto(String empresa, String usuario,
            List<InvListaProductosCambiarPrecioCantidadTO> invListaProductosCambiarPrecioCantidadTOs, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("usuario", usuario);
            map.put("invListaProductosCambiarPrecioCantidadTOs", invListaProductosCambiarPrecioCantidadTOs);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/invCambiarPrecioCantidadProducto",
                    UtilsJSON.objetoToJson(map), MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvEstadoCCCVT getEstadoCCCVT(String empresa, String periodo, String motivo, String numero, String proceso, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("proceso", proceso);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getEstadoCCCVT", UtilsJSON.objetoToJson(map),
                    InvEstadoCCCVT.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoSincronizarTO> invProductoSincronizar(String empresaOrigen, String empresaDestino,
            String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresaOrigen", empresaOrigen);
            map.put("empresaDestino", empresaDestino);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/invProductoSincronizar",
                    UtilsJSON.objetoToJson(map), InvProductoSincronizarTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListadoPagosTO> invListadoPagosTO(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/invListadoPagosTO",
                    UtilsJSON.objetoToJson(map), InvListadoPagosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListadoCobrosTO> invListadoCobrosTO(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/invListadoCobrosTO",
                    UtilsJSON.objetoToJson(map), InvListadoCobrosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunComprasTO> getInvFunComprasTO(String empresa, String desde, String hasta, String motivo,
            String proveedor, String documento, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("motivo", motivo);
            map.put("proveedor", proveedor);
            map.put("documento", documento);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunComprasTO",
                    UtilsJSON.objetoToJson(map), InvFunComprasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    /*NUEVO DIFERENTE*/
    public List<InvFunVentasTO> listarInvFunVentasTO(String empresa, String desde, String hasta, String motivo,
            String cliente, String documento, String sector, String estado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("motivo", motivo);
            map.put("cliente", cliente);
            map.put("documento", documento);
            map.put("sector", sector);
            map.put("estado", estado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/listarInvFunVentasTO",
                    UtilsJSON.objetoToJson(map), InvFunVentasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    /**/
    public List<InvFunVentasTO> getInvFunVentasTO(String empresa, String desde, String hasta, String motivo,
            String cliente, String documento,String grupo_empresarial, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("motivo", motivo);
            map.put("cliente", cliente);
            map.put("documento", documento);
            map.put("grupo_empresarial", grupo_empresarial);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunVentasTO",
                    UtilsJSON.objetoToJson(map), InvFunVentasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunConsumosTO> getInvFunConsumosTO(String empresa, String desde, String hasta, String motivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("motivo", motivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunConsumosTO",
                    UtilsJSON.objetoToJson(map), InvFunConsumosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunComprasConsolidandoProductosTO> getInvFunComprasConsolidandoProductosTO(String empresa,
            String desde, String hasta, String sector, String motivo, String proveedor, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sector", sector);
            map.put("motivo", motivo);
            map.put("proveedor", proveedor);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunComprasConsolidandoProductosTO",
                    UtilsJSON.objetoToJson(map), InvFunComprasConsolidandoProductosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunVentasConsolidandoProductosTO> getInvFunVentasConsolidandoProductosTO(String empresa,
            String desde, String hasta, String sector, String bodega, String cliente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sector", sector);
            map.put("bodega", bodega);
            map.put("cliente", cliente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunVentasConsolidandoProductosTO",
                    UtilsJSON.objetoToJson(map), InvFunVentasConsolidandoProductosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunVentasConsolidandoProductosCoberturaTO> getInvFunVentasConsolidandoProductosCoberturaTO(String empresa,
            String desde, String hasta, String sector, String bodega, String motivo, String cliente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sector", sector);
            map.put("bodega", bodega);
            map.put("motivo", motivo);
            map.put("cliente", cliente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);

            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunVentasConsolidandoProductosCoberturaTO",
                    UtilsJSON.objetoToJson(map), InvFunVentasConsolidandoProductosCoberturaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunVentasConsolidandoClientesTO> getInvFunVentasConsolidandoClientesTO(String empresa, String sector,
            String desde, String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("desde", desde);
            map.put("hasta", hasta);

            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunVentasConsolidandoClientesTO",
                    UtilsJSON.objetoToJson(map), InvFunVentasConsolidandoClientesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunVentasVsCostoTO> getInvFunVentasVsCostoTO(String empresa, String desde, String hasta,
            String bodega, String cliente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("bodega", bodega);
            map.put("cliente", cliente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunVentasVsCostoTO",
                    UtilsJSON.objetoToJson(map), InvFunVentasVsCostoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunListadoProductosTO> getInvFunListadoProductosTO(String empresa, String categoria,
            String busqueda, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("categoria", categoria);
            map.put("busqueda", busqueda);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunListadoProductosTO",
                    UtilsJSON.objetoToJson(map), InvFunListadoProductosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunListadoClientesTO> getInvFunListadoClientesTO(String empresa, String categoria, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("categoria", categoria);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunListadoClientesTO",
                    UtilsJSON.objetoToJson(map), InvFunListadoClientesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunListadoProveedoresTO> getInvFunListadoProveedoresTO(String empresa, String categoria, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("categoria", categoria);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunListadoProveedoresTO",
                    UtilsJSON.objetoToJson(map), InvFunListadoProveedoresTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Boolean getPuedeEliminarProducto(String empresa, String producto, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("producto", producto);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPuedeEliminarProducto", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public java.math.BigDecimal getPrecioProductoPorCantidad(String empresa, String cliente, String codProducto, java.math.BigDecimal cantidad, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cliente", cliente);
            map.put("codProducto", codProducto);
            map.put("cantidad", cantidad);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPrecioProductoPorCantidad", UtilsJSON.objetoToJson(map),
                    java.math.BigDecimal.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public java.math.BigDecimal getCantidad3(String empresa, String codProducto, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codProducto", codProducto);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getCantidad3", UtilsJSON.objetoToJson(map),
                    java.math.BigDecimal.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvSecuenciaComprobanteTO> getInvSecuenciaComprobanteTO(String empresa, String fechaDesde,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvSecuenciaComprobanteTO",
                    UtilsJSON.objetoToJson(map), InvSecuenciaComprobanteTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvProductoTipoComboTO> getInvProductoTipoComboListadoTO(String empresa, String accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvProductoTipoComboListadoTO",
                    UtilsJSON.objetoToJson(map), InvProductoTipoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionInvProductoTipo(InvProductoTipoTO invProductoTipoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invProductoTipoTO", invProductoTipoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionInvProductoTipo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Boolean comprobarEliminarInvProductoTipo(String empresa, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/comprobarEliminarInvProductoTipo",
                    UtilsJSON.objetoToJson(map), Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Boolean buscarConteoCliente(String empCodigo, String codigoCliente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("codigoCliente", codigoCliente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/buscarConteoCliente", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Boolean buscarConteoProveedor(String empCodigo, String codigoProveedor, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("codigoProveedor", codigoProveedor);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/buscarConteoProveedor", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SaldoBodegaComprobacionTO> getInvFunSaldoBodegaComprobacionTO(String empresa, String bodega,
            String desde, String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("bodega", bodega);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);

            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunSaldoBodegaComprobacionTO",
                    UtilsJSON.objetoToJson(map), SaldoBodegaComprobacionTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SaldoBodegaComprobacionTO> getInvFunSaldoBodegaComprobacionCantidadTO(String empresa, String bodega,
            String desde, String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("bodega", bodega);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays
                    .asList(restTemplate.postForObject(conexionWS + "/getInvFunSaldoBodegaComprobacionCantidadesTO",
                            UtilsJSON.objetoToJson(map), SaldoBodegaComprobacionTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunConsumosConsolidandoProductosTO> getInvFunConsumosConsolidandoProductosTO(String empresa,
            String desde, String hasta, String sector, String bodega, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sector", sector);
            map.put("bodega", bodega);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunConsumosConsolidandoProductosTO",
                    UtilsJSON.objetoToJson(map), InvFunConsumosConsolidandoProductosTO[].class, map));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvVendedorComboListadoTO> getComboinvListaVendedorTOs(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboinvListaVendedorTOs",
                    UtilsJSON.objetoToJson(map), InvVendedorComboListadoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunListaProductosImpresionPlacasTO> getInvFunListaProductosImpresionPlacas1TO(String empresa,
            String producto, boolean estado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("producto", producto);
            map.put("estado", estado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunListaProductosImpresionPlacasTO",
                    UtilsJSON.objetoToJson(map), InvFunListaProductosImpresionPlacasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvFunUltimasComprasTO> getInvFunUltimasComprasTOs(String empresa, String producto, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("producto", producto);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvFunUltimasComprasTOs",
                    UtilsJSON.objetoToJson(map), InvFunUltimasComprasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RetornoTO getInvFunListaProductosSaldosGeneralTO(String empresa, String producto, String fecha,
            boolean estado, String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("producto", producto);
            map.put("fecha", fecha);
            map.put("estado", estado);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvFunListaProductosSaldosGeneralTO",
                    UtilsJSON.objetoToJson(map), RetornoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvVentaRetencionesTO getInvVentaRetencionesTO(String codigoEmpresa, String facturaNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("codigoEmpresa", codigoEmpresa);
            map.put("facturaNumero", facturaNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvVentaRetencionesTO", UtilsJSON.objetoToJson(map),
                    InvVentaRetencionesTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvComprasTO getComprasTO(String empresa, String periodo, String motivo, String numeroCompra, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroCompra", numeroCompra);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getComprasTO", UtilsJSON.objetoToJson(map),
                    InvComprasTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaProductosCompraSustentoConceptoTO> getInvProductoSustentoConcepto(String empresa, String fecha,
            List<InvListaProductosCompraSustentoConceptoTO> invListaProductosCompraTOs, SisInfoTO sisInfoTO) {
        try {

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("invListaProductosCompraTOs", invListaProductosCompraTOs);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getInvProductoSustentoConcepto",
                    UtilsJSON.objetoToJson(map), InvListaProductosCompraSustentoConceptoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RetornoTO getComprasPorPeriodo(String empresa, String codigoSector, String fechaInicio, String fechaFin,
            boolean chk, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoSector", codigoSector);
            map.put("fechaInicio", fechaInicio);
            map.put("fechaFin", fechaFin);
            map.put("chk", chk);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getComprasPorPeriodo", UtilsJSON.objetoToJson(map),
                    RetornoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteInvKardex(String nombreProducto, String fechaDesde, String fechaHasta,
            List<InvKardexTO> listInvKardexTO, boolean banderaCosto, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("nombreProducto", nombreProducto);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("listInvKardexTO", listInvKardexTO);
            map.put("banderaCosto", banderaCosto);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportInvKardex.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteInvKardex", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteImpresionPlaca(
            LinkedList<DatoFunListaProductosImpresionPlaca> listProductosImpresionPlaca, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("listProductosImpresionPlaca", listProductosImpresionPlaca);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportImpresionPlaca.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteImpresionPlaca", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoCompras(String fechaDesde, String fechaHasta, String motivo, String proveedorId,
            String documento, List<InvFunComprasTO> listInvFunComprasTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("motivo", motivo);
            map.put("proveedorId", proveedorId);
            map.put("documento", documento);
            map.put("listInvFunComprasTO", listInvFunComprasTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoCompras.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoCompras", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsolidadoConsumoProducto(String fechaDesde, String fechaHasta, String bodega,
            String proveedor, List<InvFunConsumosConsolidandoProductosTO> listInvFunConsumosConsolidandoProductosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("bodega", bodega);
            map.put("proveedor", proveedor);
            map.put("listInvFunConsumosConsolidandoProductosTO", listInvFunConsumosConsolidandoProductosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoCompraProducto.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsolidadoConsumoProducto", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsolidadoCompraProducto(String fechaDesde, String fechaHasta, String bodega,
            String proveedor, List<InvFunComprasConsolidandoProductosTO> listInvFunComprasConsolidandoProductosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("bodega", bodega);
            map.put("proveedor", proveedor);
            map.put("listInvFunComprasConsolidandoProductosTO", listInvFunComprasConsolidandoProductosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoCompraProducto.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsolidadoCompraProducto", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoVentas(String fechaDesde, String fechaHasta, String motivo, String cliente,
            String documento, List<InvFunVentasTO> listInvFunVentasTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("motivo", motivo);
            map.put("cliente", cliente);
            map.put("documento", documento);
            map.put("listInvFunVentasTO", listInvFunVentasTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoVentas.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoVentas", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsolidadoVentaProducto(String fechaDesde, String fechaHasta, String bodega,
            String cliente, List<InvFunVentasConsolidandoProductosTO> listInvFunVentasConsolidandoProductosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("bodega", bodega);
            map.put("cliente", cliente);
            map.put("listInvFunVentasConsolidandoProductosTO", listInvFunVentasConsolidandoProductosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoVentaProducto.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsolidadoVentaProducto", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsolidadoVentaCliente(String fechaDesde, String fechaHasta, String sector,
            List<InvFunVentasConsolidandoClientesTO> listInvFunVentasConsolidandoClientesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sector", sector);
            map.put("listInvFunVentasConsolidandoClientesTO", listInvFunVentasConsolidandoClientesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoVentaCliente.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsolidadoVentaCliente", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoConsumos(String fechaDesde, String fechaHasta,
            List<InvFunConsumosTO> listInvFunConsumosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("listInvFunConsumosTO", listInvFunConsumosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoConsumos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoConsumos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListaProductos(String bodega, List<InvListaProductosTO> listInvListaProductosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("bodega", bodega);
            map.put("listInvListaProductosTO", listInvListaProductosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListaProductos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListaProductos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteSaldoBodega(String bodega, String fechaHasta, List<SaldoBodegaTO> listSaldoBodegaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("bodega", bodega);
            map.put("fechaHasta", fechaHasta);
            map.put("listSaldoBodegaTO", listSaldoBodegaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportSaldoBodega.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteSaldoBodega", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteSaldoBodegaComprobacion(String bodega, String fechaDesde, String fechaHasta,
            List<SaldoBodegaComprobacionTO> lista, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("bodega", bodega);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportSaldoBodegaComprobacion.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteSaldoBodegaComprobacion", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteInvProductosConError(List<InvProductosConErrorTO> listInvProductosConErrorTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("listInvProductosConErrorTO", listInvProductosConErrorTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportReporteInvProductosConError.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteInvProductosConError", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteTrasferencias(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportTrasferencias.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteTrasferencias", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsumoDetalle(List<InvConsumosTO> invConsumosTOs, boolean ordenado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("invConsumosTOs", invConsumosTOs);
            map.put("ordenado", ordenado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsumoDetalle.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsumoDetalle", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteCompraDetalle(List<ReporteCompraDetalle> reporteCompraDetalles, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("reporteCompraDetalles", reporteCompraDetalles);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reporteCompraDetalles.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCompraDetalle", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteVentaDetalleImpresion(List<ReporteVentaDetalle> lista, String nombreCliente,
            String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("nombreCliente", nombreCliente);
            map.put("nombreReporte", nombreReporte);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportVentaDetalleImpresion.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteVentaDetalleImpresion", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteProformaDetalleImpresion(List<ReporteProformaDetalle> lista, String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("nombreReporte", nombreReporte);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportProformaDetalleImpresion.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteProformaDetalleImpresion", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteInvFunVentasVsCosto(String fechaDesde, String fechaHasta, String bodega,
            String clienteId, List<InvFunVentasVsCostoTO> invFunVentasVsCostoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("bodega", bodega);
            map.put("clienteId", clienteId);
            map.put("invFunVentasVsCostoTO", invFunVentasVsCostoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportInvFunVentasVsCosto.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteInvFunVentasVsCosto", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    /////////////////////////// Metodos WEB ///////////////////////////
    public InvCliente obtenerInvClientePorCedulaRuc(String empresa, String cedulaRuc, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cedulaRuc", cedulaRuc);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerInvClientePorCedulaRuc",
                    UtilsJSON.objetoToJson(map), InvCliente.class, map);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvProveedor obtenerInvProveedorPorCedulaRuc(String empresa, String ruc, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("ruc", ruc);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerInvProveedorPorCedulaRuc",
                    UtilsJSON.objetoToJson(map), InvProveedor.class, map);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvListaProductosTO> getListaProductosTO(String empresa, String busqueda, String bodega,
            String categoria, String fecha, boolean incluirInactivos, boolean limite, SisInfoTO sisInfoTO) {
        try {
            if (fecha.trim().isEmpty()) {
                fecha = null;
            } else {
                fecha = "'" + fecha + "'";
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("busqueda", busqueda);
            map.put("bodega", bodega);
            map.put("categoria", categoria);
            map.put("fecha", fecha);
            map.put("incluirInactivos", incluirInactivos);
            map.put("limite", limite);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaProductosTO",
                    UtilsJSON.objetoToJson(map), InvListaProductosTO[].class, map));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvProducto getProducto(String empresa, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getProducto", UtilsJSON.objetoToJson(map),
                    InvProducto.class, map);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvBodega> getListaBodegas(String empresa, boolean inactivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("inactivo", inactivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBodegas",
                    UtilsJSON.objetoToJson(map), InvBodega[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvConsumosMotivo> getListaConsumosMotivo(String empresa, boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConsumosMotivo",
                    UtilsJSON.objetoToJson(map), InvConsumosMotivo[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvConsumos getInvConsumos(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getInvConsumos", UtilsJSON.objetoToJson(map),
                    InvConsumos.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarModificarInvConsumos(InvConsumos invConsumos,
            List<InvConsumosDetalle> listaInvConsumosDetalle, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invConsumos", invConsumos);
            map.put("listaInvConsumosDetalle", listaInvConsumosDetalle);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarInvConsumos", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarModificarInvConsumosWeb(InvConsumos invConsumos,
            List<InvConsumosDetalle> listaInvConsumosDetalle, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invConsumos", invConsumos);
            map.put("listaInvConsumosDetalle", listaInvConsumosDetalle);
            map.put("sisInfoTO", sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarInvConsumos", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String desmayorizarConsumo(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/desmayorizarConsumo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String anularConsumo(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/anularConsumo", UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String restaurarConsumo(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/restaurarConsumo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String desmayorizarCompra(InvComprasPK invComprasPK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasPK", invComprasPK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/desmayorizarCompra", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String anularCompra(InvComprasPK invComprasPK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasPK", invComprasPK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/anularCompra", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String restaurarCompra(InvComprasPK invComprasPK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasPK", invComprasPK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/restaurarCompra", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String guardarImagenesCompra(InvComprasPK invComprasPK, List<InvAdjuntosCompras> listInvAdjuntosCompras, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasPK", invComprasPK);
            map.put("listInvAdjuntosCompras", listInvAdjuntosCompras);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/guardarImagenesCompra", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvComprasDatosBasicoTO obtenerDatosBasicosCompra(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerDatosBasicosCompra", UtilsJSON.objetoToJson(map),
                    InvComprasDatosBasicoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvAdjuntoComprasTO> obtenerAdjuntosCompra(InvComprasPK invComprasPK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("invComprasPK", invComprasPK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/obtenerAdjuntosCompra",
                    UtilsJSON.objetoToJson(map), InvAdjuntoComprasTO[].class, map));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String anularTransferencia(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/anularTransferencia", UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String restaurarTrasnferencia(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/restaurarTransferencia", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String desmayorizarTrasnferencia(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/desmayorizarTransferencia", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String desmayorizarProforma(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/desmayorizarProforma", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String anularProforma(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/anularProforma", UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String restaurarProforma(String empresa, String periodo, String motivo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/restaurarProforma", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarInvPedidosMotivoTO(InvPedidosMotivoTO invPedidosMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("invPedidosMotivoTO", invPedidosMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvPedidosMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarInvPedidosMotivoTO(InvPedidosMotivoTO invPedidosMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("invPedidosMotivoTO", invPedidosMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarInvPedidosMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarInvPedidosMotivoTO(InvPedidosMotivoTO invPedidosMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("invPedidosMotivoTO", invPedidosMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarInvPedidosMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<InvPedidosMotivoTO> getListaInvPedidosMotivoTO(String empresa, Boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaInvPedidosMotivoTO", UtilsJSON.objetoToJson(map), InvPedidosMotivoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarInvPedidosConfiguracionTO(InvPedidosConfiguracionTO invPedidosConfiguracionTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("invPedidosConfiguracionTO", invPedidosConfiguracionTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarInvPedidosConfiguracionTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public InvPedidosConfiguracionTO getListaInvPedidosConfiguracionTO(String empresa, InvPedidosMotivoTO invPedidosMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("invPedidosMotivoTO", invPedidosMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getListaInvPedidosConfiguracionTO", UtilsJSON.objetoToJson(map), InvPedidosConfiguracionTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    //NUEVOS DELEGATE
    public String generarReporteInvListaConsultaCompra(List<InvListaConsultaCompra> lista, String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = nombreReporte + ".jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteInvListaConsultaCompra", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteInvListaConsultaVenta(List<InvListaConsultaVenta> lista, String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = nombreReporte + ".jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteInvListaConsultaVenta", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteInvListaConsultaConsumo(List<InvListaConsultaConsumo> lista, String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = nombreReporte + ".jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteInvListaConsultaConsumo", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteInvListaConsultaTransferencia(List<InvListaConsultaTransferencia> lista, String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = nombreReporte + ".jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteInvListaConsultaTransferencia", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
}
