package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter

public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private long idU;
	
	@Column(name = "nombre", length =50)
	private String nomU;
	
	@Column(name = "apellido", length =50)
	private String apeU;
	
	@Column(name = "email", length =80)
	private String emailU;
	
	@Column(name = "documento", length =30)
	private String docuU;
	
	@Column(name = "estado", length =20)
	private String estadoU;
	
	@Column(name = "contrasena", length =50)
	private String contraU;

	@OneToOne
    @JoinColumn(name="rol")
    private Rol rol;
	
	@OneToMany(mappedBy = "fk_usuario")
	private List<Reserva> ListReserva;
	
	//**********************************************//
	
	public Usuario(){
	}
	
	public Usuario(String nomU, String apeU, String emailU, String docuU, String estadoU, String contraU,
			List<Reserva> listReserva) {
		super();
		this.nomU = nomU;
		this.apeU = apeU;
		this.emailU = emailU;
		this.docuU = docuU;
		this.estadoU = estadoU;
		this.contraU = contraU;
		ListReserva = listReserva;
	}



	//*************************************//

	public long getIdU() {
		return idU;
	}

	public void setIdU(long idU) {
		this.idU = idU;
	}

	public String getNomU() {
		return nomU;
	}

	public void setNomU(String nomU) {
		this.nomU = nomU;
	}

	public String getApeU() {
		return apeU;
	}

	public void setApeU(String apeU) {
		this.apeU = apeU;
	}

	public String getEmailU() {
		return emailU;
	}

	public void setEmailU(String emailU) {
		this.emailU = emailU;
	}

	public String getDocuU() {
		return docuU;
	}

	public void setDocuU(String docuU) {
		this.docuU = docuU;
	}

	public String getEstadoU() {
		return estadoU;
	}

	public void setEstadoU(String estadoU) {
		this.estadoU = estadoU;
	}

	public String getContraU() {
		return contraU;
	}

	public void setContraU(String contraU) {
		this.contraU = contraU;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Reserva> getListReserva() {
		return ListReserva;
	}

	public void setListReserva(List<Reserva> listReserva) {
		ListReserva = listReserva;
	}
	
	//********************************//
	
	/*@Override
	public String toString(){
	return "Usuario [id=" + idU + ", nombre=" + nomU + ", apellido=" + apeU + ", email="
	+ emailU + ",documento" + docuU + ", estado=" + estadoU + ", contraseña=" + contraU + "]";
	
	}*/
	}


	
	
	

