package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sis_grupo", schema = "sistemaweb")
public class SisGrupo implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected SisGrupoPK sisGrupoPK;

    @Column(name = "gru_nombre")
    private String gruNombre;

    @Column(name = "gru_crear")
    private Boolean gruCrear;
    @Column(name = "gru_crear_clientes")
    private Boolean gruCrearClientes;
    @Column(name = "gru_crear_proveedores")
    private Boolean gruCrearProveedores;
    @Column(name = "gru_crear_productos")
    private Boolean gruCrearProductos;
    @Column(name = "gru_crear_cuentas_contables")
    private Boolean gruCrearCuentasContables;
    @Column(name = "gru_crear_empleados")
    private Boolean gruCrearEmpleados;
    @Column(name = "gru_crear_centros_produccion")
    private Boolean gruCrearCentrosProduccion;
    @Column(name = "gru_crear_centros_costo")
    private Boolean gruCrearCentrosCosto;
    @Column(name = "gru_crear_periodos_sistema")
    private Boolean gruCrearPeriodosSistema;
    @Column(name = "gru_crear_periodos_produccion")
    private Boolean gruCrearPeriodosProduccion;

    @Column(name = "gru_modificar")
    private Boolean gruModificar;
    @Column(name = "gru_modificar_clientes")
    private Boolean gruModificarClientes;
    @Column(name = "gru_modificar_proveedores")
    private Boolean gruModificarProveedores;
    @Column(name = "gru_modificar_productos")
    private Boolean gruModificarProductos;
    @Column(name = "gru_modificar_cuentas_contables")
    private Boolean gruModificarCuentasContables;
    @Column(name = "gru_modificar_empleados")
    private Boolean gruModificarEmpleados;
    @Column(name = "gru_modificar_centros_produccion")
    private Boolean gruModificarCentrosProduccion;
    @Column(name = "gru_modificar_centros_costo")
    private Boolean gruModificarCentrosCosto;
    @Column(name = "gru_modificar_periodos_sistema")
    private Boolean gruModificarPeriodosSistema;
    @Column(name = "gru_modificar_periodos_produccion")
    private Boolean gruModificarPeriodosProduccion;
    @Column(name = "gru_modificar_oc_aprobadas")
    private Boolean gruModificarOcAprobadas;

    @Column(name = "gru_eliminar")
    private Boolean gruEliminar;
    @Column(name = "gru_eliminar_compras")
    private Boolean gruEliminarCompras;
    @Column(name = "gru_eliminar_ventas")
    private Boolean gruEliminarVentas;
    @Column(name = "gru_eliminar_consumos")
    private Boolean gruEliminarConsumos;
    @Column(name = "gru_eliminar_transferencias")
    private Boolean gruEliminarTransferencias;
    @Column(name = "gru_eliminar_contables")
    private Boolean gruEliminarContables;
    @Column(name = "gru_eliminar_contables_talento_humano")
    private Boolean gruEliminarContablesTalentoHumano;
    @Column(name = "gru_eliminar_presupuestos")
    private Boolean gruEliminarPresupuestos;
    @Column(name = "gru_eliminar_preliquidaciones")
    private Boolean gruEliminarPreliquidaciones;
    @Column(name = "gru_eliminar_liquidaciones")
    private Boolean gruEliminarLiquidaciones;
    @Column(name = "gru_eliminar_proformas")
    private Boolean gruEliminarProformas;
    @Column(name = "gru_eliminar_contratos")
    private Boolean gruEliminarContratos;

    @Column(name = "gru_mayorizar_compras")
    private Boolean gruMayorizarCompras;
    @Column(name = "gru_mayorizar_ventas")
    private Boolean gruMayorizarVentas;
    @Column(name = "gru_mayorizar_consumos")
    private Boolean gruMayorizarConsumos;
    @Column(name = "gru_mayorizar_transferencias")
    private Boolean gruMayorizarTransferencias;
    @Column(name = "gru_mayorizar_contables")
    private Boolean gruMayorizarContables;
    @Column(name = "gru_mayorizar_contables_talento_humano")
    private Boolean gruMayorizarContablesTalentoHumano;
    @Column(name = "gru_mayorizar_presupuestos")
    private Boolean gruMayorizarPresupuestos;
    @Column(name = "gru_mayorizar_preliquidaciones")
    private Boolean gruMayorizarPreliquidaciones;
    @Column(name = "gru_mayorizar_liquidaciones")
    private Boolean gruMayorizarLiquidaciones;
    @Column(name = "gru_mayorizar_proformas")
    private Boolean gruMayorizarProformas;

    @Column(name = "gru_mayorizar_pagos")
    private Boolean gruMayorizarPagos;
    @Column(name = "gru_mayorizar_cobros")
    private Boolean gruMayorizarCobros;
    @Column(name = "gru_mayorizar_anticipos_clientes")
    private Boolean gruMayorizarAnticiposClientes;
    @Column(name = "gru_mayorizar_anticipos_proveedores")
    private Boolean gruMayorizarAnticiposProveedores;

    @Column(name = "gru_desmayorizar_compras")
    private Boolean gruDesmayorizarCompras;
    @Column(name = "gru_desmayorizar_ventas")
    private Boolean gruDesmayorizarVentas;
    @Column(name = "gru_desmayorizar_consumos")
    private Boolean gruDesmayorizarConsumos;
    @Column(name = "gru_desmayorizar_transferencias")
    private Boolean gruDesmayorizarTransferencias;
    @Column(name = "gru_desmayorizar_contables")
    private Boolean gruDesmayorizarContables;
    @Column(name = "gru_desmayorizar_contables_talento_humano")
    private Boolean gruDesmayorizarContablesTalentoHumano;
    @Column(name = "gru_desmayorizar_presupuestos")
    private Boolean gruDesmayorizarPresupuestos;
    @Column(name = "gru_desmayorizar_preliquidaciones")
    private Boolean gruDesmayorizarPreliquidaciones;
    @Column(name = "gru_desmayorizar_liquidaciones")
    private Boolean gruDesmayorizarLiquidaciones;
    @Column(name = "gru_desmayorizar_proformas")
    private Boolean gruDesmayorizarProformas;

    @Column(name = "gru_desmayorizar_pagos")
    private Boolean gruDesmayorizarPagos;
    @Column(name = "gru_desmayorizar_cobros")
    private Boolean gruDesmayorizarCobros;
    @Column(name = "gru_desmayorizar_anticipos_clientes")
    private Boolean gruDesmayorizarAnticiposClientes;
    @Column(name = "gru_desmayorizar_anticipos_proveedores")
    private Boolean gruDesmayorizarAnticiposProveedores;

    @Column(name = "gru_anular_compras")
    private Boolean gruAnularCompras;
    @Column(name = "gru_anular_ventas")
    private Boolean gruAnularVentas;
    @Column(name = "gru_anular_consumos")
    private Boolean gruAnularConsumos;
    @Column(name = "gru_anular_transferencias")
    private Boolean gruAnularTransferencias;
    @Column(name = "gru_anular_contables")
    private Boolean gruAnularContables;
    @Column(name = "gru_anular_contables_talento_humano")
    private Boolean gruAnularContablesTalentoHumano;
    @Column(name = "gru_anular_presupuestos")
    private Boolean gruAnularPresupuestos;
    @Column(name = "gru_anular_preliquidaciones")
    private Boolean gruAnularPreliquidaciones;
    @Column(name = "gru_anular_liquidaciones")
    private Boolean gruAnularLiquidaciones;
    @Column(name = "gru_anular_proformas")
    private Boolean gruAnularProformas;

    @Column(name = "gru_anular_retencion")
    private Boolean gruAnularRetencion;

    @Column(name = "gru_configurar")
    private Boolean gruConfigurar;
    @Column(name = "gru_imprimir")
    private Boolean gruImprimir;
    @Column(name = "gru_exportar")
    private Boolean gruExportar;
    @Column(name = "gru_dashboard")
    private Boolean gruDashboard;
    @Column(name = "gru_adjuntar_imagenes")
    private Boolean gruAdjuntarImagenes;

    @Column(name = "gru_reutilizar_cheque")
    private Boolean gruReutilizarCheque;
    
    @Column(name = "gru_consultar_compras")
    private Boolean gruConsultarCompras;
    @Column(name = "gru_consultar_ventas")
    private Boolean gruConsultarVentas;
    @Column(name = "gru_consultar_consumos")
    private Boolean gruConsultarConsumos;
    @Column(name = "gru_consultar_transferencias")
    private Boolean gruConsultarTransferencias;
    @Column(name = "gru_consultar_contables")
    private Boolean gruConsultarContables;
    @Column(name = "gru_consultar_contables_talento_humano")
    private Boolean gruConsultarContablesTalentoHumano;
    @Column(name = "gru_consultar_presupuestos")
    private Boolean gruConsultarPresupuestos;
    @Column(name = "gru_consultar_preliquidaciones")
    private Boolean gruConsultarPreliquidaciones;
    @Column(name = "gru_consultar_liquidaciones")
    private Boolean gruConsultarLiquidaciones;
    @Column(name = "gru_consultar_proformas")
    private Boolean gruConsultarProformas;
    @Column(name = "gru_consultar_pagos")
    private Boolean gruConsultarPagos;
    @Column(name = "gru_consultar_cobros")
    private Boolean gruConsultarCobros;
    @Column(name = "gru_consultar_anticipos_clientes")
    private Boolean gruConsultarAnticiposClientes;
    @Column(name = "gru_consultar_anticipos_proveedores")
    private Boolean gruConsultarAnticiposProveedores;

    @Column(name = "usr_inserta_grupo")
    private String usrInsertaGrupo;
    @Column(name = "usr_fecha_inserta_grupo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInsertaGrupo;
    @JoinColumn(name = "emp_codigo", referencedColumnName = "emp_codigo")
    @ManyToOne
    private SisEmpresa empCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sisGrupo")
    private List<SisUsuarioDetalle> sisUsuarioDetalleList;

    public SisGrupo() {
    }

    public SisGrupo(SisGrupoPK sisGrupoPK) {
        this.sisGrupoPK = sisGrupoPK;
    }

    public SisGrupo(String gruEmpresa, String gruCodigo) {
        this.sisGrupoPK = new SisGrupoPK(gruEmpresa, gruCodigo);
    }

    public SisGrupoPK getSisGrupoPK() {
        return sisGrupoPK;
    }

    public void setSisGrupoPK(SisGrupoPK sisGrupoPK) {
        this.sisGrupoPK = sisGrupoPK;
    }

    public String getGruNombre() {
        return gruNombre;
    }

    public void setGruNombre(String gruNombre) {
        this.gruNombre = gruNombre;
    }

    public Boolean getGruCrear() {
        return gruCrear;
    }

    public void setGruCrear(Boolean gruCrear) {
        this.gruCrear = gruCrear;
    }

    public Boolean getGruCrearClientes() {
        return gruCrearClientes;
    }

    public void setGruCrearClientes(Boolean gruCrearClientes) {
        this.gruCrearClientes = gruCrearClientes;
    }

    public Boolean getGruCrearProveedores() {
        return gruCrearProveedores;
    }

    public void setGruCrearProveedores(Boolean gruCrearProveedores) {
        this.gruCrearProveedores = gruCrearProveedores;
    }

    public Boolean getGruCrearProductos() {
        return gruCrearProductos;
    }

    public void setGruCrearProductos(Boolean gruCrearProductos) {
        this.gruCrearProductos = gruCrearProductos;
    }

    public Boolean getGruCrearCuentasContables() {
        return gruCrearCuentasContables;
    }

    public void setGruCrearCuentasContables(Boolean gruCrearCuentasContables) {
        this.gruCrearCuentasContables = gruCrearCuentasContables;
    }

    public Boolean getGruCrearEmpleados() {
        return gruCrearEmpleados;
    }

    public void setGruCrearEmpleados(Boolean gruCrearEmpleados) {
        this.gruCrearEmpleados = gruCrearEmpleados;
    }

    public Boolean getGruCrearCentrosProduccion() {
        return gruCrearCentrosProduccion;
    }

    public void setGruCrearCentrosProduccion(Boolean gruCrearCentrosProduccion) {
        this.gruCrearCentrosProduccion = gruCrearCentrosProduccion;
    }

    public Boolean getGruCrearCentrosCosto() {
        return gruCrearCentrosCosto;
    }

    public void setGruCrearCentrosCosto(Boolean gruCrearCentrosCosto) {
        this.gruCrearCentrosCosto = gruCrearCentrosCosto;
    }

    public Boolean getGruCrearPeriodosSistema() {
        return gruCrearPeriodosSistema;
    }

    public void setGruCrearPeriodosSistema(Boolean gruCrearPeriodosSistema) {
        this.gruCrearPeriodosSistema = gruCrearPeriodosSistema;
    }

    public Boolean getGruCrearPeriodosProduccion() {
        return gruCrearPeriodosProduccion;
    }

    public void setGruCrearPeriodosProduccion(Boolean gruCrearPeriodosProduccion) {
        this.gruCrearPeriodosProduccion = gruCrearPeriodosProduccion;
    }

    public Boolean getGruModificar() {
        return gruModificar;
    }

    public void setGruModificar(Boolean gruModificar) {
        this.gruModificar = gruModificar;
    }

    public Boolean getGruModificarClientes() {
        return gruModificarClientes;
    }

    public void setGruModificarClientes(Boolean gruModificarClientes) {
        this.gruModificarClientes = gruModificarClientes;
    }

    public Boolean getGruModificarProveedores() {
        return gruModificarProveedores;
    }

    public void setGruModificarProveedores(Boolean gruModificarProveedores) {
        this.gruModificarProveedores = gruModificarProveedores;
    }

    public Boolean getGruModificarProductos() {
        return gruModificarProductos;
    }

    public void setGruModificarProductos(Boolean gruModificarProductos) {
        this.gruModificarProductos = gruModificarProductos;
    }

    public Boolean getGruModificarCuentasContables() {
        return gruModificarCuentasContables;
    }

    public void setGruModificarCuentasContables(Boolean gruModificarCuentasContables) {
        this.gruModificarCuentasContables = gruModificarCuentasContables;
    }

    public Boolean getGruModificarEmpleados() {
        return gruModificarEmpleados;
    }

    public void setGruModificarEmpleados(Boolean gruModificarEmpleados) {
        this.gruModificarEmpleados = gruModificarEmpleados;
    }

    public Boolean getGruModificarCentrosProduccion() {
        return gruModificarCentrosProduccion;
    }

    public void setGruModificarCentrosProduccion(Boolean gruModificarCentrosProduccion) {
        this.gruModificarCentrosProduccion = gruModificarCentrosProduccion;
    }

    public Boolean getGruModificarCentrosCosto() {
        return gruModificarCentrosCosto;
    }

    public void setGruModificarCentrosCosto(Boolean gruModificarCentrosCosto) {
        this.gruModificarCentrosCosto = gruModificarCentrosCosto;
    }

    public Boolean getGruModificarPeriodosSistema() {
        return gruModificarPeriodosSistema;
    }

    public void setGruModificarPeriodosSistema(Boolean gruModificarPeriodosSistema) {
        this.gruModificarPeriodosSistema = gruModificarPeriodosSistema;
    }

    public Boolean getGruModificarPeriodosProduccion() {
        return gruModificarPeriodosProduccion;
    }

    public void setGruModificarPeriodosProduccion(Boolean gruModificarPeriodosProduccion) {
        this.gruModificarPeriodosProduccion = gruModificarPeriodosProduccion;
    }

    public Boolean getGruModificarOcAprobadas() {
        return gruModificarOcAprobadas;
    }

    public void setGruModificarOcAprobadas(Boolean gruModificarOcAprobadas) {
        this.gruModificarOcAprobadas = gruModificarOcAprobadas;
    }

    public Boolean getGruEliminar() {
        return gruEliminar;
    }

    public void setGruEliminar(Boolean gruEliminar) {
        this.gruEliminar = gruEliminar;
    }

    public Boolean getGruEliminarCompras() {
        return gruEliminarCompras;
    }

    public void setGruEliminarCompras(Boolean gruEliminarCompras) {
        this.gruEliminarCompras = gruEliminarCompras;
    }

    public Boolean getGruEliminarVentas() {
        return gruEliminarVentas;
    }

    public void setGruEliminarVentas(Boolean gruEliminarVentas) {
        this.gruEliminarVentas = gruEliminarVentas;
    }

    public Boolean getGruEliminarConsumos() {
        return gruEliminarConsumos;
    }

    public void setGruEliminarConsumos(Boolean gruEliminarConsumos) {
        this.gruEliminarConsumos = gruEliminarConsumos;
    }

    public Boolean getGruEliminarTransferencias() {
        return gruEliminarTransferencias;
    }

    public void setGruEliminarTransferencias(Boolean gruEliminarTransferencias) {
        this.gruEliminarTransferencias = gruEliminarTransferencias;
    }

    public Boolean getGruEliminarContables() {
        return gruEliminarContables;
    }

    public void setGruEliminarContables(Boolean gruEliminarContables) {
        this.gruEliminarContables = gruEliminarContables;
    }

    public Boolean getGruEliminarContablesTalentoHumano() {
        return gruEliminarContablesTalentoHumano;
    }

    public void setGruEliminarContablesTalentoHumano(Boolean gruEliminarContablesTalentoHumano) {
        this.gruEliminarContablesTalentoHumano = gruEliminarContablesTalentoHumano;
    }

    public Boolean getGruEliminarPresupuestos() {
        return gruEliminarPresupuestos;
    }

    public void setGruEliminarPresupuestos(Boolean gruEliminarPresupuestos) {
        this.gruEliminarPresupuestos = gruEliminarPresupuestos;
    }

    public Boolean getGruEliminarPreliquidaciones() {
        return gruEliminarPreliquidaciones;
    }

    public void setGruEliminarPreliquidaciones(Boolean gruEliminarPreliquidaciones) {
        this.gruEliminarPreliquidaciones = gruEliminarPreliquidaciones;
    }

    public Boolean getGruEliminarLiquidaciones() {
        return gruEliminarLiquidaciones;
    }

    public void setGruEliminarLiquidaciones(Boolean gruEliminarLiquidaciones) {
        this.gruEliminarLiquidaciones = gruEliminarLiquidaciones;
    }

    public Boolean getGruEliminarProformas() {
        return gruEliminarProformas;
    }

    public void setGruEliminarProformas(Boolean gruEliminarProformas) {
        this.gruEliminarProformas = gruEliminarProformas;
    }

    public Boolean getGruEliminarContratos() {
        return gruEliminarContratos;
    }

    public void setGruEliminarContratos(Boolean gruEliminarContratos) {
        this.gruEliminarContratos = gruEliminarContratos;
    }

    public Boolean getGruMayorizarCompras() {
        return gruMayorizarCompras;
    }

    public void setGruMayorizarCompras(Boolean gruMayorizarCompras) {
        this.gruMayorizarCompras = gruMayorizarCompras;
    }

    public Boolean getGruMayorizarVentas() {
        return gruMayorizarVentas;
    }

    public void setGruMayorizarVentas(Boolean gruMayorizarVentas) {
        this.gruMayorizarVentas = gruMayorizarVentas;
    }

    public Boolean getGruMayorizarConsumos() {
        return gruMayorizarConsumos;
    }

    public void setGruMayorizarConsumos(Boolean gruMayorizarConsumos) {
        this.gruMayorizarConsumos = gruMayorizarConsumos;
    }

    public Boolean getGruMayorizarTransferencias() {
        return gruMayorizarTransferencias;
    }

    public void setGruMayorizarTransferencias(Boolean gruMayorizarTransferencias) {
        this.gruMayorizarTransferencias = gruMayorizarTransferencias;
    }

    public Boolean getGruMayorizarContables() {
        return gruMayorizarContables;
    }

    public void setGruMayorizarContables(Boolean gruMayorizarContables) {
        this.gruMayorizarContables = gruMayorizarContables;
    }

    public Boolean getGruMayorizarContablesTalentoHumano() {
        return gruMayorizarContablesTalentoHumano;
    }

    public void setGruMayorizarContablesTalentoHumano(Boolean gruMayorizarContablesTalentoHumano) {
        this.gruMayorizarContablesTalentoHumano = gruMayorizarContablesTalentoHumano;
    }

    public Boolean getGruMayorizarPresupuestos() {
        return gruMayorizarPresupuestos;
    }

    public void setGruMayorizarPresupuestos(Boolean gruMayorizarPresupuestos) {
        this.gruMayorizarPresupuestos = gruMayorizarPresupuestos;
    }

    public Boolean getGruMayorizarPreliquidaciones() {
        return gruMayorizarPreliquidaciones;
    }

    public void setGruMayorizarPreliquidaciones(Boolean gruMayorizarPreliquidaciones) {
        this.gruMayorizarPreliquidaciones = gruMayorizarPreliquidaciones;
    }

    public Boolean getGruMayorizarLiquidaciones() {
        return gruMayorizarLiquidaciones;
    }

    public void setGruMayorizarLiquidaciones(Boolean gruMayorizarLiquidaciones) {
        this.gruMayorizarLiquidaciones = gruMayorizarLiquidaciones;
    }

    public Boolean getGruMayorizarProformas() {
        return gruMayorizarProformas;
    }

    public void setGruMayorizarProformas(Boolean gruMayorizarProformas) {
        this.gruMayorizarProformas = gruMayorizarProformas;
    }

    public Boolean getGruDesmayorizarCompras() {
        return gruDesmayorizarCompras;
    }

    public void setGruDesmayorizarCompras(Boolean gruDesmayorizarCompras) {
        this.gruDesmayorizarCompras = gruDesmayorizarCompras;
    }

    public Boolean getGruDesmayorizarVentas() {
        return gruDesmayorizarVentas;
    }

    public void setGruDesmayorizarVentas(Boolean gruDesmayorizarVentas) {
        this.gruDesmayorizarVentas = gruDesmayorizarVentas;
    }

    public Boolean getGruDesmayorizarConsumos() {
        return gruDesmayorizarConsumos;
    }

    public void setGruDesmayorizarConsumos(Boolean gruDesmayorizarConsumos) {
        this.gruDesmayorizarConsumos = gruDesmayorizarConsumos;
    }

    public Boolean getGruDesmayorizarTransferencias() {
        return gruDesmayorizarTransferencias;
    }

    public void setGruDesmayorizarTransferencias(Boolean gruDesmayorizarTransferencias) {
        this.gruDesmayorizarTransferencias = gruDesmayorizarTransferencias;
    }

    public Boolean getGruDesmayorizarContables() {
        return gruDesmayorizarContables;
    }

    public void setGruDesmayorizarContables(Boolean gruDesmayorizarContables) {
        this.gruDesmayorizarContables = gruDesmayorizarContables;
    }

    public Boolean getGruDesmayorizarContablesTalentoHumano() {
        return gruDesmayorizarContablesTalentoHumano;
    }

    public void setGruDesmayorizarContablesTalentoHumano(Boolean gruDesmayorizarContablesTalentoHumano) {
        this.gruDesmayorizarContablesTalentoHumano = gruDesmayorizarContablesTalentoHumano;
    }

    public Boolean getGruDesmayorizarPresupuestos() {
        return gruDesmayorizarPresupuestos;
    }

    public void setGruDesmayorizarPresupuestos(Boolean gruDesmayorizarPresupuestos) {
        this.gruDesmayorizarPresupuestos = gruDesmayorizarPresupuestos;
    }

    public Boolean getGruDesmayorizarPreliquidaciones() {
        return gruDesmayorizarPreliquidaciones;
    }

    public void setGruDesmayorizarPreliquidaciones(Boolean gruDesmayorizarPreliquidaciones) {
        this.gruDesmayorizarPreliquidaciones = gruDesmayorizarPreliquidaciones;
    }

    public Boolean getGruDesmayorizarLiquidaciones() {
        return gruDesmayorizarLiquidaciones;
    }

    public void setGruDesmayorizarLiquidaciones(Boolean gruDesmayorizarLiquidaciones) {
        this.gruDesmayorizarLiquidaciones = gruDesmayorizarLiquidaciones;
    }

    public Boolean getGruDesmayorizarProformas() {
        return gruDesmayorizarProformas;
    }

    public void setGruDesmayorizarProformas(Boolean gruDesmayorizarProformas) {
        this.gruDesmayorizarProformas = gruDesmayorizarProformas;
    }

    public Boolean getGruAnularCompras() {
        return gruAnularCompras;
    }

    public void setGruAnularCompras(Boolean gruAnularCompras) {
        this.gruAnularCompras = gruAnularCompras;
    }

    public Boolean getGruAnularVentas() {
        return gruAnularVentas;
    }

    public void setGruAnularVentas(Boolean gruAnularVentas) {
        this.gruAnularVentas = gruAnularVentas;
    }

    public Boolean getGruAnularConsumos() {
        return gruAnularConsumos;
    }

    public void setGruAnularConsumos(Boolean gruAnularConsumos) {
        this.gruAnularConsumos = gruAnularConsumos;
    }

    public Boolean getGruAnularTransferencias() {
        return gruAnularTransferencias;
    }

    public void setGruAnularTransferencias(Boolean gruAnularTransferencias) {
        this.gruAnularTransferencias = gruAnularTransferencias;
    }

    public Boolean getGruAnularContables() {
        return gruAnularContables;
    }

    public void setGruAnularContables(Boolean gruAnularContables) {
        this.gruAnularContables = gruAnularContables;
    }

    public Boolean getGruAnularContablesTalentoHumano() {
        return gruAnularContablesTalentoHumano;
    }

    public void setGruAnularContablesTalentoHumano(Boolean gruAnularContablesTalentoHumano) {
        this.gruAnularContablesTalentoHumano = gruAnularContablesTalentoHumano;
    }

    public Boolean getGruAnularPresupuestos() {
        return gruAnularPresupuestos;
    }

    public void setGruAnularPresupuestos(Boolean gruAnularPresupuestos) {
        this.gruAnularPresupuestos = gruAnularPresupuestos;
    }

    public Boolean getGruAnularPreliquidaciones() {
        return gruAnularPreliquidaciones;
    }

    public void setGruAnularPreliquidaciones(Boolean gruAnularPreliquidaciones) {
        this.gruAnularPreliquidaciones = gruAnularPreliquidaciones;
    }

    public Boolean getGruAnularLiquidaciones() {
        return gruAnularLiquidaciones;
    }

    public void setGruAnularLiquidaciones(Boolean gruAnularLiquidaciones) {
        this.gruAnularLiquidaciones = gruAnularLiquidaciones;
    }

    public Boolean getGruAnularProformas() {
        return gruAnularProformas;
    }

    public void setGruAnularProformas(Boolean gruAnularProformas) {
        this.gruAnularProformas = gruAnularProformas;
    }

    public Boolean getGruConfigurar() {
        return gruConfigurar;
    }

    public void setGruConfigurar(Boolean gruConfigurar) {
        this.gruConfigurar = gruConfigurar;
    }

    public Boolean getGruImprimir() {
        return gruImprimir;
    }

    public void setGruImprimir(Boolean gruImprimir) {
        this.gruImprimir = gruImprimir;
    }

    public Boolean getGruExportar() {
        return gruExportar;
    }

    public void setGruExportar(Boolean gruExportar) {
        this.gruExportar = gruExportar;
    }

    public String getUsrInsertaGrupo() {
        return usrInsertaGrupo;
    }

    public void setUsrInsertaGrupo(String usrInsertaGrupo) {
        this.usrInsertaGrupo = usrInsertaGrupo;
    }

    public Date getUsrFechaInsertaGrupo() {
        return usrFechaInsertaGrupo;
    }

    public void setUsrFechaInsertaGrupo(Date usrFechaInsertaGrupo) {
        this.usrFechaInsertaGrupo = usrFechaInsertaGrupo;
    }

    public SisEmpresa getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(SisEmpresa empCodigo) {
        this.empCodigo = empCodigo;
    }

    public List<SisUsuarioDetalle> getSisUsuarioDetalleList() {
        return sisUsuarioDetalleList;
    }

    public void setSisUsuarioDetalleList(List<SisUsuarioDetalle> sisUsuarioDetalleList) {
        this.sisUsuarioDetalleList = sisUsuarioDetalleList;
    }

    public Boolean getGruMayorizarPagos() {
        return gruMayorizarPagos;
    }

    public void setGruMayorizarPagos(Boolean gruMayorizarPagos) {
        this.gruMayorizarPagos = gruMayorizarPagos;
    }

    public Boolean getGruMayorizarCobros() {
        return gruMayorizarCobros;
    }

    public void setGruMayorizarCobros(Boolean gruMayorizarCobros) {
        this.gruMayorizarCobros = gruMayorizarCobros;
    }

    public Boolean getGruMayorizarAnticiposClientes() {
        return gruMayorizarAnticiposClientes;
    }

    public void setGruMayorizarAnticiposClientes(Boolean gruMayorizarAnticiposClientes) {
        this.gruMayorizarAnticiposClientes = gruMayorizarAnticiposClientes;
    }

    public Boolean getGruMayorizarAnticiposProveedores() {
        return gruMayorizarAnticiposProveedores;
    }

    public void setGruMayorizarAnticiposProveedores(Boolean gruMayorizarAnticiposProveedores) {
        this.gruMayorizarAnticiposProveedores = gruMayorizarAnticiposProveedores;
    }

    public Boolean getGruDesmayorizarPagos() {
        return gruDesmayorizarPagos;
    }

    public void setGruDesmayorizarPagos(Boolean gruDesmayorizarPagos) {
        this.gruDesmayorizarPagos = gruDesmayorizarPagos;
    }

    public Boolean getGruDesmayorizarCobros() {
        return gruDesmayorizarCobros;
    }

    public void setGruDesmayorizarCobros(Boolean gruDesmayorizarCobros) {
        this.gruDesmayorizarCobros = gruDesmayorizarCobros;
    }

    public Boolean getGruDesmayorizarAnticiposClientes() {
        return gruDesmayorizarAnticiposClientes;
    }

    public void setGruDesmayorizarAnticiposClientes(Boolean gruDesmayorizarAnticiposClientes) {
        this.gruDesmayorizarAnticiposClientes = gruDesmayorizarAnticiposClientes;
    }

    public Boolean getGruDesmayorizarAnticiposProveedores() {
        return gruDesmayorizarAnticiposProveedores;
    }

    public void setGruDesmayorizarAnticiposProveedores(Boolean gruDesmayorizarAnticiposProveedores) {
        this.gruDesmayorizarAnticiposProveedores = gruDesmayorizarAnticiposProveedores;
    }

    public Boolean getGruAnularRetencion() {
        return gruAnularRetencion;
    }

    public void setGruAnularRetencion(Boolean gruAnularRetencion) {
        this.gruAnularRetencion = gruAnularRetencion;
    }

    public Boolean getGruDashboard() {
        return gruDashboard;
    }

    public void setGruDashboard(Boolean gruDashboard) {
        this.gruDashboard = gruDashboard;
    }

    public Boolean getGruAdjuntarImagenes() {
        return gruAdjuntarImagenes;
    }

    public void setGruAdjuntarImagenes(Boolean gruAdjuntarImagenes) {
        this.gruAdjuntarImagenes = gruAdjuntarImagenes;
    }

    public Boolean getGruReutilizarCheque() {
        return gruReutilizarCheque;
    }

    public void setGruReutilizarCheque(Boolean gruReutilizarCheque) {
        this.gruReutilizarCheque = gruReutilizarCheque;
    }

    public Boolean getGruConsultarCompras() {
        return gruConsultarCompras;
    }

    public void setGruConsultarCompras(Boolean gruConsultarCompras) {
        this.gruConsultarCompras = gruConsultarCompras;
    }

    public Boolean getGruConsultarVentas() {
        return gruConsultarVentas;
    }

    public void setGruConsultarVentas(Boolean gruConsultarVentas) {
        this.gruConsultarVentas = gruConsultarVentas;
    }

    public Boolean getGruConsultarConsumos() {
        return gruConsultarConsumos;
    }

    public void setGruConsultarConsumos(Boolean gruConsultarConsumos) {
        this.gruConsultarConsumos = gruConsultarConsumos;
    }

    public Boolean getGruConsultarTransferencias() {
        return gruConsultarTransferencias;
    }

    public void setGruConsultarTransferencias(Boolean gruConsultarTransferencias) {
        this.gruConsultarTransferencias = gruConsultarTransferencias;
    }

    public Boolean getGruConsultarContables() {
        return gruConsultarContables;
    }

    public void setGruConsultarContables(Boolean gruConsultarContables) {
        this.gruConsultarContables = gruConsultarContables;
    }

    public Boolean getGruConsultarContablesTalentoHumano() {
        return gruConsultarContablesTalentoHumano;
    }

    public void setGruConsultarContablesTalentoHumano(Boolean gruConsultarContablesTalentoHumano) {
        this.gruConsultarContablesTalentoHumano = gruConsultarContablesTalentoHumano;
    }

    public Boolean getGruConsultarPresupuestos() {
        return gruConsultarPresupuestos;
    }

    public void setGruConsultarPresupuestos(Boolean gruConsultarPresupuestos) {
        this.gruConsultarPresupuestos = gruConsultarPresupuestos;
    }

    public Boolean getGruConsultarPreliquidaciones() {
        return gruConsultarPreliquidaciones;
    }

    public void setGruConsultarPreliquidaciones(Boolean gruConsultarPreliquidaciones) {
        this.gruConsultarPreliquidaciones = gruConsultarPreliquidaciones;
    }

    public Boolean getGruConsultarLiquidaciones() {
        return gruConsultarLiquidaciones;
    }

    public void setGruConsultarLiquidaciones(Boolean gruConsultarLiquidaciones) {
        this.gruConsultarLiquidaciones = gruConsultarLiquidaciones;
    }

    public Boolean getGruConsultarProformas() {
        return gruConsultarProformas;
    }

    public void setGruConsultarProformas(Boolean gruConsultarProformas) {
        this.gruConsultarProformas = gruConsultarProformas;
    }

    public Boolean getGruConsultarPagos() {
        return gruConsultarPagos;
    }

    public void setGruConsultarPagos(Boolean gruConsultarPagos) {
        this.gruConsultarPagos = gruConsultarPagos;
    }

    public Boolean getGruConsultarCobros() {
        return gruConsultarCobros;
    }

    public void setGruConsultarCobros(Boolean gruConsultarCobros) {
        this.gruConsultarCobros = gruConsultarCobros;
    }

    public Boolean getGruConsultarAnticiposClientes() {
        return gruConsultarAnticiposClientes;
    }

    public void setGruConsultarAnticiposClientes(Boolean gruConsultarAnticiposClientes) {
        this.gruConsultarAnticiposClientes = gruConsultarAnticiposClientes;
    }

    public Boolean getGruConsultarAnticiposProveedores() {
        return gruConsultarAnticiposProveedores;
    }

    public void setGruConsultarAnticiposProveedores(Boolean gruConsultarAnticiposProveedores) {
        this.gruConsultarAnticiposProveedores = gruConsultarAnticiposProveedores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sisGrupoPK != null ? sisGrupoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SisGrupo)) {
            return false;
        }
        SisGrupo other = (SisGrupo) object;
        if ((this.sisGrupoPK == null && other.sisGrupoPK != null)
                || (this.sisGrupoPK != null && !this.sisGrupoPK.equals(other.sisGrupoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistemaWeb.entity.SisGrupo[ sisGrupoPK=" + sisGrupoPK + " ]";
    }

}
