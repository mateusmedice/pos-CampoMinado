package model.enums;

public enum TamanhoTabuleiro {

	PEQUENO(5, 5, "Pequeno"),
	MEDIO(10, 10, "Médio"),
	GRANDE(20, 20, "Grande"),
	EXTRA_GRANDE(50, 50, "Extra Grande");
	
	private Integer altura;
	private Integer largura;
	private String descricao;
	
	TamanhoTabuleiro(Integer altura, Integer largura, String descricao) {
		this.altura = altura;
		this.largura = largura;
		this.descricao = descricao;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getLargura() {
		return largura;
	}

	public void setLargura(Integer largura) {
		this.largura = largura;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
