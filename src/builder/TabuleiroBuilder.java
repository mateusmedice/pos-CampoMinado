package builder;

import java.util.ArrayList;
import java.util.List;

import model.Bomba;
import model.Casa;
import model.Tabuleiro;
import model.X;
import model.enums.TamanhoTabuleiro;

public class TabuleiroBuilder {

	private TabuleiroBuilder() { }
	
	public static Tabuleiro build(TamanhoTabuleiro tamanhoTabuleiro, Integer quantidadeBombas) {
		
		Tabuleiro tabuleiro = new Tabuleiro(tamanhoTabuleiro, buildCasas(tamanhoTabuleiro));
		
		return tabuleiro;
	}

	private static List<List<Casa>> buildCasas(TamanhoTabuleiro tamanhoTabuleiro) {
		
		List<List<Casa>> rows = new ArrayList<List<Casa>>(5);
		
		List<Casa> cell = new ArrayList<Casa>(5);
	
		cell.add(new X(0));
		cell.add(new X(0));
		cell.add(new X(0));
		cell.add(new X(1));
		cell.add(new X(1));
	
		rows.add(cell);

		cell = new ArrayList<Casa>(5);
		
		cell.add(new X(0));
		cell.add(new X(0));
		cell.add(new X(0));
		cell.add(new X(1));
		cell.add(new Bomba());

		rows.add(cell);

		cell = new ArrayList<Casa>(5);
		
		cell.add(new X(0));
		cell.add(new X(1));
		cell.add(new X(1));
		cell.add(new X(3));
		cell.add(new X(2));
				
		rows.add(cell);

		cell = new ArrayList<Casa>(5);
		
		cell.add(new X(0));
		cell.add(new X(1));
		cell.add(new Bomba());
		cell.add(new X(2));
		cell.add(new Bomba());
		
		rows.add(cell);

		cell = new ArrayList<Casa>(5);
		
		cell.add(new X(0));
		cell.add(new X(1));
		cell.add(new X(1));
		cell.add(new X(2));
		cell.add(new X(1));
		
		rows.add(cell);

		return rows;
	}
	
}
