package ec.com.todocompu.ShrimpSoftUtils.delegate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import ec.com.todocompu.ShrimpSoftUtils.Propiedades;
import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.UtilsRESTFul;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisComboPeriodoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisConsultaUsuarioGrupoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisEmpresaTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisErrorTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisGrupoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisListaEmpresaTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisListaPeriodoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisListaSusTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisListaUsuarioTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisLoginTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisMenu;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisPeriodoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisPermisoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisSucesoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisUsuarioTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresa;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisPeriodo;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisUsuario;
import ec.com.todocompu.ShrimpSoftUtils.sistema.report.ReporteSuceso;

public class SistemaDelegate {

    private static SistemaDelegate sistemaDelegate;
    private RestTemplate restTemplate = new RestTemplate();
    private String conexionWS;

    private SistemaDelegate() throws Exception {
        Properties propSistema = Propiedades.readPropiedades();
        conexionWS = propSistema.getProperty("servidor.ip") + ":"
                + propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
                + "/todocompuWS/sistemaController";
    }

    public static SistemaDelegate getInstance() {
        if (sistemaDelegate == null) {
            try {
                sistemaDelegate = new SistemaDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sistemaDelegate;
    }

    public void enviarError(SisErrorTO sisErrorTO) {
        try {
            restTemplate.postForObject(conexionWS + "/enviarError", sisErrorTO, Void.class);
        } catch (RestClientException e) {
            e.printStackTrace();
        }
    }

    public boolean comprobarSisPcs(SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("mac", sisInfoTO.getMac());
            map.put("sisInfoTO", sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/comprobarSisPcs", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean comprobarEmails(String destinatarios, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("destinatarios", destinatarios);
            map.put("sisInfoTO", sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/comprobarEmails", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public List<SisListaEmpresaTO> getListaLoginEmpresaTO(String usrCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usrCodigo", usrCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaLoginEmpresaTO",
                    UtilsJSON.objetoToJson(map), SisListaEmpresaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public SisLoginTO getAccesoTO(String nick, String password, String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("nick", nick);
            map.put("password", password);
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getSisAccesoTO", UtilsJSON.objetoToJson(map),
                    SisLoginTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public SisLoginTO getPermisoInventarioTO(SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("infEmpresa", sisInfoTO.getEmpresa());
            map.put("infUsuario", sisInfoTO.getUsuario());
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoInventarioTO", UtilsJSON.objetoToJson(map),
                    SisLoginTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> getListaPermisoModulo(String empCodigo, String grupoCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("grupoCodigo", grupoCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPermisoModulo",
                    UtilsJSON.objetoToJson(map), String[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisMenu> getListaPermisoTO(String empCodigo, String grupoCodigo, String perModulo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("grupoCodigo", grupoCodigo);
            map.put("perModulo", perModulo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaLoginPermisoTO",
                    UtilsJSON.objetoToJson(map), SisMenu[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public void sisRegistrarEventosUsuario(String suceso, String mensaje, String tabla, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("suceso", suceso);
            map.put("mensaje", mensaje);
            map.put("tabla", tabla);
            map.put("sisInfoTO", sisInfoTO);
            restTemplate.postForObject(conexionWS + "/sisRegistrarEventosUsuario", map, Void.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
    }

    public String insertarSisUsuarioTO(SisUsuarioTO sisUsuarioTO, boolean insertaDetalle, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisUsuarioTO", sisUsuarioTO);
            map.put("insertaDetalle", insertaDetalle);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarSisUsuarioTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarPasswordSisUsuarioTO(SisUsuarioTO sisUsuarioTO, String pass, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisUsuarioTO", sisUsuarioTO);
            map.put("pass", pass);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarPasswordSisUsuarioTO",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarSisUsuarioWebTO(SisUsuarioTO sisUsuarioTO, String pass, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisUsuarioTO", sisUsuarioTO);
            map.put("pass", pass);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarSisUsuarioWebTO",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarSisUsuarioTO(SisUsuarioTO sisUsuarioTO, String pass, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisUsuarioTO", sisUsuarioTO);
            map.put("pass", pass);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarSisUsuarioTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean eliminarSisUsuarioTO(SisUsuarioTO sisUsuarioTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisUsuarioTO", sisUsuarioTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarSisUsuarioTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public List<SisGrupoTO> getListaSisGrupo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisGrupo",
                    UtilsJSON.objetoToJson(map), SisGrupoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisGrupoTO> getSisGrupoTOs(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getSisGrupoTOs", UtilsJSON.objetoToJson(map),
                    SisGrupoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisConsultaUsuarioGrupoTO> getListaUsuario(String parametro, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("parametro", parametro);
            map.put("infEmpresa", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO().getEmpresa() : sisInfoTO.getEmpresa());
            // map.put("infUsuario",
            // sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO.getInfUsuario());
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaUsuario",
                    UtilsJSON.objetoToJson(map), SisConsultaUsuarioGrupoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public SisUsuario buscarUsuario(String empCodigo, String usrCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("usrCodigo", usrCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/buscarUsuario", UtilsJSON.objetoToJson(map),
                    SisUsuario.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public SisGrupoTO sisGrupoUsuariosTO(SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("infEmpresa", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO().getEmpresa() : sisInfoTO.getEmpresa());
            map.put("infUsuario", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO().getUsuario() : sisInfoTO.getUsuario());
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/sisGrupoUsuariosTO", UtilsJSON.objetoToJson(map),
                    SisGrupoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public SisGrupoTO sisGrupoUsuariosWebTO(String empresa, String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("infEmpresa", empresa);
            map.put("infUsuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/sisGrupoUsuariosTO", UtilsJSON.objetoToJson(map),
                    SisGrupoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean accionSisGrupoTO(SisGrupoTO sisGrupoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisGrupoTO", sisGrupoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionSisGrupoTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String estadoPeriodo(String empresa, String fecha, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/estadoPeriodo", UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisListaPeriodoTO> getListaSisPeriodoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<SisListaPeriodoTO>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListaSisPeriodosTO", UtilsJSON.objetoToJson(map), SisListaPeriodoTO[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisComboPeriodoTO> getSisComboPeriodoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisPeriodosTO",
                    UtilsJSON.objetoToJson(map), SisComboPeriodoTO[].class));

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertaSisPeriodoTO(SisPeriodoTO sisPeriodoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisPeriodoTO", sisPeriodoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarSisPeriodoTO", UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarSisPeriodoTO(SisPeriodoTO sisPeriodoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisPeriodoTO", sisPeriodoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarSisPeriodoTO", UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean eliminarSisPeriodoTO(SisPeriodoTO sisPeriodoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisPeriodoTO", sisPeriodoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarSisPeriodoTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public SisPeriodo getPeriodoPorFecha(Date fecha, String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fecha", fecha);
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPeriodoPorFecha", UtilsJSON.objetoToJson(map),
                    SisPeriodo.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String validarPeriodo(Date fecha, String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fecha", fecha);
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/validarPeriodo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisListaSusTablaTO> getListaSisSusTablaTOs(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisSusTablaTOs",
                    UtilsJSON.objetoToJson(map), SisListaSusTablaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisListaUsuarioTO> getListaUsuariosTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisUsuario",
                    UtilsJSON.objetoToJson(map), SisListaUsuarioTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisSucesoTO> getListaSisSucesoTO(String desde, String hasta, String usuario, String suceso,
            String cadenaGeneral, String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("usuario", usuario);
            map.put("suceso", suceso);
            map.put("cadenaGeneral", cadenaGeneral);
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisSucesoTO",
                    UtilsJSON.objetoToJson(map), SisSucesoTO[].class));

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean insertarSisEmpresa(SisEmpresaTO sisEmpresaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisEmpresaTO", sisEmpresaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarSisEmpresa", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean modificarSisEmpresa(SisEmpresaTO sisEmpresaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sisEmpresaTO", sisEmpresaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarSisEmpresa", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String guardarImagenEmpresa(byte[] imagen, String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("imagen", imagen);
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/guardarImagenEmpresa", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String guardarArchivoFirmaElectronica(byte[] archivo, String nombreArchivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("archivo", archivo);
            map.put("nombreArchivo", nombreArchivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/guardarArchivoFirmaElectronica", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String guardarImagenUsuario(byte[] imagen, String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("imagen", imagen);
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/guardarImagenUsuario", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarImagenEmpresa(String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarImagenEmpresa", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public byte[] obtenerImagenEmpresa(String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerImagenEmpresa", UtilsJSON.objetoToJson(map),
                    byte[].class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public byte[] obtenerImagenUsuario(String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerImagenUsuario", UtilsJSON.objetoToJson(map),
                    byte[].class);
        } catch (RestClientException e) {
            e.printStackTrace();
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisEmpresaTO> getListaSisEmpresa(String usrCodigo, String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usrCodigo", usrCodigo);
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisEmpresaTO",
                    UtilsJSON.objetoToJson(map), SisEmpresaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisEmpresaTO> getListaSisEmpresaWeb(String usrCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usrCodigo", usrCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisEmpresaTO",
                    UtilsJSON.objetoToJson(map), SisEmpresaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean modificarSisPermiso(List<SisPermisoTO> listaSisPermisoTO, String usuario, String codModifGrupo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("listaSisPermisoTO", listaSisPermisoTO);
            map.put("usuario", usuario);
            map.put("codModifGrupo", codModifGrupo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarSisPermiso", UtilsJSON.objetoToJson(map),
                    boolean.class);

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public List<SisPermisoTO> getListaPermisoTO(String grupoCodigo, String empCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("grupoCodigo", grupoCodigo);
            map.put("empCodigo", empCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaPermisoTO",
                    UtilsJSON.objetoToJson(map), SisPermisoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Integer getColumnasEstadosFinancieros(String empCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getColumnasEstadosFinancieros",
                    UtilsJSON.objetoToJson(map), Integer.class);

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    /////////////////////////// Metodos WEB ///////////////////////////
    public List<SisMenu> getMenuWeb(String usuario, boolean produccion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuario", usuario);
            map.put("produccion", produccion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            List<SisMenu> menus = new ArrayList<SisMenu>(Arrays.asList(restTemplate
                    .postForObject(conexionWS + "/getMenuWeb", UtilsJSON.objetoToJson(map), SisMenu[].class)));
            menus.add(new SisMenu("", "", "", "", "", "", false));
            return menus;
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public SisUsuario buscarUsuarioPorNick(String usrNick, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usrNick", usrNick);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/buscarUsuarioPorNick", UtilsJSON.objetoToJson(map),
                    SisUsuario.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public SisGrupoTO sisGrupoUsuariosTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("infEmpresa", empresa);
            map.put("infUsuario", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO().getUsuario() : sisInfoTO.getUsuario());
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/sisGrupoUsuariosTO", UtilsJSON.objetoToJson(map),
                    SisGrupoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisPeriodo> getListaSisPeriodo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaSisPeriodos",
                    UtilsJSON.objetoToJson(map), SisPeriodo[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getSisPeriodo(String empresa, String periodo, String fecha, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("fecha", fecha);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getSisPeriodo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<SisEmpresa> getEmpresasPorUsuarioItemAngular(HttpServletRequest request, SisInfoTO sisInfoTO) {
        try {
            String[] url = request.getRequestURI().split("/");
            System.out.println("url" + url);
            String item = url[url.length - 1];
            System.out.println("item" + item);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuario", sisInfoTO.getUsuario());
            map.put("item", item);
            map.put("sisInfoTO", sisInfoTO);
            List<SisEmpresa> listEmpresas = new ArrayList<SisEmpresa>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getEmpresasPorUsuarioItem", UtilsJSON.objetoToJson(map), SisEmpresa[].class)));
            if (listEmpresas == null || listEmpresas.isEmpty()) {
                throw new AccessDeniedException("Acceso denegado - vista: " + item + " usuario: " + sisInfoTO.getUsuario());
            }
            return listEmpresas;
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String getFechaServidor(String mascara) {
        try {
            return restTemplate.postForObject(conexionWS + "/getFechaServidor?mascara=" + mascara, null, String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), null);
        }
        return null;
    }

    public String generarReporteUsuario(List<SisConsultaUsuarioGrupoTO> listSisConsultaUsuarioGrupoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("listSisConsultaUsuarioGrupoTO", listSisConsultaUsuarioGrupoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportUsuario.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteUsuario", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String guardarImagenTexto(String tipo, byte[] imagen, String empresa, String nombreArchivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("imagen", imagen);
            map.put("tipo", tipo);
            map.put("empresa", empresa);
            map.put("nombreArchivo", nombreArchivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/guardarImagenTexto", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarImagenTexto(String tipo, String empresa, String nombreArchivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("tipo", tipo);
            map.put("empresa", empresa);
            map.put("nombreArchivo", nombreArchivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarImagenTexto", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> obtenerImagenesTexto(String tipo, String empresa, String nombreArchivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("tipo", tipo);
            map.put("empresa", empresa);
            map.put("nombreArchivo", nombreArchivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/obtenerImagenesTexto",
                    UtilsJSON.objetoToJson(map), String[].class));
        } catch (RestClientException e) {
            e.printStackTrace();
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean obtenerEstadoLlevarContabilidad(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/estadoLlevarContabilidad", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String generarReporteSuceso(List<ReporteSuceso> lista, String nombreReporte, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = nombreReporte + ".jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteSuceso", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
}
