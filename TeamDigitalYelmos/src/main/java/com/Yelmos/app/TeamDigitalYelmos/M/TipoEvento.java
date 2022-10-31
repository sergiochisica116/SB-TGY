package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tiposeventos")
public class TipoEvento implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoEvento")
	private int idTpEve;
	
	@Column(name = "nombreTipoE", length = 50)
	private String nombreTpEve;
	
	@Column(name = "implementos" , length = 50)
	private String impleEve;

}
