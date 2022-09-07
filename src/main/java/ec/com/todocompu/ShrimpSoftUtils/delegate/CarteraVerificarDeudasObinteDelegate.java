package ec.com.todocompu.ShrimpSoftUtils.delegate;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class CarteraVerificarDeudasObinteDelegate {

	private static CarteraVerificarDeudasObinteDelegate grupoDelegate;
	private RestTemplate restTemplate = new RestTemplate();
	private String conexionWSVerificarDeudas;

	private CarteraVerificarDeudasObinteDelegate() throws Exception {
		conexionWSVerificarDeudas = "https://ws1.acosux.com:1443/Obinte/todocompuWS/carteraController";
	}

	public static CarteraVerificarDeudasObinteDelegate getInstance() {
		if (grupoDelegate == null) {
			try {
				grupoDelegate = new CarteraVerificarDeudasObinteDelegate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return grupoDelegate;
	}

	
	public java.math.BigDecimal getCarDeudaVencida(String empresa, String proveedor, SisInfoTO sisInfoTO) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", empresa);
			map.put("cliente", proveedor);
			map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
			return restTemplate.postForObject(conexionWSVerificarDeudas + "/getCarDeudaVencida",
					UtilsJSON.objetoToJson(map), java.math.BigDecimal.class);
		} catch (RestClientException e) {
                    e.printStackTrace();
			//UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
		}
		return null;
	}
}
