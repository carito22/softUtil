package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdUtilidadDiariaCorridaTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "u_tipo")
	private String uTipo;
	@Column(name = "u_descripcion")
	private String uDescripcion;
	@Column(name = "u_valor_numerico")
	private BigDecimal uValorNumerico;
        @Column(name = "u_valor_texto")
	private String uValorTexto;
        
	public PrdUtilidadDiariaCorridaTO() {
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuTipo() {
        return uTipo;
    }

    public void setuTipo(String uTipo) {
        this.uTipo = uTipo;
    }

    public String getuDescripcion() {
        return uDescripcion;
    }

    public void setuDescripcion(String uDescripcion) {
        this.uDescripcion = uDescripcion;
    }

    public BigDecimal getuValorNumerico() {
        return uValorNumerico;
    }

    public void setuValorNumerico(BigDecimal uValorNumerico) {
        this.uValorNumerico = uValorNumerico;
    }

    public String getuValorTexto() {
        return uValorTexto;
    }

    public void setuValorTexto(String uValorTexto) {
        this.uValorTexto = uValorTexto;
    }

	
}
