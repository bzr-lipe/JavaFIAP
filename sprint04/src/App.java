import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nEquipes;

		Scanner sc = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("Quantas Equipes Participarão?");
		nEquipes = sc.nextInt();

		int idEquipe[] = new int[nEquipes];
		int pontos[][] = new int[nEquipes][nEquipes - 1];
		int notaDesign[] = new int[nEquipes];
		int totalPontos[] = new int[nEquipes];

		for (int i = 0; i < idEquipe.length; i++) {
			idEquipe[i] = (i + 1);
		}

		for (int i = 0; i < pontos.length; i++) {
			for (int j = 0; j < pontos[i].length; j++) {
				pontos[i][j] = generator.nextInt(10);
			}

		}
		
		for (int i = 0; i < nEquipes; i++) {
			notaDesign[i] = generator.nextInt(10);
			
		}
		
		
		

		System.out.println("    Resultados: \n");

		int nBatalha = 0;
		
		// coletar total
		for (int i = 0; i < pontos.length; i++) {
			for (int j = 0; j < pontos[i].length; j++) {
				totalPontos[i] += pontos[i][j];

			}
		}
		
		for (int i = 0; i < pontos[i].length; i++) {
			for (int j = 0; j < (pontos.length-1)-i; j++) {
				nBatalha++;
				System.out.println("     Batalha " + nBatalha);
				System.out.println("Equipe " + idEquipe[i] + " x " + "Equipe " + idEquipe[j+1]);
				
				if (pontos[i][j] == pontos[j+1][i]) {
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Houve um empate, nota de Design será usado como critério para desempate");
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Equipe " +idEquipe[i] +"= " +notaDesign[i]);
					System.out.println("Equipe " +idEquipe[j+1] +"= " +notaDesign[j+1]);
					System.out.println("--------------------------------");
					if (notaDesign[i]<notaDesign[j+1]) {
						System.out.println("Equipe " +idEquipe[i] +" venceu!");
					} else{
						System.out.println("Equipe " +idEquipe[i+1] +" venceu!");
					}
					System.out.println("--------------------------------");
				}else {
					System.out.println("       " +pontos[i][j] +" x " +pontos[j+1][i]);
					System.out.println();
				}
				
				
				
			}
		}

	}

}
