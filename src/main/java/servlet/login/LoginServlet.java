package servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.core.Usuario;
import classe.core.UsuarioBo;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession sessaolog = req.getSession();

		Usuario usuario = getUsuario(req);
		UsuarioBo bo = new UsuarioBo();

		sessaolog.setAttribute("usuarioLogado", bo.validar(usuario));

		if (sessaolog.getAttribute("usuarioLogado").equals(true)) {
			resp.sendRedirect("sistema");
		} else {
			req.getRequestDispatcher("sistema/login.jsp").forward(req, resp);
		}
	}

	private Usuario getUsuario(HttpServletRequest req) {
		String usuarioParam = req.getParameter("usuario");
		String senhaParam = req.getParameter("senha");
		String nomeUsuario = usuarioParam == null ? "" : usuarioParam;
		String senha = usuarioParam == null ? "" : senhaParam;

		Usuario usuario = new Usuario(nomeUsuario, senha);
		return usuario;
	}
}