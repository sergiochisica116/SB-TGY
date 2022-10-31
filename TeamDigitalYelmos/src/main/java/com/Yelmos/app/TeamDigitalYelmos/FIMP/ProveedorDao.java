package com.Yelmos.app.TeamDigitalYelmos.FIMP;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Yelmos.app.TeamDigitalYelmos.F.IProveedor;
import com.Yelmos.app.TeamDigitalYelmos.M.Proveedor;
import com.Yelmos.app.TeamDigitalYelmos.R.ProveedorR;

@Service
public class ProveedorDao implements IProveedor{

	@Autowired
	private ProveedorR proveedorReport;
	
	@Override
	public List<Proveedor> findALll() {
		return this.proveedorReport.findAll();
	}

	@Override
	public void create(Proveedor prov) {
		this.proveedorReport.save(prov);
		
	}

	@Override
	public void update(Proveedor prov) {
		this.proveedorReport.save(prov);
		
	}

	@Override
	public void delete(Proveedor prov) {
		Proveedor provee=this.proveedorReport.getById(prov.getIdProveedor());
		this.proveedorReport.delete(provee);
		
	}
}
