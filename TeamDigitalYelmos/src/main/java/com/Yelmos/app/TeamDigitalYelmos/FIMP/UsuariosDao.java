package com.Yelmos.app.TeamDigitalYelmos.FIMP;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Yelmos.app.TeamDigitalYelmos.F.IUsuario;
import com.Yelmos.app.TeamDigitalYelmos.M.Usuario;
import com.Yelmos.app.TeamDigitalYelmos.R.UsuarioR;

@Service
public class UsuariosDao implements IUsuario{
	
	@Autowired
	private UsuarioR usuarioReport;

	@Override
	public List<Usuario> findALll() {
		return usuarioReport.findAll();
	}

	@Override
	public Usuario create (Usuario user) {
		return usuarioReport.save(user);
	}

	@Override
	public Usuario update(Usuario user) {
		return usuarioReport.save(user);
	}

	@Override
	public void delete(Long idU) {
		usuarioReport.deleteById(idU);
	}

	@Override
	public Usuario search(Long idU) {
		// TODO Auto-generated method stub
		return usuarioReport.findById(idU).get();
	}

	@Override
	public Usuario save(Usuario user) {
		// TODO Auto-generated method stub
		return usuarioReport.save(user);
	}
}
