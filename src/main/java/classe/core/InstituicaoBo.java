package classe.core;

import java.util.List;

public class InstituicaoBo {
	private InstituicaoDao dao = new InstituicaoDao();
	
	public void adicionar(Instituicao instituicao) {
		dao.adicionar(instituicao);
	}
	
	public void remover(Instituicao instituicao) {
		dao.remover(instituicao);
	}
	
	public void editar(Instituicao instituicao, Instituicao instituicaoAnterior) {
		dao.editar(instituicao, instituicaoAnterior);
	}
	
	public List<Instituicao> pesquisar(String dadoCadastral) {
		return dao.pesquisar(dadoCadastral);
	}
	
	public List<Instituicao> listar() {
		return dao.listar();
	}

}
