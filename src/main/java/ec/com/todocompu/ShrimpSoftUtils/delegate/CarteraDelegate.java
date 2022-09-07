package ec.com.todocompu.ShrimpSoftUtils.delegate;

import java.util.Arrays;
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
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCobrosAnticipoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCobrosDetalleAnticiposTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCobrosDetalleFormaTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCobrosDetalleVentasTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCobrosTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarComboPagosCobrosFormaTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarContableTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCuentasPorCobrarSaldoAnticiposTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCuentasPorPagarCobrarAnticiposTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCuentasPorPagarCobrarGeneralTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarCuentasPorPagarSaldoAnticiposTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunCobrosDetalleTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunCobrosSaldoAnticipoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunCobrosTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunCuentasPorCobrarListadoVentasTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunCuentasPorPagarListadoComprasTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunPagosDetalleTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunPagosPruebaTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunPagosSaldoAnticipoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarFunPagosTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaCobrosClienteTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaCobrosTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaMayorAuxiliarClienteProveedorTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaPagosCobrosDetalleAnticipoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaPagosCobrosDetalleFormaTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaPagosCobrosFormaTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaPagosProveedorTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarListaPagosTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarPagosAnticipoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarPagosCobrosAnticipoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarPagosCobrosFormaTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarPagosDetalleAnticiposTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarPagosDetalleComprasTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarPagosDetalleFormaTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CarPagosTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CuentasPorCobrarDetalladoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.TO.CuentasPorPagarDetalladoTO;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCarFunCuentasPorCobrarListadoVentas;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCarFunCuentasPorPagarListadoCompras;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCobros;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCuentasPorCobrarDetallado;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCuentasPorCobrarGeneral;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCuentasPorPagarAnticipos;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCuentasPorPagarCobrarSaldoAnticipos;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCuentasPorPagarDetallado;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteCuentasPorPagarGeneral;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteListadoCobros;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteListadoPagos;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReporteMayorAuxiliarProveedorCliente;
import ec.com.todocompu.ShrimpSoftUtils.cartera.report.ReportePagos;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class CarteraDelegate {

	private static CarteraDelegate grupoDelegate;
	private RestTemplate restTemplate = new RestTemplate();
	private String conexionWS;

	private CarteraDelegate() throws Exception {
		Properties propSistema = Propiedades.readPropiedades();
		conexionWS = propSistema.getProperty("servidor.ip") + ":"
				+ propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
				+ "/todocompuWS/carteraController";
	}

	public static CarteraDelegate getInstance() {
		if (grupoDelegate == null) {
			try {
				grupoDelegate = new CarteraDelegate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return grupoDelegate;
	}

	public CarContableTO insertarCarPagos(CarPagosTO carPagosTO,
			List<CarPagosDetalleComprasTO> carPagosDetalleComprasTOs,
			List<CarPagosDetalleAnticiposTO> carPagosDetalleAnticiposTOs,
			List<CarPagosDetalleFormaTO> carPagosDetalleFormaTOs, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carPagosTO", carPagosTO);
			map.put("carPagosDetalleComprasTOs", carPagosDetalleComprasTOs);
			map.put("carPagosDetalleAnticiposTOs", carPagosDetalleAnticiposTOs);
			map.put("carPagosDetalleFormaTOs", carPagosDetalleFormaTOs);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarCarPagos", UtilsJSON.objetoToJson(map),
					CarContableTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CarListaPagosProveedorTO getPagosConsultaProveedorTO(String empresa, String periodo, String tipo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPagosConsultaProveedorTO", UtilsJSON.objetoToJson(map),
					CarListaPagosProveedorTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CarListaPagosProveedorTO getPagosConsultaProveedorAnticipoTO(String empresa, String periodo, String tipo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getPagosConsultaProveedorAnticipoTO",
					UtilsJSON.objetoToJson(map), CarListaPagosProveedorTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaPagosTO> getPagosConsultaDetalleComprasTO(String empresa, String periodo, String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPagosConsultaDetalleComprasTO",
					UtilsJSON.objetoToJson(map), CarListaPagosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaPagosTO> getCarListaPagosTO(String empresa, String proveedor, SisInfoTO sisInfoTO) {
		System.out.println("entre en getCarListaPagosTO");
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("proveedor", proveedor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaPagosTO",
					UtilsJSON.objetoToJson(map), CarListaPagosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaPagosCobrosDetalleFormaTO> getPagosConsultaDetalleFormaTO(String empresa, String periodo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPagosConsultaDetalleFormaTO",
					UtilsJSON.objetoToJson(map), CarListaPagosCobrosDetalleFormaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunPagosTO> getCarFunPagosTO(String empresa, String sector, String desde, String hasta,
			String proveedor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("proveedor", proveedor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarFunPagosTO",
					UtilsJSON.objetoToJson(map), CarFunPagosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunPagosPruebaTO> getCarFunPagosPruebaTO(String empresa, String desde, String hasta,
			String proveedor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("proveedor", proveedor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanListaConciliacionBancariaCreditoTO",
					UtilsJSON.objetoToJson(map), CarFunPagosPruebaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunPagosDetalleTO> getCarFunPagosDetalleTO(String empresa, String sector, String desde, String hasta,
			String proveedor, String formaPago, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("proveedor", proveedor);
			map.put("formaPago", formaPago);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarFunPagosDetalleTO",
					UtilsJSON.objetoToJson(map), CarFunPagosDetalleTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunPagosSaldoAnticipoTO> getCarFunPagosSaldoAnticipoTO(String empresa, String proveedor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("proveedor", proveedor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarFunPagosSaldoAnticipoTO",
					UtilsJSON.objetoToJson(map), CarFunPagosSaldoAnticipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CarContableTO insertarCarCobros(CarCobrosTO carCobrosTO,
			List<CarCobrosDetalleVentasTO> carCobrosDetalleVentasTOs,
			List<CarCobrosDetalleAnticiposTO> carCobrosDetalleAnticiposTOs,
			List<CarCobrosDetalleFormaTO> carCobrosDetalleFormaTOs, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carCobrosTO", carCobrosTO);
			map.put("carCobrosDetalleVentasTOs", carCobrosDetalleVentasTOs);
			map.put("carCobrosDetalleAnticiposTOs", carCobrosDetalleAnticiposTOs);
			map.put("carCobrosDetalleFormaTOs", carCobrosDetalleFormaTOs);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarCarCobros", UtilsJSON.objetoToJson(map),
					CarContableTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CarListaCobrosClienteTO getCobrosConsultaClienteTO(String empresa, String periodo, String tipo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getCobrosConsultaClienteTO", UtilsJSON.objetoToJson(map),
					CarListaCobrosClienteTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CarListaCobrosClienteTO getCobrosConsultaClienteAnticipoTO(String empresa, String periodo, String tipo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getCobrosConsultaClienteAnticipoTO",
					UtilsJSON.objetoToJson(map), CarListaCobrosClienteTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaCobrosTO> getCobrosConsultaDetalleVentasTO(String empresa, String periodo, String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCobrosConsultaDetalleVentasTO",
					UtilsJSON.objetoToJson(map), CarListaCobrosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaCobrosTO> getCarListaCobrosTO(String empresa, String proveedor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("proveedor", proveedor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCobrosTO",
					UtilsJSON.objetoToJson(map), CarListaCobrosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaPagosCobrosDetalleFormaTO> getCobrosConsultaDetalleFormaTO(String empresa, String periodo,
			String numero, boolean hayPostfechados, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("numero", numero);
			map.put("hayPostfechados", hayPostfechados);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			List<CarListaPagosCobrosDetalleFormaTO> lista = Arrays
					.asList(restTemplate.postForObject(conexionWS + "/getCobrosConsultaDetalleFormaTO",
							UtilsJSON.objetoToJson(map), CarListaPagosCobrosDetalleFormaTO[].class));
			// for(CarListaPagosCobrosDetalleFormaTO cl : lista){
			// System.out.println("cl: "+cl);
			// }
			return lista;
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaPagosCobrosDetalleAnticipoTO> getCobrosConsultaDetalleAnticipo(String empresa, String periodo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCobrosConsultaDetalleAnticipo",
					UtilsJSON.objetoToJson(map), CarListaPagosCobrosDetalleAnticipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaPagosCobrosDetalleAnticipoTO> getPagosConsultaDetalleAnticipo(String empresa, String periodo,
			String numero, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("numero", numero);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getPagosConsultaDetalleAnticipo",
					UtilsJSON.objetoToJson(map), CarListaPagosCobrosDetalleAnticipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunCobrosTO> getCarFunCobrosTO(String empresa, String sector, String desde, String hasta,
			String cliente, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("cliente", cliente);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarFunCobrosTO",
					UtilsJSON.objetoToJson(map), CarFunCobrosTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunCobrosDetalleTO> getCarFunCobrosDetalleTO(String empresa, String sector, String desde,
			String hasta, String cliente, String formaPago, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("cliente", cliente);
			map.put("formaPago", formaPago);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarFunCobrosDetalleTO",
					UtilsJSON.objetoToJson(map), CarFunCobrosDetalleTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunCobrosSaldoAnticipoTO> getCarFunCobrosSaldoAnticipoTO(String empresa, String cliente, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("cliente", cliente);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarFunCobrosSaldoAnticipoTO",
					UtilsJSON.objetoToJson(map), CarFunCobrosSaldoAnticipoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String accionCarPagosForma(CarPagosCobrosFormaTO carPagosCobrosFormaTO, char accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carPagosCobrosFormaTO", carPagosCobrosFormaTO);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/accionCarPagosForma", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String accionCarCobrosForma(CarPagosCobrosFormaTO carPagosCobrosFormaTO, char accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carPagosCobrosFormaTO", carPagosCobrosFormaTO);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/accionCarCobrosForma", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarComboPagosCobrosFormaTO> getCarComboPagosCobrosFormaTO(String empresa, char accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarComboPagosCobrosFormaTO",
					UtilsJSON.objetoToJson(map), CarComboPagosCobrosFormaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;

	}

	public List<CarListaPagosCobrosFormaTO> getCarListaPagosCobrosFormaTO(String empresa, char accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaPagosCobrosFormaTO",
					UtilsJSON.objetoToJson(map), CarListaPagosCobrosFormaTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarListaMayorAuxiliarClienteProveedorTO> getCarListaMayorAuxiliarClienteProveedorTO(String empresa,
			String sector, String proveedor, String desde, String hasta, char accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("proveedor", proveedor);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaMayorAuxiliarClienteProveedorTO",
					UtilsJSON.objetoToJson(map), CarListaMayorAuxiliarClienteProveedorTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public CarPagosCobrosAnticipoTO getCarPagosCobrosAnticipoTO(String empresa, String periodo, String tipo,
			String numero, char accion, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("periodo", periodo);
			map.put("tipo", tipo);
			map.put("numero", numero);
			map.put("accion", accion);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/getCarPagosCobrosAnticipoTO", UtilsJSON.objetoToJson(map),
					CarPagosCobrosAnticipoTO.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CuentasPorPagarDetalladoTO> getCarListaCuentasPorPagarDetalladoTO(String empresa, String sector,
			String proveedor, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("proveedor", proveedor);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorPagarDetalladoTO",
					UtilsJSON.objetoToJson(map), CuentasPorPagarDetalladoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarCuentasPorPagarCobrarGeneralTO> getCarListaCuentasPorPagarGeneralTO(String empresa, String sector,
			String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorPagarGeneralTO",
					UtilsJSON.objetoToJson(map), CarCuentasPorPagarCobrarGeneralTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarCuentasPorPagarCobrarAnticiposTO> getCarListaCuentasPorPagarAnticiposTO(String empresa,
			String sector, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorPagarAnticiposTO",
					UtilsJSON.objetoToJson(map), CarCuentasPorPagarCobrarAnticiposTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarCuentasPorPagarSaldoAnticiposTO> getCarListaCuentasPorPagarSaldoAnticiposTO(String empresa,
			String sector, String proveedorCodigo, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("proveedorCodigo", proveedorCodigo);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorPagarSaldoAnticiposTO",
					UtilsJSON.objetoToJson(map), CarCuentasPorPagarSaldoAnticiposTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarCuentasPorCobrarSaldoAnticiposTO> getCarListaCuentasPorCobrarSaldoAnticiposTO(String empresa,
			String sector, String clienteCodigo, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("clienteCodigo", clienteCodigo);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorCobrarSaldoAnticiposTO",
					UtilsJSON.objetoToJson(map), CarCuentasPorCobrarSaldoAnticiposTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarCuentasPorPagarCobrarAnticiposTO> getCarListaCuentasPorCobrarAnticiposTO(String empresa,
			String sector, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorCobrarAnticiposTO",
					UtilsJSON.objetoToJson(map), CarCuentasPorPagarCobrarAnticiposTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CuentasPorCobrarDetalladoTO> getCarListaCuentasPorCobrarDetalladoTO(String empresa, String sector,
			String cliente, String desde, String hasta, boolean ichfa, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("cliente", cliente);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("ichfa", ichfa);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorCobrarDetalladoTO",
					UtilsJSON.objetoToJson(map), CuentasPorCobrarDetalladoTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunCuentasPorCobrarListadoVentasTO> getCarFunCuentasPorCobrarListadoVentasTO(String empresa,
			String sector, String cliente, String desde, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("cliente", cliente);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			List<CarFunCuentasPorCobrarListadoVentasTO> lista = Arrays
					.asList(restTemplate.postForObject(conexionWS + "/getCarFunCuentasPorCobrarListadoVentasTO",
							UtilsJSON.objetoToJson(map), CarFunCuentasPorCobrarListadoVentasTO[].class));
			System.out.println("lista::" + lista);
			return lista;
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarFunCuentasPorPagarListadoComprasTO> getCarFunCuentasPorPagarListadoComprasTO(String empresa,
			String sector, String proveedor, String desde, String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("proveedor", proveedor);
			map.put("desde", desde);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarFunCuentasPorPagarListadoComprasTO",
					UtilsJSON.objetoToJson(map), CarFunCuentasPorPagarListadoComprasTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public List<CarCuentasPorPagarCobrarGeneralTO> getCarListaCuentasPorCobrarGeneralTO(String empresa, String sector,
			String hasta, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("sector", sector);
			map.put("hasta", hasta);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return Arrays.asList(restTemplate.postForObject(conexionWS + "/getCarListaCuentasPorCobrarGeneralTO",
					UtilsJSON.objetoToJson(map), CarCuentasPorPagarCobrarGeneralTO[].class));
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarAnticiposPago(CarPagosAnticipoTO carPagosAnticipoTO, String observaciones,
			String nombreProveedor, String fecha, String sectorProveedor, String documento, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carPagosAnticipoTO", carPagosAnticipoTO);
			map.put("observaciones", observaciones);
			map.put("nombreProveedor", nombreProveedor);
			map.put("fecha", fecha);
			map.put("sectorProveedor", sectorProveedor);
			map.put("documento", documento);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarAnticiposPago", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String insertarAnticiposCobro(CarCobrosAnticipoTO carCobrosAnticipoTO, String observaciones,
			String nombreCliente, String fecha, String sectorCliente, String documento, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carCobrosAnticipoTO", carCobrosAnticipoTO);
			map.put("observaciones", observaciones);
			map.put("nombreCliente", nombreCliente);
			map.put("fecha", fecha);
			map.put("sectorCliente", sectorCliente);
			map.put("documento", documento);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWS + "/insertarAnticiposCobro", UtilsJSON.objetoToJson(map),
					String.class);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCuentasPorCobrarDetallado(
			List<ReporteCuentasPorCobrarDetallado> reporteCuentasPorCobrarDetallado, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCuentasPorCobrarDetallado", reporteCuentasPorCobrarDetallado);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCuentasPorCobrarDetallado";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCuentasPorCobrarDetallado", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCuentasPorPagarDetallado(
			List<ReporteCuentasPorPagarDetallado> reporteCuentasPorPagarDetallado, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCuentasPorPagarDetallado", reporteCuentasPorPagarDetallado);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCuentasPorPagarDetallado.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCuentasPorPagarDetallado", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCuentasPorCobrarGeneral(
			List<ReporteCuentasPorCobrarGeneral> reporteCuentasPorCobrarGeneral, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCuentasPorCobrarGeneral", reporteCuentasPorCobrarGeneral);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCuentasPorCobrarGeneral.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCuentasPorCobrarGeneral", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCarFunCuentasPorCobrarListadoVentas(
			List<ReporteCarFunCuentasPorCobrarListadoVentas> reporteCarFunCuentasPorCobrarListadoVentas, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCarFunCuentasPorCobrarListadoVentas", reporteCarFunCuentasPorCobrarListadoVentas);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCarFunCuentasPorCobrarListadoVentas.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCarFunCuentasPorCobrarListadoVentas", map,
					rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCarFunCuentasPorPagarListadoCompras(
			List<ReporteCarFunCuentasPorPagarListadoCompras> reporteCarFunCuentasPorPagarListadoCompras, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCarFunCuentasPorPagarListadoCompras", reporteCarFunCuentasPorPagarListadoCompras);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCarFunCuentasPorPagarListadoCompras.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCarFunCuentasPorPagarListadoCompras", map,
					rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCuentasPorPagarGeneral(
			List<ReporteCuentasPorPagarGeneral> reporteCuentasPorPagarGeneral, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCuentasPorPagarGeneral", reporteCuentasPorPagarGeneral);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCuentasPorPagarGeneral.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCuentasPorPagarGeneral", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCuentasPorPagarAnticipos(
			List<ReporteCuentasPorPagarAnticipos> reporteCuentasPorPagarAnticipos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCuentasPorPagarAnticipos", reporteCuentasPorPagarAnticipos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCuentasPorPagarAnticipos.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCuentasPorPagarAnticipos", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCuentasPorPagarSaldoAnticipos(
			List<ReporteCuentasPorPagarCobrarSaldoAnticipos> reporteCuentasPorPagarSaldoAnticipos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCuentasPorPagarSaldoAnticipos", reporteCuentasPorPagarSaldoAnticipos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCuentasPorPagarSaldoAnticipos.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCuentasPorPagarSaldoAnticipos", map,
					rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCuentasPorCobrarAnticipos(
			List<ReporteCuentasPorPagarAnticipos> reporteCuentasPorPagarAnticipos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCuentasPorPagarAnticipos", reporteCuentasPorPagarAnticipos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportCuentasPorCobrarAnticipos.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCuentasPorCobrarAnticipos", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteCobros(List<ReporteCobros> reporteCobros, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteCobros", reporteCobros);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);

			String rutaArchivo = "reportReporteCobros.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCobros", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReportePagos(List<ReportePagos> reportePagos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reportePagos", reportePagos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportReportePagos.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReportePagos", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteMayorAuxiliarProveedorCliente(
			List<ReporteMayorAuxiliarProveedorCliente> reporteMayorAuxiliarProveedorCliente, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			System.out.println("EN EL DELEGATE: " + UtilsAplicacion.usuarioEmpresaReporteTO.getEmpDireccion());
			map.put("reporteMayorAuxiliarProveedorCliente", reporteMayorAuxiliarProveedorCliente);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportMayorAuxiliarProveedorCliente.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteMayorAuxiliarProveedorCliente", map,
					rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteListadoPagos(List<ReporteListadoPagos> reporteListadoPagos, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteListadoPagos", reporteListadoPagos);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportListadoPagos.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoPagos", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

	public String generarReporteListadoCobros(List<ReporteListadoCobros> reporteListadoCobros, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
			map.put("reporteListadoCobros", reporteListadoCobros);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			String rutaArchivo = "reportComprobanteListadoCobros.jrprint";
			return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoCobros", map, rutaArchivo);
		} catch (RestClientException e) {
			UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}

}