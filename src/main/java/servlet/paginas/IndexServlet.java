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
@WebServlet(value = "/sistema")
public class IndexServlet extends HttpServlet {

  protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    //Referência para a sessão.
    HttpSession sessao = req.getSession();

    ArrayList<Instituicao> insts;
    
    if(sessao.getAttribute("insts") == null) {
    	insts = new ArrayList<Instituicao>();
    	sessao.setAttribute("insts", insts);
    } else {
    	insts = (ArrayList<Instituicao>) sessao.getAttribute("insts");
    }
    
    //Obtém referência para o atributo "usuarioLogado".
    Boolean usuarioLogado = (Boolean) sessao.getAttribute("usuarioLogado");
    
    if (usuarioLogado == null || usuarioLogado == false) {
      req.getRequestDispatcher("sistema/login.jsp").forward(req, resp);  
    } else {
      req.getRequestDispatcher("sistema/index.jsp").forward(req, resp);
    }
  }

}