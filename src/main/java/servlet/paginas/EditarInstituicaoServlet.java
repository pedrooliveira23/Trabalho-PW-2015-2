package servlet.paginas;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classe.core.Instituicao;
import classe.core.InstituicaoDao;

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

		String acaoParam = req.getParameter("acao");
		String acao = acaoParam == null ? "" : acaoParam;
		/*try {
			InstituicaoDao dao = new InstituicaoDao();
			if (acao.equals("Editar")) {
				if (!dao.pesquisar(cnpj).equals(null)) {
					Instituicao instituicao = new Instituicao();
					instituicao.setCnpj(cnpj);
					instituicao.setEmail(email);
					instituicao.setEndereco(endereco);
					instituicao.setNivelCurso(nivelCurso);
					instituicao.setNome(nome);
					instituicao.setNomeResponsavel(nomeResponsavel);
					instituicao.setTelefone(telefone);
					instituicao.setTelefoneResponsavel(telefoneResponsavel);
					instituicao.setEmailResponsavel(emailResponsavel);
					dao.editar(instituicao);
				}

			}

			if (acao.equals("Excluir")) {
					dao.remover(dao.pesquisar(cnpj).get(0));
					req.setAttribute("nome", "");
					req.setAttribute("nivelCurso", "");
					req.setAttribute("endereco", "");
					req.setAttribute("telefone", "");
					req.setAttribute("email", "");
					req.setAttribute("nomeResponsavel", "");
					req.setAttribute("telefoneResponsavel", "");
					req.setAttribute("cnpj", "");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		req.getRequestDispatcher("sistema/editarInstituicao.jsp").forward(req,
				resp);

	}

}
