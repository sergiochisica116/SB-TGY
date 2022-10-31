package com.Yelmos.app.TeamDigitalYelmos.FIMP;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Yelmos.app.TeamDigitalYelmos.F.IDespacho;
import com.Yelmos.app.TeamDigitalYelmos.M.Despacho;
import com.Yelmos.app.TeamDigitalYelmos.R.DespachoR;

@Service
public class DespachoDao implements IDespacho{
	
	@Autowired
	private DespachoR despachoRepor;

	@Override
	public List<Despacho> findALll() {
		return this.despachoRepor.findAll();
	}

	@Override
	public void create(Despacho des) {
		this.despachoRepor.save(des);
		
	}

	@Override
	public void update(Despacho des) {
		this.despachoRepor.save(des);
		
	}

	@Override
	public void delete(Despacho des) {
		Despacho despa=this.despachoRepor.getById(des.getIdDespacho());
		this.despachoRepor.delete(despa);
	}
}
