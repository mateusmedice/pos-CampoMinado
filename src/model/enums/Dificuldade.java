package model.enums;

public enum Dificuldade {

	FACIL(3, "Fácil"),
	MEDIO(7, "Médio"),
	DIFICIL(12, "Dificil");

	private Integer quantidadeBombas;
	
	private String descricao;
	
	Dificuldade(Integer quantidadeBombas, String descricao) {
		this.quantidadeBombas = quantidadeBombas;
		this.setDescricao(descricao);
	}

	public Integer getQuantidadeBombas() {
		return quantidadeBombas;
	}

	public void setQuantidadeBombas(Integer quantidadeBombas) {
		this.quantidadeBombas = quantidadeBombas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
