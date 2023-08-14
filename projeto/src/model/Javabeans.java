package model;

public class Javabeans {
	private String id;
	private String nome;
	private String quantidade;
	private String valorUni;
	private String valorTotal;
	
	public Javabeans() {
		super();
	}
	
	public Javabeans(String id, String nome, String quantidade, String valorUni, String valorTotal) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUni = valorUni;
		this.valorTotal = valorTotal;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getValorUni() {
		return valorUni;
	}
	public void setValorUni(String valorUni) {
		this.valorUni = valorUni;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
