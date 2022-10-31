package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private int idProd;
	
	@Column(name = "nombreProducto", length = 50)
	private String nomProd;

	@OneToOne
    @JoinColumn(name="fk_categoria")
    private Categoria idCategoria;
	
	@OneToOne
    @JoinColumn(name="fk_tipoProducto")
    private TipoProducto idTpProd;
	
	@ManyToMany(mappedBy = "ListProducto")
	private List<Despacho> ListDespacho;
	
	@ManyToOne
	@JoinColumn(name = "fk_inventario", referencedColumnName = "idInventario")
	private Inventario fk_inventario;

}