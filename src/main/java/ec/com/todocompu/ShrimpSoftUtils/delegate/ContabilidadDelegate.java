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

import ec.com.todocompu.ShrimpSoftUtils.MensajeTO;
import ec.com.todocompu.ShrimpSoftUtils.Propiedades;
import ec.com.todocompu.ShrimpSoftUtils.RetornoTO;
import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.UtilsRESTFul;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConBalanceComprobacionTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConBalanceGeneralComparativoTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConBalanceResultadoComparativoTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConBalanceResultadosMensualizadosTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConContableReporteTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConContableTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConCuentasFlujoDetalleTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConCuentasFlujoTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConCuentasTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConDetalleTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConDetalleTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConDiarioAuxiliarTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConEstructuraFlujoTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConEstructuraTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConFunBalanceGeneralNecTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConFunBalanceResultadosNecTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConFunContablesVerificacionesComprasTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConFunContablesVerificacionesTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConFunIPPTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConListaBalanceResultadosVsInventarioTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConMayorAuxiliarTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConMayorGeneralTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConNumeracionTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConTipoTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ListaConContableTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.PersonaTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContablePK;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConDetalle;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConTipo;
import ec.com.todocompu.ShrimpSoftUtils.inventario.report.ReporteCompraDetalle;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdContabilizarCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class ContabilidadDelegate {

	private static ContabilidadDelegate grupoDelegate;
	private RestTemplate restTemplate = new RestTemplate();
	private String conexionWS;

	private ContabilidadDelegate() throws Exception {
		Properties propSistema = Propiedades.readPropiedades();
		conexionWS = propSistema.getProperty("servidor.ip") + ":"
				+ propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
				+ "/todocompuWS/contabilidadController";
	}

	public static ContabilidadDelegate getInstance() {
		if (grupoDelegate == null) {
			try {
				grupoDelegate = new ContabilidadDelegate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return grupoDelegate;
	}

	public List<ConTipoTO> getListaConTipoTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConTipoTO",
					UtilsJSON.objetoToJson(map), ConTipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

    public List<ConTipoTO> getListaConTipoTOFiltrado(String empresa, String filtro, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("filtro", filtro);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConTipoTOFiltrado",
                    UtilsJSON.objetoToJson(map), ConTipoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

	public ConTipoTO getConTipoTO(String empresa, String tipCodigo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("tipCodigo", tipCodigo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getConTipoTO", UtilsJSON.objetoToJson(map),
					ConTipoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConTipoTO> getListaConTipoRrhh(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConTipoRrhhTO",
					UtilsJSON.objetoToJson(map), ConTipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConTipoTO> getListaConTipoCartera(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConTipoCarteraTO",
					UtilsJSON.objetoToJson(map), ConTipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConTipoTO> getListaConTipoCarteraAnticiposTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConTipoCarteraAnticiposTO",
					UtilsJSON.objetoToJson(map), ConTipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConCuentasTO> getListaConCuentas(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConCuentasTO",
					UtilsJSON.objetoToJson(map), ConCuentasTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConCuentasTO> getRangoCuentasTO(String empresa, String codigoCuentaDesde, String codigoCuentaHasta,
			int largoCuenta, String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoCuentaDesde", codigoCuentaDesde);
			map.put("codigoCuentaHasta", codigoCuentaHasta);
			map.put("largoCuenta", largoCuenta);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRangoCuentasTO",
					UtilsJSON.objetoToJson(map), ConCuentasTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConCuentasFlujoTO> getListaConCuentasFlujoTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConCuentasFlujoTO",
					UtilsJSON.objetoToJson(map), ConCuentasFlujoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConCuentasFlujoDetalleTO> getListaConCuentasFlujoDetalle(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConCuentasFlujoDetalleTO",
					UtilsJSON.objetoToJson(map), ConCuentasFlujoDetalleTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConCuentasTO> getListaBuscarConCuentas(String empresa, String buscar, String ctaGrupo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("buscar", buscar);
			map.put("ctaGrupo", ctaGrupo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBuscarConCuentasTO",
					UtilsJSON.objetoToJson(map), ConCuentasTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConCuentasFlujoTO> getListaBuscarConCuentasFlujo(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBuscarConCuentasFlujoTO",
					UtilsJSON.objetoToJson(map), ConCuentasFlujoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConEstructuraTO> getListaConEstructura(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConEstructura",
					UtilsJSON.objetoToJson(map), ConEstructuraTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConEstructuraFlujoTO> getListaConEstructuraFlujo(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConEstructuraFlujoTO",
					UtilsJSON.objetoToJson(map), ConEstructuraFlujoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConContableTO> getListaConContable(String empresa, String perCodigo, String tipCodigo,
			String numContable, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("perCodigo", perCodigo);
			map.put("tipCodigo", tipCodigo);
			map.put("numContable", numContable);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<ConContableTO>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaConContableTO", UtilsJSON.objetoToJson(map), ConContableTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConDetalleTablaTO> getListaConDetalle(String empresa, String periodo, String tipo, String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<ConDetalleTablaTO>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaConDetalleTO", UtilsJSON.objetoToJson(map), ConDetalleTablaTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public Boolean buscarConDetallesActivosBiologicos(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/buscarConDetallesActivosBiologicos",
					UtilsJSON.objetoToJson(map), Boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConFunBalanceResultadosNecTO> getConEstadoResultadosIntegralTO(String empresa, String sector,
			String fechaDesde, String fechaHasta, Boolean ocultarDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("ocultarDetalle", ocultarDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getConEstadoResultadosIntegralTO",
					UtilsJSON.objetoToJson(map), ConFunBalanceResultadosNecTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConBalanceResultadoComparativoTO> getConBalanceResultadoComparativoTO(String empresa, String sector, 
                String fechaDesde, String fechaHasta, 
                String fechaDesde2, String fechaHasta2, 
                Boolean ocultarDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("fechaDesde2", fechaDesde2);
			map.put("fechaHasta2", fechaHasta2);
			map.put("ocultarDetalle", ocultarDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getConBalanceResultadoComparativoTO",
					UtilsJSON.objetoToJson(map), ConBalanceResultadoComparativoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConFunBalanceResultadosNecTO> getConFunBalanceFlujoEfectivo(String empresa, String sector, String fechaDesde,
			String fechaHasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getConFunBalanceFlujoEfectivo",
					UtilsJSON.objetoToJson(map), ConFunBalanceResultadosNecTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConFunBalanceGeneralNecTO> getConEstadoSituacionFinancieraTO(String empresa, String sector, String fecha,
			Boolean ocultar, Boolean ocultarDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("ocultar", ocultar);
			map.put("ocultarDetalle", ocultarDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getConEstadoSituacionFinancieraTO",
					UtilsJSON.objetoToJson(map), ConFunBalanceGeneralNecTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConFunBalanceGeneralNecTO> getFunCuentasSobregiradasTO(String empresa, String secCodigo, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("secCodigo", secCodigo);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunCuentasSobregiradasTO",
					UtilsJSON.objetoToJson(map), ConFunBalanceGeneralNecTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConBalanceGeneralComparativoTO> getFunBalanceGeneralComparativoTO(String empresa, String secCodigo,
			String fechaAnterior, String fechaActual, Boolean ocultar, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("secCodigo", secCodigo);
			map.put("fechaAnterior", fechaAnterior);
			map.put("fechaActual", fechaActual);
			map.put("ocultar", ocultar);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunBalanceGeneralComparativoTO",
					UtilsJSON.objetoToJson(map), ConBalanceGeneralComparativoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConBalanceComprobacionTO> getListaBalanceComprobacionTO(String empresa, String codigoSector,
			String fechaInicio, String fechaFin, Boolean ocultarDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("ocultarDetalle", ocultarDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBalanceComprobacionTO",
					UtilsJSON.objetoToJson(map), ConBalanceComprobacionTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConMayorAuxiliarTO> getListaMayorAuxiliarTO(String empresa, String codigoCuentaDesde,
			String codigoCuentaHasta, String fechaInicio, String fechaFin, String sector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoCuentaDesde", codigoCuentaDesde);
			map.put("codigoCuentaHasta", codigoCuentaHasta);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("sector", sector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaMayorAuxiliarTO",
					UtilsJSON.objetoToJson(map), ConMayorAuxiliarTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConMayorGeneralTO> getListaMayorGeneralTO(String empresa, String codigoSector, String codigoCuenta,
			String fechaFin, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("codigoCuenta", codigoCuenta);
			map.put("fechaFin", fechaFin);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaMayorGeneralTO",
					UtilsJSON.objetoToJson(map), ConMayorGeneralTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConDiarioAuxiliarTO> getListaDiarioAuxiliarTO(String empresa, String codigoTipo, String fechaInicio,
			String fechaFin, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoTipo", codigoTipo);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaDiarioAuxiliarTO",
					UtilsJSON.objetoToJson(map), ConDiarioAuxiliarTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarConTipo(ConTipoTO conTipoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conTipoTO", conTipoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarConTipo", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO modificarConTipo(ConTipoTO conTipoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conTipoTO", conTipoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarConTipo", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO eliminarConTipo(ConTipoTO conTipoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conTipoTO", conTipoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarConTipo", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public int buscarConteoDetalleEliminarCuenta(String empCodigo, String cuentaCodigo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empCodigo", empCodigo);
			map.put("cuentaCodigo", cuentaCodigo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/buscarConteoDetalleEliminarCuenta",
					UtilsJSON.objetoToJson(map), int.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return 0;
	}

	public MensajeTO insertarConCuenta(ConCuentasTO conCuentasTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasTO", conCuentasTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarConCuenta", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public boolean insertarConCuentaFlujo(ConCuentasFlujoTO conCuentasFlujoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasFlujoTO", conCuentasFlujoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarConCuentaFlujo", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean insertarConCuentaFlujoDetalle(ConCuentasFlujoDetalleTO conCuentasFlujoDetalleTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasFlujoDetalleTO", conCuentasFlujoDetalleTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarConCuentaFlujoDetalle",
					UtilsJSON.objetoToJson(map), boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public MensajeTO modificarConCuenta(ConCuentasTO conCuentasTO, String codigoCambiarLlave, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasTO", conCuentasTO);
			map.put("codigoCambiarLlave", codigoCambiarLlave);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarConCuenta", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public boolean modificarConCuentaFlujo(ConCuentasFlujoTO conCuentasFlujoTO, String codigoCambiarLlave, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasFlujoTO", conCuentasFlujoTO);
			map.put("codigoCambiarLlave", codigoCambiarLlave);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarConCuentaFlujo", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean modificarConCuentaFlujoDetalle(ConCuentasFlujoDetalleTO conCuentasFlujoDetalleTO,
			String codigoCambiarLlave, char formaPagoAnterior, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasFlujoDetalleTO", conCuentasFlujoDetalleTO);
			map.put("codigoCambiarLlave", codigoCambiarLlave);
			map.put("formaPagoAnterior", formaPagoAnterior);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarConCuentaFlujoDetalle",
					UtilsJSON.objetoToJson(map), boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public MensajeTO eliminarConCuenta(ConCuentasTO conCuentasTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasTO", conCuentasTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarConCuenta", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarConCuentaFlujo(ConCuentasFlujoTO conCuentasFlujoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasFlujoTO", conCuentasFlujoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarConCuentaFlujo", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarConCuentaFlujoDetalle(ConCuentasFlujoDetalleTO conCuentasFlujoDetalleTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conCuentasFlujoDetalleTO", conCuentasFlujoDetalleTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarConCuentaFlujoDetalle",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarConContable(ConContableTO conContableTO, List<ConDetalleTO> listaConDetalleTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContableTO", conContableTO);
			map.put("listaConDetalleTO", listaConDetalleTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarConContable", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarModificarContable(ConContable conContable, List<ConDetalle> listaConDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContable", conContable);
			map.put("listaConDetalle", listaConDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarModificarContable", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConNumeracionTO> getListaConNumeracionTO(String empresa, String periodo, String tipo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConNumeracionTO",
					UtilsJSON.objetoToJson(map), ConNumeracionTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public ConDetalle buscarDetalleContable(Long codDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("codDetalle", codDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/buscarDetalleContable", UtilsJSON.objetoToJson(map),
					ConDetalle.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConDetalle> getListConDetalle(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContablePK", conContablePK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<ConDetalle>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getListConDetalle",
					UtilsJSON.objetoToJson(map), ConDetalle[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConDetalleTO> buscarConContable(String codEmpresa, String perCodigo, String tipCodigo,
			String conNumero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("codEmpresa", codEmpresa);
			map.put("perCodigo", perCodigo);
			map.put("tipCodigo", tipCodigo);
			map.put("conNumero", conNumero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/buscarConContable",
					UtilsJSON.objetoToJson(map), ConDetalleTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConListaBalanceResultadosVsInventarioTO> getConListaBalanceResultadosVsInventarioTO(String empresa,
			String desde, String hasta, String sector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("sector", sector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getConListaBalanceResultadosVsInventarioTO",
					UtilsJSON.objetoToJson(map), ConListaBalanceResultadosVsInventarioTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConBalanceResultadosMensualizadosTO> getBalanceResultadoMensualizado(String empresa, String codigoSector, String fechaInicio,
			String fechaFin, String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getBalanceResultadoMensualizado",
					UtilsJSON.objetoToJson(map), ConBalanceResultadosMensualizadosTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
        
	public RetornoTO getBalanceResultadoMensualizadoAntiguo(String empresa, String codigoSector, String fechaInicio,
			String fechaFin, String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getBalanceResultadoMensualizadoAntiguo",
					UtilsJSON.objetoToJson(map), RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String desbloquearConContable(String empresa, String periodo, String tipo, String numero, String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("numero", numero);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/desbloquearConContable", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConFunContablesVerificacionesTO> getFunContablesVerificacionesTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunContablesVerificacionesTO",
					UtilsJSON.objetoToJson(map), ConFunContablesVerificacionesTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConFunIPPTO> getFunListaIPP(String empresa, String fechaInicio, String fechaFin, String parametro, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("parametro", parametro);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<ConFunIPPTO>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunListaIPP",
					UtilsJSON.objetoToJson(map), ConFunIPPTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarModificarIPP(String empresa, String fechaDesde, String fechaHasta, String tipo,
			Date fechaHoraBusqueda, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("tipo", tipo);
			map.put("fechaHoraBusqueda", fechaHoraBusqueda);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarModificarIPP", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarModificarContablesIPPTodo(String empresa, String fechaDesde, String fechaHasta, 
			Date fechaHoraBusqueda, List<PrdContabilizarCorridaTO> listaContabilizarCorrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("fechaHoraBusqueda", fechaHoraBusqueda);
                        map.put("listaContabilizarCorrida", listaContabilizarCorrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarModificarContablesIPPTodo", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarModificarContabilizarCorrida(String empresa, String desde, String hasta,
			List<PrdContabilizarCorridaTO> listaContabilizarCorrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("listaContabilizarCorrida", listaContabilizarCorrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarModificarContabilizarCorrida",
					UtilsJSON.objetoToJson(map), MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO getListaInvConsultaConsumosPendientes(String empCodigo, String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empCodigo", empCodigo);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getListaInvConsultaConsumosPendientes",
					UtilsJSON.objetoToJson(map), MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarConContableCierreCuentas(ConContableTO conContableTO, String centroProduccion,
			String conNumeroContable, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContableTO", conContableTO);
			map.put("centroProduccion", centroProduccion);
			map.put("conNumeroContable", conNumeroContable);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarConContableCierreCuentas",
					UtilsJSON.objetoToJson(map), MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConCuentasFlujoTO> getListaBuscarConCuentasFlujoTO(String empresa, String buscar, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("buscar", buscar);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBuscarConCuentasFlujoTO",
					UtilsJSON.objetoToJson(map), ConCuentasFlujoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConFunContablesVerificacionesComprasTO> getConFunContablesVerificacionesComprasTOs(String empresa,
			String fechaInicio, String fechaFin, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getConFunContablesVerificacionesComprasTOs",
					UtilsJSON.objetoToJson(map), ConFunContablesVerificacionesComprasTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PersonaTO> getFunPersonaTOs(String empresa, String busquedad, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("busquedad", busquedad);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunPersonaTOs",
					UtilsJSON.objetoToJson(map), PersonaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteContableDetalle(List<ConContableReporteTO> listConContableReporteTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("listConContableReporteTO", listConContableReporteTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportComprobanteContable.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteContableDetalle", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteMayorAuxiliar(String fechaDesde, String fechaHasta, String cuentaContableDesde,
			String cuentaContablePadreDesde, String cuentaContableHasta, String cuentaContablePadreHasta,
			List<ConMayorAuxiliarTO> listConMayorAuxiliarTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("cuentaContableDesde", cuentaContableDesde);
			map.put("cuentaContablePadreDesde", cuentaContablePadreDesde);
			map.put("cuentaContableHasta", cuentaContableHasta);
			map.put("cuentaContablePadreHasta", cuentaContablePadreHasta);
			map.put("listConMayorAuxiliarTO", listConMayorAuxiliarTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadMayorAuxiliar.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteMayorAuxiliar", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteDiarioAuxiliar(String fechaDesde, String fechaHasta, String codigoTipo,
			List<ConDiarioAuxiliarTO> listConDiarioAuxiliarTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("codigoTipo", codigoTipo);
			map.put("listConDiarioAuxiliarTO", listConDiarioAuxiliarTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadDiarioGeneral.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDiarioAuxiliar", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteBalanceComprobacion(String fechaDesde, String fechaHasta,
			List<ConBalanceComprobacionTO> listConBalanceComprobacionTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("listConBalanceComprobacionTO", listConBalanceComprobacionTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadBalanceComprobacion.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteBalanceComprobacion", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteBalanceGeneral(String fechaHasta, String codigoSector,
			List<ConFunBalanceGeneralNecTO> listConFunBalanceGeneralNecTO,
			List<ConFunBalanceGeneralNecTO> listConBalanceGeneralTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaHasta", fechaHasta);
			map.put("codigoSector", codigoSector);
			map.put("listConFunBalanceGeneralNecTO", listConFunBalanceGeneralNecTO);
			map.put("listConBalanceGeneralTO", listConBalanceGeneralTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadBalanceGeneral.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteBalanceGeneral", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String generarReporteBalanceGeneralComparativo(String fechaAnterior, String fechaActual, String codigoSector,
			List<ConBalanceGeneralComparativoTO> listConBalanceGeneralComparativoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaAnterior", fechaAnterior);
			map.put("fechaActual", fechaActual);
			map.put("codigoSector", codigoSector);
			map.put("listConBalanceGeneralComparativoTO", listConBalanceGeneralComparativoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadBalanceGeneralComparativo.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteBalanceGeneralComparativo", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteBalanceResultado(String fechaDesde, String fechaHasta, String codigoSector,
			Integer columnasEstadosFinancieros, List<ConFunBalanceResultadosNecTO> listConFunBalanceResultadosNecTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("codigoSector", codigoSector);
			map.put("columnasEstadosFinancieros", columnasEstadosFinancieros);
			map.put("listConFunBalanceResultadosNecTO", listConFunBalanceResultadosNecTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadBalanceResultados.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteBalanceResultado", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteBalanceResultadoComparativo(String fechaDesde, String fechaHasta, String fechaDesde2, String fechaHasta2,
                String codigoSector, List<ConBalanceResultadoComparativoTO> conBalanceResultadoComparativoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("fechaDesde2", fechaDesde2);
			map.put("fechaHasta2", fechaHasta2);
			map.put("codigoSector", codigoSector);
			map.put("conBalanceResultadoComparativoTO", conBalanceResultadoComparativoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadBalanceResultados.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteBalanceResultadoComparativo", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteContablesVerificacionesCompras(String fechaDesde, String fechaHasta,
			List<ConFunContablesVerificacionesComprasTO> listConFunContablesVerificacionesComprasTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("listConFunContablesVerificacionesComprasTO", listConFunContablesVerificacionesComprasTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadMayorGeneral.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteContablesVerificacionesCompras", map,
					rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteConListaBalanceResultadosVsInventario(String fechaDesde, String fechaHasta,
			List<ConListaBalanceResultadosVsInventarioTO> listConListaBalanceResultadosVsInventarioTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("listConListaBalanceResultadosVsInventarioTO", listConListaBalanceResultadosVsInventarioTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportBalanceResultadoVSInventario.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConListaBalanceResultadosVsInventario", map,
					rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteContablesVerificacionesErrores(
			List<ConFunContablesVerificacionesTO> listConFunContablesVerificacionesTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("listConFunContablesVerificacionesTO", listConFunContablesVerificacionesTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "ReporteContablesVerificacionesErrores.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteContablesVerificacionesErrores", map,
					rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteMayorGeneral(String fechaHasta, String cuentaContable, Object[][] datos, SisInfoTO sisInfoTO) {// List<ConMayorGeneralTO>
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaHasta", fechaHasta);
			map.put("cuentaContable", cuentaContable);
			map.put("datos", datos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadMayorGeneral.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteMayorGeneralDatos", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteMayorGeneral(String fechaHasta, String cuentaContable,
			List<ConMayorGeneralTO> listConMayorGeneralTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaHasta", fechaHasta);
			map.put("cuentaContable", cuentaContable);
			map.put("listConMayorGeneralTO", listConMayorGeneralTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportContabilidadMayorGeneral.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteMayorGeneral", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCompraContableDetalle(List<ReporteCompraDetalle> reporteCompraDetalles,
			List<ConContableReporteTO> list, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCompraDetalles", reporteCompraDetalles);
			map.put("list", list);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportComprobanteCompraContable.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCompraContableDetalle", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	/////////////////////////// Metodos WEB ///////////////////////////

	public List<ConTipo> getListaConTipoReferencia(String empresa, String referencia, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("referencia", referencia);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<ConTipo>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaConTipoReferencia", UtilsJSON.objetoToJson(map), ConTipo[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ConTipo> getListaConTipo(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<ConTipo>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConTipo",
					UtilsJSON.objetoToJson(map), ConTipo[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ListaConContableTO> getListConContableTO(String empresa, String periodo, String tipo, String busqueda,
			String referencia, String nRegistros, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("busqueda", busqueda);
			map.put("referencia", referencia);
			map.put("nRegistros", nRegistros);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<ListaConContableTO>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListConContableTO", UtilsJSON.objetoToJson(map), ListaConContableTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public ConContable getConContable(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContablePK", conContablePK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getConContable", UtilsJSON.objetoToJson(map),
					ConContable.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String desmayorizarConContable(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContablePK", conContablePK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/desmayorizarConContable", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String anularReversarConContable(ConContablePK conContablePK, boolean anularReversar, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContablePK", conContablePK);
			map.put("anularReversar", anularReversar);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/anularReversarConContable", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
        
	public String eliminarConContable(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContablePK", conContablePK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarConContable", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String restaurarConContable(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("conContablePK", conContablePK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/restaurarConContable", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<String> validarChequesConciliados(String periodo, String conTipo, String conNumero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("periodo", periodo);
			map.put("conTipo", conTipo);
			map.put("conNumero", conNumero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/validarChequesConciliados", UtilsJSON.objetoToJson(map),
					List.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO validarContables(String periodo, String conTipo, String conNumero, String accionUsuario,
			String bandera, SisInfoTO sisInfoTO) {
		try {

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("periodo", periodo);
			map.put("conTipo", conTipo);
			map.put("conNumero", conNumero);
			map.put("accionUsuario", accionUsuario);
			map.put("bandera", bandera);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/validarContables", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

}
