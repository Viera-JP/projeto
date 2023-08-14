package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutoDao extends DAO {
	// CRUD create
	DAO dao = new DAO();

	public void inserirProduto(Javabeans produto) {
		String create = "insert into burguer(nome, quantidade, valorUni, valorTotal) values (?,?,?,?)";
		try {
			// abrir conex�o
			Connection con = dao.conectar();
			// Preparar a query para execu��o
			PreparedStatement pst = con.prepareStatement(create);
			// substituir os par�metros (?) pelo conteudo javabeans
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getQuantidade());
			pst.setString(3, produto.getValorUni());
			pst.setString(4, produto.getValorTotal());
			// executa a query
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// CRUD read
	public ArrayList<Javabeans> listarProduto() {
		ArrayList<Javabeans> produto = new ArrayList<>();
		String read = "select * from burguer order by nome";
		try {
			Connection con = dao.conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String quantidade = rs.getString(3);
				String valorUni = rs.getString(4);
				String valorTotal = rs.getString(5);
				produto.add(new Javabeans(id, nome, quantidade, valorUni, valorTotal));
			}
			con.close();
			return produto;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//CRUD update
	
	//selecionar produto
	public void selecionarProduto(Javabeans produto) {
		String read2 = "select * from burguer where id = ?";
		try {
			Connection con = dao.conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, produto.getId());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				produto.setId(rs.getString(1));
				produto.setNome(rs.getString(2));
				produto.setQuantidade(rs.getString(3));
				produto.setValorUni(rs.getString(4));
				produto.setValorTotal(rs.getString(5));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//editar produto
	public void alterarProduto(Javabeans produto) {
		String create = "update burguer set nome=?, quantidade=?, valorUni=?, valorTotal=? where id=?";
		try {
			Connection con = dao.conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getQuantidade());
			pst.setString(3, produto.getValorUni());
			pst.setString(4, produto.getValorTotal());
			pst.setString(5, produto.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//CRUD delete
	public void deletarProduto(Javabeans produto) {
		String delete = "delete from burguer where id = ?";
		try {
			Connection con = dao.conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, produto.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
