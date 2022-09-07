package ec.com.todocompu.ShrimpSoftUtils.delegate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import ec.com.todocompu.ShrimpSoftUtils.Propiedades;
import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.UtilsRESTFul;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxAnuladoTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxAnuladosTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraDetalleTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraElectronicaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraFormaPagoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraReembolsoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCompraTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxComprobanteElectronicoUtilTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxConceptoComboTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxConceptoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxCuentasContablesTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxEstablecimientoComboTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxFormaPagoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxFunListadoDevolucionIvaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxFunListadoDevolucionIvaVentasTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxFunRegistroDatosCrediticiosTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaComprobanteAnuladoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaConsolidadoRetencionesVentasTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaEstablecimientoRetencionesVentasTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaRetencionesFuenteIvaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaRetencionesPendientesTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaRetencionesRentaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaRetencionesTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaVentaElectronicaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListaVentasPendientesTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListadoCompraElectronicaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxListadoRetencionesVentasTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxNumeracionLineaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxNumeracionTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxNumeracionTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxPaisTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxProvinciaCantonTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxPuntoEmisionComboTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxSustentoComboTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxSustentoTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxTalonResumenTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxTalonResumenVentaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxTipoComprobanteComboTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxTipoComprobanteTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxTipoComprobanteTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxTipoIdentificacionTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxTipoListaTransaccionTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxUltimaAutorizacionTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxVentaElectronicaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.AnxVentaTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.ComprobanteElectronico;
import ec.com.todocompu.ShrimpSoftUtils.anexos.TO.anxUrlWebServicesTO;
import ec.com.todocompu.ShrimpSoftUtils.anexos.entity.AnxCompra;
import ec.com.todocompu.ShrimpSoftUtils.anexos.report.ReporteObjetoAnexo;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.RespuestaComprobante;

public class AnexosDelegate {

    private static AnexosDelegate grupoDelegate;
    private RestTemplate restTemplate = new RestTemplate();
    private String conexionWS;

    private AnexosDelegate() throws Exception {
        Properties propSistema = Propiedades.readPropiedades();
        conexionWS = propSistema.getProperty("servidor.ip") + ":"
                + propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
                + "/todocompuWS/anexosController";
    }

    public static AnexosDelegate getInstance() {
        if (grupoDelegate == null) {
            try {
                grupoDelegate = new AnexosDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return grupoDelegate;
    }

    public List<AnxEstablecimientoComboTO> getListaEstablecimientoComboto(String empresa, SisInfoTO sisInfoTO) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("empresa", empresa);
        map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        return Arrays.asList(restTemplate.postForObject(conexionWS + "/getEstablecimientos",
                UtilsJSON.objetoToJson(map), AnxEstablecimientoComboTO[].class));
    }

    // public List<AnxEstablecimientoComboTO>
    // getListaPuntosEmisionComboto(String empresa, String establecimiento)
    public List<AnxPuntoEmisionComboTO> getListaPuntosEmisionComboto(String empresa, String establecimiento, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("establecimiento", establecimiento);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPuntosEmision",
                    UtilsJSON.objetoToJson(map), AnxPuntoEmisionComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxNumeracionLineaTO getNumeroAutorizacion(String empresa, String numeroRetencion, String numeroComprobante,
            String fechaVencimiento, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("numeroRetencion", numeroRetencion);
            map.put("numeroComprobante", numeroComprobante);
            map.put("fechaVencimiento", fechaVencimiento);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            AnxNumeracionLineaTO anxNumeracionLineaTO = restTemplate.postForObject(
                    conexionWS + "/getNumeroAutorizacion", UtilsJSON.objetoToJson(map), AnxNumeracionLineaTO.class);
            return anxNumeracionLineaTO;
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxSustentoComboTO> getListaAnxSustentoComboTO(String tipoComprobante, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("tipoComprobante", tipoComprobante);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxSustentoComboTO",
                    UtilsJSON.objetoToJson(map), AnxSustentoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxConceptoComboTO> getListaAnxConceptoComboTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxConceptoComboTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxConceptoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxConceptoComboTO> getListaAnxConceptoTO(String fechaRetencion, String busqueda, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fechaRetencion", fechaRetencion);
            map.put("busqueda", busqueda);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxConceptoTO",
                    UtilsJSON.objetoToJson(map), AnxConceptoComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTipoIdentificacionTO> getListaAnxTipoIdentificacionTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxTipoIdentificacionTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxTipoIdentificacionTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getCodigoAnxTipoTransaccionTO(String tipoIdentificacion, String tipoTransaccion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("tipoIdentificacion", tipoIdentificacion);
            map.put("tipoTransaccion", tipoTransaccion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getCodigoAnxTipoTransaccionTO",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTipoComprobanteComboTO> getListaAnxTipoComprobanteComboTO(String codigoTipoTransaccion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("codigoTipoTransaccion", codigoTipoTransaccion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxTipoComprobanteComboTO",
                    UtilsJSON.objetoToJson(map), AnxTipoComprobanteComboTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTipoComprobanteComboTO> getListaAnxTipoComprobanteComboTOCompleto(SisInfoTO sisInfoTO) {
        return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxTipoComprobanteComboTOCompleto",
                sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxTipoComprobanteComboTO[].class));
    }

    public java.math.BigDecimal getValorAnxPorcentajeIvaTO(String fechaFactura, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fechaFactura", fechaFactura);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getValorAnxPorcentajeIvaTO", UtilsJSON.objetoToJson(map),
                    java.math.BigDecimal.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public java.math.BigDecimal getValorAnxMontoMaximoConsumidorFinalTO(String fechaFactura, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fechaFactura", fechaFactura);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getValorAnxMontoMaximoConsumidorFinalTO",
                    UtilsJSON.objetoToJson(map), java.math.BigDecimal.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxCompraTO getAnexoCompraTO(String empresa, String periodo, String motivo, String numeroCompra, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroCompra", numeroCompra);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAnexoCompraTO", UtilsJSON.objetoToJson(map),
                    AnxCompraTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxCompraDetalleTO> getAnexoCompraDetalleTO(String empresa, String periodo, String motivo,
            String numeroCompra, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroCompra", numeroCompra);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoCompraDetalleTO",
                    UtilsJSON.objetoToJson(map), AnxCompraDetalleTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxVentaTO getAnexoVentaTO(String empresa, String periodo, String motivo, String numeroVenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroVenta", numeroVenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAnexoVentaTO", UtilsJSON.objetoToJson(map),
                    AnxVentaTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxCompra getAnexoCompra(String empresa, String periodo, String motivo, String numeroCompra, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroCompra", numeroCompra);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAnexoCompra", UtilsJSON.objetoToJson(map),
                    AnxCompra.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaRetencionesTO> getAnexoListaRetencionesTO(String empresa, String fechaDesde,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoListaRetencionesTO",
                    UtilsJSON.objetoToJson(map), AnxListaRetencionesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaRetencionesRentaTO> getAnexoListaRetencionesRentaTO(String empresa, String fechaDesde,
            String fechaHasta, String pOrden, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("pOrden", pOrden);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoListaRetencionesRentaTO",
                    UtilsJSON.objetoToJson(map), AnxListaRetencionesRentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaRetencionesFuenteIvaTO> getAnexoListaRetencionesFuenteIvaTO(String empresa, String fechaDesde,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoListaRetencionesFuenteIvaTO",
                    UtilsJSON.objetoToJson(map), AnxListaRetencionesFuenteIvaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaRetencionesTO> getAnexoFunListadoRetencionesPorNumero(String empresa, String fechaDesde,
            String fechaHasta, String parametroEstado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("parametroEstado", parametroEstado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoFunListadoRetencionesPorNumero",
                    UtilsJSON.objetoToJson(map), AnxListaRetencionesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaComprobanteAnuladoTO> getAnxListaComprobanteAnuladoTO(String empresa, String fechaDesde,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnxListaComprobanteAnuladoTO",
                    UtilsJSON.objetoToJson(map), AnxListaComprobanteAnuladoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaConsolidadoRetencionesVentasTO> getAnxListaConsolidadoRetencionesVentasTO(String empresa,
            String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnxListaConsolidadoRetencionesVentasTO",
                    UtilsJSON.objetoToJson(map), AnxListaConsolidadoRetencionesVentasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaEstablecimientoRetencionesVentasTO> getAnxListaEstablecimientoRetencionesVentasTO(
            String empresa, String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays
                    .asList(restTemplate.postForObject(conexionWS + "/getAnxListaEstablecimientoRetencionesVentasTO",
                            UtilsJSON.objetoToJson(map), AnxListaEstablecimientoRetencionesVentasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListadoRetencionesVentasTO> getAnxListadoRetencionesVentasTO(String empresa, String tipoDocumento,
            String establecimiento, String puntoEmision, String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("tipoDocumento", tipoDocumento);
            map.put("establecimiento", establecimiento);
            map.put("puntoEmision", puntoEmision);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnxListadoRetencionesVentasTO",
                    UtilsJSON.objetoToJson(map), AnxListadoRetencionesVentasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxFunListadoDevolucionIvaVentasTO> getAnxFunListadoDevolucionIvaVentasTO(String empresa,
            String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnxFunListadoDevolucionIvaVentasTO",
                    UtilsJSON.objetoToJson(map), AnxFunListadoDevolucionIvaVentasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTalonResumenTO> getAnexoTalonResumenTO(String empresa, String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoTalonResumenTO",
                    UtilsJSON.objetoToJson(map), AnxTalonResumenTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTalonResumenVentaTO> getAnexoTalonResumenVentaTO(String empresa, String fechaDesde,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoTalonResumenVentaTO",
                    UtilsJSON.objetoToJson(map), AnxTalonResumenVentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxNumeracionTablaTO> getListaAnexoNumeracionTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnexoNumeracionTO",
                    UtilsJSON.objetoToJson(map), AnxNumeracionTablaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxNumeracionTO getAnexoNumeracionTO(Integer secuencia, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("secuencia", secuencia);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAnexoNumeracionTO", UtilsJSON.objetoToJson(map),
                    AnxNumeracionTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarAnexoNumeracionTO(AnxNumeracionTO anxNumeracionTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxNumeracionTO", anxNumeracionTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarAnexoNumeracionTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarAnexoNumeracionTO(AnxNumeracionTO anxNumeracionTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxNumeracionTO", anxNumeracionTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarAnexoNumeracionTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarAnexoNumeracionTO(AnxNumeracionTO anxNumeracionTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxNumeracionTO", anxNumeracionTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarAnexoNumeracionTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxConceptoTO> getAnexoConceptoTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoConceptoTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxConceptoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxSustentoTO> getAnexoSustentoTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoSustentoTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxSustentoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTipoComprobanteTO> getAnexoTipoComprobanteTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoTipoComprobanteTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxTipoComprobanteTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTipoListaTransaccionTO> getAnexoTipoListaTransaccionTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoTipoListaTransaccionTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxTipoListaTransaccionTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxAnuladoTablaTO> getListaAnxAnuladoTablaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxAnuladoTablaTO",
                    UtilsJSON.objetoToJson(map), AnxAnuladoTablaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxAnuladosTO getAnxAnuladosTO(Integer secuencial, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("secuencial", secuencial);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAnxAnuladosTO", UtilsJSON.objetoToJson(map),
                    AnxAnuladosTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarAnexoAnuladoTO(AnxAnuladosTO anxAnuladosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxAnuladosTO", anxAnuladosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarAnexoAnuladoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarAnexoAnuladoTO(AnxAnuladosTO anxAnuladosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxAnuladosTO", anxAnuladosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarAnexoAnuladoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarAnexoAnuladoTO(AnxAnuladosTO anxAnuladosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxAnuladosTO", anxAnuladosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarAnexoAnuladoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxPaisTO> getComboAnxPaisTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboAnxPaisTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxPaisTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxProvinciaCantonTO> getComboAnxProvinciaTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboAnxProvinciaTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxProvinciaCantonTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxProvinciaCantonTO> getComboAnxCantonTO(String provincia, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("provincia", provincia);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboAnxCantonTO",
                    UtilsJSON.objetoToJson(map), AnxProvinciaCantonTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxProvinciaCantonTO> getComboAnxDpaProvinciaTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboAnxDpaProvinciaTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, AnxProvinciaCantonTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxProvinciaCantonTO> getComboAnxDpaCantonTO(String codigoProvincia, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("codigoProvincia", codigoProvincia);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboAnxDpaCantonTO",
                    UtilsJSON.objetoToJson(map), AnxProvinciaCantonTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxProvinciaCantonTO> getComboAnxParroquiaTO(String codigoProvincia, String codigoCanton, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("codigoProvincia", codigoProvincia);
            map.put("codigoCanton", codigoCanton);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboAnxParroquiaTO",
                    UtilsJSON.objetoToJson(map), AnxProvinciaCantonTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxCuentasContablesTO getAnxCuentasContablesTO(String empresa, String nombreCuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("nombreCuenta", nombreCuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAnxCuentasContablesTO", UtilsJSON.objetoToJson(map),
                    AnxCuentasContablesTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String actualizarAnxCuentasContables(AnxCuentasContablesTO anxCuentasContablesTO, String empresa,
            String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxCuentasContablesTO", anxCuentasContablesTO);
            map.put("empresa", empresa);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/actualizarAnxCuentasContables",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarAnxVentas(AnxVentaTO anxVentaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxVentaTO", anxVentaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarAnxVentas", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionAnxVenta(AnxVentaTO anxVentaTO, String numeroFactura, String periodoFactura, String cliCodigo,
            char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxVentaTO", anxVentaTO);
            map.put("numeroFactura", numeroFactura);
            map.put("periodoFactura", periodoFactura);
            map.put("cliCodigo", cliCodigo);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionAnxVenta", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxFunListadoDevolucionIvaTO> getAnxFunListadoDevolucionIvaTOs(String empCodigo, String desde,
            String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnxFunListadoDevolucionIvaTOs",
                    UtilsJSON.objetoToJson(map), AnxFunListadoDevolucionIvaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String reestructurarRetencion(AnxCompraTO anxCompraTO, String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxCompraTO", UtilsJSON.objetoToJson(anxCompraTO));
            map.put("usuario", UtilsJSON.objetoToJson(usuario));
            map.put("sisInfoTO", UtilsJSON.objetoToJson(sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO));
            return restTemplate.postForObject(conexionWS + "/reestructurarRetencion", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxCompraReembolsoTO> getAnexoCompraReembolsoTOs(String empresa, String periodo, String motivo,
            String numeroCompra, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numeroCompra", numeroCompra);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoCompraReembolsoTOs",
                    UtilsJSON.objetoToJson(map), AnxCompraReembolsoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxTipoComprobanteTablaTO> getListaAnexoTipoComprobanteTO(String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnexoTipoComprobanteTO",
                    UtilsJSON.objetoToJson(map), AnxTipoComprobanteTablaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxFormaPagoTO> getAnexoFormaPagoTO(Date fechaFactura, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fechaFactura", fechaFactura);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoFormaPagoTO",
                    UtilsJSON.objetoToJson(map), AnxFormaPagoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxCompraFormaPagoTO> getAnexoCompraFormaPagoTO(String empresa, String periodo, String motivo,
            String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoCompraFormaPagoTO",
                    UtilsJSON.objetoToJson(map), AnxCompraFormaPagoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getUltimaNumeracionComprobante(String empresa, String comprobante, String secuencial, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("comprobante", comprobante);
            map.put("secuencial", secuencial);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getUltimaNumeracionComprobante",
                    UtilsJSON.objetoToJson(map), String.class);

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxFunRegistroDatosCrediticiosTO> getFunRegistroDatosCrediticiosTOs(String codigoEmpresa,
            String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("codigoEmpresa", codigoEmpresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunRegistroDatosCrediticiosTOs",
                    UtilsJSON.objetoToJson(map), AnxFunRegistroDatosCrediticiosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getCompAutorizacion(String empCodigo, String provCodigo, String codTipoComprobante,
            String numComplemento, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("provCodigo", provCodigo);
            map.put("codTipoComprobante", codTipoComprobante);
            map.put("numComplemento", numComplemento);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getCompAutorizacion", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> getAnexoFunListadoRetencionesHuerfanas(String empresa, String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoFunListadoRetencionesHuerfanas",
                    UtilsJSON.objetoToJson(map), String[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> getAnexoFunListadoComprobantesPendientes(String empresa, String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoFunListadoComprobantesPendientes",
                    UtilsJSON.objetoToJson(map), String[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionAnxUrlWebServicesTO(anxUrlWebServicesTO anxUrlWebServicesTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxUrlWebServicesTO", anxUrlWebServicesTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionAnxUrlWebServicesTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public anxUrlWebServicesTO getAnxUrlWebServicesTO(SisInfoTO sisInfoTO) {
        try {
            return restTemplate.postForObject(conexionWS + "/getAnxUrlWebServicesTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO,
                    anxUrlWebServicesTO.class);

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionAnxVentaElectronica(AnxVentaElectronicaTO anxVentaElectronicaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxVentaElectronicaTO", anxVentaElectronicaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionAnxVentaElectronica", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionAnxCompraElectronica(AnxCompraElectronicaTO anxCompraElectronicaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("anxCompraElectronicaTO", UtilsJSON.objetoToJson(anxCompraElectronicaTO));
            map.put("accion", accion);
            map.put("sisInfoTO", UtilsJSON.objetoToJson(sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO));
            return restTemplate.postForObject(conexionWS + "/accionAnxCompraElectronica", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaVentaElectronicaTO> getListaAnxVentaElectronicaTO(String empresa,
            String fechaDesde, String fechaHasta, String tipoDocumento, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("tipoDocumento", tipoDocumento);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxVentaElectronicaTO",
                    UtilsJSON.objetoToJson(map), AnxListaVentaElectronicaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getXmlComprobanteRetencion(String empresa, String ePeriodo, String eMotivo, String eNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("ePeriodo", ePeriodo);
            map.put("eMotivo", eMotivo);
            map.put("eNumero", eNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getXmlComprobanteRetencion", UtilsJSON.objetoToJson(map),
                    String.class);

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListadoCompraElectronicaTO> getListaAnxComprasElectronicaTO(String empresa, String estado,
            String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("estado", estado);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAnxComprasElectronicaTO",
                    UtilsJSON.objetoToJson(map), AnxListadoCompraElectronicaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaRetencionesPendientesTO> getAnexoListaRetencionesPendienteTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getAnexoListaRetencionesPendienteTO",
                    UtilsJSON.objetoToJson(map), AnxListaRetencionesPendientesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AnxListaVentasPendientesTO> getListaVentasPendientes(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaVentasPendientes",
                    UtilsJSON.objetoToJson(map), AnxListaVentasPendientesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean comprobarRetencionAutorizadaProcesamiento(String empresa, String periodo, String motivo,
            String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/comprobarRetencionAutorizadaProcesamiento",
                    UtilsJSON.objetoToJson(map), boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String getXmlComprobanteElectronico(String empresa, String ePeriodo, String eMotivo, String eNumero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("ePeriodo", ePeriodo);
            map.put("eMotivo", eMotivo);
            map.put("eNumero", eNumero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getXmlComprobanteElectronico", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String comprobarAnxVentaElectronicaAutorizacion(String empresa, String periodo, String motivo,
            String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("motivo", motivo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/comprobarAnxVentaElectronicaAutorizacion",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxUltimaAutorizacionTO getAnxUltimaAutorizacionTO(String empresa, String proveedor, String tipoDocumento,
            String secuencial, String fechaFactura, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("proveedor", proveedor);
            map.put("tipoDocumento", tipoDocumento);
            map.put("secuencial", secuencial);
            map.put("fechaFactura", fechaFactura);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAnxUltimaAutorizacionTO", UtilsJSON.objetoToJson(map),
                    AnxUltimaAutorizacionTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteTalonResumen(String desde, String hasta,
            List<AnxTalonResumenTO> listaAnxTalonResumenTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("listaAnxTalonResumenTO", listaAnxTalonResumenTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reporteTalonResumenCompras.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteTalonResumen", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteTalonResumenVentas(String desde, String hasta,
            List<AnxTalonResumenVentaTO> listaAnxTalonResumenVentaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("listaAnxTalonResumenVentaTO", listaAnxTalonResumenVentaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoPagos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteTalonResumenVentas", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoRetencionesPorNumero(List<AnxListaRetencionesTO> listaAnxListaRetencionesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("listaAnxListaRetencionesTO", listaAnxListaRetencionesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoPagos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoRetencionesPorNumero", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoRetencionesVentas(String fechaDesde, String fechaHasta,
            List<AnxListadoRetencionesVentasTO> anxListadoRetencionesVentasTOs, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("anxListadoRetencionesVentasTOs", anxListadoRetencionesVentasTOs);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoPagos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoRetencionesVentas", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoDevolucionIva(String fechaDesde, String fechaHasta,
            List<AnxFunListadoDevolucionIvaTO> anxFunListadoDevolucionIvaTOs, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("anxFunListadoDevolucionIvaTOs", UtilsJSON.objetoToJson(anxFunListadoDevolucionIvaTOs));
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoPagos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoPagos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RespuestaComprobante getAutorizadocionComprobantes(String claveAcceso, String tipoAmbiente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("claveAcceso", claveAcceso);
            map.put("tipoAmbiente", tipoAmbiente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getAutorizadocionComprobantes",
                    UtilsJSON.objetoToJson(map), RespuestaComprobante.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public AnxComprobanteElectronicoUtilTO getEnvioComprobanteElectronicosWS(byte[] eXmlFirmado, String claveAcceso,
            String tipoAmbiente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("eXmlFirmado", eXmlFirmado);
            map.put("claveAcceso", claveAcceso);
            map.put("tipoAmbiente", tipoAmbiente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getEnvioComprobanteElectronicosWS",
                    UtilsJSON.objetoToJson(map), AnxComprobanteElectronicoUtilTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteComprobanteElectronico(String empresa, String claveAcceso, String XmlString,
            String nombreReporteJasper, SisInfoTO sisInfoTO) {
        try {

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("claveAcceso", claveAcceso);
            map.put("XmlString", XmlString);
            map.put("nombreReporteJasper", nombreReporteJasper);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "" + claveAcceso + ".jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteComprobanteElectronico", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String validarExistenciaReportesElectronicos(String empresa, String claveAcceso,
            String nombreReporteJasper, SisInfoTO sisInfoTO) {
        try {

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("claveAcceso", claveAcceso);
            map.put("nombreReporteJasper", nombreReporteJasper);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/validarExistenciaReportesElectronicos",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String enviarAutorizarRetencionElectronica(String empresa, String perCodigo, String motCodigo,
            String compNumero, String tipoAmbiente, char accion, SisInfoTO sisInfoTO) {
        try {

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("perCodigo", perCodigo);
            map.put("motCodigo", motCodigo);
            map.put("compNumero", compNumero);
            map.put("tipoAmbiente", tipoAmbiente);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/enviarAutorizarRetencionElectronica",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String enviarAutorizarRetencionElectronicaLote(String empresa,
            List<AnxListaRetencionesPendientesTO> listaEnviar, SisInfoTO sisInfoTO) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("empresa", empresa);
        map.put("listaEnviar", listaEnviar);
        map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        try {
            return restTemplate.postForObject(conexionWS + "/enviarAutorizarRetencionElectronicaLote",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String descargarrAutorizarRetencionElectronica(String empresa, String perCodigo, String motCodigo,
            String compNumero, String tipoAmbiente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("perCodigo", perCodigo);
            map.put("motCodigo", motCodigo);
            map.put("compNumero", compNumero);
            map.put("tipoAmbiente", tipoAmbiente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/descargarrAutorizarRetencionElectronica",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    ///////////////
    public String enviarAutorizarFacturaElectronica(String empresa, String vtaPerCodigo, String vtaMotCodigo,
            String vtaNumero, String tipoAmbiente, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("vtaPerCodigo", vtaPerCodigo);
            map.put("vtaMotCodigo", vtaMotCodigo);
            map.put("vtaNumero", vtaNumero);
            map.put("tipoAmbiente", tipoAmbiente);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/enviarAutorizarFacturaElectronica",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String descargarrAutorizarFacturaElectronica(String empresa, String vtaPerCodigo, String vtaMotCodigo,
            String vtaNumero, String tipoAmbiente, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("vtaPerCodigo", vtaPerCodigo);
            map.put("vtaMotCodigo", vtaMotCodigo);
            map.put("vtaNumero", vtaNumero);
            map.put("tipoAmbiente", tipoAmbiente);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/descargarrAutorizarFacturaElectronica",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String enviarAutorizarFaturasElectronicaLote(String empresa, List<AnxListaVentasPendientesTO> listaEnviar, SisInfoTO sisInfoTO) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("empresa", empresa);
        map.put("listaEnviar", listaEnviar);
        map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        try {
            return restTemplate.postForObject(conexionWS + "/enviarAutorizarFaturasElectronicaLote",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String enviarEmailComprobantesElectronicos(String empresa, String ePeriodo, String eMotivo, String eNumero,
            String claveAcceso, String nombreReporteJasper, String XmlString, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("ePeriodo", ePeriodo);
            map.put("eMotivo", eMotivo);
            map.put("eNumero", eNumero);
            map.put("claveAcceso", claveAcceso);
            map.put("nombreReporteJasper", nombreReporteJasper);
            map.put("XmlString", XmlString);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/enviarEmailComprobantesElectronicos",
                    UtilsJSON.objetoToJson(map), String.class);

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    /////////////////////////// Metodos WEB ///////////////////////////
    public List<ComprobanteElectronico> obtenerDocumentosPorCedulaRucMesAnio(String cedulaRuc, String mes,
            String anio, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("cedulaRuc", cedulaRuc);
            map.put("mes", mes);
            map.put("anio", anio);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<ComprobanteElectronico>(
                    Arrays.asList(restTemplate.postForObject(conexionWS + "/obtenerDocumentosPorCedulaRucMesAnio",
                            UtilsJSON.objetoToJson(map), ComprobanteElectronico[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String enviarComprobantes(String cedulaRuc, List<ComprobanteElectronico> comprobantes, String mes,
            String anio, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("cedulaRuc", cedulaRuc);
            map.put("comprobantes", comprobantes);
            map.put("mes", mes);
            map.put("anio", anio);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/enviarComprobantes", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoDevolucionIvaVentas(String fechaDesde, String fechaHasta,
            List<AnxFunListadoDevolucionIvaVentasTO> anxFunListadoDevolucionIvaVentasTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("anxFunListadoDevolucionIvaVentasTO", anxFunListadoDevolucionIvaVentasTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoDevolucionIvaVentas.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoDevolucionIvaVentas", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteRegistroDatosCrediticios(String fechaDesde, String fechaHasta,
            List<AnxFunRegistroDatosCrediticiosTO> listaAnxFunRegistroDatosCrediticiosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("listaAnxFunRegistroDatosCrediticiosTO", listaAnxFunRegistroDatosCrediticiosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoDevolucionIvaVentas.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteRegistroDatosCrediticio", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteRetencion(List<ReporteObjetoAnexo> anxListaRetencionesTOs, Map<String, Object> parametros, String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", anxListaRetencionesTOs);
            map.put("nombreReporte", nombreReporte);
            map.put("parametros", parametros);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportComprobanteRetencionPreliminar.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteRetencion", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
}
