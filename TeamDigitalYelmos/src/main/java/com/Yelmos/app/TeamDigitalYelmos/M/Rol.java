package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "roles")

public class Rol implements Serializable{
	
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rol;
	
	@Column(name="nombreRol", length =30)
	private String nomRol;
	
}
