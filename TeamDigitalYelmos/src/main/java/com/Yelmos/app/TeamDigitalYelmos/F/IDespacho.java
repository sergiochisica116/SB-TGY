package com.Yelmos.app.TeamDigitalYelmos.F;

import java.util.List;
import com.Yelmos.app.TeamDigitalYelmos.M.Despacho;

public interface IDespacho {
	
	public List<Despacho> findALll();
	public void create(Despacho des);
	public void update(Despacho des);
	public void delete(Despacho des);

}
