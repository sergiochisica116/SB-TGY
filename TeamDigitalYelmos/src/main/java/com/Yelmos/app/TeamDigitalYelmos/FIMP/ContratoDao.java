package com.Yelmos.app.TeamDigitalYelmos.FIMP;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Yelmos.app.TeamDigitalYelmos.F.IContrato;
import com.Yelmos.app.TeamDigitalYelmos.M.Contrato;
import com.Yelmos.app.TeamDigitalYelmos.R.ContratoR;

@Service
public class ContratoDao implements IContrato{
	
	@Autowired
	private ContratoR contratoRepor;

	@Override
	public List<Contrato> findALll() {
		return this.contratoRepor.findAll();
	}

	@Override
	public void create(Contrato cont) {
		this.contratoRepor.save(cont);
		
	}

	@Override
	public void update(Contrato cont) {
		this.contratoRepor.save(cont);
		
	}

	@Override
	public void delete(Contrato cont) {
		Contrato contra=this.contratoRepor.getById(cont.getIdContrato());
		this.contratoRepor.delete(contra);
	}
}
