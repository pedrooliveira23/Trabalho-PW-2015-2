package classe.core;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

	public List<Usuario> listar() {
		List<Usuario> result = new ArrayList<Usuario>();
		try {
			String jpql = "from Usuario";
			result = JpaUtil.getEntityManager()
					.createQuery(jpql, Usuario.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JpaUtil.closeEntityManager();
		}
		return result;
	}
}
