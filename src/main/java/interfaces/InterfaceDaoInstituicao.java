package interfaces;

import java.sql.SQLException;
import java.util.List;

import classe.core.Instituicao;

public interface InterfaceDaoInstituicao {
	void adicionar(Instituicao instituicao) throws SQLException;
	void remover(Instituicao instituicao) throws SQLException;
	void editar(Instituicao instituicao) throws SQLException;
	List<Instituicao> pesquisar(String dadoCadastral) throws SQLException;
	List<Instituicao> listar(String dadoCadastral) throws SQLException;
}
