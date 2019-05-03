package school.cesar.q5;

import java.util.Random;

public class Craps {
	
	public Craps() {
		
	}
	
	public int somaDados(int dado1, int dado2) {
		
		return (dado1 + dado2);
		
	}
	
	public void outraRodada(int pontuacao, int dado1, int dado2) {
		
		int novaPontuacao = 0;
		
		do {
			
			if (somaDados(dado1, dado2) != 7) {
				
				novaPontuacao = somaDados(dado1, dado2);
				
			} else if (somaDados(dado1, dado2) == pontuacao) {
				
				novaPontuacao = pontuacao;
				System.out.println("O jogador vence.");
				
				break;
				
			} else {
				
				System.out.println("O jogador perde.");
				
				break;
			}
		} while (novaPontuacao != pontuacao);
		
		
	}
	
	public void partidasDeCraps(int partidas) {
		Random random = new Random();
		
		int dado1 = random.nextInt(6);
		int dado2 = random.nextInt(6);
		int pontuacao;
		
		if (dado1 == 0) {
			
			dado1 = 1;
			
		}
		
		if (dado2 == 0) {
			
			dado2 = 1;
			
		}
		
		for (int i = 1; i <= partidas; i++) {
			
			if (somaDados(dado1, dado2) == 7 || somaDados(dado1, dado2) == 11) {
				
				System.out.printf("partida %d: O jogador venceu.%n", i);
				
			} else if (somaDados(dado1, dado2) == 2 || somaDados(dado1, dado2) == 3 || somaDados(dado1, dado2) == 12) {
				
				System.out.printf("partida %d: O jogagor perdeu.\n", i);
				
			} else if (somaDados(dado1, dado2) == 4 || somaDados(dado1, dado2) == 5 || somaDados(dado1, dado2) == 6 || somaDados(dado1, dado2) == 8 || somaDados(dado1, dado2) == 9 || somaDados(dado1, dado2) == 10) {
				
				pontuacao = somaDados(dado1, dado2);
				System.out.printf("partida %d. A partida continua.", i);
				outraRodada(pontuacao, dado1, dado2);
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		Craps craps = new Craps();
		
		int partidas = 30;
		
		craps.partidasDeCraps(partidas);
		
		

	}

}
