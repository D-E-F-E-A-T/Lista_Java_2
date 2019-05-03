package school.cesar.q2;

import java.util.ArrayList;

public class EquacaoSegundoGrau {
	
	private double a;
	private double b;
	private double c;
	
	private ArrayList<Double> raizes = new ArrayList<Double>(); // cria array privado raizes
	
	public EquacaoSegundoGrau(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public ArrayList<Double> getRaizes() {
		
		double delta = (this.b * this.b) - (4 * (this.a * this.c));
		
		if (delta > 0) {
			
			this.raizes.add(((this.b * (-1)) + (Math.sqrt(delta))) / (2 * this.a));
			this.raizes.add(((this.b * (-1)) - (Math.sqrt(delta))) / (2 * this.a));
			
			return this.raizes;
			
		} else if (delta == 0) {
			
			this.raizes.add((this.b * (-1)) / (2 * this.a));
			
			return this.raizes;
			
		} else {
			
			return null;
			
		}
		
	}
	
	@Override
	public String toString() {
		
		return "a: " + this.a + "\n" + "b: " + this.b + "\n" + "c: " + this.c + "\n" + "raizes: " + this.raizes;
		
	}
	
	@Override
	public int hashCode() {
		final int primo = 31;
		int resultado = 1;
		
		resultado = (primo * resultado) + (int) this.a;
		resultado = (primo * resultado) + (int) this.b;
		resultado = (primo * resultado) + (int) this.c;
		
		return resultado;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (getClass() != obj.getClass()) {
			return false;
		}
		
		EquacaoSegundoGrau other = (EquacaoSegundoGrau) obj;
		
		if (this.a != other.a) {
			
			return false;
			
		}
		if (this.b != other.b) {
			
			return false;
			
		}
		if (this.c != other.c) {
			
			return false;
			
		}
		
		if (this.raizes != other.raizes) {
			
			return false;
			
		}
		
		return true;
			
	}

	public static void main(String[] args) {
		
		EquacaoSegundoGrau equacao1 = new EquacaoSegundoGrau(1, 4, 3);
		EquacaoSegundoGrau equacao2 = equacao1;
		
		equacao1.getRaizes();
		
		System.out.println(equacao1);
		System.out.println(equacao2);
		System.out.printf("As equações são iguais? %b%n", equacao1.equals(equacao2));

	}

}
