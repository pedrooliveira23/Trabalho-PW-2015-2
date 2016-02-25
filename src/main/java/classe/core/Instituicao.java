package classe.core;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instituicao {
	@Id
	private String cnpj;
	private String nome, nivelCurso, endereco, telefone, email,
			nomeResponsavel, telefoneResponsavel, emailResponsavel;

	public Instituicao() {

	}

	public Instituicao(String nome, String nivelCurso, String endereco,
			String telefone, String email, String nomeResponsavel,
			String telefoneResponsavel, String emailResponsavel, String cnpj) {
		this.nome = nome;
		this.nivelCurso = nivelCurso;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.nomeResponsavel = nomeResponsavel;
		this.telefoneResponsavel = telefoneResponsavel;
		this.emailResponsavel = emailResponsavel;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivelCurso() {
		return nivelCurso;
	}

	public void setNivelCurso(String nivelCurso) {
		this.nivelCurso = nivelCurso;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		this.telefoneResponsavel = telefoneResponsavel;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
