package school.cesar.q1.utils;

public class Matrizes {

	public static int[][] multiplicar(int[][] matrix1, int[][] matrix2) {
		
		/* condição para multiplicação de matrizes:
		 * O número de colunas de matrix1 deve ser igual ao número de linhas de matrix2.
		 */
		int[][] matriz = new int[matrix1.length][matrix1.length];
		
		if (matrix1[0].length == matrix2.length) {
			
			//Matriz matriz = new Matriz(matrix1.length);
			
			for (int i =0 ; i < matrix1.length; i++) {
				for (int j = 0; j < matrix2[0].length; j++) {
					for(int k = 0; k < matrix1[0].length; k++) {
						matriz[i][j] = matriz[i][j] + (matrix1[i][k] * matrix2[k][j]);
					}
					
				}
			}
			
		} else {
			return null;
		}
		
		return matriz;
	}
}
