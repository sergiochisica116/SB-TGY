package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "proveedores")
@Getter
@Setter
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProveedor")
	private long idProv;
	
	@Column(name = "nombreProveedor", length = 50)
	private String nomProv;
	
	@Column(name = "emailP", length = 70)
	private String emailProv;
	
	@Column(name = "telefonoP")
	private Long telProv;

	@OneToOne
    @JoinColumn(name="fk_tpProveedor")
    private TipoProveedor idTpProv;
	
	public Long getIdProveedor() {
		return idProv;
	}
}
