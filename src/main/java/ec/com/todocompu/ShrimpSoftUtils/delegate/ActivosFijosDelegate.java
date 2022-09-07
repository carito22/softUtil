package ec.com.todocompu.ShrimpSoftUtils.delegate;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import ec.com.todocompu.ShrimpSoftUtils.Propiedades;
import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfActivoTO;
import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfCategoriasTO;
import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfDepreciacionMotivoTO;
import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfUbicacionesTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;
import java.util.Arrays;
import java.util.List;

public class ActivosFijosDelegate {

    private static ActivosFijosDelegate activoFijoDelegate;
    private RestTemplate restTemplate = new RestTemplate();
    private String conexionWS;

    private ActivosFijosDelegate() throws Exception {
        Properties propSistema = Propiedades.readPropiedades();
        conexionWS = propSistema.getProperty("servidor.ip") + ":"
                + propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
                + "/todocompuWS/activosFijosController";
    }

    public static ActivosFijosDelegate getInstance() {
        if (activoFijoDelegate == null) {
            try {
                activoFijoDelegate = new ActivosFijosDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return activoFijoDelegate;
    }

    public String insertarAfCategoriasTO(AfCategoriasTO afCategoriasTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afCategoriasTO", afCategoriasTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarAfCategoriasTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarAfCategoriasTO(AfCategoriasTO afCategoriasTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afCategoriasTO", afCategoriasTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarAfCategoriasTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public String eliminarAfCategoriasTO(AfCategoriasTO afCategoriasTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afCategoriasTO", afCategoriasTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarAfCategoriasTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AfCategoriasTO> getListaAfCategoriasTO(String empresa, Boolean filtrarInactivos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("filtrarInactivos", filtrarInactivos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAfCategoriasTO", UtilsJSON.objetoToJson(map), AfCategoriasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarAfUbicacionesTO(AfUbicacionesTO afUbicacionesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afUbicacionesTO", afUbicacionesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarAfUbicacionesTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarAfUbicacionesTO(AfUbicacionesTO afUbicacionesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afUbicacionesTO", afUbicacionesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarAfUbicacionesTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public String eliminarAfUbicacionesTO(AfUbicacionesTO afUbicacionesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afUbicacionesTO", afUbicacionesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarAfUbicacionesTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AfUbicacionesTO> getListaAfUbicacionesTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAfUbicacionesTO", UtilsJSON.objetoToJson(map), AfUbicacionesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarAfDepreciacionMotivoTO(AfDepreciacionMotivoTO afDepreciacionMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afDepreciacionMotivoTO", afDepreciacionMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarAfDepreciacionMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarAfDepreciacionMotivoTO(AfDepreciacionMotivoTO afDepreciacionMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afDepreciacionMotivoTO", afDepreciacionMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarAfDepreciacionMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public String eliminarAfDepreciacionMotivoTO(AfDepreciacionMotivoTO afDepreciacionMotivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afDepreciacionMotivoTO", afDepreciacionMotivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarAfDepreciacionMotivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AfDepreciacionMotivoTO> getListaAfDepreciacionMotivoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAfDepreciacionMotivoTO", UtilsJSON.objetoToJson(map), AfDepreciacionMotivoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    public String insertarAfActivoTO(AfActivoTO afActivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afActivoTO", afActivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarAfActivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarAfActivoTO(AfActivoTO afActivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afActivoTO", afActivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarAfActivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public String eliminarAfActivoTO(AfActivoTO afActivoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("afActivoTO", afActivoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarAfActivoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<AfActivoTO> getListaAfActivoTO(String empresa,String sector, String ubicacion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("ubicacion", ubicacion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaAfActivoTO", UtilsJSON.objetoToJson(map), AfActivoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
}
