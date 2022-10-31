package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "eventos")
@Getter
@Setter
public class Evento implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvento")
	private long idEve;
	
	@Column(name = "nombreE", length = 50)
	private String nombreEve;
	
	@Column(name = "descripcion", length = 80)
	private String descripcionEve;
	
	@Column(name = "cantidadImplementos")
	private int cantidadImplementosEve;
	
	@Column(name = "implementosAdicionales", length = 20)
	private String nombreProA;
	
	@Column(name = "cantidadImplementosAdicional")
	private int cantidadImpleA;
	
	@OneToOne
    @JoinColumn(name="fk_tipoEvento")
    private TipoEvento idTpEvento;
	
	@OneToOne
    @JoinColumn(name="fk_reservaEve")
    private Reserva idReservaEve;
	
	@OneToMany(mappedBy = "fk_evento")
	private List <Contrato> ListContrato;
	
	public Long getIdEvento() {
		return idEve;
	}
}
