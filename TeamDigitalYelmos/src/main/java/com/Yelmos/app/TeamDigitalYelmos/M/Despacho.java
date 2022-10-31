package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "Despachos")
@Getter
@Setter
public class Despacho implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDespacho")
	private long idDesp;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaSalida")
	private Date fechaSalida;
	
	@Column(name = "cantidadSalida")
	private int canSalida;
	
	@Column(name = "estadoDespacho", length = 3)
	private String estadoDesp;
	
	@OneToOne
    @JoinColumn(name="fk_productoDesp")
    private Producto idProDesp;
	
	@ManyToMany
	@JoinTable(name="despachoProductos",
			joinColumns = @JoinColumn(name="fk_productoInventario", nullable=false),
			inverseJoinColumns=@JoinColumn(name="fk_despacho",nullable=false))
	private List <Producto> ListProducto;
	
	@ManyToOne
    @JoinColumn(name="fk_packing", referencedColumnName = "idPacking")
    private Packing fk_packing;

	public Long getIdDespacho() {
		return idDesp;
	}
}
