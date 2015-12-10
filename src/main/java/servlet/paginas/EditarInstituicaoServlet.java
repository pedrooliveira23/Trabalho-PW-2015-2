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
 * Servlet implementation class NovaInstituicaoServlet
 */

@WebServlet(value = "/editarInstituicao")
public class EditarInstituicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// Referência para a sessão.
		HttpSession sessao = req.getSession();

		ArrayList<Instituicao> insts;

		if (sessao.getAttribute("insts") == null) {
			insts = new ArrayList<Instituicao>();
			sessao.setAttribute("insts", insts);
		} else {
			insts = ((ArrayList<Instituicao>) sessao.getAttribute("insts"));
		}

		String paramEditar = req.getParameter("acao") == null ? "" : req
				.getParameter("acao");

		if (req.getParameter("cnpj") != null && paramEditar.equals("Enviar")) {
			for (int i = 0; i < insts.size(); i++) {
				if (insts.get(i).getCnpj().equals(req.getParameter("cnpj"))) {
					insts.get(i).setEmail(req.getParameter("email"));
					insts.get(i).setEmailResponsavel(
							req.getParameter("emailResp"));
					insts.get(i).setEndereco(req.getParameter("endereco"));
					insts.get(i).setNivelCurso(req.getParameter("nivel"));
					insts.get(i).setNome(req.getParameter("nome"));
					insts.get(i).setNomeResponsavel(
							req.getParameter("nomeResp"));
					insts.get(i).setTelefone(req.getParameter("telefone"));
					insts.get(i).setTelefoneResponsavel(
							req.getParameter("telefoneResp"));
					sessao.setAttribute("insts", insts);
				}
			}
		} else if (req.getParameter("cnpj") != null
				&& paramEditar.equals("Excluir")) {
			for (int i = 0; i < insts.size(); i++) {
				if (insts.get(i).getCnpj().equals(req.getParameter("cnpj"))) {
					insts.remove(i);
					sessao.setAttribute("insts", insts);
					req.getRequestDispatcher("sistema/pesquisar.jsp").forward(
							req, resp);
				}
			}
		}

		req.getRequestDispatcher("sistema/editarInstituicao.jsp").forward(req,
				resp);

	}

}
