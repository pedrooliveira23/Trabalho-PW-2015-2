package servlet.paginas;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.core.Instituicao;
import classe.core.InstituicaoBo;
import classe.core.InstituicaoDao;

@WebServlet(value = "/sistema")
public class PesquisarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// Referência para a sessão.

		HttpSession sessaoLogin = req.getSession();

		// Obtém referência para o atributo "usuarioLogado".
		Boolean usuarioLogado = (Boolean) sessaoLogin
				.getAttribute("usuarioLogado");

		if (usuarioLogado == null || usuarioLogado == false) {
			req.getRequestDispatcher("sistema/login.jsp").forward(req, resp);
		} else {
			String paramPesquisa = req.getParameter("pesquisa");
			String pesquisa = paramPesquisa == null ? "" : paramPesquisa;

			HttpSession sessao = req.getSession();

			InstituicaoBo bo = new InstituicaoBo();

			if (pesquisa.equals("")) {
				sessao.setAttribute("listaDeInstituicoes", bo.listar());
			} else {
				sessao.setAttribute("listaDeInstituicoes",
						bo.pesquisar(pesquisa));
			}

			req.getRequestDispatcher("sistema/index.jsp").forward(req, resp);
		}
	}
}
