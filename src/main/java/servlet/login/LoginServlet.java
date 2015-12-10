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

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// Referência para a sessão.
		HttpSession sessaolog = req.getSession();
		
		ArrayList<Instituicao> insts;
	    
	    if(sessaolog.getAttribute("insts") == null) {
	    	insts = new ArrayList<Instituicao>();
	    	sessaolog.setAttribute("insts", insts);
	    } else {
	    	insts = (ArrayList<Instituicao>) sessaolog.getAttribute("insts");
	    }

		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");
		// Usuário válido.
		String erro = " ";

		req.setAttribute("erro", erro);
		if (usuario != null && usuario.equals("admin") && senha != null
				&& senha.equals("admin")) {
			sessaolog.setAttribute("usuarioLogado", true);
			resp.sendRedirect("sistema");
			erro = " ";
			req.setAttribute("erro", erro);
		} else {
			sessaolog.setAttribute("usuarioLogado", false);
			erro = "Nome de Usuário ou Senha incorretos!";
			req.setAttribute("erro", erro);
			req.getRequestDispatcher("sistema/login.jsp").forward(req, resp);
		}
	}

}