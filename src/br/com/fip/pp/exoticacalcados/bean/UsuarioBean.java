package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.fip.pp.exoticacalcados.business.UsuarioBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Usuario;

/**
 * Classe responsavel pela conexão entre a as classes que contém os metodos do
 * usuario e as telas de vizualição
 * 
 * @author LuizNeto
 *
 */
@SessionScoped
@ManagedBean
public class UsuarioBean implements Serializable {

	private UsuarioBusiness usuarioBusiness;
	private Usuario usuario;
	private Usuario usuarioLogado;
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();

	public UsuarioBean() {
		usuarioBusiness = new UsuarioBusiness();
		usuario = new Usuario();	

	}
	
	/**
	 * @param metodo responsavel por salvar um usuario
	 */

	public void salvar() {
		usuarioBusiness.salvar(usuario);
		usuario = new Usuario();
		
		
		
	}
/**
 * 
 * @return meto responsável por verificar  e retorna o nivel de acesso de um usuario
 */
	public String autentificar() {
		
		usuarioLogado = null;
		this.listaUsuarios = usuarioBusiness.listar();
		for (Usuario usuario2 : listaUsuarios) {
			if ((usuario2.getLogin().equals((usuario.getLogin())))
					&& ((usuario2.getSenha().equals(usuario.getSenha())))) {
				usuarioLogado = usuario2;
				return "principalAdministrador";
			}
		}

		return "login";
	}
/**
 * 
 * @return metodo responsavel por retirna um usuario do tipo Usuario
 */
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

/**
 * 
 * @return metodo que retorna uma lista de Usuarios
 */
	public List<Usuario> getListaUsuarios() {
		this.listaUsuarios = usuarioBusiness.listar();
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
