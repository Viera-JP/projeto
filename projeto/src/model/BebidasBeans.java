package model;

public class BebidasBeans {
	private String idBebidas;
	private String nomeBebidas;
	private String tamanho;
	private String quantidadeBebidas;
	private String valorUniBebidas;
	private String valorTotalBebidas;
	
	public BebidasBeans() {
		super();
	}
	
	public BebidasBeans(String idBebidas, String nomeBebidas, String tamanho, String quantidadeBebidas,
			String valorUniBebidas, String valorTotalBebidas) {
		super();
		this.idBebidas = idBebidas;
		this.nomeBebidas = nomeBebidas;
		this.tamanho = tamanho;
		this.quantidadeBebidas = quantidadeBebidas;
		this.valorUniBebidas = valorUniBebidas;
		this.valorTotalBebidas = valorTotalBebidas;
	}

	public String getIdBebidas() {
		return idBebidas;
	}
	public void setIdBebidas(String idBebidas) {
		this.idBebidas = idBebidas;
	}
	public String getNomeBebidas() {
		return nomeBebidas;
	}
	public void setNomeBebidas(String nomeBebidas) {
		this.nomeBebidas = nomeBebidas;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getQuantidadeBebidas() {
		return quantidadeBebidas;
	}
	public void setQuantidadeBebidas(String quantidadeBebidas) {
		this.quantidadeBebidas = quantidadeBebidas;
	}
	public String getValorUniBebidas() {
		return valorUniBebidas;
	}
	public void setValorUniBebidas(String valorUniBebidas) {
		this.valorUniBebidas = valorUniBebidas;
	}
	public String getValorTotalBebidas() {
		return valorTotalBebidas;
	}
	public void setValorTotalBebidas(String valorTotalBebidas) {
		this.valorTotalBebidas = valorTotalBebidas;
	}
}
