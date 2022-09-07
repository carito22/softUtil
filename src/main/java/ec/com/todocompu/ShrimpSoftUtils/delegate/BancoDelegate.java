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
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanBancoTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanCajaTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanChequePreavisadoTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanChequeTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanChequesNumeracionTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanComboBancoTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanComboCuentaTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanConciliacionTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanCuentaTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanFunChequesNoEntregadosTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanFunChequesNoRevisadosTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanListaChequeTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanListaChequesNoImpresosTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanListaConciliacionBancariaTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanListaConciliacionTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.BanPreavisosTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.ConsultaDatosBancoCuentaTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.ListaBanBancoTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.ListaBanCajaTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.ListaBanChequesNumeracionTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.TO.ListaBanCuentaTO;
import ec.com.todocompu.ShrimpSoftUtils.banco.report.ReporteConciliacionCabecera;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConDetalle;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class BancoDelegate {

    private static BancoDelegate grupoDelegate;
    private RestTemplate restTemplate = new RestTemplate();
    private String conexionWS;

    private BancoDelegate() throws Exception {
        Properties propSistema = Propiedades.readPropiedades();
        conexionWS = propSistema.getProperty("servidor.ip") + ":"
                + propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
                + "/todocompuWS/bancoController";
    }

    public static BancoDelegate getInstance() {
        if (grupoDelegate == null) {
            try {
                grupoDelegate = new BancoDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return grupoDelegate;
    }

    public List<ListaBanBancoTO> getListaBancosTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBanBancoTO",
                    UtilsJSON.objetoToJson(map), ListaBanBancoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;

    }

    public List<ListaBanChequesNumeracionTO> getListaChequesNumeracionTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaChequesNumeracionTO",
                    UtilsJSON.objetoToJson(map), ListaBanChequesNumeracionTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<ListaBanCajaTO> getListaCajaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBanCajaTO",
                    UtilsJSON.objetoToJson(map), ListaBanCajaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<ListaBanCuentaTO> getListaCuentaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("SisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaBanCuentaTO",
                    UtilsJSON.objetoToJson(map), ListaBanCuentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanListaChequesNoImpresosTO> getListaChequesNoImpresosTO(String empresa, String cuentaBancaria, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuentaBancaria", cuentaBancaria);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            List<BanListaChequesNoImpresosTO> banListaChequesNoImpresosTO = Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaChequesNoImpresosTO",
                    UtilsJSON.objetoToJson(map), BanListaChequesNoImpresosTO[].class));
            return banListaChequesNoImpresosTO;
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    public List<BanListaChequesNoImpresosTO> getListaChequesNoImpresosWebTO(String empresa, String cuentaBancaria, SisInfoTO sisInfoTO, String modulo) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuentaBancaria", cuentaBancaria);
            map.put("modulo", modulo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            List<BanListaChequesNoImpresosTO> banListaChequesNoImpresosTO = Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaChequesNoImpresosWebTO",
                    UtilsJSON.objetoToJson(map), BanListaChequesNoImpresosTO[].class));
            return banListaChequesNoImpresosTO;
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }


    public ConsultaDatosBancoCuentaTO getConsultaDatosBancoCuentaTO(String empresa, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getConsultaDatosBancoCuentaTO",
                    UtilsJSON.objetoToJson(map), ConsultaDatosBancoCuentaTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean isExisteChequeAimprimir(String empresa, String cuentaContable, String numeroCheque,
            Long detSecuencia, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuentaContable", cuentaContable);
            map.put("numeroCheque", numeroCheque);
            map.put("detSecuencia", detSecuencia);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/isExisteChequeAimprimir", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean insertarBanBanco(BanBancoTO banBancoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banBancoTO", banBancoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarBanBancoTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean insertarBanChequeNumeracion(BanChequesNumeracionTO banBancoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banBancoTO", banBancoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarBanChequeNumeracionTO",
                    UtilsJSON.objetoToJson(map), boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean insertarBanCaja(BanCajaTO banCajaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banCajaTO", banCajaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarBanCajaTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean insertarBanCuenta(BanCuentaTO banCuentaTO, String codigoBanco, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banCuentaTO", banCuentaTO);
            map.put("codigoBanco", codigoBanco);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarBanCuentaTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String insertarBanChequeTO(BanChequeTO banChequeTO, String usrInserta, String numeroCheque, String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banChequeTO", banChequeTO);
            map.put("usrInserta", usrInserta);
            map.put("numeroCheque", numeroCheque);
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarBanChequeTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean modificarBanBanco(BanBancoTO banBancoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banBancoTO", banBancoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarBanBancoTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean modificarBanChequeNumeracion(BanChequesNumeracionTO banBancoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banBancoTO", banBancoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarBanChequeNumeracionTO",
                    UtilsJSON.objetoToJson(map), boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean modificarBanCaja(BanCajaTO banCajaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banCajaTO", banCajaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarBanCajaTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean modificarBanCuenta(BanCuentaTO banCuentaTO, String codigoBanco, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banCuentaTO", banCuentaTO);
            map.put("codigoBanco", codigoBanco);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarBanCuentaTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String modificarFechaBanChequeTO(String empresa, String cuenta, String numero, String fecha,
            String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("numero", numero);
            map.put("fecha", fecha);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarFechaBanChequeTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarNumeroBanChequeTO(String empresa, String cuenta, String numero, String numeroNuevo,
            String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("numero", numero);
            map.put("numeroNuevo", numeroNuevo);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarNumeroBanChequeTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean eliminarBanBanco(BanBancoTO banBancoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banBancoTO", banBancoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarBanBancoTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean eliminarBanChequeNumeracion(BanChequesNumeracionTO banBancoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banBancoTO", banBancoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarBanChequeNumeracionTO",
                    UtilsJSON.objetoToJson(map), boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean eliminarBanCaja(BanCajaTO banCajaTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banCajaTO", banCajaTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarBanCajaTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean eliminarBanCuenta(BanCuentaTO banCuentaTO, String codigoBanco, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banCuentaTO", banCuentaTO);
            map.put("codigoBanco", codigoBanco);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarBanCuentaTO", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public String getBanConciliacionFechaHasta(String empresa, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getBanConciliacionFechaHasta", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanComboBancoTO> getBanComboBancoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanComboBancoTO",
                    UtilsJSON.objetoToJson(map), BanComboBancoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Boolean conciliacionHasta(String empresa, String hasta, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("hasta", hasta);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/conciliacionHasta", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean conciliacionPendiente(String empresa, String cuentaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuentaContable", cuentaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/conciliacionPendiente", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public List<BanListaConciliacionTO> getBanListaConciliacionTO(String empresa, String buscar, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("buscar", buscar);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanListaConciliacionTO",
                    UtilsJSON.objetoToJson(map), BanListaConciliacionTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanListaConciliacionBancariaTO> getBanListaConciliacionBancariaDebitoTO(String empresa, String cuenta,
            String codigo, String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("codigo", codigo);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanListaConciliacionBancariaDebitoTO",
                    UtilsJSON.objetoToJson(map), BanListaConciliacionBancariaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanListaConciliacionBancariaTO> getBanListaConciliacionBancariaCreditoTO(String empresa, String cuenta,
            String codigo, String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("codigo", codigo);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanListaConciliacionBancariaCreditoTO",
                    UtilsJSON.objetoToJson(map), BanListaConciliacionBancariaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public java.math.BigDecimal getBanValorSaldoSistema(String empresa, String cuenta, String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getBanValorSaldoSistema", UtilsJSON.objetoToJson(map),
                    java.math.BigDecimal.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionBanConciliacionTO(BanConciliacionTO banConciliacionTO, List<BanChequeTO> banChequeTOs,
            char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banConciliacionTO", banConciliacionTO);
            map.put("banChequeTOs", banChequeTOs);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionBanConciliacionTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanListaChequeTO> getBanListaChequeTO(String empresa, String cuenta, String desde, String hasta,
            String tipo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("tipo", tipo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanListaChequeTO",
                    UtilsJSON.objetoToJson(map), BanListaChequeTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanComboCuentaTO> getBanComboCuentaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanComboCuentaTO",
                    UtilsJSON.objetoToJson(map), BanComboCuentaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanFunChequesNoEntregadosTO> getBanFunChequesNoEntregadosTO(String empresa, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanFunChequesNoEntregadosTO",
                    UtilsJSON.objetoToJson(map), BanFunChequesNoEntregadosTO[].class, map));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> insertarBanFunChequesNoEntregados(String empresa, String cuenta,
            List<BanFunChequesNoEntregadosTO> banFunChequesNoEntregadosTOs, String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("banFunChequesNoEntregadosTOs", banFunChequesNoEntregadosTOs);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/insertarBanFunChequesNoEntregados",
                    UtilsJSON.objetoToJson(map), String[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanFunChequesNoRevisadosTO> getBanFunChequesNoRevisadosTO(String empresa, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanFunChequesNoRevisadosTO",
                    UtilsJSON.objetoToJson(map), BanFunChequesNoRevisadosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> insertarBanFunChequesNoRevisados(String empresa, String cuenta,
            List<BanFunChequesNoRevisadosTO> banFunChequesNoRevisadosTOs, String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("banFunChequesNoRevisadosTOs", banFunChequesNoRevisadosTOs);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/insertarBanFunChequesNoRevisados",
                    UtilsJSON.objetoToJson(map), String[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> getBanCuentasContablesBancos(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanCuentasContablesBancos",
                    UtilsJSON.objetoToJson(map), String[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<BanChequePreavisadoTO> getBanFunChequesPreavisados(String empresa, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getBanFunChequesPreavisados",
                    UtilsJSON.objetoToJson(map), BanChequePreavisadoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public int getConteoChequesPreavisados(String empresa, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getConteoChequesPreavisados", UtilsJSON.objetoToJson(map),
                    int.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return 0;
    }

    public String insertarPreaviso(BanPreavisosTO banPreavisosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("banPreavisosTO", banPreavisosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarPreaviso", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarBanPreaviso(String empresa, String usuario, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("usuario", usuario);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarBanPreaviso", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String cambioDeCheque(String cuenta, String cuentaActual, String chequeAnterior, String chequeNuevo,
            String empresa, String usuario, String observaciones, String fecha, String con_tipo_cod, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("cuenta", cuenta);
            map.put("cuentaActual", cuentaActual);
            map.put("chequeAnterior", chequeAnterior);
            map.put("chequeNuevo", chequeNuevo);
            map.put("empresa", empresa);
            map.put("usuario", usuario);
            map.put("observaciones", observaciones);
            map.put("fecha", fecha);
            map.put("con_tipo_cod", con_tipo_cod);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/cambioDeCheque", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public Object getBanChequeSecuencial(String empresa, String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getBanChequeSecuencial", UtilsJSON.objetoToJson(map),
                    Object.class, map);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConciliacion(int estado, ReporteConciliacionCabecera conciliacionCabecera,
            List<BanListaConciliacionBancariaTO> listConciliacionCredito,
            List<BanListaConciliacionBancariaTO> listConciliacionDebito, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("estado", estado);
            map.put("conciliacionCabecera", conciliacionCabecera);
            map.put("listConciliacionCredito", listConciliacionCredito);
            map.put("listConciliacionDebito", listConciliacionDebito);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConciliacion.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConciliacion", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoChequeEmisionVencimientoCobrarNumero(String cuenta, String desde, String hasta,
            String tipo, List<BanListaChequeTO> listBanListaChequeTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("cuenta", cuenta);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("tipo", tipo);
            map.put("listBanListaChequeTO", listBanListaChequeTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoChequeEmisionVencimientoCobrarNumero.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoChequeEmisionVencimientoCobrarNumero",
                    map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteCheque(BanChequeTO banChequeTO, String valorLetra1, String valorLetra2,
            String nombreReporteCheque, ConDetalle conDetalle, String cuentaCodigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("banChequeTO", banChequeTO);
            map.put("valorLetra1", valorLetra1);
            map.put("valorLetra2", valorLetra2);
            map.put("nombreReporteCheque", nombreReporteCheque);
            map.put("conDetalle", conDetalle);
            map.put("cuentaCodigo", cuentaCodigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportCheque.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteCheque", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<String> getValidarCuentaContableConBancoExiste(String banEmpresa, String banCodigo) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("banEmpresa", banEmpresa);
        map.put("banCodigo", banCodigo);
        try {
            return restTemplate.postForObject(conexionWS + "/getValidarCuentaContableConBancoExiste",
                    UtilsJSON.objetoToJson(map), List.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(), null);
        }
        return null;
    }
}
