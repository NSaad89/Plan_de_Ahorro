package ar.com.patrones_de_diseno.dao;

import ar.com.patrones_de_diseno.domain.Usuario;

public interface UsuarioDao {
	
	public Usuario crearUsuario (Usuario usuarioACrear) throws Exception;

}
