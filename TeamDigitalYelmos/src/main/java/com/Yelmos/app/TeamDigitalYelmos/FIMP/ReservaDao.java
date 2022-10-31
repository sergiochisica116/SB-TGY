package com.Yelmos.app.TeamDigitalYelmos.FIMP;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Yelmos.app.TeamDigitalYelmos.F.IReserva;
import com.Yelmos.app.TeamDigitalYelmos.M.Reserva;
import com.Yelmos.app.TeamDigitalYelmos.R.ReservaR;

@Service
public class ReservaDao implements IReserva{
	
	@Autowired
	private ReservaR reservaReport;

	@Override
	public List<Reserva> findALll() {
		return this.reservaReport.findAll();
	}

	@Override
	public void create(Reserva res) {
		this.reservaReport.save(res);
	}

	@Override
	public void update(Reserva res) {
		this.reservaReport.save(res);
	}

	@Override
	public void delete(Reserva res) {
		Reserva reserv=this.reservaReport.getById(res.getIdReserva());
		this.reservaReport.delete(reserv);
	}
}
