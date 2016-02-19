package classe.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceDaoInstituicao;

public class InstituicaoDao implements InterfaceDaoInstituicao {
	private String url = "jdbc:derby:cie;create=true";
	private Connection conn;

	public InstituicaoDao() throws SQLException {
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void adicionar(Instituicao instituicao) throws SQLException {
		String sql = "insert into instituicoes (nome, nivelCurso, endereco, telefone, email, nomeResponsavel, telefoneResponsavel, emailResponsavel, cnpj) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement prepareStatement;
		prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(1, instituicao.getNome());
		prepareStatement.setString(2, instituicao.getNivelCurso());
		prepareStatement.setString(3, instituicao.getEndereco());
		prepareStatement.setString(4, instituicao.getTelefone());
		prepareStatement.setString(5, instituicao.getEmail());
		prepareStatement.setString(6, instituicao.getNomeResponsavel());
		prepareStatement.setString(7, instituicao.getTelefoneResponsavel());
		prepareStatement.setString(8, instituicao.getEmailResponsavel());
		prepareStatement.setString(9, instituicao.getCnpj());
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}

	public void remover(Instituicao instituicao) throws SQLException {
		String sql = "delete from instituicoes where cnpj=?";
		PreparedStatement prepareStatement;
		prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(1, instituicao.getCnpj());
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}

	public void editar(Instituicao instituicao) throws SQLException {
		String sql = "update insituicoes set nome=?, nivelCurso=?, endereco=?, telefone=?, email=?, nomeResponsavel=?, telefoneResponsavel=?, emailResponsavel=? where cnpj=?";
		PreparedStatement prepareStatement;
		prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(1, instituicao.getNome());
		prepareStatement.setString(2, instituicao.getNivelCurso());
		prepareStatement.setString(3, instituicao.getEndereco());
		prepareStatement.setString(4, instituicao.getTelefone());
		prepareStatement.setString(5, instituicao.getEmail());
		prepareStatement.setString(6, instituicao.getNomeResponsavel());
		prepareStatement.setString(7, instituicao.getTelefoneResponsavel());
		prepareStatement.setString(8, instituicao.getEmailResponsavel());
		prepareStatement.setString(9, instituicao.getCnpj());
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}

	public List<Instituicao> pesquisar(String dadoCadastral)
			throws SQLException {
		List<Instituicao> instituicoes = new ArrayList<Instituicao>();
		String sql = "select * from instituicoes where cnpj=? or nome=? or nivelCurso=? or endereco=? or telefone=? or email=? or nomeResponsavel=? or telefoneResponsavel=? or emailResponsavel=? order by nome";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(1, dadoCadastral);
		prepareStatement.setString(2, dadoCadastral);
		prepareStatement.setString(3, dadoCadastral);
		prepareStatement.setString(4, dadoCadastral);
		prepareStatement.setString(5, dadoCadastral);
		prepareStatement.setString(6, dadoCadastral);
		prepareStatement.setString(7, dadoCadastral);
		prepareStatement.setString(8, dadoCadastral);
		prepareStatement.setString(9, dadoCadastral);
		ResultSet rs = prepareStatement.executeQuery();
		while (rs.next()) {
			Instituicao novaInstituicao = new Instituicao();
			novaInstituicao.setNome(rs.getString(1));
			novaInstituicao.setNivelCurso(rs.getString(2));
			novaInstituicao.setEndereco(rs.getString(3));
			novaInstituicao.setTelefone(rs.getString(4));
			novaInstituicao.setEmail(rs.getString(5));
			novaInstituicao.setNomeResponsavel(rs.getString(6));
			novaInstituicao.setTelefoneResponsavel(rs.getString(7));
			novaInstituicao.setEmailResponsavel(rs.getString(8));
			novaInstituicao.setCnpj(rs.getString(9));
			instituicoes.add(novaInstituicao);
		}
		rs.close();
		prepareStatement.close();
		return instituicoes;
	}

	public List<Instituicao> listar() throws SQLException {
		List<Instituicao> instituicoes = new ArrayList<Instituicao>();
		String sql = "select * from instituicoes order by nome";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		ResultSet rs = prepareStatement.executeQuery();
		while (rs.next()) {
			Instituicao novaInstituicao = new Instituicao();
			novaInstituicao.setNome(rs.getString(1));
			novaInstituicao.setNivelCurso(rs.getString(2));
			novaInstituicao.setEndereco(rs.getString(3));
			novaInstituicao.setTelefone(rs.getString(4));
			novaInstituicao.setEmail(rs.getString(5));
			novaInstituicao.setNomeResponsavel(rs.getString(6));
			novaInstituicao.setTelefoneResponsavel(rs.getString(7));
			novaInstituicao.setEmailResponsavel(rs.getString(8));
			novaInstituicao.setCnpj(rs.getString(9));
			instituicoes.add(novaInstituicao);
		}
		rs.close();
		prepareStatement.close();
		return instituicoes;
	}

}
