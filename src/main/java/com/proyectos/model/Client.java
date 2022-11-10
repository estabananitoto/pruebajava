package com.proyectos.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="Cliente")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
    private int Num_doc;
    
    @Column(name="Nombre", length = 40)
    private String nome;
    
    @Column(name="Apellido", length = 40)
    private String apel;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Fecha;
    
    @Column(name="Ciudad", length = 40)
    private String ciud;
    
    @Column(name="Mail", length = 40)
    private String mail;

    @Column(name="Telefono", length = 40)
    private long tele;
    
    @Column(name="Ocupacion", length = 40)
    private String ocup;
    
    @Column(name="Estado", length = 40)
    private String esta;

	public int getNum_doc() {
		return Num_doc;
	}

	public void setNum_doc(int num_doc) {
		Num_doc = num_doc;
	}

	public String getNom() {
		return nome;
	}

	public void setNom(String nom) {
		this.nome = nom;
	}

	public String getApe() {
		return apel;
	}

	public void setApe(String ape) {
		this.apel = ape;
	}

	public String getCiu() {
		return ciud;
	}

	public void setCiu(String ciu) {
		this.ciud = ciu;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getTel() {
		return tele;
	}

	public void setTel(long tel) {
		this.tele = tel;
	}

	public String getOcu() {
		return ocup;
	}

	public void setOcu(String ocu) {
		this.ocup = ocu;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getEst() {
		return esta;
	}

	public void setEst(String est) {
		this.esta = est;
	}

}
