package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BebidasDao extends DAO {
	// CRUD create
	DAO dao = new DAO();

	public void inserirBebidas(BebidasBeans bebidas) {
		String create = "insert into bebidas(nomeBebidas, tamanho, quantidadeBebidas, valorUniBebidas, valorTotalBebidas) values (?,?,?,?,?)";
		try {
			// abrir conex�o
			Connection con = dao.conectar();
			// Preparar a query para execu��o
			PreparedStatement pst = con.prepareStatement(create);
			// substituir os par�metros (?) pelo conteudo bebidasbeans
			pst.setString(1, bebidas.getNomeBebidas());
			pst.setString(2, bebidas.getTamanho());
			pst.setString(3, bebidas.getQuantidadeBebidas());
			pst.setString(4, bebidas.getValorUniBebidas());
			pst.setString(5, bebidas.getValorTotalBebidas());
			// executa a query
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// CRUD read
	public ArrayList<BebidasBeans> listarBebidas() {
		ArrayList<BebidasBeans> bebidas = new ArrayList<>();
		String read = "select * from bebidas order by nomeBebidas";
		try {
			Connection con = dao.conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				String idBebidas = rs.getString(1);
				String nomeBebidas = rs.getString(2);
				String tamanho = rs.getString(3);
				String quantidadeBebidas = rs.getString(4);
				String valorUniBebidas = rs.getString(5);
				String valorTotalBebidas = rs.getString(6);

				bebidas.add(new BebidasBeans(idBebidas, nomeBebidas, tamanho, quantidadeBebidas, valorUniBebidas,
						valorTotalBebidas));
			}
			con.close();
			return bebidas;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	// CRUD UPDATE
	
	public void selecionarBebidas(BebidasBeans bebidas) {
		String read2 = "select * from bebidas where idBebidas = ?";
		try {
			Connection con = dao.conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, bebidas.getIdBebidas());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				bebidas.setIdBebidas(rs.getString(1));
				bebidas.setNomeBebidas(rs.getString(2));
				bebidas.setTamanho(rs.getString(3));
				bebidas.setQuantidadeBebidas(rs.getString(4));
				bebidas.setValorUniBebidas(rs.getString(5));
				bebidas.setValorTotalBebidas(rs.getString(6));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//editar produto
		public void alterarBebidas(BebidasBeans bebidas) {
			String create = "update bebidas set nomeBebidas=?, tamanho=?, quantidadeBebidas=?, valorUniBebidas=?, valorTotalBebidas=? where idBebidas=?";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(create);
				pst.setString(1, bebidas.getNomeBebidas());
				pst.setString(2, bebidas.getTamanho());
				pst.setString(3, bebidas.getQuantidadeBebidas());
				pst.setString(4, bebidas.getValorUniBebidas());
				pst.setString(5, bebidas.getValorTotalBebidas());
				pst.setString(6, bebidas.getIdBebidas());
				pst.executeUpdate();
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//CRUD delete
		public void deletarBebidas(BebidasBeans bebidas) {
			String delete = "delete from bebidas where idBebidas = ?";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setString(1, bebidas.getIdBebidas());
				pst.executeUpdate();
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
