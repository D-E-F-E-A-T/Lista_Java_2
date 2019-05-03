package school.cesar.q3;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaDupla {
	
	private ArrayList<Integer> valores = new ArrayList<Integer>();
	
	public void setValores(int valor) {
		
		this.valores.add(valor);
		
	}
	
	public ArrayList<Integer> getValores() {
		return this.valores;
	}
	
	public static String somaDupla(ArrayList<Integer> valores, int alvo) {
		
		int aux = valores.get(0);
		
		for (int item : valores) {
			
			if ((item + aux) == alvo) {
				
				return "indices: " + valores.indexOf(aux) + " e " + valores.indexOf(item);
				
			} else {
				
				aux = item;
				
			}
		}
		
		return "Índices indeterminados";
		
	}
	public static void main(String[] args) {
		
		SomaDupla lista = new SomaDupla();
		Scanner input = new Scanner(System.in);
		int alvo;
		int valor;
		String linha;
		boolean parar = false;
		
		do {
			
			System.out.println("Digite um número: ");
			linha = input.nextLine();
			
			if (!linha.equals("parar")) {
				
				valor = Integer.parseInt(linha);
				lista.setValores(valor);
				
			} else {
				
				parar = true;
			}
			
		} while (!parar);
		
		System.out.println("Digite o valor do alvo: ");
		alvo = input.nextInt();
		input.close();
		
		System.out.println(SomaDupla.somaDupla(lista.getValores(), alvo));
		
	}

}
