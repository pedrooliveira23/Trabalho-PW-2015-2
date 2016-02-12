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
import classe.core.InstituicaoDao;

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

		try {
			InstituicaoDao dao = new InstituicaoDao();

			String paramPesquisa = req.getParameter("pesquisa");
			String pesquisa = paramPesquisa == null ? "" : paramPesquisa;

			if (pesquisa.equals("")) {
				sessao.setAttribute("insts", dao.listar());
			} else {
				sessao.setAttribute("insts", dao.pesquisar(pesquisa));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.getRequestDispatcher("sistema/pesquisar.jsp").forward(req, resp);
	}
}
