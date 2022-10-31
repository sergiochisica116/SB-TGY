package com.Yelmos.app.TeamDigitalYelmos.FIMP;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Yelmos.app.TeamDigitalYelmos.F.IEvento;
import com.Yelmos.app.TeamDigitalYelmos.M.Evento;
import com.Yelmos.app.TeamDigitalYelmos.R.EventoR;

@Service
public class EventoDao implements IEvento{

	@Autowired
	private EventoR eventoRepor;
	
	@Override
	public List<Evento> findALll() {
		return this.eventoRepor.findAll();
	}

	@Override
	public void create(Evento eve) {
		this.eventoRepor.save(eve);
	}

	@Override
	public void update(Evento eve) {
		this.eventoRepor.save(eve);
	}

	@Override
	public void delete(Evento eve) {
		Evento even=this.eventoRepor.getById(eve.getIdEvento());
		this.eventoRepor.delete(even);
	}
}
