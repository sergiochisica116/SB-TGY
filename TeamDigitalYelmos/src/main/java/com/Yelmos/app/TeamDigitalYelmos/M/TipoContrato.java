package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tiposcontratos")
public class TipoContrato implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoContrato")
	private int idTpContr;
	
	@Column(name = "nombreTipoContrato", length = 30)
	private String tpContr;

}

