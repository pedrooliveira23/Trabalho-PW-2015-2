package classe.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	private String url = "jdbc:derby:cie;create=true";

	public boolean validar(String nomeDeUsuario, String senha) {
		Connection conn;
		try {
			conn = DriverManager.getConnection(url);
			String sql = "select * from contas";
			// Obtém referência para uma sentença SQL.
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			// Executa a instrução SQL.
			ResultSet rs = prepareStatement.executeQuery();
			while (rs.next()) {
				if (nomeDeUsuario.equals(rs.getString("usuario"))
						&& senha.equals(rs.getString("senha"))) {
					return true;
				}
			}
			rs.close();
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
