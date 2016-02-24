package servlet.paginas;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.core.Instituicao;
import classe.core.InstituicaoBo;
import classe.core.InstituicaoDao;

/**
 * Servlet implementation class NovaInstituicaoServlet
 */

@WebServlet(value = "/novaInstituicao")
public class NovaInstituicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		

		String acaoParam = req.getParameter("acao");
		String acao = acaoParam == null ? "" : acaoParam;
		
		Instituicao instituicao = getInstituicao(req);
		
		InstituicaoBo bo = new InstituicaoBo();
		
		if (acao.equals("Enviar") && !instituicao.getCnpj().equals("")
				&& !bo.pesquisar(instituicao.getCnpj()).contains(instituicao)) {
			bo.adicionar(instituicao);
		}

		if (acao.equals("Limpar")) {
			req.setAttribute("nome", "");
			req.setAttribute("nivelCurso", "");
			req.setAttribute("endereco", "");
			req.setAttribute("telefone", "");
			req.setAttribute("email", "");
			req.setAttribute("nomeResponsavel", "");
			req.setAttribute("telefoneResponsavel", "");
			req.setAttribute("cnpj", "");
		}

		// Referência para a sessão.
		HttpSession sessao = req.getSession();
		req.getRequestDispatcher("sistema/novaInstituicao.jsp").forward(req,
				resp);

	}
	
	private Instituicao getInstituicao(HttpServletRequest req) {
		String nomeParam = req.getParameter("nome");
		String nivelCursoParam = req.getParameter("nivelCurso");
		String enderecoParam = req.getParameter("endereco");
		String telefoneParam = req.getParameter("telefone");
		String emailParam = req.getParameter("email");
		String nomeResponsavelParam = req.getParameter("nomeResponsavel");
		String telefoneResponsavelParam = req
				.getParameter("telefoneResponsavel");
		String emailResponsavelParam = req.getParameter("emailResponsavel");
		String cnpjParam = req.getParameter("cnpj");

		String nome = nomeParam == null ? "" : nomeParam;
		String nivelCurso = nivelCursoParam == null ? "" : nivelCursoParam;
		String endereco = enderecoParam == null ? "" : enderecoParam;
		String telefone = telefoneParam == null ? "" : telefoneParam;
		String email = emailParam == null ? "" : emailParam;
		String nomeResponsavel = nomeResponsavelParam == null ? ""
				: nomeResponsavelParam;
		String telefoneResponsavel = telefoneResponsavelParam == null ? ""
				: telefoneResponsavelParam;
		String emailResponsavel = emailResponsavelParam == null ? ""
				: emailResponsavelParam;
		String cnpj = cnpjParam == null ? "" : cnpjParam;

		return new Instituicao(nome, nivelCurso, endereco,
				telefone, email, nomeResponsavel, telefoneResponsavel,
				emailResponsavel, cnpj);
		
	}

}
