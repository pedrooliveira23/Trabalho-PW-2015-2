package servlet.paginas;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.core.Instituicao;

/**
 * Servlet implementation class PesquisarServlet
 */

@WebServlet(value = "/pesquisar")
public class PesquisarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// Referência para a sessão.
		HttpSession sessao = req.getSession();

		ArrayList<Instituicao> insts = new ArrayList<Instituicao>();

		Instituicao ins = new Instituicao();
		ins.setCnpj("01567601/0001-43");
		ins.setEmail("contato@ufg.br");
		ins.setEmailResponsavel("walison@inf.ufg.br");
		ins.setEndereco("Avenida Esperança s/n, Campus Samambaia - Prédio da Reitoria. CEP 74690-900");
		ins.setNivelCurso("Superior");
		ins.setNome("Universidade Federal de Goiás - Goiânia");
		ins.setNomeResponsavel("Walison Cavalcanti Moreira");
		ins.setTelefone("(62) 3521-1000");
		ins.setTelefoneResponsavel("(62) 3521-1181");
		insts.add(ins);

		Instituicao ins2 = new Instituicao();
		ins2.setCnpj("01567601/0001-43");
		ins2.setEmail("catalao@ufg.br");
		ins2.setEmailResponsavel("walison@ufg.br");
		ins2.setEndereco("Av. Dr. Lamartine Pinto de Avelar, 1120, Setor Universitário - CEP 75704-020");
		ins2.setNivelCurso("Superior");
		ins2.setNome("Universidade Federal de Goiás - Catalão");
		ins2.setNomeResponsavel("Walison Cavalcanti Moreira");
		ins2.setTelefone("(64) 3441-5300");
		ins2.setTelefoneResponsavel("(62) 3521-1181");
		insts.add(ins2);

		sessao.setAttribute("insts", insts);

		String paramPesquisa = req.getParameter("pesquisa");
		String pesquisa = paramPesquisa == null ? "" : paramPesquisa;

		if (pesquisa.equals("")) {
			if (sessao.getAttribute("instsOr") != null) {
				sessao.setAttribute("insts", sessao.getAttribute("instsOr"));
			}
		} else {
			ArrayList<Instituicao> instsPesquisa = new ArrayList<Instituicao>();
			sessao.setAttribute("instsOr", insts);
			for (int i = 0; i < insts.size(); i++) {
				if (insts.get(i).getCnpj().contains(pesquisa)
						|| insts.get(i).getEmail().contains(pesquisa)
						|| insts.get(i).getEmailResponsavel()
								.contains(pesquisa)
						|| insts.get(i).getEndereco().contains(pesquisa)
						|| insts.get(i).getNivelCurso().contains(pesquisa)
						|| insts.get(i).getNome().contains(pesquisa)
						|| insts.get(i).getNomeResponsavel().contains(pesquisa)
						|| insts.get(i).getTelefone().contains(pesquisa)
						|| insts.get(i).getTelefoneResponsavel()
								.contains(pesquisa)) {
					instsPesquisa.add(insts.get(i));
				}
			}
			sessao.setAttribute("insts", instsPesquisa);
		}

		req.getRequestDispatcher("sistema/pesquisar.jsp").forward(req, resp);
	}

}
