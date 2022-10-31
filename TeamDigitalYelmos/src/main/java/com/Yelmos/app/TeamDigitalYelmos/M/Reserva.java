package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservas")
@Getter
@Setter

public class Reserva implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idReseva")
	private long idReserva;
	
	@Column(name = "direccionR", length =60)
	private String direRes;
	
	@Column(name = "emailR", length =70)
	private String emailRes;
	
	@Column(name = "telefonoR")
	private Long telR;
	
	@Column(name = "localidadR", length =50)
	private String localR;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicioR")
	private Date inicioR;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FinR")
	private Date finR;

	@ManyToOne
    @JoinColumn(name="fk_usuario", referencedColumnName = "idUsuario")
    private Usuario fk_usuario;
	
	public Long getIdReserva() {
		return idReserva;
	}
}
