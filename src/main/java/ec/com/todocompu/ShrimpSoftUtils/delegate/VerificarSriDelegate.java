/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.delegate;

import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author CarolValdiviezo
 */
public class VerificarSriDelegate {

    private static VerificarSriDelegate grupoDelegate;
    private final RestTemplate restTemplate = new RestTemplate();
    private final String conexionSri;

    private VerificarSriDelegate() throws Exception {
        conexionSri = "https://srienlinea.sri.gob.ec/facturacion-internet";
    }

    public static VerificarSriDelegate getInstance() {
        if (grupoDelegate == null) {
            try {
                grupoDelegate = new VerificarSriDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return grupoDelegate;
    }

    public String obtenerPorNumerosRuc(String numeroRuc) {
        try {
            String url = conexionSri + "/consultas/publico/ruc-datos2.jspa?ruc=" + numeroRuc;
            String body = restTemplate.getForObject(url, String.class);
            return body;
        } catch (HttpServerErrorException ex) {
            return "NN";
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String consultarPorRucAlSRI(String numeroRuc) {
        String url = conexionSri + "/consultas/publico/ruc-datos2.jspa?ruc=" + numeroRuc;
        String body = restTemplate.getForObject(url, String.class);
        return body;
    }

    public boolean existePorNumeroRucSRI(String numeroRuc) {
        try {
            String urlPrincipal = "https://srienlinea.sri.gob.ec/sri-catastro-sujeto-servicio-internet/rest/ConsolidadoContribuyente/existePorNumeroRuc?numeroRuc=";
            String url = urlPrincipal + numeroRuc;
            boolean body = restTemplate.getForObject(url, boolean.class);
            return body;
        } catch (HttpServerErrorException ex) {
            return false;
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return false;
    }

}
