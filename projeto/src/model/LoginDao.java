package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class LoginDao extends DAO {
	DAO dao = new DAO();

	public boolean verificarLogin(String login, String senha) {
		String select = "select * from adm where login = ? and senha = ?";
		try {
		Connection con = dao.conectar();
		PreparedStatement pst = con.prepareStatement(select);
		pst.setString(1, login);
		pst.setString(2, senha);
		ResultSet rs = pst.executeQuery();
		boolean resultado = rs.next();
		con.close();
		return resultado;
		} catch (Exception e) {
		System.out.println(e);
		return false;
		}
		}
}
