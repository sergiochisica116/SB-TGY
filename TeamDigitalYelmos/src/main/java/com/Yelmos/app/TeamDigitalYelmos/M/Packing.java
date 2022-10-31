package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="Packing")

public class Packing implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPacking")
	private int idPack;
	
	@Column(name = "cantidadEntrada")
	private int canPack;
	
	@Column(name = "observaciones", length =80)
	private String observaciones;
	
	@OneToOne
    @JoinColumn(name="fk_reservaP")
    private Reserva idRes;
	
	@OneToMany (mappedBy = "fk_packing")
	private List <Despacho> ListDespacho;

}
