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

		ArrayList<Instituicao> insts;

		if (sessao.getAttribute("insts") == null) {
			insts = new ArrayList<Instituicao>();

			Instituicao ins = new Instituicao();
			ins.setCnpj("0000");
			ins.setEmail("asdasd");
			ins.setEmailResponsavel("sadjsaoda");
			ins.setEndereco("sadasda");
			ins.setNivelCurso("asdasd");
			ins.setNome("asdasd");
			ins.setNomeResponsavel("asdas");
			ins.setTelefone("asdasd");
			ins.setTelefoneResponsavel("asdas");
			insts.add(ins);

			Instituicao ins2 = new Instituicao();
			ins2.setCnpj("222222222");
			ins2.setEmail("eeeeeeeeeee");
			ins2.setEmailResponsavel("rrrrrrrrrrrrr");
			ins2.setEndereco("endddddddd");
			ins2.setNivelCurso("nnnnnnnn");
			ins2.setNome("nommmmmmmm");
			ins2.setNomeResponsavel("norrrrrrrrr");
			ins2.setTelefone("teeeeeeeeeel");
			ins2.setTelefoneResponsavel("relrrrrrrrrrr");
			insts.add(ins2);

			sessao.setAttribute("insts", insts);
		} else {
			insts = ((ArrayList<Instituicao>) sessao.getAttribute("insts"));
		}

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
