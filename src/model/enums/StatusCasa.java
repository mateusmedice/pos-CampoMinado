package model.enums;

public enum StatusCasa {

	ABERTO(1),
	FECHADO(0);
	
	private Integer value;
	
	StatusCasa(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
