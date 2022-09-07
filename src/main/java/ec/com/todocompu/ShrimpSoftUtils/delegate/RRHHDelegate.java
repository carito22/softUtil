package ec.com.todocompu.ShrimpSoftUtils.delegate;

import ec.com.todocompu.ShrimpSoftUtils.CedulaRuc;
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
import ec.com.todocompu.ShrimpSoftUtils.RetornoTO;
import ec.com.todocompu.ShrimpSoftUtils.UtilsAplicacion;
import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.UtilsRESTFul;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContablePK;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhAnticipoMotivoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhAnulacionesTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhAvisoEntradaTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhBonoConceptoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhCabeceraReporteRolColectivoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhCategoriaTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhComboBonoConceptoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhComboCategoriaTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhComboFormaPagoBeneficioSocialTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhComboFormaPagoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhContableTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhCtaIessTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhDetalleVacionesPagadasGozadasTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhEmpleadoDescuentosFijosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhEmpleadoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFormaPagoBeneficioSocialTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFormaPagoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFormulario107PeriodoFiscalTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunFormulario107TO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunFormulario107_2013TO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunListadoEmpleadosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunPlantillaSueldosLotePreliminarTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunPlantillaSueldosLoteTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunUtilidadesCalcularTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunUtilidadesConsultarTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunXiiiSueldoCalcularTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunXiiiSueldoConsultarTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunXivSueldoCalcularTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhFunXivSueldoConsultarTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaBonoConceptoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaConsolidadoAnticiposPrestamosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaConsolidadoBonosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaConsolidadoRolesTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleAnticiposLoteTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleAnticiposPrestamosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleAnticiposTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleBonosLoteTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleBonosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetallePrestamosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleRolesTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaDetalleViaticosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaEmpleadoLoteTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaEmpleadoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaFormaPagoBeneficioSocialTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaFormaPagoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaProvisionesTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaRolSaldoEmpleadoDetalladoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaSaldoConsolidadoAnticiposPrestamosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaSaldoConsolidadoBonosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaSaldoConsolidadoSueldosPorPagarTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhListaSaldoIndividualAnticiposPrestamosTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhPreavisoAnticiposPrestamosSueldoPichinchaTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhPreavisoAnticiposPrestamosSueldoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhRolSaldoEmpleadoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhRolSueldoEmpleadoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhSalarioDignoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhUtilidadesPeriodoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhVacacionesTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhXiiiSueldoPeriodoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.TO.RhXivSueldoPeriodoTO;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhAnticipo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhAnticipoMotivo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhBono;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhBonoMotivo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhEmpleado;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhEmpleadoDescuentosFijos;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhEmpleadoPK;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhParametros;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhPrestamo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhPrestamoMotivo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhRelacionTrabajo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhRol;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhRolMotivo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhUtilidadMotivo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhUtilidades;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhXiiiSueldo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhXiiiSueldoMotivo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhXivSueldo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhXivSueldoMotivo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.report.ReporteAnticipoPrestamoXIIISueldo;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.report.ReporteConsultaAnticiposLote;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.report.ReporteConsultaBonosLote;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.report.ReporteEmpleado;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.report.ReportesRol;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;
import java.math.BigDecimal;

public class RRHHDelegate {

    private static RRHHDelegate grupoDelegate;
    private RestTemplate restTemplate = new RestTemplate();
    private String conexionWS;

    private RRHHDelegate() throws Exception {
        Properties propSistema = Propiedades.readPropiedades();
        conexionWS = propSistema.getProperty("servidor.ip") + ":"
                + propSistema.getProperty("servidor.puerto") + "/" + propSistema.getProperty("servidor.ubicacion")
                + "/todocompuWS/RRHHController";
    }

    public static RRHHDelegate getInstance() {
        if (grupoDelegate == null) {
            try {
                grupoDelegate = new RRHHDelegate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return grupoDelegate;
    }

    public String accionRhCategoria(RhCategoriaTO rhCategoriaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhCategoriaTO", rhCategoriaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhCategoria", map, String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String comprobacion(String cedula) {
        return CedulaRuc.comprobacion(cedula);
    }

    public RhCategoriaTO getRhCategoriaTO(String empCodigo, String catNombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("catNombre", catNombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getRhCategoriaTO", UtilsJSON.objetoToJson(map),
                    RhCategoriaTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhCategoriaTO> getListaRhCategoriaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhCategoriaTO",
                    UtilsJSON.objetoToJson(map), RhCategoriaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public List<RhRelacionTrabajo> listarRhRelacionTrabajo(SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/listarRhRelacionTrabajo",
                    UtilsJSON.objetoToJson(map), RhRelacionTrabajo[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhCategoriaTO> getListaRhCategoriaCuentasTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhCategoriaCuentasTO",
                    UtilsJSON.objetoToJson(map), RhCategoriaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhComboCategoriaTO> getComboRhCategoriaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboRhCategoriaTO",
                    UtilsJSON.objetoToJson(map), RhComboCategoriaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarRhEmpleado(RhEmpleadoTO rhEmpleadoTO,
            List<RhEmpleadoDescuentosFijosTO> ListarhEmpleadoDescuentosFijosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhEmpleadoTO", rhEmpleadoTO);
            map.put("ListarhEmpleadoDescuentosFijosTO", ListarhEmpleadoDescuentosFijosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhEmpleado", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String guardarImagenEmpleado(byte[] imagen, String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("imagen", imagen);
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/guardarImagenEmpleado", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarImagenEmpleado(String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarImagenEmpleado", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public byte[] obtenerImagenEmpleado(String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerImagenEmpleado", UtilsJSON.objetoToJson(map),
                    byte[].class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String obtenerRutaImagenEmpleado(String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerRutaImagenEmpleado", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhEmpleado(RhEmpleadoTO rhEmpleadoTO, List<RhEmpleadoDescuentosFijosTO> listaModificar,
            List<RhEmpleadoDescuentosFijosTO> listaEliminar, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhEmpleadoTO", rhEmpleadoTO);
            map.put("listaModificar", listaModificar);
            map.put("listaEliminar", listaEliminar);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhEmpleado", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhEmpleado(RhEmpleadoTO rhEmpleadoTO, List<RhEmpleadoDescuentosFijosTO> listaEliminar, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhEmpleadoTO", rhEmpleadoTO);
            map.put("listaEliminar", listaEliminar);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhEmpleadoTO", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhEmpleadoTO> getListaRhEmpleadoTO(String empresa, String buscar, boolean estado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("buscar", buscar);
            map.put("estado", estado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhEmpleadoTO",
                    UtilsJSON.objetoToJson(map), RhEmpleadoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaEmpleadoTO> getListaConsultaEmpleadoTO(String empresa, String buscar, Boolean interno,
            boolean estado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("buscar", buscar);
            map.put("interno", interno);
            map.put("estado", estado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaConsultaEmpleadoTO",
                    UtilsJSON.objetoToJson(map), RhListaEmpleadoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaEmpleadoLoteTO> getListaEmpleadoLote(String empresa, String categoria, String sector,
            String fechaHasta, String motivo, boolean rol, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("categoria", categoria);
            map.put("sector", sector);
            map.put("fechaHasta", fechaHasta);
            map.put("motivo", motivo);
            map.put("rol", rol);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhListaEmpleadoLoteTO>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListaEmpleadoLote", UtilsJSON.objetoToJson(map), RhListaEmpleadoLoteTO[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunPlantillaSueldosLoteTO> getFunPlantillaSueldosLote(String empCodigo, String fechaDesde,
            String fechaHasta, String categoria, String sector, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("categoria", categoria);
            map.put("sector", sector);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunPlantillaSueldosLote",
                    UtilsJSON.objetoToJson(map), RhFunPlantillaSueldosLoteTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunPlantillaSueldosLotePreliminarTO> getFunPlantillaSueldosLotePreliminar(String empCodigo,
            String fechaDesde, String fechaHasta, String categoria, String sector, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("categoria", categoria);
            map.put("sector", sector);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getFunPlantillaSueldosLotePreliminar",
                    UtilsJSON.objetoToJson(map), RhFunPlantillaSueldosLotePreliminarTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunListadoEmpleadosTO> getRhFunListadoEmpleadosTO(String empresa, String provincia, String canton,
            String sector, String categoria, boolean estado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("provincia", provincia);
            map.put("canton", canton);
            map.put("sector", sector);
            map.put("categoria", categoria);
            map.put("estado", estado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunListadoEmpleadosTO",
                    UtilsJSON.objetoToJson(map), RhFunListadoEmpleadosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionRhAvisosEntrada(RhAvisoEntradaTO rhAvisoEntradaTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhAvisoEntradaTO", rhAvisoEntradaTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhAvisosEntrada", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionRhFormaPago(RhFormaPagoTO rhFormaPagoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhFormaPagoTO", rhFormaPagoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhFormaPago", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaFormaPagoTO> getListaRhFormaPagoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhFormaPagoTO",
                    UtilsJSON.objetoToJson(map), RhListaFormaPagoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhComboFormaPagoTO> getComboRhFormaPagoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboRhFormaPagoTO",
                    UtilsJSON.objetoToJson(map), RhComboFormaPagoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionRhFormaPagoBeneficioSocial(RhFormaPagoBeneficioSocialTO rhFormaPagoBeneficioSocialTO,
            char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhFormaPagoBeneficioSocialTO", rhFormaPagoBeneficioSocialTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhFormaPagoBeneficioSocial",
                    UtilsJSON.objetoToJson(map), String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaFormaPagoBeneficioSocialTO> getListaFormaPagoBeneficioSocial(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaFormaPagoBeneficioSocialTO",
                    UtilsJSON.objetoToJson(map), RhListaFormaPagoBeneficioSocialTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhComboFormaPagoBeneficioSocialTO> getComboFormaPagoBeneficioSocial(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboFormaPagoBeneficioSocial",
                    UtilsJSON.objetoToJson(map), RhComboFormaPagoBeneficioSocialTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RhContableTO insertarRhVacaciones(RhVacacionesTO rhVacacionesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhVacacionesTO", rhVacacionesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhVacacionesConContable",
                    UtilsJSON.objetoToJson(map), RhContableTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RhContableTO insertarRhSalarioDignoContable(RhSalarioDignoTO rhSalarioDignoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhSalarioDignoTO", rhSalarioDignoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhSalarioDignoContable",
                    UtilsJSON.objetoToJson(map), RhContableTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean insertarRhBonoConcepto(RhBonoConceptoTO rhBonoConceptoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhBonoConceptoTO", rhBonoConceptoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhBonoConcepto", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean modificarRhBonoConcepto(RhBonoConceptoTO rhBonoConceptoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhBonoConceptoTO", rhBonoConceptoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhBonoConcepto", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public boolean eliminarRhBonoConcepto(RhBonoConceptoTO rhBonoConceptoTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhBonoConceptoTO", rhBonoConceptoTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhBonoConcepto", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public List<RhListaBonoConceptoTO> getListaRhBonoConceptoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhBonoConceptoTO",
                    UtilsJSON.objetoToJson(map), RhListaBonoConceptoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhComboBonoConceptoTO> getComboRhBonoConceptoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getComboRhBonoConceptoTO",
                    UtilsJSON.objetoToJson(map), RhComboBonoConceptoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getRhEmpleadoRetencion(String empCodigo, String empId, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("empId", empId);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getRhEmpleadoRetencion", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public RhCtaIessTO buscarCtaRhIess(String empCodigo, String empId, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("empId", empId);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/buscarCtaRhIess", UtilsJSON.objetoToJson(map),
                    RhCtaIessTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public java.math.BigDecimal getRhValorImpuestoRenta(String empCodigo, String empId, String fechaHasta,
            Integer diasLaborados, java.math.BigDecimal rolIngresos, java.math.BigDecimal rolExtras, BigDecimal ingresoExento, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("empId", empId);
            map.put("fechaHasta", fechaHasta);
            map.put("diasLaborados", diasLaborados);
            map.put("rolIngresos", rolIngresos);
            map.put("rolExtras", rolExtras);
            map.put("ingresoExento", ingresoExento);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getRhValorImpuestoRenta", UtilsJSON.objetoToJson(map),
                    java.math.BigDecimal.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RhRolSueldoEmpleadoTO getRhRolSueldoEmpleadoTO(String empCodigo, String empId, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("empId", empId);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getRhRolSueldoEmpleadoTO", UtilsJSON.objetoToJson(map),
                    RhRolSueldoEmpleadoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaRolSaldoEmpleadoDetalladoTO> getRhRolSaldoEmpleadoDetallado(String empCodigo, String empId,
            String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("empId", empId);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhRolSaldoEmpleadoDetallado",
                    UtilsJSON.objetoToJson(map), RhListaRolSaldoEmpleadoDetalladoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public java.math.BigDecimal getRhRolSaldoPrestamo(String empCodigo, String empId, String fechaDesde,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("empId", empId);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getRhRolSaldoPrestamo", UtilsJSON.objetoToJson(map),
                    java.math.BigDecimal.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhAnulacionesTO> getRhAnulacionesTO(String empresa, String periodo, String tipo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("tipo", tipo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhAnulacionesTO",
                    UtilsJSON.objetoToJson(map), RhAnulacionesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleAnticiposTO> getRhDetalleAnticiposTO(String empCodigo, String fechaDesde,
            String fechaHasta, String empCategoria, String empId, String formaPago, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("formaPago", formaPago);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleAnticiposTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleAnticiposTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleAnticiposTO> getRhDetalleAnticiposFiltradoTO(String empCodigo, String fechaDesde,
            String fechaHasta, String empCategoria, String empId, String formaPago, String parametro, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("formaPago", formaPago);
            map.put("parametro", parametro);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleAnticiposFiltradoTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleAnticiposTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleAnticiposLoteTO> getRhDetalleAnticiposLoteTO(String empresa, String periodo, String tipo,
            String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("tipo", tipo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleAnticiposLoteTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleAnticiposLoteTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleBonosLoteTO> getRhDetalleBonosLoteTO(String empresa, String periodo, String tipo,
            String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("tipo", tipo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleBonosLoteTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleBonosLoteTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleAnticiposPrestamosTO> getRhDetalleAnticiposPrestamosTO(String empCodigo,
            String fechaDesde, String fechaHasta, String empCategoria, String empId, String parametro, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("parametro", parametro);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleAnticiposPrestamosTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleAnticiposPrestamosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetallePrestamosTO> getRhDetallePrestamosTO(String empCodigo, String fechaDesde,
            String fechaHasta, String empCategoria, String empId, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetallePrestamosTO",
                    UtilsJSON.objetoToJson(map), RhListaDetallePrestamosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleBonosTO> getRhDetalleBonosTO(String empCodigo, String fechaDesde, String fechaHasta,
            String empCategoria, String empId, String estadoDeducible, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("estadoDeducible", estadoDeducible);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleBonosTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleBonosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleBonosTO> getRhListaDetalleBonosFiltradoTO(String empCodigo, String fechaDesde,
            String fechaHasta, String empCategoria, String empId, String estadoDeducible, String parametro, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("estadoDeducible", estadoDeducible);
            map.put("parametro", parametro);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhListaDetalleBonosFiltradoTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleBonosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleViaticosTO> getRhDetalleViaticosTO(String empCodigo, String fechaDesde, String fechaHasta,
            String empCategoria, String empId, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleViaticosTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleViaticosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleRolesTO> getRhDetalleRolesTO(String empCodigo, String fechaDesde, String fechaHasta,
            String sector, String empCategoria, String empId, String filtro, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("sector", sector);
            map.put("empId", empId);
            map.put("filtro", filtro);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleRolesTO",
                    UtilsJSON.objetoToJson(map), RhListaDetalleRolesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhDetalleVacionesPagadasGozadasTO> getRhDetalleVacacionesPagadasGozadasTO(String empCodigo,
            String empId, String sector, String fechaDesde, String fechaHasta, String tipo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("empId", empId);
            map.put("sector", sector);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("tipo", tipo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhDetalleVacacionesPagadasGozadasTO",
                    UtilsJSON.objetoToJson(map), RhDetalleVacionesPagadasGozadasTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaConsolidadoAnticiposPrestamosTO> getRhConsolidadoAnticiposPrestamosTO(String empCodigo,
            String fechaDesde, String fechaHasta, String empCategoria, String empId, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhConsolidadoAnticiposPrestamosTO",
                    UtilsJSON.objetoToJson(map), RhListaConsolidadoAnticiposPrestamosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaConsolidadoBonosTO> getRhConsolidadoBonosTO(String empCodigo, String fechaDesde,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhConsolidadoBonosTO",
                    UtilsJSON.objetoToJson(map), RhListaConsolidadoBonosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaConsolidadoRolesTO> getRhConsolidadoRolesTO(String empCodigo, String fechaDesde,
            String fechaHasta, String sector, String empCategoria, String empId, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("sector", sector);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhConsolidadoRolesTO",
                    UtilsJSON.objetoToJson(map), RhListaConsolidadoRolesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaSaldoConsolidadoAnticiposPrestamosTO> getRhSaldoConsolidadoAnticiposPrestamosTO(String empCodigo,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhSaldoConsolidadoAnticiposPrestamosTO",
                    UtilsJSON.objetoToJson(map), RhListaSaldoConsolidadoAnticiposPrestamosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaSaldoConsolidadoBonosTO> getRhSaldoConsolidadoBonosTO(String empCodigo, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhSaldoConsolidadoBonosTO",
                    UtilsJSON.objetoToJson(map), RhListaSaldoConsolidadoBonosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaSaldoConsolidadoSueldosPorPagarTO> getRhSaldoConsolidadoSueldosPorPagarTO(String empCodigo,
            String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhSaldoConsolidadoSueldosPorPagarTO",
                    UtilsJSON.objetoToJson(map), RhListaSaldoConsolidadoSueldosPorPagarTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaSaldoIndividualAnticiposPrestamosTO> getRhSaldoIndividualAnticiposPrestamosTO(String empCodigo,
            String fechaDesde, String fechaHasta, String empId, String tipo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empId", empId);
            map.put("tipo", tipo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhSaldoIndividualAnticiposPrestamosTO",
                    UtilsJSON.objetoToJson(map), RhListaSaldoIndividualAnticiposPrestamosTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RhContableTO insertarRhListaProvisionesConContable(String empresa, String periodo, String sector, String status,
            String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("sector", sector);
            map.put("status", status);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhListaProvisionesConContable",
                    UtilsJSON.objetoToJson(map), RhContableTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaProvisionesTO> getRhListaProvisionesTO(String empresa, String periodo, String sector,
            String status, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("sector", sector);
            map.put("status", status);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhListaProvisionesTO",
                    UtilsJSON.objetoToJson(map), RhListaProvisionesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaProvisionesTO> getRhListaProvisionesComprobanteContableTO(String empresa, String periodo,
            String tipo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("tipo", tipo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhListaProvisionesComprobanteContableTO",
                    UtilsJSON.objetoToJson(map), RhListaProvisionesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhXiiiSueldoPeriodoTO> getRhComboXiiiSueldoPeriodoTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhComboXiiiSueldoPeriodoTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, RhXiiiSueldoPeriodoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunXiiiSueldoCalcularTO> getRhFunCalcularXiiiSueldo(String empresa, String sector, String desde,
            String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunCalcularXiiiSueldo",
                    UtilsJSON.objetoToJson(map), RhFunXiiiSueldoCalcularTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunXiiiSueldoConsultarTO> getRhFunConsultarXiiiSueldo(String empresa, String sector, String desde,
            String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunConsultarXiiiSueldo",
                    UtilsJSON.objetoToJson(map), RhFunXiiiSueldoConsultarTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunUtilidadesConsultarTO> getRhFunConsultarUtilidades(String empresa, String sector, String desde,
            String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunConsultarUtilidades",
                    UtilsJSON.objetoToJson(map), RhFunUtilidadesConsultarTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhXivSueldoPeriodoTO> getRhComboXivSueldoPeriodoTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhComboXivSueldoPeriodoTO",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, RhXivSueldoPeriodoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhUtilidadesPeriodoTO> getRhComboUtilidadesPeriodoTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhComboUtilidadesPeriodoTO",
                    UtilsJSON.objetoToJson(map), RhUtilidadesPeriodoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunXivSueldoCalcularTO> getRhFunCalcularXivSueldo(String empresa, String sector, String desde,
            String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunCalcularXivSueldo",
                    UtilsJSON.objetoToJson(map), RhFunXivSueldoCalcularTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunUtilidadesCalcularTO> getRhFunCalcularUtilidades(String empresa, String sector, String desde,
            String hasta, Integer totalDias, Integer totalCargas, java.math.BigDecimal totalPagar, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("totalDias", totalDias);
            map.put("totalCargas", totalCargas);
            map.put("totalPagar", totalPagar);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunCalcularUtilidades",
                    UtilsJSON.objetoToJson(map), RhFunUtilidadesCalcularTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunXivSueldoConsultarTO> getRhFunConsultarXivSueldo(String empresa, String sector, String desde,
            String hasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sector", sector);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunConsultarXivSueldo",
                    UtilsJSON.objetoToJson(map), RhFunXivSueldoConsultarTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFormulario107PeriodoFiscalTO> getRhFormulario107PeriodoFiscalComboTO(SisInfoTO sisInfoTO) {
        try {
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunConsultarUtilidades",
                    sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO, RhFormulario107PeriodoFiscalTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPreavisoAnticiposPrestamosSueldoTO> getRhFunPreavisoXiiis(String empresa, String fecha,
            String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunPreavisoXiiis",
                    UtilsJSON.objetoToJson(map), RhPreavisoAnticiposPrestamosSueldoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPreavisoAnticiposPrestamosSueldoTO> getRhFunPreavisoXivs(String empresa, String fecha,
            String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunPreavisoXivs",
                    UtilsJSON.objetoToJson(map), RhPreavisoAnticiposPrestamosSueldoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPreavisoAnticiposPrestamosSueldoTO> getRhFunPreavisoAnticiposBolivariano(String empresa, String fecha,
            String cuenta, String tipoPreAviso, String servicio, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("cuenta", cuenta);
            map.put("tipoPreAviso", tipoPreAviso);
            map.put("servicio", servicio);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunPreavisoAnticiposBolivariano",
                    UtilsJSON.objetoToJson(map), RhPreavisoAnticiposPrestamosSueldoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPreavisoAnticiposPrestamosSueldoPichinchaTO> getRhFunPreavisoAnticiposPichincha(String empresa,
            String fecha, String cuenta, String tipo, String banco, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("cuenta", cuenta);
            map.put("tipo", tipo);
            map.put("banco", banco);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunPreavisoAnticiposPichincha",
                    UtilsJSON.objetoToJson(map), RhPreavisoAnticiposPrestamosSueldoPichinchaTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPreavisoAnticiposPrestamosSueldoTO> getRhFunPreavisoPrestamos(String empresa, String fecha,
            String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunPreavisoPrestamos",
                    UtilsJSON.objetoToJson(map), RhPreavisoAnticiposPrestamosSueldoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPreavisoAnticiposPrestamosSueldoTO> getRhFunPreavisoSueldos(String empresa, String fecha,
            String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunPreavisoAnticipos",
                    UtilsJSON.objetoToJson(map), RhPreavisoAnticiposPrestamosSueldoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunFormulario107TO> getRhFunFormulario107(String empresa, String desde, String hasta,
            Character status, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("status", status);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunFormulario107",
                    UtilsJSON.objetoToJson(map), RhFunFormulario107TO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhFunFormulario107_2013TO> getRhFunFormulario107_2013(String empresa, String desde, String hasta,
            Character status, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("status", status);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunFormulario107_2013",
                    UtilsJSON.objetoToJson(map), RhFunFormulario107_2013TO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getSwInactivaEmpleado(String empresa, String empleado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("empleado", empleado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getSwInactivaEmpleado", UtilsJSON.objetoToJson(map),
                    boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public List<RhPreavisoAnticiposPrestamosSueldoTO> getRhFunPreavisoVacaciones(String empresa, String fecha,
            String cuenta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("fecha", fecha);
            map.put("cuenta", cuenta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhFunPreavisoVacaciones",
                    UtilsJSON.objetoToJson(map), RhPreavisoAnticiposPrestamosSueldoTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RetornoTO getConsolidadoIngresosTabulado(String empresa, String codigoSector, String fechaInicio,
            String fechaFin, String usuario, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoSector", codigoSector);
            map.put("fechaInicio", fechaInicio);
            map.put("fechaFin", fechaFin);
            map.put("usuario", usuario);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getConsolidadoIngresosTabulado",
                    UtilsJSON.objetoToJson(map), RetornoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhEmpleadoDescuentosFijosTO> getRhEmpleadoDescuentosFijosTO(String empresa, String empresaID, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("empresaID", empresaID);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhEmpleadoDescuentosFijosTO>(
                    Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhEmpleadoDescuentosFijosTO",
                            UtilsJSON.objetoToJson(map), RhEmpleadoDescuentosFijosTO[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RetornoTO getProvisionPorFechas(String empresa, String codigoSector, String fechaInicio, String fechaFin,
            String agrupacion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("codigoSector", codigoSector);
            map.put("fechaInicio", fechaInicio);
            map.put("fechaFin", fechaFin);
            map.put("agrupacion", agrupacion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getProvisionPorFechas", UtilsJSON.objetoToJson(map),
                    RetornoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhAnticipoMotivoTO> getListaRhAnticipoMotivoTablaTO(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhAnticipoMotivoTO>(
                    Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhAnticipoMotivoTablaTO",
                            UtilsJSON.objetoToJson(map), RhAnticipoMotivoTO[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionRhAnticipoMotivo(RhAnticipoMotivoTO rhAnticipoMotivoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhAnticipoMotivoTO", rhAnticipoMotivoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhAnticipoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionRhXiiiSueldoPeriodo(RhXiiiSueldoPeriodoTO rhXiiiSueldoPeriodoTO, String empresaCodigo,
            String usuarioCodigo, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXiiiSueldoPeriodoTO", rhXiiiSueldoPeriodoTO);
            map.put("empresaCodigo", empresaCodigo);
            map.put("usuarioCodigo", usuarioCodigo);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhXiiiSueldoPeriodo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionRhXivSueldoPeriodo(RhXivSueldoPeriodoTO rhXivSueldoPeriodoTO, String empresaCodigo,
            String usuarioCodigo, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXivSueldoPeriodoTO", rhXivSueldoPeriodoTO);
            map.put("empresaCodigo", empresaCodigo);
            map.put("usuarioCodigo", usuarioCodigo);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhXivSueldoPeriodo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String accionRhUtilidadesPeriodo(RhUtilidadesPeriodoTO rhUtilidadesPeriodoTO, char accion, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhUtilidadesPeriodoTO", rhUtilidadesPeriodoTO);
            map.put("accion", accion);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/accionRhUtilidadesPeriodo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsolidadoAnticiposPrestamos(String fechaDesde, String fechaHasta,
            List<RhListaConsolidadoAnticiposPrestamosTO> listaConsolidadoAnticiposPrestamosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("listaConsolidadoAnticiposPrestamosTO", listaConsolidadoAnticiposPrestamosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoAnticiposPrestamos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsolidadoAnticiposPrestamos", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListaDetalleVacaionesPagadas(String desde, String hasta, String empSector,
            List<RhDetalleVacionesPagadasGozadasTO> listaDetalleVacacionesPagadasGozadasTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("desde", desde);
            map.put("hasta", hasta);
            map.put("empSector", empSector);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            map.put("listaDetalleVacacionesPagadasGozadasTO", listaDetalleVacacionesPagadasGozadasTO);
            String rutaArchivo = "reportListaDetalleVacaionesPagadas.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListaDetalleVacaionesPagadas", map,
                    rutaArchivo);

        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetalleAnticipos(String empId, String empCodigo, String empCategoria, String fechaDesde,
            String fechaHasta, List<RhListaDetalleAnticiposTO> listaDetalleAnticiposTO, String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("empId", empId);
            map.put("empCodigo", empCodigo);
            map.put("empCategoria", empCategoria);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("listaDetalleAnticiposTO", listaDetalleAnticiposTO);
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportDetalleAnticipos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetalleAnticipos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetalleAnticiposPrestamos(String empCodigo, String fechaDesde, String fechaHasta,
            String empCategoria, String empId,
            List<RhListaDetalleAnticiposPrestamosTO> listaDetalleAnticiposPrestamosTO, String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("listaDetalleAnticiposPrestamosTO", listaDetalleAnticiposPrestamosTO);
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportDetalleAnticiposPrestamos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetalleAnticiposPrestamos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetallePrestamos(String empCodigo, String fechaDesde, String fechaHasta,
            String empCategoria, String empId, List<RhListaDetallePrestamosTO> listaDetallePrestamosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("empCodigo", empCodigo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("empId", empId);
            map.put("listaDetallePrestamosTO", listaDetallePrestamosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoAnticiposPrestamos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetallePrestamos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetalleBonos(String fechaDesde, String fechaHasta, String empCategoria,
            String nombreEmpleado, List<RhListaDetalleBonosTO> listaDetalleBonosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("nombreEmpleado", nombreEmpleado);
            map.put("listaDetalleBonosTO", listaDetalleBonosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportDetalleBonos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetalleBonos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetalleBonosLote(String periodo, String tipo, String numero,
            List<RhListaDetalleBonosLoteTO> listaDetalleBonosLoteTO, String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("periodo", periodo);
            map.put("tipo", tipo);
            map.put("numero", numero);
            map.put("listaDetalleBonosLoteTO", listaDetalleBonosLoteTO);
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = nombre + ".jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetalleBonosLote", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetalleBonosLoteWeb(List<ReporteConsultaBonosLote> reporteConsultaBonosLotes, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("reporteConsultaBonosLotes", reporteConsultaBonosLotes);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportDetalleBonosLote.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetalleBonosLoteWeb", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetalleBonosLoteColectivo(List<ReporteConsultaBonosLote> reporteConsultaBonosLotes, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("reporteConsultaBonosLotes", reporteConsultaBonosLotes);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportComprobanteBonosPorLoteColectivo.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetalleBonosLoteColectivo", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteDetalleViaticos(String fechaDesde, String fechaHasta, String empCategoria,
            String nombreEmpleado, List<RhListaDetalleViaticosTO> listaDetalleViaticosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("nombreEmpleado", nombreEmpleado);
            map.put("listaDetalleViaticosTO", listaDetalleViaticosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportDetalleViaticos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteDetalleViaticos", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsolidadoBonosViatico(String fechaDesde, String fechaHasta,
            List<RhListaConsolidadoBonosTO> listaConsolidadoBonosViaticosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("listaConsolidadoBonosViaticosTO", listaConsolidadoBonosViaticosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoBonosViatico.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsolidadoBonosViatico", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteListadoRolesPago(String fechaDesde, String fechaHasta, String empCategoria,
            String nombreEmpleado, List<RhListaDetalleRolesTO> listaDetalleRolesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("nombreEmpleado", nombreEmpleado);
            map.put("listaDetalleRolesTO", listaDetalleRolesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportListadoRolesPago.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteListadoRolesPago", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsolidadoRoles(String fechaDesde, String fechaHasta, String empCategoria,
            String nombreEmpleado, List<RhListaConsolidadoRolesTO> listaConsolidadoRolesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empCategoria", empCategoria);
            map.put("nombreEmpleado", nombreEmpleado);
            map.put("listaConsolidadoRolesTO", listaConsolidadoRolesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsolidadoRoles.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsolidadoRoles", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteSaldoIndividualAnticiposPrestamos(String fechaDesde, String fechaHasta, String empId,
            List<RhListaSaldoIndividualAnticiposPrestamosTO> listaSaldoIndividualAnticiposPrestamosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("empId", empId);
            map.put("listaSaldoIndividualAnticiposPrestamosTO", listaSaldoIndividualAnticiposPrestamosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportSaldoIndividualAnticiposPrestamos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteSaldoIndividualAnticiposPrestamos", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteSaldoConsolidadoAnticiposPrestamos(String fechaHasta,
            List<RhListaSaldoConsolidadoAnticiposPrestamosTO> listaSaldoConsolidadoAnticiposPrestamosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaHasta", fechaHasta);
            map.put("listaSaldoConsolidadoAnticiposPrestamosTO", listaSaldoConsolidadoAnticiposPrestamosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportSaldoConsolidadoAnticiposPrestamos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteSaldoConsolidadoAnticiposPrestamos", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteSaldoConsolidadoBonosViaticos(String fechaHasta,
            List<RhListaSaldoConsolidadoBonosTO> listaSaldoConsolidadoBonosViaticosTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaHasta", fechaHasta);
            map.put("listaSaldoConsolidadoBonosViaticosTO", listaSaldoConsolidadoBonosViaticosTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportSaldoConsolidadoBonosViaticos.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteSaldoConsolidadoBonosViaticos", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteSaldoConsolidadoSueldosPorPagar(String fechaHasta,
            List<RhListaSaldoConsolidadoSueldosPorPagarTO> listaSaldoConsolidadoSueldosPorPagarTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("fechaHasta", fechaHasta);
            map.put("listaSaldoConsolidadoSueldosPorPagarTO", listaSaldoConsolidadoSueldosPorPagarTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportSaldoConsolidadoSueldosPorPagar.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteSaldoConsolidadoSueldosPorPagar", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteXiiiSueldoConsulta(String sector, String periodo, String fechaDesde, String fechaHasta,
            String fechaMaxima, List<RhFunXiiiSueldoConsultarTO> rhFunXiiiSueldoConsultarTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("sector", sector);
            map.put("periodo", periodo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("fechaMaxima", fechaMaxima);
            map.put("rhFunXiiiSueldoConsultarTO", rhFunXiiiSueldoConsultarTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportXiiiSueldoConsulta.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteXiiiSueldoConsulta", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteXivSueldoConsulta(String sector, String periodo, String fechaDesde, String fechaHasta,
            String fechaMaxima, List<RhFunXivSueldoConsultarTO> rhFunXivSueldoConsultarTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("sector", sector);
            map.put("periodo", periodo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("fechaMaxima", fechaMaxima);
            map.put("rhFunXivSueldoConsultarTO", rhFunXivSueldoConsultarTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportXivSueldoConsulta.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteXivSueldoConsulta", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteUtilidadesPreCalculo(String sector, String periodo, String fechaDesde,
            String fechaHasta, String fechaMaxima, List<RhFunUtilidadesCalcularTO> rhFunUtilidadesCalcularTOs, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("sector", sector);
            map.put("periodo", periodo);
            map.put("fechaDesde", fechaDesde);
            map.put("fechaHasta", fechaHasta);
            map.put("fechaMaxima", fechaMaxima);
            map.put("rhFunUtilidadesCalcularTOs", rhFunUtilidadesCalcularTOs);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportUtilidadesPreCalculo.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteUtilidadesPreCalculo", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteProvisionesComprobanteContable(String periodo, String tipo, String numero,
            List<RhListaProvisionesTO> listaProvisionesTO, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("periodo", periodo);
            map.put("tipo", tipo);
            map.put("numero", numero);
            map.put("listaProvisionesTO", listaProvisionesTO);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportProvisionesComprobanteContable.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteProvisionesComprobanteContable", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteXIIISueldo(List<ReporteAnticipoPrestamoXIIISueldo> rhReporteXIIISueldo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("rhReporteXIIISueldo", rhReporteXIIISueldo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportAnticipo.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteXIIISueldo", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteXIVSueldo(List<ReporteAnticipoPrestamoXIIISueldo> rhReporteXIVSueldo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("rhReporteXIVSueldo", rhReporteXIVSueldo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportAnticipo.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteXIVSueldo", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteUtilidades(List<ReporteAnticipoPrestamoXIIISueldo> rhReporteUtilidades, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("rhReporteUtilidades", rhReporteUtilidades);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportAnticipo.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteUtilidades", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteAnticipo(List<ReporteAnticipoPrestamoXIIISueldo> rhReporteAnticipoOprestamos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("rhReporteAnticipoOprestamos", rhReporteAnticipoOprestamos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportAnticipo.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteAnticipo", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsultaAnticiposLote(List<ReporteConsultaAnticiposLote> lista, String nombre, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("nombre", nombre);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsultaAnticiposLote.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsultaAnticiposLote", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteConsultaAnticiposLoteColectivo(List<ReporteConsultaAnticiposLote> lista, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportConsultaAnticiposLoteColectivo.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteConsultaAnticiposLoteColectivo", map,
                    rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReportePrestamoVista(List<ReporteAnticipoPrestamoXIIISueldo> lista, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportPrestamoVista.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReportePrestamoVista", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteRol(List<ReportesRol> lista, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportRol.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteRol", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    public String generarReporteLiquidacion(List<ReportesRol> lista, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportRol.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteLiquidacion", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    public String generarReporteRolLote(List<ReportesRol> lista, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportRolLote.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteRolLote", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    public String generarReporteRolLoteSoporte(List<ReportesRol> lista, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("lista", lista);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportRolLote.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteRolLoteSoporte", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String generarReporteEmpleado(List<ReporteEmpleado> listReporteEmpleado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("usuarioEmpresaReporteTO", UtilsAplicacion.usuarioEmpresaReporteTO);
            map.put("listReporteEmpleado", listReporteEmpleado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            String rutaArchivo = "reportEmpleado.jrprint";
            return UtilsRESTFul.postForFile(conexionWS + "/generarReporteEmpleado", map, rutaArchivo);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    /////////////////////////// Metodos WEB ///////////////////////////
    public RhParametros getRhParametros(String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getRhParametros", UtilsJSON.objetoToJson(map),
                    RhParametros.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public RhParametros obtenerRhParametrosPorCodigoRelacionTrabajo(String fechaHasta, String codigo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("fechaHasta", fechaHasta);
            map.put("codigo", codigo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerRhParametrosPorCodigoRelacionTrabajo", UtilsJSON.objetoToJson(map),
                    RhParametros.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
    public RhRolSaldoEmpleadoTO obtenerRhRolSaldoEmpleadoTO(String empresa, String empleado, String fechaDesde, String fechaHasta, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("fechaDesde", fechaDesde);
            map.put("empleado", empleado);
            map.put("empresa", empresa);
            map.put("fechaHasta", fechaHasta);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/obtenerRhRolSaldoEmpleadoTO", UtilsJSON.objetoToJson(map),
                    RhRolSaldoEmpleadoTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarRhAnticipoMotivo(RhAnticipoMotivo rhAnticipoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhAnticipoMotivo", rhAnticipoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhAnticipoMotivo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhAnticipoMotivo(RhAnticipoMotivo rhAnticipoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhAnticipoMotivo", rhAnticipoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhAnticipoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhAnticipoMotivo(RhAnticipoMotivo rhAnticipoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhAnticipoMotivo", rhAnticipoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhAnticipoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhAnticipoMotivo> getListaRhAnticipoMotivo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhAnticipoMotivo>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListaRhAnticipoMotivo", UtilsJSON.objetoToJson(map), RhAnticipoMotivo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarRhBonoMotivo(RhBonoMotivo rhBonoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhBonoMotivo", rhBonoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhBonoMotivo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhBonoMotivo(RhBonoMotivo rhBonoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhBonoMotivo", rhBonoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhBonoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhBonoMotivo(RhBonoMotivo rhBonoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhBonoMotivo", rhBonoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhBonoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhBonoMotivo> getListaRhBonoMotivo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhBonoMotivo>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListaRhBonoMotivo", UtilsJSON.objetoToJson(map), RhBonoMotivo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarRhXiiiSueldoMotivo(RhXiiiSueldoMotivo rhXiiiSueldoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXiiiSueldoMotivo", rhXiiiSueldoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhXiiiSueldoMotivo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhXiiiSueldoMotivo(RhXiiiSueldoMotivo rhXiiiSueldoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXiiiSueldoMotivo", rhXiiiSueldoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhXiiiSueldoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhXiiiSueldoMotivo(RhXiiiSueldoMotivo rhXiiiSueldoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXiiiSueldoMotivo", rhXiiiSueldoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhXiiiSueldoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhXiiiSueldoMotivo> getListaRhXiiiSueldoMotivo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhXiiiSueldoMotivo>(
                    Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhXiiiSueldoMotivo",
                            UtilsJSON.objetoToJson(map), RhXiiiSueldoMotivo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarRhXivSueldoMotivo(RhXivSueldoMotivo rhXivSueldoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXivSueldoMotivo", rhXivSueldoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhXivSueldoMotivo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhXivSueldoMotivo(RhXivSueldoMotivo rhXivSueldoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXivSueldoMotivo", rhXivSueldoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhXivSueldoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhXivSueldoMotivo(RhXivSueldoMotivo rhXivSueldoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhXivSueldoMotivo", rhXivSueldoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhXivSueldoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhXivSueldoMotivo> getListaRhXivSueldoMotivo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhXivSueldoMotivo>(
                    Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaRhXivSueldoMotivo",
                            UtilsJSON.objetoToJson(map), RhXivSueldoMotivo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarRhUtilidadMotivo(RhUtilidadMotivo rhUtilidadMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhUtilidadMotivo", rhUtilidadMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhUtilidadMotivo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhUtilidadMotivo(RhUtilidadMotivo rhUtilidadMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhUtilidadMotivo", rhUtilidadMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhUtilidadMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhUtilidadMotivo(RhUtilidadMotivo rhUtilidadMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhUtilidadMotivo", rhUtilidadMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhUtilidadMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhUtilidadMotivo> getListaRhUtilidadMotivo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhUtilidadMotivo>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListaRhUtilidadMotivo", UtilsJSON.objetoToJson(map), RhUtilidadMotivo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarRhPrestamoMotivo(RhPrestamoMotivo rhPrestamoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhPrestamoMotivo", rhPrestamoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhPrestamoMotivo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhPrestamoMotivo(RhPrestamoMotivo rhPrestamoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhPrestamoMotivo", rhPrestamoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhPrestamoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhPrestamoMotivo(RhPrestamoMotivo rhPrestamoMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhPrestamoMotivo", rhPrestamoMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhPrestamoMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPrestamoMotivo> getListaRhPrestamoMotivo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhPrestamoMotivo>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListaRhPrestamoMotivo", UtilsJSON.objetoToJson(map), RhPrestamoMotivo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String insertarRhRolMotivo(RhRolMotivo rhRolMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhRolMotivo", rhRolMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarRhRolMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String modificarRhRolMotivo(RhRolMotivo rhRolMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhRolMotivo", rhRolMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/modificarRhRolMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhRolMotivo(RhRolMotivo rhRolMotivo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhRolMotivo", rhRolMotivo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhRolMotivo", UtilsJSON.objetoToJson(map),
                    String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhRolMotivo> getListaRhRolMotivo(String empresa, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhRolMotivo>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListaRhRolMotivo", UtilsJSON.objetoToJson(map), RhRolMotivo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarModificarRhProvisiones(ConContable conContable, List<RhRol> listaRhRol, SisInfoTO sisInfoTO) {
        /*
            Método utilizado en el proyecto web de Primefaces para registrar las provisiones
         */
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("listaRhRol", listaRhRol);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhProvisiones",
                    UtilsJSON.objetoToJson(map), MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getPermisoAccionesRol(ConContablePK conContablePK, String fechaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("fechaContable", fechaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoAccionesRol", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarModificarRhRol(ConContable conContable, List<RhRol> listaRhRol, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("listaRhRol", listaRhRol);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhRol", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhRol> getListRhRol(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhRol>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getListRhRol",
                    UtilsJSON.objetoToJson(map), RhRol[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getPermisoAccionesAnticipo(ConContablePK conContablePK, String fechaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("fechaContable", fechaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoAccionesAnticipo", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarModificarRhAnticipo(ConContable conContable, List<RhAnticipo> listaRhAnticipo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("listaRhAnticipo", listaRhAnticipo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhAnticipo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhAnticipo> getListRhAnticipo(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhAnticipo>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getListRhAnticipo",
                    UtilsJSON.objetoToJson(map), RhAnticipo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getPermisoAccionesXiiiSueldo(ConContablePK conContablePK, String fechaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("fechaContable", fechaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoAccionesXiiiSueldo", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarModificarRhXiiiSueldo(ConContable conContable, List<RhXiiiSueldo> listaRhXiiiSueldo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("listaRhXiiiSueldo", listaRhXiiiSueldo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhXiiiSueldo",
                    UtilsJSON.objetoToJson(map), MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhXiiiSueldo> getListRhXiiiSueldo(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhXiiiSueldo>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListRhXiiiSueldo", UtilsJSON.objetoToJson(map), RhXiiiSueldo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getPermisoAccionesXivSueldo(ConContablePK conContablePK, String fechaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("fechaContable", fechaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoAccionesXivSueldo", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarModificarRhXivSueldo(ConContable conContable, List<RhXivSueldo> listaRhXivSueldo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("listaRhXivSueldo", listaRhXivSueldo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhXivSueldo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhXivSueldo> getListRhXivSueldo(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhXivSueldo>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListRhXivSueldo", UtilsJSON.objetoToJson(map), RhXivSueldo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getPermisoAccionesUtilidad(ConContablePK conContablePK, String fechaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("fechaContable", fechaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoAccionesUtilidad", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarModificarRhUtilidades(ConContable conContable, List<RhUtilidades> listaRhUtilidades, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("listaRhUtilidades", listaRhUtilidades);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhUtilidades",
                    UtilsJSON.objetoToJson(map), MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhUtilidades> getListRhUtilidades(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhUtilidades>(Arrays.asList(restTemplate.postForObject(
                    conexionWS + "/getListRhUtilidades", UtilsJSON.objetoToJson(map), RhUtilidades[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getPermisoAccionesPrestamo(ConContablePK conContablePK, String fechaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("fechaContable", fechaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoAccionesPrestamo", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarModificarRhPrestamo(ConContable conContable, RhPrestamo rhPrestamo, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("rhPrestamo", rhPrestamo);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhPrestamo", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhPrestamo> getListRhPrestamo(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhPrestamo>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getListRhPrestamo",
                    UtilsJSON.objetoToJson(map), RhPrestamo[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public boolean getPermisoAccionesBono(ConContablePK conContablePK, String fechaContable, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("fechaContable", fechaContable);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getPermisoAccionesBono", UtilsJSON.objetoToJson(map),
                    Boolean.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return false;
    }

    public MensajeTO insertarModificarRhBono(ConContable conContable, List<RhBono> listaRhBono, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContable", conContable);
            map.put("listaRhBono", listaRhBono);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhBono", UtilsJSON.objetoToJson(map),
                    MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhBono> getListRhBono(ConContablePK conContablePK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("conContablePK", conContablePK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhBono>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getListRhBono",
                    UtilsJSON.objetoToJson(map), RhBono[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhEmpleado> getListaEmpleado(String empresa, String buscar, boolean estado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("buscar", buscar);
            map.put("estado", estado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhEmpleado>(Arrays.asList(restTemplate.postForObject(conexionWS + "/getListaEmpleado",
                    UtilsJSON.objetoToJson(map), RhEmpleado[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public RhEmpleado getEmpleado(String empresa, String id, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("id", id);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/getEmpleado", UtilsJSON.objetoToJson(map),
                    RhEmpleado.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhEmpleadoDescuentosFijos> getEmpleadoDescuentosFijos(String empresa, String empleado, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("empresa", empresa);
            map.put("empleado", empleado);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return new ArrayList<RhEmpleadoDescuentosFijos>(
                    Arrays.asList(restTemplate.postForObject(conexionWS + "/getEmpleadoDescuentosFijos",
                            UtilsJSON.objetoToJson(map), RhEmpleadoDescuentosFijos[].class)));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public MensajeTO insertarModificarRhEmpleado(RhEmpleado rhEmpleado,
            List<RhEmpleadoDescuentosFijos> listEmpleadoDescuentosFijos, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhEmpleado", rhEmpleado);
            map.put("listEmpleadoDescuentosFijos", listEmpleadoDescuentosFijos);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/insertarModificarRhEmpleado", map, MensajeTO.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public String eliminarRhEmpleado(RhEmpleadoPK rhEmpleadoPK, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("rhEmpleadoPK", rhEmpleadoPK);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return restTemplate.postForObject(conexionWS + "/eliminarRhEmpleado", map, String.class);
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }

    public List<RhListaDetalleRolesTO> getRhSoporteContableRolesTO(String empresa, String periodo, String tipo, String numero, SisInfoTO sisInfoTO) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("empresa", empresa);
            map.put("periodo", periodo);
            map.put("tipo", tipo);
            map.put("numero", numero);
            map.put("sisInfoTO", sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
            return Arrays.asList(restTemplate.postForObject(conexionWS + "/getRhSoporteContableRolesTO", UtilsJSON.objetoToJson(map), RhListaDetalleRolesTO[].class));
        } catch (RestClientException e) {
            UtilsExcepciones.enviarError(e, getClass().getName(),sisInfoTO == null ? UtilsAplicacion.getSisInfoTO() : sisInfoTO);
        }
        return null;
    }
    
}
