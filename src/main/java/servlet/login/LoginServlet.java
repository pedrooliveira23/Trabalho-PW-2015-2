package servlet.login;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.core.Instituicao;
import classe.core.LoginDao;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession sessaolog = req.getSession();

		String usuarioParam = req.getParameter("usuario");
		String senhaParam = req.getParameter("senha");
		String usuario = usuarioParam == null ? "" : usuarioParam;
		String senha = usuarioParam == null ? "" : senhaParam;
		
		LoginDao loginDao = new LoginDao();		
		
		if (loginDao.validar(usuario, senha)) {
			sessaolog.setAttribute("usuarioLogado", true);
			resp.sendRedirect("sistema");
		} else {
			sessaolog.setAttribute("usuarioLogado", false);
			req.getRequestDispatcher("sistema/login.jsp").forward(req, resp);
		}
	}

}