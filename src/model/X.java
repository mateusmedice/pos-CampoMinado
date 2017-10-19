package model;

import model.enums.StatusCasa;

public class X extends Casa {

	private Integer valor;
	
	public X(Integer valor) {
		
		if (valor == null) {
			throw new IllegalArgumentException("Valor não pode ser nulo.");
		}
		
		this.valor = valor;
	}

	@Override
	protected String getValue() {
		
		if (StatusCasa.ABERTO.getValue().equals(this.statusCasa.getValue())) {
			return this.valor.toString();
		}
		
		return "-";
	}

	@Override
	protected void click() {
		
	}

	public Integer getValor() {
		return valor;
	}
	
}
