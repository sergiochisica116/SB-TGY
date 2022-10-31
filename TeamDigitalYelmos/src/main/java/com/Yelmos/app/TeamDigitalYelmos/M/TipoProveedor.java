package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tiposproveedores")
public class TipoProveedor implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProveedor")
	private int idTpProv;
	
	@Column(name = "nombreTipoProveedor" , length =60)
	private String nomTpProv;
	
	@Column(name = "implemento" , length = 50)
	private String impleProv;

	//****//
	
	public int getIdTpProv() {
		return idTpProv;
	}

	public void setIdTpProv(int idTpProv) {
		this.idTpProv = idTpProv;
	}

	public String getNomTpProv() {
		return nomTpProv;
	}

	public void setNomTpProv(String nomTpProv) {
		this.nomTpProv = nomTpProv;
	}

	public String getImpleProv() {
		return impleProv;
	}

	public void setImpleProv(String impleProv) {
		this.impleProv = impleProv;
	}
}

