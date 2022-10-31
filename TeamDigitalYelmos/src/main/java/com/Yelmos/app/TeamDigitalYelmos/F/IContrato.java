package com.Yelmos.app.TeamDigitalYelmos.F;

import java.util.List;
import com.Yelmos.app.TeamDigitalYelmos.M.Contrato;

public interface IContrato {

	public List<Contrato> findALll();
	public void create(Contrato cont);
	public void update(Contrato cont);
	public void delete(Contrato cont);
}
