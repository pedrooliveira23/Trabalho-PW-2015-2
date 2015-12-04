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
 * Servlet implementation class IndexServlet
 */
@WebServlet(value = "/cad-institucional")
public class IndexServlet extends HttpServlet {

  protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    //Referência para a sessão.
    HttpSession sessao = req.getSession();

    ArrayList<Instituicao> insts = new ArrayList<Instituicao>();
    
    //Obtém referência para o atributo "usuarioLogado".
    Boolean usuarioLogado = (Boolean) sessao.getAttribute("usuarioLogado");
    
    if (usuarioLogado == null || usuarioLogado == false) {
      req.getRequestDispatcher("login.jsp").forward(req, resp);  
    } else {
      req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
  }

}