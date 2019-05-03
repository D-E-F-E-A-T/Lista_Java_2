package school.cesar.q4.domain;


public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private DiaDaSemana diaDaSemana;
	
	public Data(int dia, int mes, int ano, DiaDaSemana diaDaSemana) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaDaSemana = diaDaSemana;
		
		if (this.mes > 12) {
			this.mes = 12;
		} else if (this.mes < 1) {
			this.mes = 1;
		}
		
		if (this.mes == 2) {
			if (this.dia > 29) {
				this.dia = 1;
				this.mes = 3;
			} else if (this.dia <= 0) {
				this.dia = 1;
			}
		}
		
		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
			if (this.dia > 31) {
				if (this.mes == 12) {
					this.dia = 1;
					this.mes = 1;
				} else {
					this.dia = 1;
					this.mes += 1;
				}
			} else if (this.dia <= 0) {
				this.dia = 1;
			}
		}
		
		if (this.dia <= 0) {
			this.dia = 1;
		}
		
		if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
			if (this.dia > 30) {
				this.dia = 1;
				this.mes +=1;
			} else if (this.dia <= 0) {
				this.dia =1;
			}
		}
	}
	
	public boolean equalsData(Object obj) {
		Data other = (Data) obj;
		
		if (this.dia != other.dia) {
			return false;
		}
		
		if (this.mes != other.mes) {
			return false;
		}
		
		if (this.ano != other.ano) {
			return false;
		}
		
		return true;
	}
	
	public boolean equalsDia(Object obj) {
		
		Data other = (Data) obj;
		
		if (this.dia != other.dia) {
			return false;
		}
		
		return true;
	}
	
	public boolean equalsMes(Object obj) {
		
		Data other = (Data) obj;
		
		if (this.mes != other.mes) {
			return false;
		}
		
		return true;
	}
	
	public boolean equalsAno(Object obj) {
		
		Data other = (Data) obj;
		
		if (this.ano != other.ano) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			
			return true;
			
		}
		if (obj == null) {
			
			return false;
			
		}
		if (getClass() != obj.getClass()) {
			
			return false;
			
		}
		
		Data other = (Data) obj;
		
		if (this.ano != other.ano) {
			
			return false;
			
		}
		if (this.dia != other.dia) {
			
			return false;
			
		}
		
		if (this.diaDaSemana != other.diaDaSemana) {
			
			return false;
			
		}
		
		if (this.mes != other.mes) {
			
			return false;
			
		}
			
		return true;
	}
	
	public String compararDatas(Data data) {
		
		if (this.equalsData(data)) {
			
			return "A data atual é igual à passada como parâmetro";
			
		} else if (this.dia > data.dia && this.equalsMes(data) && this.equalsAno(data)) {
			
			return "A data atual é maior do que a data passada como parâmetro";
			
		} else if (this.equalsDia(data) && this.mes > data.mes && this.equalsAno(data)) {
			
			return "A data atual é maior do que a data passada como parâmetro";
			
		} else if (this.equalsDia(data) && this.equalsMes(data) && this.ano > data.ano) {
			
			return "A data atual é maior do que a data passada como parâmetro";
			
		} else if (this.ano > data.ano) {
			
			return "A data atual é maior do que a passada como parâmetro";
			
		} else {
			
			return "A data atual é menor do que a passada como parâmetro";
			
		}
	}
	
	public String compararDatas(DiaDaSemana diaDaSemana) {
		
		if (this.diaDaSemana.equals(diaDaSemana)) {
			
			return "O dia atual é igual ao do parâmetro.";
			
		} else if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA) && diaDaSemana.equals(DiaDaSemana.TERCA)) {
			
			return "O dia atual é menor do que o do parâmetro.";
			
		} else if (this.diaDaSemana.equals(DiaDaSemana.TERCA) && diaDaSemana.equals(DiaDaSemana.QUARTA)) {
			
			return "O dia atual é menor do que o do parâmetro.";
			
		} else if (this.diaDaSemana.equals(DiaDaSemana.QUARTA) && diaDaSemana.equals(DiaDaSemana.QUINTA)) {
			
			return "O dia atual é menor do que o do parâmetro.";
			
		} else if (this.diaDaSemana.equals(DiaDaSemana.QUINTA) && diaDaSemana.equals(DiaDaSemana.SEXTA)) {
			
			return "O dia atual é menor do que o do parâmetro";
			
		} else if (this.diaDaSemana.equals(DiaDaSemana.SEXTA) && diaDaSemana.equals(DiaDaSemana.SABADO)) {
			
			return "O dia atual é menor do que o do parâmetro";
			
		} else if (this.diaDaSemana.equals(DiaDaSemana.SABADO) && diaDaSemana.equals(DiaDaSemana.DOMINGO)) {
			
			return "O dia atual é menor do que o do parâmetro";
			
		} else {
			
			return "O dia atual é maior do que o do parâmetro";
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Data data1 = new Data(18, 12, 1200, DiaDaSemana.SEGUNDA);
		Data data2 = new Data(20, 10, 1000, DiaDaSemana.DOMINGO);
		
		System.out.println(data1.compararDatas(data2));
		System.out.println(data1.compararDatas(data2.diaDaSemana));
		

	}

	
}
