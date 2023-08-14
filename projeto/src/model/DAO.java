package model;

import java.sql.Connection;
import java.sql.DriverManager;


public class DAO {
	/** M�dulo de conex�o **/
	// Par�metro de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/estoque?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";

	// M�todo de conex�o
	public Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// teste de conex�o
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}