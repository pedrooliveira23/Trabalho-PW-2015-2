package classe.core;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InstituicaoDao {
	private EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("instituicoes-persistence-unit");
	private EntityManager em = emf.createEntityManager();

	public void adicionar(Instituicao instituicao) {
		try {
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
		em.remove(em.contains(instituicao) ? instituicao : em.merge(instituicao));
		em.getTransaction().commit();
	}

	public void editar(Instituicao instituicao, Instituicao instituicaoAnterior) {
		remover(instituicaoAnterior);
		adicionar(instituicao);
	}

	public List<Instituicao> pesquisar(String dadoCadastral) {
		List<Instituicao> result = new ArrayList<Instituicao>();
		try {
			String jpql = "from Instituicao where cnpj like '%" + dadoCadastral
					+ "%' or nome like '%" + dadoCadastral + "%' or nivelCurso like '%"
					+ dadoCadastral + "%' or endereco like '%" + dadoCadastral
					+ "%' or telefone like '%" + dadoCadastral + "%' or email like '%"
					+ dadoCadastral + "%' or nomeResponsavel like '%" + dadoCadastral
					+ "%' or telefoneResponsavel like '%" + dadoCadastral
					+ "%' or emailResponsavel like '%" + dadoCadastral + "%'";
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
