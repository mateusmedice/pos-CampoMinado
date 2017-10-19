package model;

import model.enums.StatusCasa;

public abstract class Casa {
	
	protected StatusCasa statusCasa;

	public Casa() {
		this.statusCasa = StatusCasa.FECHADO;
	}

	public Casa(StatusCasa statusCasa) {
		this.statusCasa = statusCasa;
	}
	
	protected abstract void click();

	protected abstract String getValue();
	
	public StatusCasa getStatusCasa() {
		return statusCasa;
	}

	public void setStatusCasa(StatusCasa statusCasa) {
		this.statusCasa = statusCasa;
	}
	
}
