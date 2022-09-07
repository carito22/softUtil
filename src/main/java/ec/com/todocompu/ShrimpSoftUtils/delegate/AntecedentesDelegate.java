/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.delegate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author VALDIVIEZO
 */
public class AntecedentesDelegate {

    private static AntecedentesDelegate grupoDelegate;
    private final String conexionWSVerificar;

    private AntecedentesDelegate() throws Exception {
        conexionWSVerificar = "http://certificados.ministeriodegobierno.gob.ec/gestorcertificados/antecedentes/data.php";
    }

    public static AntecedentesDelegate getInstance() {
        if (grupoDelegate == null) {
            try {
                grupoDelegate = new AntecedentesDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return grupoDelegate;
    }

    public String obtenerAntecedentePorCedula(String numeroRuc) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("tipo", "getDataWs");
            body.add("ci", numeroRuc);
            body.add("tp", "C");
            body.add("ise", "SI");
            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> resp = restTemplate.postForEntity(conexionWSVerificar, requestEntity, String.class);
            String respuesta = resp.getBody();
            return respuesta;
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return null;
    }
}
