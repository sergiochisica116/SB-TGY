
package com.Yelmos.app.TeamDigitalYelmos.C;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Yelmos.app.TeamDigitalYelmos.FIMP.UsuariosDao;
import com.Yelmos.app.TeamDigitalYelmos.M.Usuario;


@Controller
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private UsuariosDao usuarioDao;
	
	@GetMapping("/usuarios")
	public String findALll(Model modelo) {
		modelo.addAttribute("usuarios", usuarioDao.findALll());
		return "usuarios";		
	}
	
	@GetMapping("/usuarios/crear")
	public String create(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuarios", usuario);
		return "crear_usuario";
	}
	
	@PostMapping("/usuarios")
	public String save(@ModelAttribute("usuarios")Usuario usuario) {
		usuarioDao.save(usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/usuarios/editar/{idU}")
	public String editUsu(@PathVariable Long idU, Model modelo) {
		modelo.addAttribute("usuario", usuarioDao.search(idU));
		return "editar_usuarios";
	}

	@PostMapping("/usuarios/{idU}")
	public String update(@PathVariable Long idU, @ModelAttribute("usuario") Usuario usuario, Model modelo) {
		Usuario usuarioExis = usuarioDao.search(idU);
		usuarioExis.setIdU(idU);
		usuarioExis.setNomU(usuario.getNomU());
		usuarioExis.setApeU(usuario.getApeU());
		usuarioExis.setEmailU(usuario.getEmailU());
		usuarioExis.setDocuU(usuario.getDocuU());
		usuarioExis.setEstadoU(usuario.getEstadoU());
		usuarioExis.setContraU(usuario.getContraU());
		//usuarioExis.setRol(usuario.getRol());
		usuarioDao.update(usuarioExis);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/usuarios/{idU}")
	public String delete (@PathVariable Long idU) {
		usuarioDao.delete(idU);
		return "redirect:/usuarios";
	}
}
