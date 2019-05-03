package school.cesar.q4.domain;

public enum DiaDaSemana {
	
	SEGUNDA("Segunda"), TERCA("Terca"), QUARTA("Quarta"), QUINTA("Quinta"), SEXTA("Sexta"), SABADO("Sabado"), DOMINGO("Domingo");
	
	private String diaDaSemana;
	
	private DiaDaSemana(String diaDaSemana) {
		
		this.diaDaSemana = diaDaSemana;
		
	}
	
	public String getDiaDaSemana() {
		
		return this.diaDaSemana;
		
	}

}
