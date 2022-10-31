package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "inventarios")

public class Inventario implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idInventario")
	private int idInv;
	
	@Column(name = "cantidad")
	private int canInv;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaIngreso")
	private Date fechaIng;
	
	@OneToMany(mappedBy="fk_inventario")
    private List <Producto> ListProducto;

}