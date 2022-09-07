package ec.com.todocompu.ShrimpSoftUtils.delegate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import ec.com.todocompu.ShrimpSoftUtils.MensajeTO;
import ec.com.todocompu.ShrimpSoftUtils.Propiedades;
import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.UtilsRESTFul;
import ec.com.todocompu.ShrimpSoftUtils.caja.TO.CajCajaTO;
import ec.com.todocompu.ShrimpSoftUtils.caja.TO.CajCajaValesTO;
import ec.com.todocompu.ShrimpSoftUtils.caja.TO.CajCuadreCajaTO;
import ec.com.todocompu.ShrimpSoftUtils.caja.TO.CajValesConceptoTO;
import ec.com.todocompu.ShrimpSoftUtils.caja.TO.CajValesConceptosComboTO;
import ec.com.todocompu.ShrimpSoftUtils.caja.TO.CajaValesTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class CajaDelegate {

	private static CajaDelegate grupoDelegate;
	private RestTemplate restTemplate = new RestTemplate();
	private String conexionWS;

	private CajaDelegate() throws Exception {
		Properties propSistema = Propiedades.readPropiedades();
		conexionWS = propSistema.getProperty("servidor.ip") + ":"
				+ propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
				+ "/todocompuWS/cajaController";
	}

	public static CajaDelegate getInstance() {
		if (grupoDelegate == null) {
			try {
				grupoDelegate = new CajaDelegate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return grupoDelegate;
	}

	public MensajeTO accionCajCaja(CajCajaTO cajCajaTO, String accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("cajCajaTO", cajCajaTO);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/accionCajCajaTO", UtilsJSON.objetoToJson(map),
					MensajeTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CajCajaTO> getListadoCajCajaTO(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<CajCajaTO>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getListadoCajCajaTO", UtilsJSON.objetoToJson(map), CajCajaTO[].class, map)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String accionCajaValesTO(CajCajaValesTO cajCajaValesTO, String accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("cajCajaValesTO", cajCajaValesTO);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/accionCajaValesTO", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String accionCajValesConceptosTO(CajValesConceptoTO cajValesConceptosTO, char accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("cajValesConceptosTO", cajValesConceptosTO);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/accionCajValesConceptosTO", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CajaValesTO> getListadoCajValesTO(String empresa, String motCodigo, String fechaDesde,
			String fechaHasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("motCodigo", motCodigo);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListadoCajValesTO",
					UtilsJSON.objetoToJson(map), CajaValesTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CajCajaValesTO getCajCajaValesTO(String empresa, String perCodigo, String motCodigo, String valeNumero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("perCodigo", perCodigo);
			map.put("motCodigo", motCodigo);
			map.put("valeNumero", valeNumero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getCajCajaValesTO", UtilsJSON.objetoToJson(map),
					CajCajaValesTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CajCuadreCajaTO> getCajCuadreCajaTOs(String empresa, String codigoMotivo, String fechaDesde,
			String fechaHasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("codigoMotivo", codigoMotivo);
			map.put("fechaDesde", fechaDesde);
			map.put("fechaHasta", fechaHasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return new ArrayList<CajCuadreCajaTO>(Arrays.asList(restTemplate.postForObject(
					conexionWS + "/getCajCuadreCajaTOs", UtilsJSON.objetoToJson(map), CajCuadreCajaTO[].class)));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CajValesConceptosComboTO> getCajValesConceptosComboTOs(String empresa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCajValesConceptosComboTOs",
					UtilsJSON.objetoToJson(map), CajValesConceptosComboTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CajCajaTO getCajCajaTO(String empresa, String usuarioCodigo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("usuarioCodigo", usuarioCodigo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getCajCajaTO", UtilsJSON.objetoToJson(map),
					CajCajaTO.class);

		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCajCuadreDeCaja(String fechaHasta, String codigoMotivo, String descripcionMotivo,
			List<CajCuadreCajaTO> listCajCuadreCajaTOs, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("fechaHasta", fechaHasta);
			map.put("codigoMotivo", codigoMotivo);
			map.put("descripcionMotivo", descripcionMotivo);
			map.put("listCajCuadreCajaTOs", listCajCuadreCajaTOs);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCajCuadreDeCaja.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCajCuadreDeCaja", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCajVales(String descripcionCajaConcepto, String codigoCajaConcepto,
			CajCajaValesTO cajCajaValesTo, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("descripcionCajaConcepto", descripcionCajaConcepto);
			map.put("codigoCajaConcepto", codigoCajaConcepto);
			map.put("cajCajaValesTo", cajCajaValesTo);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCajVales.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCajVales", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCajValesListado(List<CajaValesTO> listaCajValesListaTOs, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("listaCajValesListaTOs", listaCajValesListaTOs);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCajValesListado.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCajValesListado", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
}
