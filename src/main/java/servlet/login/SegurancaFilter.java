package servlet.login;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SegurancaFilter
 */

//@WebFilter("")
public class SegurancaFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SegurancaFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
	    HttpServletResponse res = (HttpServletResponse) response;

	    if (req.getRequestURI().endsWith("/login")) {
	      chain.doFilter(request, response); //Continua com a requisição.
	    } else {
	      //Referência para a sessão.
	      HttpSession sessao = req.getSession();

	      //Obtém referência para o atributo "usuarioLogado".
	      Boolean usuarioLogado = (Boolean) sessao.getAttribute("usuarioLogado");
	      
	      if (usuarioLogado == null || usuarioLogado == false) {
	        res.sendRedirect("login");  
	      } else {
	        chain.doFilter(request, response); //Continua com a requisição.
	      }
	      
	    }
	  }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
