package classe.core;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InstituicaoDao {
	private EntityManager em = null;
	private EntityManagerFactory emf = null;

	public void adicionar(Instituicao instituicao) {
		try {
			// Obter uma fábrica de conexões com o banco de dados.
			emf = Persistence
					.createEntityManagerFactory("instituicoes-persistence-unit");

			// Obter conexão com o banco de dados.
			em = emf.createEntityManager();

			em.getTransaction().begin();

			em.persist(instituicao);

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em != null) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

	public void remover(Instituicao instituicao) {
		em.getTransaction().begin();
		em.remove(instituicao);
		em.getTransaction().commit();
	}

	public void editar(Instituicao instituicao, Instituicao instituicaoAnterior) {
		remover(instituicaoAnterior);
		adicionar(instituicao);
	}

	public List<Instituicao> pesquisar(String dadoCadastral) {
		List<Instituicao> result = new ArrayList<Instituicao>();
		try {
			String jpql = "from Instituicao where cnpj = '" + dadoCadastral
					+ "' or nome = '" + dadoCadastral + "' or nivelCurso ='"
					+ dadoCadastral + "' or endereco='" + dadoCadastral
					+ "' or telefone='" + dadoCadastral + "' or email='"
					+ dadoCadastral + "' or nomeResponsavel='" + dadoCadastral
					+ "' or telefoneResponsavel='" + dadoCadastral
					+ "' or emailResponsavel='" + dadoCadastral + "'";
			result = JpaUtil.getEntityManager()
					.createQuery(jpql, Instituicao.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JpaUtil.closeEntityManager();
		}
		return result;
	}

	public List<Instituicao> listar() {
		List<Instituicao> result = new ArrayList<Instituicao>();
		try {
			String jpql = "from Instituicao";
			result = JpaUtil.getEntityManager()
					.createQuery(jpql, Instituicao.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JpaUtil.closeEntityManager();
		}
		return result;
	}
}
