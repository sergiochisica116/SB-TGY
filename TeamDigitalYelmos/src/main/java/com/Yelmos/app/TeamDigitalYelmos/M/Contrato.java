package com.Yelmos.app.TeamDigitalYelmos.M;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Contratos")
@Getter
@Setter
public class Contrato implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContrato")
	private long idCon;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicioContrato")
	private Date inicioCon;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaFinContrato")
	private Date finCon;
	
	@Column(name = "detalles", length = 80)
	private String detallesCon;
	
	@OneToOne
    @JoinColumn(name="fk_tpContrato")
    private TipoContrato idTpContra;
	
	@ManyToOne
    @JoinColumn(name="fk_evento", referencedColumnName = "idEvento")
    private Evento fk_evento;
	
	@ManyToOne
	@JoinColumn(name = "fk_Proveedor", referencedColumnName = "idProveedor")
	private Proveedor fk_Proveedor;

	public Long getIdContrato() {
		return idCon;
	}
}

