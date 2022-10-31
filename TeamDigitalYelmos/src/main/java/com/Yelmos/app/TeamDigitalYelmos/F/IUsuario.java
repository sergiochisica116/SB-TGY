package com.Yelmos.app.TeamDigitalYelmos.F;

import java.util.List;
import com.Yelmos.app.TeamDigitalYelmos.M.Usuario;

public interface IUsuario {
	
	public List<Usuario> findALll();
	public Usuario create(Usuario user);
	public Usuario search(Long idU);
	public Usuario update(Usuario user);
	public Usuario save(Usuario user);
	public void delete(Long idU);


}