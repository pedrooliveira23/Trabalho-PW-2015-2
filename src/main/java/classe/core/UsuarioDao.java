package classe.core;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

	public List<Usuario> listar() {
		List<Usuario> result = new ArrayList<Usuario>();
		try {
			String jpql = "from Login";
			result = JpaUtil.getEntityManager()
					.createQuery(jpql, Usuario.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JpaUtil.closeEntityManager();
		}
		return result;
	}

	public Usuario buscar(Usuario usuario) {
		Usuario result = new Usuario();
		try {
			String jpql = "from Login where nomeUsuario = '"
					+ usuario.getNomeUsuario() + "' and senha='"
					+ usuario.getSenha() + "'";
			result = JpaUtil.getEntityManager()
					.createQuery(jpql, Usuario.class).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JpaUtil.closeEntityManager();
		}
		return result;
	}
}
