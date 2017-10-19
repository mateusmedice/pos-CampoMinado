package model;

import java.util.List;

import model.enums.TamanhoTabuleiro;

public class Tabuleiro {

	private TamanhoTabuleiro tamanhoTabuleiro;
	
	private List<List<Casa>> casas = null;

	public Tabuleiro() {
		
	}
	
	public Tabuleiro(TamanhoTabuleiro tamanhoTabuleiro, List<List<Casa>> casas) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
		this.casas = casas;
	}

	public String getTabuleiroDesenhado() {
		String desenho = "";
		for (List<Casa> row : casas) {
			for (Casa cell : row) {
				desenho += cell.getValue() + "\t";
			}
			desenho += "\n";
		}
		return desenho;
	}

	public Integer getAlturaTabuleiro() {
		return casas.size();
	}
	
	public Integer getLarguraTabuleiro() {
		
		int firstSize = casas.get(0).size();
		
		for (List<Casa> rows : casas) {
			
			if (firstSize != rows.size()) {
				throw new RuntimeException("Larguras diferentes.");
			}
		}
		
		return firstSize;
	}
	
}
