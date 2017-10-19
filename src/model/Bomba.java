package model;

import model.enums.StatusCasa;

public class Bomba extends Casa {

	private static final String MESSAGE = "You Lose!";
	
	@Override
	protected void click() {
		System.out.println(MESSAGE);
	}

	@Override
	protected String getValue() {

		if (StatusCasa.ABERTO.getValue().equals(this.statusCasa.getValue())) {
			return "B";
		}
		
		return "-";
	}

}
