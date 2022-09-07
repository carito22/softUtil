package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvClienteContratosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "cli_id")
    private String cliId;

    @Column(name = "cli_razon_social")
    private String cliRazonSocial;

    @Column(name = "cli_categoria")
    private String cliCategoria;

    @Column(name = "cli_ip")
    private String cliIp;

    @Column(name = "cli_contratos")
    private Integer cliContratos;

    @Column(name = "cli_detalles_venta")
    private Integer cliDetallesVenta;
    
    @Column(name = "cli_inactivo")
    private Boolean cliInactivo;

    public InvClienteContratosTO() {
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }

    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliCategoria() {
        return cliCategoria;
    }

    public void setCliCategoria(String cliCategoria) {
        this.cliCategoria = cliCategoria;
    }

    public String getCliIp() {
        return cliIp;
    }

    public void setCliIp(String cliIp) {
        this.cliIp = cliIp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCliContratos() {
        return cliContratos;
    }

    public void setCliContratos(Integer cliContratos) {
        this.cliContratos = cliContratos;
    }

    public Integer getCliDetallesVenta() {
        return cliDetallesVenta;
    }

    public void setCliDetallesVenta(Integer cliDetallesVenta) {
        this.cliDetallesVenta = cliDetallesVenta;
    }

    public Boolean getCliInactivo() {
        return cliInactivo;
    }

    public void setCliInactivo(Boolean cliInactivo) {
        this.cliInactivo = cliInactivo;
    }

}
