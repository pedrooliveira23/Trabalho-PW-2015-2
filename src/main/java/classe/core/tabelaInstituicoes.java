package classe.core;

import java.util.ArrayList;

public class tabelaInstituicoes {
	private ArrayList<Instituicao> insts;
	
	public tabelaInstituicoes (ArrayList<Instituicao> insts) {
		this.setInsts(insts);
	}
	
	
	public String getNomeInst (int i) {
		return getInsts().get(i).getNome();
	}
	
	public String getCnpj (int i) {
		return getInsts().get(i).getCnpj();
	}
	
	public String getNivel (int i) {
		return getInsts().get(i).getNivelCurso();
	}
	
	public String getEndereco (int i) {
		return getInsts().get(i).getEndereco();
	}
	
	public String getTelefone (int i) {
		return getInsts().get(i).getTelefone();
	}

	public String getEmail (int i) {
		return insts.get(i).getEmail();
	}
	
	public String getNomeResponsavel (int i) {
		return insts.get(i).getNomeResponsavel();
	}
	
	public String getTelefoneResponsavel (int i) {
		return insts.get(i).getTelefoneResponsavel();
	}
	
	public String getEmailResponsavel (int i) {
		return insts.get(i).getEmailResponsavel();
	}
	
	public ArrayList<Instituicao> getInsts() {
		return insts;
	}


	public void setInsts(ArrayList<Instituicao> insts) {
		this.insts = insts;
	}
}
