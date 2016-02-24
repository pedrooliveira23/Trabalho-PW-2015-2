package classe.core;

public class UsuarioBo {
	private UsuarioDao dao = new UsuarioDao();

	public boolean validar(Usuario usuario) {
		if(usuario.equals(dao.buscar(usuario))) {
			return true;
		}
		return false;
	}

}
