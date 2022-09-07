package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sis_notificaciones", schema = "sistemaweb")
public class SisNotificacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "SIS_NOTIFICACIONES_MAIL_ID_GENERATOR", sequenceName = "SISTEMAWEB.SIS_NOTIFICACIONES_MAIL_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIS_NOTIFICACIONES_MAIL_ID_GENERATOR")
	@Column(name = "mail_id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "mail_emisor", nullable = false)
	private String mailEmisor;
	@Column(name = "mail_password_emisor", nullable = false)
	private String mailPasswordEmisor;
	@Column(name = "mail_receptor", nullable = false)
	private String mailReceptor;

    public SisNotificacion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMailEmisor() {
        return mailEmisor;
    }

    public void setMailEmisor(String mailEmisor) {
        this.mailEmisor = mailEmisor;
    }

    public String getMailPasswordEmisor() {
        return mailPasswordEmisor;
    }

    public void setMailPasswordEmisor(String mailPasswordEmisor) {
        this.mailPasswordEmisor = mailPasswordEmisor;
    }

    public String getMailReceptor() {
        return mailReceptor;
    }

    public void setMailReceptor(String mailReceptor) {
        this.mailReceptor = mailReceptor;
    }


}
