package com.Yelmos.app.TeamDigitalYelmos.F;

import java.util.List;
import com.Yelmos.app.TeamDigitalYelmos.M.Evento;

public interface IEvento {

	public List<Evento> findALll();
	public void create(Evento eve);
	public void update(Evento eve);
	public void delete(Evento eve);
}
