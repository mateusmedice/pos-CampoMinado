package main;

import model.Tabuleiro;
import model.enums.Dificuldade;
import model.enums.TamanhoTabuleiro;
import builder.TabuleiroBuilder;

public class Main {

	public static void main(String[] args) {

		// Scanner scanner = new Scanner();
		
		// TODO: Pedir Tamanho do tabuleiro
		TamanhoTabuleiro tamanhoTabuleiro = TamanhoTabuleiro.PEQUENO;
		
		// TODO: Pedir a Dificuldade
		Dificuldade dificuldade = Dificuldade.FACIL;
		
		// TODO: Iniciar jogo 
		Tabuleiro tabuleiro = TabuleiroBuilder.build(tamanhoTabuleiro, dificuldade.getQuantidadeBombas());
		
		System.out.println(tabuleiro.getTabuleiroDesenhado());
		
		// TODO: Laço para jogar
		
	}
	
}
