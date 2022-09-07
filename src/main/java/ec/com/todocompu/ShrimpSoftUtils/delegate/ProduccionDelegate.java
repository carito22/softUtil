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
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.ListaLiquidacionTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.ListaPreLiquidacionTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.MultiplePiscinaCorrida;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PiscinaGrameajeTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdComboCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdComboPiscinaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdConsumosTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdContabilizarCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdCostoDetalleFechaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdEstadoCCCVT;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdFunCostosPorFechaSimpleTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdGrameajeTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionCabeceraTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionDetalleTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionMotivoComboTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionMotivoTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionMotivoTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionProductoTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionProductoTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionTallaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdLiquidacionTallaTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaCostosDetalleCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaDetalleLiquidacionTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaFunAnalisisPesosTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaPiscinaComboTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaPiscinaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaSectorConHectareajeTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaSectorTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaSobrevivenciaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListadoGrameajeTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdPiscinaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdPreLiquidacionTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdProyeccionTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdResumenCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdResumenFinancieroTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdResumenPescaSiembraTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdSectorTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdSobrevivenciaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdUtilidadDiariaCorridaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdCorrida;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdCorridaDetalle;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdCorridaPK;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdGrameaje;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdLiquidacion;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdLiquidacionDetalle;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdLiquidacionMotivo;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdLiquidacionPK;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPiscina;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPreLiquidacion;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPreLiquidacionDetalle;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPreLiquidacionMotivo;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPreLiquidacionPK;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPresupuestoPesca;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPresupuestoPescaDetalle;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPresupuestoPescaMotivo;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPresupuestoPescaPK;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdProducto;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdTalla;
import ec.com.todocompu.ShrimpSoftUtils.produccion.report.ReporteLiquidacionPesca;
import ec.com.todocompu.ShrimpSoftUtils.produccion.report.ReportePrdFunCostosPorFechaSimpleTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.report.ReporteResumenFinanciero;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class ProduccionDelegate {

	private static ProduccionDelegate produccionDelegate;
	private RestTemplate restTemplate = new RestTemplate();
	private String conexionWS;

	private ProduccionDelegate() throws Exception {
		Properties propSistema = Propiedades.readPropiedades();
		conexionWS = propSistema.getProperty("servidor.ip") + ":"
				+ propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
				+ "/todocompuWS/produccionController";
	}

	public static ProduccionDelegate getInstance() {
		if (produccionDelegate == null) {
			try {
				produccionDelegate = new ProduccionDelegate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return produccionDelegate;
	}

	public boolean insertarPrdSector(PrdSectorTO prdSectorTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSectorTO", prdSectorTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdSectorTO", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean modificarPrdSector(PrdSectorTO prdSectorTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSectorTO", prdSectorTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdSectorTO", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean eliminarPrdSector(PrdSectorTO prdSectorTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSectorTO", prdSectorTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdSectorTO", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public List<PrdListaSectorTO> getListaSectorTO(String empresa, Boolean activo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("activo", activo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSectorTO",
					UtilsJSON.objetoToJson(map), PrdListaSectorTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public boolean insertarPrdPiscina(PrdPiscinaTO prdPiscinaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPiscinaTO", prdPiscinaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdPiscinaTO", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean modificarPrdPiscina(PrdPiscinaTO prdPiscinaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPiscinaTO", prdPiscinaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdPiscinaTO", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean eliminarPrdPiscina(PrdPiscinaTO prdPiscinaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPiscinaTO", prdPiscinaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdPiscinaTO", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public List<PrdListaPiscinaTO> getListaPiscinaTO(String empresa, String sector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPiscinaTO",
					UtilsJSON.objetoToJson(map), PrdListaPiscinaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaPiscinaComboTO> getListaPiscinaActivoTO(String empresa, boolean activo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("activo", activo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPiscinaActivoTO",
					UtilsJSON.objetoToJson(map), PrdListaPiscinaComboTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaPiscinaTO> getListaPiscinaTOBusqueda(String empresa, String sector, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPiscinaTOBusqueda",
					UtilsJSON.objetoToJson(map), PrdListaPiscinaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdComboPiscinaTO> getComboPrdPiscinaTO(String empresa, String sector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboPrdPiscinaTO",
					UtilsJSON.objetoToJson(map), PrdComboPiscinaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaCorridaTO> getListaCorridaTO(String empresa, String sector, String piscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaCorridaTO",
					UtilsJSON.objetoToJson(map), PrdListaCorridaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaCorridaTO> getListaCorridaTO(String empresa, String sector, String piscina, String corrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("corrida", corrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaCorridaTO",
					UtilsJSON.objetoToJson(map), PrdListaCorridaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaCostosDetalleCorridaTO> getPrdListaCostosDetalleCorridaTO(String empresa, String sector,
			String piscina, String corrida, String desde, String hasta, String agrupadoPor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("corrida", corrida);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("agrupadoPor", agrupadoPor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPrdListaCostosDetalleCorridaTO",
					UtilsJSON.objetoToJson(map), PrdListaCostosDetalleCorridaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdComboCorridaTO> getComboPrdCorridaTO(String empresa, String sector, String piscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboPrdCorridaTO",
					UtilsJSON.objetoToJson(map), PrdComboCorridaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdComboCorridaTO> getComboPrdCorridaFiltradoTO(String empresa, String sector, String piscina, Date fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboPrdCorridaFiltradoTO",
					UtilsJSON.objetoToJson(map), PrdComboCorridaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdResumenCorridaTO> getListaResumenCorridaTO(String empresa, String sector, String desde, String hasta,
			String tipoResumen, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("tipoResumen", tipoResumen);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaResumenCorridaTO",
					UtilsJSON.objetoToJson(map), PrdResumenCorridaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdContabilizarCorridaTO> getListaContabilizarCorridaTO(String empresa, String desde, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdContabilizarCorridaTO>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaContabilizarCorridaTO",
							UtilsJSON.objetoToJson(map), PrdContabilizarCorridaTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String consultarFechaMaxMin(String empresa, String tipoResumen, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("tipoResumen", tipoResumen);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/consultarFechaMaxMin", UtilsJSON.objetoToJson(map),
					String.class, map);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public boolean getIsFechaGrameajeSuperior(String empresa, String sector, String numPiscina, String fechaDesde,
			String fechaHasta, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("numPiscina", numPiscina);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getIsFechaGrameajeSuperior", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean insertarPrdGrameaje(PrdGrameajeTO prdGrameajeTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdGrameajeTO", prdGrameajeTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdGrameaje", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public String eliminarPrdGrameaje(PrdGrameajeTO prdGrameajeTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdGrameajeTO", prdGrameajeTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdGrameaje", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListadoGrameajeTO> getPrdListadoGrameajeTO(String empresa, String sector, String piscina,
			String desde, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPrdListadoGrameajeTO",
					UtilsJSON.objetoToJson(map), PrdListadoGrameajeTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public boolean insertarPrdSobrevivencia(PrdSobrevivenciaTO prdSobrevivenciaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSobrevivenciaTO", prdSobrevivenciaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdSobrevivencia", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean modificarPrdSobrevivencia(PrdSobrevivenciaTO prdSobrevivenciaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSobrevivenciaTO", prdSobrevivenciaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdSobrevivencia", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public boolean eliminarPrdSobrevivencia(PrdSobrevivenciaTO prdSobrevivenciaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSobrevivenciaTO", prdSobrevivenciaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdSobrevivencia", UtilsJSON.objetoToJson(map),
					boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public List<PrdListaSobrevivenciaTO> getListaSobrevivenciaTO(String empresa, String sector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSobrevivenciaTO",
					UtilsJSON.objetoToJson(map), PrdListaSobrevivenciaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdCostoDetalleFechaTO> getPrdListadoCostoDetalleFechaTO(String empresa, String secCodigo, String desde,
			String hasta, String agrupadoPor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("secCodigo", secCodigo);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("agrupadoPor", agrupadoPor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPrdListadoCostoDetalleFechaTO",
					UtilsJSON.objetoToJson(map), PrdCostoDetalleFechaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public RetornoTO modificarCorridaActivo(String empresa, String sector, String hasta, String proceso,
			String agrupadoPor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("hasta", hasta);
			map.put("proceso", proceso);
			map.put("agrupadoPor", agrupadoPor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarCorridaActivo", UtilsJSON.objetoToJson(map),
					RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public RetornoTO modificarCorridaActivoSeleccionMultiple(String empresa,
			List<MultiplePiscinaCorrida> multiplePiscinaCorrida, String proceso, String agrupadoPor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("multiplePiscinaCorrida", multiplePiscinaCorrida);
			map.put("proceso", proceso);
			map.put("agrupadoPor", agrupadoPor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarCorridaActivoSeleccionMultiple",
					UtilsJSON.objetoToJson(map), RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdCorridaTO getPrdCorridaTO(String empresa, String sector, String piscina, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdCorridaTO", UtilsJSON.objetoToJson(map),
					PrdCorridaTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdGrameajeTO getPrdGrameajeTO(String empresa, String sector, String piscina, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdGrameajeTOAux", UtilsJSON.objetoToJson(map),
					PrdGrameajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdGrameajeTO getPrdGrameajeTO(String empresa, String sector, String piscina, String desde, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdGrameajeTO", UtilsJSON.objetoToJson(map),
					PrdGrameajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<MultiplePiscinaCorrida> getCostoDetallePersonalizado(String empresa, String sector, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCostoDetallePersonalizado",
					UtilsJSON.objetoToJson(map), MultiplePiscinaCorrida[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public RetornoTO getCostoPorFechaProrrateado(String empresa, String codigoSector, String fechaInicio,
			String fechaFin, String usuario, String agrupadoPor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
			map.put("agrupadoPor", agrupadoPor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getCostoPorFechaProrrateado", UtilsJSON.objetoToJson(map),
					RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdFunCostosPorFechaSimpleTO> getPrdFunCostosPorFechaSimpleTO(String codigoSector, String fechaInicio,
			String fechaFin, String infEmpresea, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("infEmpresea", infEmpresea);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPrdFunCostosPorFechaSimpleTO",
					UtilsJSON.objetoToJson(map), PrdFunCostosPorFechaSimpleTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public RetornoTO getCostoPorPiscinaSemanal(String empresa, String codigoSector, String numeroPiscina,
			String fechaInicio, String fechaFin, String usuario, String agrupadoPor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("numeroPiscina", numeroPiscina);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
			map.put("agrupadoPor", agrupadoPor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getCostoPorPiscinaSemanal", UtilsJSON.objetoToJson(map),
					RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public RetornoTO getConsumoPorFechaDesglosado(String empresa, String codigoSector, String fechaInicio,
			String fechaFin, String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getConsumoPorFechaDesglosado", UtilsJSON.objetoToJson(map),
					RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdConsumosTO> getPrdConsumosFechaTO(String empresa, String sector, String fechaDesde,
			String fechaHasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPrdConsumosFechaTO",
					UtilsJSON.objetoToJson(map), PrdConsumosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdConsumosTO> getPrdConsumosPiscinaTO(String empresa, String sector, String piscina, String fechaDesde,
			String fechaHasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPrdConsumosPiscinaTO",
					UtilsJSON.objetoToJson(map), PrdConsumosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
        
        public List<PrdUtilidadDiariaCorridaTO> getUtilidadDiariaCorrida(String empresa, String sector, String piscina, String corrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("corrida", corrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getUtilidadDiariaCorrida",
					UtilsJSON.objetoToJson(map), PrdUtilidadDiariaCorridaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public RetornoTO getConsumoPorPiscinaPeriodo(String empresa, String codigoSector, String numeroPiscina,
			String fechaInicio, String fechaFin, String periodo, String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("numeroPiscina", numeroPiscina);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("periodo", periodo);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getConsumoPorPiscinaPeriodo", UtilsJSON.objetoToJson(map),
					RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaSectorConHectareajeTO> getListaSectorConHectareaje(String empresa, String fecha, SisInfoTO sisInfoTO)
			throws Exception {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSectorConHectareaje",
					UtilsJSON.objetoToJson(map), PrdListaSectorConHectareajeTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdResumenFinancieroTO> getPrdResumenFinancieroTO(String empresa, String secCodigo, String desde,
			String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("secCodigo", secCodigo);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPrdResumenFinancieroTO",
					UtilsJSON.objetoToJson(map), PrdResumenFinancieroTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdResumenPescaSiembraTO> getResumenPesca(String empresa, String codigoSector, String fechaInicio, String fechaFin,
			String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getResumenPesca" + "", UtilsJSON.objetoToJson(map),
					PrdResumenPescaSiembraTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdResumenPescaSiembraTO> getResumenSiembra(String empresa, String codigoSector, String fechaInicio, String fechaFin,
			String usuario, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
			map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getResumenSiembra" + "", UtilsJSON.objetoToJson(map),
					PrdResumenPescaSiembraTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdLiquidacionMotivoTablaTO> getListaPrdLiquidacionMotivoTablaTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdLiquidacionMotivoTablaTO",
					UtilsJSON.objetoToJson(map), PrdLiquidacionMotivoTablaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdLiquidacionMotivoTO(PrdLiquidacionMotivoTO prdLiquidacionMotivoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionMotivoTO", prdLiquidacionMotivoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdLiquidacionMotivoTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdLiquidacionMotivoTO(PrdLiquidacionMotivoTO prdLiquidacionMotivoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionMotivoTO", prdLiquidacionMotivoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdLiquidacionMotivoTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdLiquidacionMotivoTO(PrdLiquidacionMotivoTO prdLiquidacionMotivoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionMotivoTO", prdLiquidacionMotivoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdLiquidacionMotivoTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdLiquidacionTallaTablaTO> getListaPrdLiquidacionTallaTablaTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdLiquidacionTallaTablaTO",
					UtilsJSON.objetoToJson(map), PrdLiquidacionTallaTablaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdLiquidacionTallaTablaTO> getListaPrdLiquidacionTallaTablaTO(String empresa, String codigo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigo", codigo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdLiquidacionTallaTablaTO",
					UtilsJSON.objetoToJson(map), PrdLiquidacionTallaTablaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdLiquidacionTallaTO(PrdLiquidacionTallaTO prdLiquidacionTallaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTallaTO", prdLiquidacionTallaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdLiquidacionTallaTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdLiquidacionTallaTO(PrdLiquidacionTallaTO prdLiquidacionTallaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTallaTO", prdLiquidacionTallaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdLiquidacionTallaTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdLiquidacionTallaTO(PrdLiquidacionTallaTO prdLiquidacionTallaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTallaTO", prdLiquidacionTallaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdLiquidacionTallaTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdLiquidacionProductoTablaTO> getListaPrdLiquidacionProductoTablaTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdLiquidacionProductoTablaTO",
					UtilsJSON.objetoToJson(map), PrdLiquidacionProductoTablaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdLiquidacionProductoTablaTO> getListaPrdLiquidacionProductoTablaTO(String empresa, String codigo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigo", codigo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdLiquidacionProductoTablaTO",
					UtilsJSON.objetoToJson(map), PrdLiquidacionProductoTablaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdLiquidacionProductoTO(PrdLiquidacionProductoTO prdLiquidacionProductoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionProductoTO", prdLiquidacionProductoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdLiquidacionProductoTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdLiquidacionProductoTO(PrdLiquidacionProductoTO prdLiquidacionProductoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionProductoTO", prdLiquidacionProductoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdLiquidacionProductoTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdLiquidacionProductoTO(PrdLiquidacionProductoTO prdLiquidacionProductoTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionProductoTO", prdLiquidacionProductoTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdLiquidacionProductoTO",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdLiquidacionMotivoComboTO> getListaLiquidacionMotivoComboTO(String empresa,
			boolean filtrarInactivos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("filtrarInactivos", filtrarInactivos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaLiquidacionMotivoComboTO",
					UtilsJSON.objetoToJson(map), PrdLiquidacionMotivoComboTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdLiquidacionTO(PrdLiquidacionTO prdLiquidacionTO,
			List<PrdLiquidacionDetalleTO> listaPrdLiquidacionDetalleTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTO", prdLiquidacionTO);
			map.put("listaPrdLiquidacionDetalleTO", listaPrdLiquidacionDetalleTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			System.out.println("delegate  prdLiquidacionTO" + prdLiquidacionTO.getLiqFecha());
			return restTemplate.postForObject(conexionWS + "/insertarPrdLiquidacionTO", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdLiquidacionTO(PrdLiquidacionTO prdLiquidacionTO,
			List<PrdLiquidacionDetalleTO> listaPrdLiquidacionDetalleTO,
			List<PrdLiquidacionDetalleTO> listaPrdLiquidacionEliminarDetalleTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTO", prdLiquidacionTO);
			map.put("listaPrdLiquidacionDetalleTO", listaPrdLiquidacionDetalleTO);
			map.put("listaPrdLiquidacionEliminarDetalleTO", listaPrdLiquidacionEliminarDetalleTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdLiquidacionTO", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ListaLiquidacionTO> getListaPrdConsultaLiquidacion(String empresa, String sector, String piscina,
			String busqueda, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("busqueda", busqueda);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdConsultaLiquidacion",
					UtilsJSON.objetoToJson(map), ListaLiquidacionTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdEstadoCCCVT getEstadoCCCVT(String empresa, String motivoTipo, String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("motivoTipo", motivoTipo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getEstadoCCCVT", UtilsJSON.objetoToJson(map),
					PrdEstadoCCCVT.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdLiquidacionCabeceraTO getPrdLiquidacionCabeceraTO(String empresa, String motivo,
			String numeroLiquidacion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("motivo", motivo);
			map.put("numeroLiquidacion", numeroLiquidacion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdLiquidacionCabeceraTO", UtilsJSON.objetoToJson(map),
					PrdLiquidacionCabeceraTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaFunAnalisisPesosTO> getFunAnalisisPesos(String empresa, String sector, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunAnalisisPesos",
					UtilsJSON.objetoToJson(map), PrdListaFunAnalisisPesosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<String> getFunFechaSemanas(String empresa, String sector, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunFechaSemanas",
					UtilsJSON.objetoToJson(map), String[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdListaDetalleLiquidacionTO> getListaPrdLiquidacionDetalleTO(String empresa, String motivo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("motivo", motivo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdLiquidacionDetalleTO",
					UtilsJSON.objetoToJson(map), PrdListaDetalleLiquidacionTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public RetornoTO getConsultaGrameajePromedioPorPiscina(String empresa, String sector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getConsultaGrameajePromedioPorPiscina",
					UtilsJSON.objetoToJson(map), RetornoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteListadoGramaje(String codigoSector, String codigoPiscina, String codigoCorrida,
			String fechaDesde, String fechaHasta, List<PrdListadoGrameajeTO> prdListadoGrameajeTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("codigoSector", codigoSector);
			map.put("codigoPiscina", codigoPiscina);
			map.put("codigoCorrida", codigoCorrida);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("prdListadoGrameajeTO", prdListadoGrameajeTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportListadoGramaje.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoGramaje", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteListadoFunAnalisisPesos(String codigoSector, String fechaHasta,
			List<PrdListaFunAnalisisPesosTO> prdListaFunAnalisisPesosTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("codigoSector", codigoSector);
			map.put("fechaHasta", fechaHasta);
			map.put("prdListaFunAnalisisPesosTO", prdListaFunAnalisisPesosTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportListadoFunAnalisisPesos.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoFunAnalisisPesos", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteConsumoFecha(String secCodigo, String fechaDesde, String fechaHasta,
			List<PrdConsumosTO> prdConsumosTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("secCodigo", secCodigo);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("prdConsumosTO", prdConsumosTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);

			String rutaArchivo = "reportConsumoFecha.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsumoFecha", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteConsumoPiscina(String codigoSector, String codigoPiscina, String numeroCorrida,
			String hectareas, Integer numLarvas, String fechaDesde, String fechaHasta,
			List<PrdConsumosTO> prdConsumosTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("codigoSector", codigoSector);
			map.put("codigoPiscina", codigoPiscina);
			map.put("numeroCorrida", numeroCorrida);
			map.put("hectareas", hectareas);
			map.put("numLarvas", numLarvas);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("prdConsumosTO", prdConsumosTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportConsumoPiscina.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsumoPiscina", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteEconomicoPorFechas(String fechaDesde, String fechaHasta,
			List<PrdCostoDetalleFechaTO> listaPrdCostoDetalleFechaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("listaPrdCostoDetalleFechaTO", listaPrdCostoDetalleFechaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportEconomicoPorFechas.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteEconomicoPorFechas", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteEconomicoPorPiscinas(String codigoSector, String codigoPiscina, String codigoCorrida,
			String hectareas, Integer numLarvas, String fechaDesde, String fechaHasta,
			List<PrdListaCostosDetalleCorridaTO> prdListaCostosDetalleCorridaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("codigoSector", codigoSector);
			map.put("codigoPiscina", codigoPiscina);
			map.put("codigoCorrida", codigoCorrida);
			map.put("hectareas", hectareas);
			map.put("numLarvas", numLarvas);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("prdListaCostosDetalleCorridaTO", prdListaCostosDetalleCorridaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportEconomicoPorPiscinas.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteEconomicoPorPiscinas", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteResumenSiembra(List<PrdResumenCorridaTO> listaPrdListaResumenCorridaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("listaPrdListaResumenCorridaTO", listaPrdListaResumenCorridaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportResumenSiembraAux.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteResumenSiembraAux", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;

	}

	public String generarReporteResumenPesca(List<PrdResumenCorridaTO> listaPrdListaResumenCorridaTO, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("listaPrdListaResumenCorridaTO", listaPrdListaResumenCorridaTO);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportResumenPesca.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarResumenPesca", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteResumenEconomicoSiembra(List<PrdResumenPescaSiembraTO> datos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("datos", datos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportResumenSiembra.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteResumenEconomicoSiembra", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteResumenEconomicoPesca(List<PrdResumenPescaSiembraTO> datos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("datos", datos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportResumenPescaEconomico.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteResumenEconomicoPesca", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReportePrdResumenCorrida(List<PrdResumenCorridaTO> prdResumenCorrida, String tituloReporte,
			String rutaArchivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("prdResumenCorrida", prdResumenCorrida);
			map.put("tituloReporte", tituloReporte);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			rutaArchivo = rutaArchivo == null || rutaArchivo.isEmpty() ? "reportPrdResumenCorrida.jrprint"
					: rutaArchivo;
			return UtilsRESTFul.postForFile(conexionWS + "/generarReportePrdResumenCorrida", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReportePrdFunCostosPorFechaSimpleTO(
			List<ReportePrdFunCostosPorFechaSimpleTO> reportePrdFunCostosPorFechaSimpleTOs, String tituloReporte,
			String rutaArchivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reportePrdFunCostosPorFechaSimpleTOs", reportePrdFunCostosPorFechaSimpleTOs);
			map.put("tituloReporte", tituloReporte);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			rutaArchivo = rutaArchivo == null || rutaArchivo.isEmpty() ? "reportPrdFunCostosPorFechaSimpleTO.jrprint"
					: rutaArchivo;
			return UtilsRESTFul.postForFile(conexionWS + "/generarReportePrdFunCostosPorFechaSimpleTO", map,
					rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteResumenFinanciero(List<ReporteResumenFinanciero> reporteResumenFinanciero,
			String tituloReporte, String rutaArchivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteResumenFinanciero", reporteResumenFinanciero);
			map.put("tituloReporte", tituloReporte);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			rutaArchivo = rutaArchivo == null || rutaArchivo.isEmpty() ? "reportResumenFinanciero.jrprint"
					: rutaArchivo;
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteResumenFinanciero", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteLiquidacionPesca(List<ReporteLiquidacionPesca> reporteLiquidacionPescas, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteLiquidacionPescas", reporteLiquidacionPescas);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportLiquidacionPesca.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteLiquidacionPesca", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
        
        public String generarReporteUtilidadDiariaCorrida(List<PrdUtilidadDiariaCorridaTO> listUtilidad,String sector, String piscina, String corrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("corrida", corrida);
                        map.put("reporteUtilidadDiaria", listUtilidad);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);

			String rutaArchivo = "reportUtilidadDiariaCorrida.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteUtilidadDiariaCorrida", map, rutaArchivo);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	/////////////////////////// Metodos WEB ///////////////////////////

	public List<PrdProyeccionTO> getListaPrdProyeccion(String empresa, String sector, Date fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdProyeccionTO>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaPrdProyeccion", UtilsJSON.objetoToJson(map), PrdProyeccionTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdLiquidacion getPrdLiquidacion(PrdLiquidacionPK liquidacionPK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("liquidacionPK", liquidacionPK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdLiquidacion", UtilsJSON.objetoToJson(map),
					PrdLiquidacion.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String anularRestaurarPrdLiquidacion(PrdLiquidacionPK liquidacionPK, boolean anularRestaurar, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("liquidacionPK", liquidacionPK);
			map.put("anularRestaurar", anularRestaurar);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/anularRestaurarPrdLiquidacion",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String desmayorizarPrdLiquidacion(PrdLiquidacionPK liquidacionPK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("liquidacionPK", liquidacionPK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/desmayorizarPrdLiquidacion", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarModificarPrdLiquidacion(PrdLiquidacion prdLiquidacion,
			List<PrdLiquidacionDetalle> listaPrdLiquidacionDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacion", prdLiquidacion);
			map.put("listaPrdLiquidacionDetalle", listaPrdLiquidacionDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarModificarPrdLiquidacion",
					UtilsJSON.objetoToJson(map), MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdPreLiquidacion getPrdPreLiquidacion(PrdPreLiquidacionPK liquidacionPK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("liquidacionPK", liquidacionPK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdPreLiquidacion", UtilsJSON.objetoToJson(map),
					PrdPreLiquidacion.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String anularRestaurarPrdPreLiquidacion(PrdPreLiquidacionPK liquidacionPK, boolean anularRestaurar, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("liquidacionPK", liquidacionPK);
			map.put("anularRestaurar", anularRestaurar);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/anularRestaurarPrdPreLiquidacion",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String desmayorizarPrdPreLiquidacion(PrdPreLiquidacionPK liquidacionPK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("liquidacionPK", liquidacionPK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/desmayorizarPrdPreLiquidacion",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarModificarPrdPreLiquidacion(PrdPreLiquidacion liquidacion,
			List<PrdPreLiquidacionDetalle> listaLiquidacionDetalle, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("liquidacion", liquidacion);
			map.put("listaLiquidacionDetalle", listaLiquidacionDetalle);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarModificarPrdPreLiquidacion",
					UtilsJSON.objetoToJson(map), MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdPresupuestoPesca getPrdPresupuestoPesca(PrdPresupuestoPescaPK presupuestoPescaPK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("presupuestoPescaPK", presupuestoPescaPK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdPresupuestoPesca", UtilsJSON.objetoToJson(map),
					PrdPresupuestoPesca.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdPresupuestoPesca> getListaPrdPresupuestoPesca(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdPresupuestoPesca",
					UtilsJSON.objetoToJson(map), PrdPresupuestoPesca[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String anularRestaurarPresupuestoPesca(PrdPresupuestoPescaPK presupuestoPescaPK, boolean anularRestaurar, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("presupuestoPescaPK", presupuestoPescaPK);
			map.put("anularRestaurar", anularRestaurar);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/anularRestaurarPresupuestoPesca",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String desmayorizarPresupuestoPesca(PrdPresupuestoPescaPK presupuestoPescaPK, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("presupuestoPescaPK", presupuestoPescaPK);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/desmayorizarPresupuestoPesca", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public MensajeTO insertarModificarPrdPresupuestoPesca(PrdPresupuestoPesca prdPresupuestoPesca,
			List<PrdPresupuestoPescaDetalle> listaPrdPresupuestoPescaDetalles, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPresupuestoPesca", prdPresupuestoPesca);
			map.put("listaPrdPresupuestoPescaDetalles", listaPrdPresupuestoPescaDetalles);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarModificarPrdPresupuestoPesca",
					UtilsJSON.objetoToJson(map), MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdSector(PrdSector prdSector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSector", prdSector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdSector", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdSector(PrdSector prdSector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSector", prdSector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdSector", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdSector(PrdSector prdSector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdSector", prdSector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdSector", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdSector> getListaSector(String empresa, Boolean activo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("activo", activo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdSector>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaSectorPorEmpresa", UtilsJSON.objetoToJson(map), PrdSector[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdSector> getListaSectorPorEmpresa(String empresa, Boolean activo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("activo", activo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdSector>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaSectorPorEmpresa", UtilsJSON.objetoToJson(map), PrdSector[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdPiscina> getListaPiscinasPorEmpresaSector(String empresa, String sector, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdPiscina>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPiscinasPorEmpresaSector",
							UtilsJSON.objetoToJson(map), PrdPiscina[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdPiscina(PrdPiscina prdPiscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPiscina", prdPiscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdPiscina", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdPiscina(PrdPiscina prdPiscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPiscina", prdPiscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdPiscina", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdPiscina(PrdPiscina prdPiscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPiscina", prdPiscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdPiscina", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdCorridaDetalle> getCorridaDetalleOrigenPorCorrida(String empresa, String sector, String piscina,
			String corrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("corrida", corrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdCorridaDetalle>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getCorridaDetalleOrigenPorCorrida",
							UtilsJSON.objetoToJson(map), PrdCorridaDetalle[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdCorridaDetalle> getCorridaDetalleDestinoPorCorrida(String empresa, String sector, String piscina,
			String corrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("corrida", corrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdCorridaDetalle>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getCorridaDetalleDestinoPorCorrida",
							UtilsJSON.objetoToJson(map), PrdCorridaDetalle[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdCorrida(PrdCorrida prdCorrida, List<PrdCorridaDetalle> corridaDetalleList, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdCorrida", prdCorrida);
			map.put("corridaDetalleList", corridaDetalleList);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdCorrida", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdCorrida(PrdCorrida prdCorrida, List<PrdCorridaDetalle> corridaDetalleList, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdCorrida", prdCorrida);
			map.put("corridaDetalleList", corridaDetalleList);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdCorrida", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdCorrida(PrdCorrida prdCorrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdCorrida", prdCorrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdCorrida", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
	public String cambiarCodigoPrdCorrida(PrdCorridaPK prdCorridaPK, String nuevoCodigoPrdCorrida, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdCorridaPK", prdCorridaPK);
			map.put("nuevoCodigoPrdCorrida", nuevoCodigoPrdCorrida);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/cambiarCodigoPrdCorrida", UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdPiscina obtenerPorEmpresaSectorPiscina(String empresa, String sector, String numPiscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("numPiscina", numPiscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/obtenerPorEmpresaSectorPiscina",
					UtilsJSON.objetoToJson(map), PrdPiscina.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdPiscina> getListaPiscinaPor_Empresa_Sector_Activa(String empresa, String sector, boolean activa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("activa", activa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdPiscina>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPiscinaPor_Empresa_Sector_Activa",
							UtilsJSON.objetoToJson(map), PrdPiscina[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PiscinaGrameajeTO> getListaPiscinasGrameaje(String empresa, String sector, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPiscinasGrameaje",
					UtilsJSON.objetoToJson(map), PiscinaGrameajeTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdGrameaje> getListaGrameajes(String empresa, String sector, String fecha, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("fecha", fecha);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdGrameaje>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaGrameajes", UtilsJSON.objetoToJson(map), PrdGrameaje[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdCorrida> getListaCorridasPorEmpresaSectorPiscina(String empresa, String sector, String piscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdCorrida>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaCorridasPorEmpresaSectorPiscina",
							UtilsJSON.objetoToJson(map), PrdCorrida[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdCorrida> getCorridaPorNumero(String empresa, String sector, String piscina, String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdCorrida>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getCorridaPorNumero", UtilsJSON.objetoToJson(map), PrdCorrida[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public boolean insertarGrameajeListado(List<PrdGrameaje> listaGrameajes, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("listaGrameajes", listaGrameajes);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
                        return restTemplate.postForObject(conexionWS + "/insertarGrameajeListado", UtilsJSON.objetoToJson(map),boolean.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return false;
	}

	public String eliminarGrameaje(PrdGrameaje prdGrameaje, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdGrameaje", prdGrameaje);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarGrameaje", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public PrdGrameaje getPrdGrameaje(String empresa, String sector, String piscina, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPrdGrameaje", UtilsJSON.objetoToJson(map),
					PrdGrameaje.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdLiquidacionMotivo(PrdLiquidacionMotivo prdLiquidacionMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionMotivo", prdLiquidacionMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdLiquidacionMotivo", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdLiquidacionMotivo(PrdLiquidacionMotivo prdLiquidacionMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionMotivo", prdLiquidacionMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdLiquidacionMotivo",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdLiquidacionMotivo(PrdLiquidacionMotivo prdLiquidacionMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionMotivo", prdLiquidacionMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdLiquidacionMotivo", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdLiquidacionMotivo> getListaPrdLiquidacionMotivo(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdLiquidacionMotivo>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdLiquidacionMotivo",
							UtilsJSON.objetoToJson(map), PrdLiquidacionMotivo[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdPreLiquidacionMotivo(PrdPreLiquidacionMotivo prdPreLiquidacionMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPreLiquidacionMotivo", prdPreLiquidacionMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdPreLiquidacionMotivo",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdPreLiquidacionMotivo(PrdPreLiquidacionMotivo prdPreLiquidacionMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPreLiquidacionMotivo", prdPreLiquidacionMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdPreLiquidacionMotivo",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdPreLiquidacionMotivo(PrdPreLiquidacionMotivo prdPreLiquidacionMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPreLiquidacionMotivo", prdPreLiquidacionMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdPreLiquidacionMotivo",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdPreLiquidacionMotivo> getListaPrdPreLiquidacionMotivo(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdPreLiquidacionMotivo>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdPreLiquidacionMotivo",
							UtilsJSON.objetoToJson(map), PrdPreLiquidacionMotivo[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdPresupuestoPescaMotivo(PrdPresupuestoPescaMotivo prdPresupuestoPescaMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPresupuestoPescaMotivo", prdPresupuestoPescaMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdPresupuestoPescaMotivo",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdPresupuestoPescaMotivo(PrdPresupuestoPescaMotivo prdPresupuestoPescaMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPresupuestoPescaMotivo", prdPresupuestoPescaMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdPresupuestoPescaMotivo",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdPresupuestoPescaMotivo(PrdPresupuestoPescaMotivo prdPresupuestoPescaMotivo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdPresupuestoPescaMotivo", prdPresupuestoPescaMotivo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdPresupuestoPescaMotivo",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdPresupuestoPescaMotivo> getListaPrdPresupuestoPescaMotivo(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdPresupuestoPescaMotivo>(
					Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdPresupuestoPescaMotivo",
							UtilsJSON.objetoToJson(map), PrdPresupuestoPescaMotivo[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdTalla> getListaPrdLiquidacionTalla(String empresa, boolean presupuestoPesca, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("presupuestoPesca", presupuestoPesca);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdTalla>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaPrdLiquidacionTalla", UtilsJSON.objetoToJson(map), PrdTalla[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdLiquidacionTalla(PrdTalla prdLiquidacionTalla, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTalla", prdLiquidacionTalla);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdLiquidacionTalla", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdLiquidacionTalla(PrdTalla prdLiquidacionTalla, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTalla", prdLiquidacionTalla);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdLiquidacionTalla", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdLiquidacionTalla(PrdTalla prdLiquidacionTalla, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionTalla", prdLiquidacionTalla);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdLiquidacionTalla", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarPrdLiquidacionProducto(PrdProducto prdLiquidacionProducto, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionProducto", prdLiquidacionProducto);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarPrdLiquidacionProducto",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String modificarPrdLiquidacionProducto(PrdProducto prdLiquidacionProducto, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionProducto", prdLiquidacionProducto);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/modificarPrdLiquidacionProducto",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String eliminarPrdLiquidacionProducto(PrdProducto prdLiquidacionProducto, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("prdLiquidacionProducto", prdLiquidacionProducto);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/eliminarPrdLiquidacionProducto",
					UtilsJSON.objetoToJson(map), String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<PrdProducto> getListaPrdLiquidacionProducto(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<PrdProducto>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListaPrdLiquidacionProducto", UtilsJSON.objetoToJson(map), PrdProducto[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<ListaPreLiquidacionTO> getListaPrdConsultaPreLiquidacion(String empresa, String sector, String piscina,
			String busqueda, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("piscina", piscina);
			map.put("busqueda", busqueda);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPrdConsultaPreLiquidacion",
					UtilsJSON.objetoToJson(map), ListaPreLiquidacionTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}        
        public RetornoTO getCostosMensuales(String empresa, String codigoSector, String fechaInicio, String fechaFin,String usuario, String agrupadoPor, SisInfoTO sisInfoTO) {
		try {
                    	Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
                        map.put("fechaFin", fechaFin);
			map.put("usuario", usuario);
                        map.put("agrupadoPor", agrupadoPor);                        
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
                        RetornoTO rr=restTemplate.postForObject(conexionWS + "/getCostosMensuales", UtilsJSON.objetoToJson(map), RetornoTO.class);
                    return rr;
                } catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
        
        
         public RetornoTO getConsumosMensuales(String empresa, String codigoSector, String fechaInicio, String fechaFin,String usuario, SisInfoTO sisInfoTO) {
		try {                    
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoSector", codigoSector);
			map.put("fechaInicio", fechaInicio);
                        map.put("fechaFin", fechaFin);
                        map.put("usuario", usuario);                   
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
                        RetornoTO rr=restTemplate.postForObject(conexionWS + "/getConsumosMensuales", UtilsJSON.objetoToJson(map), RetornoTO.class);
                    return rr;
                } catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
         
            public PrdLiquidacionTO getBuscaObjLiquidacionPorLote(String liqLote, String liqEmpresa, SisInfoTO sisInfoTO) {
		try {                    
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
                        return restTemplate.postForObject(conexionWS + "/getBuscaObjLiquidacionPorLote?liqLote="+liqLote+"&liqEmpresa="+liqEmpresa, UtilsJSON.objetoToJson(map), PrdLiquidacionTO.class);
                } catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
        
        public PrdPreLiquidacionTO getBuscaObjPreLiquidacionPorLote(String plLote, SisInfoTO sisInfoTO) {
		try {                    
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
                        return restTemplate.postForObject(conexionWS + "/getBuscaObjPreLiquidacionPorLote?plLote="+plLote, UtilsJSON.objetoToJson(map), PrdPreLiquidacionTO.class);
                } catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
}