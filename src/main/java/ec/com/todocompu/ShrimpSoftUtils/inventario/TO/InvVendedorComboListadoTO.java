package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvVendedorComboListadoTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String vendEmpresa;
	private String vendCodigo;
	private String vendNombre;
        private Boolean vendInactivo;
        private String usrCodigo;

	public InvVendedorComboListadoTO() {
	}

	public InvVendedorComboListadoTO(String vendEmpresa, String vendCodigo, String vendNombre, Boolean vendInactivo, String usrCodigo) {
		this.vendEmpresa = vendEmpresa;
		this.vendCodigo = vendCodigo;
		this.vendNombre = vendNombre;
                this.vendInactivo = vendInactivo;
                this.usrCodigo = usrCodigo;
	}

	@Column(name = "vend_empresa")
	public String getVendEmpresa() {
		return vendEmpresa;
	}

	public void setVendEmpresa(String vendEmpresa) {
		this.vendEmpresa = vendEmpresa;
	}

	@Id
	@Column(name = "vend_codigo")
	public String getVendCodigo() {
		return vendCodigo;
	}

	public void setVendCodigo(String vendCodigo) {
		this.vendCodigo = vendCodigo;
	}

	@Column(name = "vend_nombre")
	public String getVendNombre() {
		return vendNombre;
	}

	public void setVendNombre(String vendNombre) {
		this.vendNombre = vendNombre;
	}
        
        @Column(name = "vend_inactivo")
        public Boolean getVendInactivo() {
            return vendInactivo;
        }

        public void setVendInactivo(Boolean vendInactivo) {
            this.vendInactivo = vendInactivo;
        }
        
        @Column(name = "usr_codigo")
        public String getUsrCodigo() {
            return usrCodigo;
        }

        public void setUsrCodigo(String usrCodigo) {
            this.usrCodigo = usrCodigo;
        }
        
	@Override
	public String toString() {
		return this.vendNombre;
	}

}
