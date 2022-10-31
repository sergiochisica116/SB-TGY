package com.Yelmos.app.TeamDigitalYelmos.F;

import java.util.List;

import com.Yelmos.app.TeamDigitalYelmos.M.Reserva;

public interface IReserva {
	
	public List<Reserva> findALll();
	public void create(Reserva res);
	public void update(Reserva res);
	public void delete(Reserva res);

}
