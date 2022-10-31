package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Categorias")
public class Categoria implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategoria")
	private int idCategoria;
	
	@Column(name = "nombreCategoria", length = 30)
	private String nomCategoria;
	
}
