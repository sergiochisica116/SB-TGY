package com.Yelmos.app.TeamDigitalYelmos.F;

import java.util.List;
import com.Yelmos.app.TeamDigitalYelmos.M.Proveedor;

public interface IProveedor {

	public List<Proveedor> findALll();
	public void create(Proveedor prov);
	public void update(Proveedor prov);
	public void delete(Proveedor prov);
}
