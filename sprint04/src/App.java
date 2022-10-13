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
		
		
		// mostrar batalhas= analise empate,
		for (int i = 0; i < pontos.length; i++) {
			for (int j = (i+1); j < pontos[i].length+1; j++) {
				
				if (idEquipe[i] != idEquipe[j]) {
					nBatalha++;
					
					System.out.println("---------------------");
					System.out.println("     Batalha " + nBatalha);
					System.out.println("---------------------");

					System.out.println(" Equipe " + idEquipe[i] + " x " + "Equipe " + idEquipe[j]);
					System.out.println("        " + pontos[i][j-1] + " x " + pontos[j][i]);
					
					
					if (pontos[i][j-1] == pontos[j][i]) {
						System.out.println("****** EMPATE ********");
						System.out.println("    Notas Design:");
						System.out.println("    Equipe " + idEquipe[i] + " = " + notaDesign[i]);
						System.out.println("    Equipe " + idEquipe[j] + " = " + notaDesign[j]);

						System.out.println("---------------------");
						if (notaDesign[i] > notaDesign[j]) {
							System.out.println("  Equipe " + idEquipe[i] + " venceu!");
						} else {
							System.out.println("  Equipe " + idEquipe[j] + " venceu!");
						}
					} else {
						System.out.println("---------------------");
						if (pontos[i][j-1] > pontos[j][i]) {
							System.out.println("  Equipe " + idEquipe[i] + " venceu!");
						} else {
							System.out.println("  Equipe " + idEquipe[j] + " venceu!");
						}
					}
					System.out.println("---------------------");
					System.out.println("\n*****************************\n");
					
				}
			}
		}
		
		int aux1, aux2, aux3;
		
		for (int i = 0; i < nEquipes - 1; i++) {
			for (int j = i + 1; j < nEquipes; j++) {
				if (totalPontos[j] > totalPontos[i]) {
					aux1 = totalPontos[j];
					totalPontos[j] = totalPontos[i];
					totalPontos[i] = aux1;

					aux2 = idEquipe[j];
					idEquipe[j] = idEquipe[i];
					idEquipe[i] = aux2;

					aux3 = notaDesign[j];
					notaDesign[j] = notaDesign[i];
					notaDesign[i] = aux3;
				}
			}
		}
		
		for (int i = 0; i < totalPontos.length; i++) {
			for (int j = 0; j < totalPontos.length; j++) {
				if(totalPontos[j]==totalPontos[i]) {
					if(notaDesign[j]>notaDesign[i]) {
						aux1 = totalPontos[j];
						totalPontos[j] = totalPontos[i];
						totalPontos[i] = aux1;

						aux2 = idEquipe[j];
						idEquipe[j] = idEquipe[i];
						idEquipe[i] = aux2;

						aux3 = notaDesign[j];
						notaDesign[j] = notaDesign[i];
						notaDesign[i] = aux3;
					}
				}
			}
			
		}
		
	}
}