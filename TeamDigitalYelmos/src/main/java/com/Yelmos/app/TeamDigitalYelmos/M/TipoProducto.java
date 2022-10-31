package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tipoproductos")
public class TipoProducto implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProducto")
	private int idTpPro;
	
	@Column(name = "nombreTipoContrato", length = 30)
	private String tpContrato;

}