package school.cesar.q1.domain;

import static school.cesar.q1.utils.Matrizes.multiplicar;
import java.util.ArrayList;
import java.util.Random;

public class Matriz {
	
	private int[][] matrix;
	
	public Matriz(int numero) {
		this.matrix = new int[numero][numero];
	}
	
	public Matriz(int linha, int coluna) {
		this.matrix = new int[linha][coluna];
	}
	
	public ArrayList<Integer> diagonal(Matriz matriz, int numero) {
		int i = 0;
		int j = 0;
		ArrayList<Integer> diagonal = new ArrayList<Integer>();
		
		do {
			
			diagonal.add(matriz.matrix[i][j]);
			i += 1;
			j += 1;
			
		} while (i < numero && j < numero);
		
		return diagonal;
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int numero = 2;
		Matriz matriz1 = new Matriz(numero);
		Matriz matriz2 = new Matriz(numero);
		Matriz matriz3 = new Matriz(numero);
		
		for (int i = 0; i < numero; i++) {
			
			for (int j = 0; j < numero; j++) {
				
				matriz1.matrix[i][j] = random.nextInt(100);
				matriz2.matrix[i][j] = random.nextInt(100);
				
			}
			
		}
		
		matriz3.matrix = multiplicar(matriz1.matrix, matriz2.matrix);
		
		for (int k = 0; k < numero; k++) {
			
			for (int m = 0; m < numero; m++) {
				
				System.out.printf("%d ",matriz3.matrix[k][m]);
				
			}
			
			System.out.println();
			
		}
		
	}

}
