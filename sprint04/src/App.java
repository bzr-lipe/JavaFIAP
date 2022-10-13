import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nEquipes;
		//
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("-----------------------------------");
		System.out.println(" Bem Vindo ao Campeonato SPRINT 04");
		System.out.println("-----------------------------------");
		System.out.println("Regras:");
		System.out.println(
				"-Na primeira fase, as vitórias valem 5 pontos, e empates valem 3 pontos, e derrotas valem 0 pontos.\n-A partir da Segunda Fase as Vitórias valerão 2 pontos, e empates valerão 1 ponto \n-Em caso de empate, a nota de Design será usada como critério de desempate\n");

		System.out.println("Quantas Equipes Participarão?");
		nEquipes = sc.nextInt();

		int idEquipe[] = new int[nEquipes];
		int pontos[][] = new int[nEquipes][nEquipes - 1];
		int notaDesign[] = new int[nEquipes];
		int totalPontos[] = new int[nEquipes];
		int totalPontosFase1[] = new int[nEquipes];
		int vitorias[] = new int[nEquipes];
		int derrotas[] = new int[nEquipes];
		int empates[] = new int[nEquipes];
		int vEmpates[] = new int[nEquipes];

		for (int i = 0; i < idEquipe.length; i++) {
			idEquipe[i] = (i + 1);
		}

		for (int i = 0; i < pontos.length; i++) {
			for (int j = 0; j < pontos[i].length; j++) {
				pontos[i][j] = generator.nextInt(11);
			}
		}

		for (int i = 0; i < nEquipes; i++) {
			notaDesign[i] = generator.nextInt(10);
		}

		
	
		int nBatalha = 0;

		// coletar total

		System.out.println("Como Deseja assistir a primeira rodada ?");
		System.out.println("1 --> Mostrar todas as Lutas");
		System.out.println("2 --> Mostrar resumo das lutas");
		int opcao = sc.nextInt();

		System.out.println("    Resultados: \n"); 
		
		switch (opcao) {
		case 1:
			System.out.println();
			for (int i = 0; i < pontos.length; i++) {
				for (int j = (i + 1); j < pontos[i].length + 1; j++) {

					if (idEquipe[i] != idEquipe[j]) {
						nBatalha++;

						System.out.println("---------------------");
						System.out.println("     Batalha " + nBatalha);
						System.out.println("---------------------");

						System.out.println(" Equipe " + idEquipe[i] + " x " + "Equipe " + idEquipe[j]);
						System.out.println("        " + pontos[i][j - 1] + " x " + pontos[j][i]);

						if (pontos[i][j - 1] == pontos[j][i]) {
							System.out.println("****** EMPATE ********");
							System.out.println("    Notas Design:");
							System.out.println("    Equipe " + idEquipe[i] + " = " + notaDesign[i]);
							System.out.println("    Equipe " + idEquipe[j] + " = " + notaDesign[j]);

							System.out.println("---------------------");
							if (notaDesign[i] > notaDesign[j]) {
								System.out.println("  Equipe " + idEquipe[i] + " venceu!");
								totalPontos[i] += 3;
								totalPontosFase1[i] += 3;
								empates[i]++;
								vEmpates[i]++;
								derrotas[j]++;
							} else {
								System.out.println("  Equipe " + idEquipe[j] + " venceu!");
								totalPontos[j] += 3;
								totalPontosFase1[j] += 3;
								derrotas[i]++;
								empates[j]++;
								vEmpates[j]++;
							}
						} else {
							System.out.println("---------------------");
							if (pontos[i][j - 1] > pontos[j][i]) {
								System.out.println("  Equipe " + idEquipe[i] + " venceu!");
								totalPontos[i] += 5;
								totalPontosFase1[i] += 5;
								vitorias[i]++;
								derrotas[j]++;
							} else {
								System.out.println("  Equipe " + idEquipe[j] + " venceu!");
								totalPontos[j] += 5;
								totalPontosFase1[j] += 5;
								vitorias[j]++;
								derrotas[i]++;
							}
						}
						System.out.println("---------------------");
						System.out.println("\n*****************************\n");

					}
				}
			}
			break;
		case 2: {
			System.out.println();
			for (int i = 0; i < pontos.length; i++) {
				for (int j = (i + 1); j < pontos[i].length + 1; j++) {
					if (idEquipe[i] != idEquipe[j]) {
						nBatalha++;
						if (pontos[i][j - 1] == pontos[j][i]) {
							empates[i]++;
							empates[j]++;
							if (notaDesign[i] > notaDesign[j]) {
								totalPontos[i] += 3;
								totalPontosFase1[i] += 3;
								vEmpates[i]++;
								derrotas[j]++;
							} else {
								totalPontos[j] += 3;
								totalPontosFase1[j] += 3;
								derrotas[i]++;
								vEmpates[j]++;
							}
						} else {
							if (pontos[i][j - 1] > pontos[j][i]) {
								totalPontos[i] += 5;
								totalPontosFase1[i] += 5;
								vitorias[i]++;
								derrotas[j]++;
							} else {
								totalPontos[j] += 5;
								totalPontosFase1[j] += 5;
								vitorias[j]++;
								derrotas[i]++;
							}
						}
					}
				}
			}

			for (int i = 0; i < vitorias.length; i++) {
				System.out.print("Equipe " + (i + 1) + ": " + vitorias[i] + " vitórias, " + derrotas[i] + " derrotas");
				if (empates[i] >= 1) {
					if (empates[i] > 1) {
						System.out.println(", " + empates[i] + " empates (" + vEmpates[i] + " vitórias).");
					} else {
						System.out.println(", " + empates[i] + " empate (" + vEmpates[i] + " vitórias).");
					}
				} else {
					System.out.println(".");
				}
			}
			break;
		}

		default: {
			System.out.println("Opção Inválida");
		}
		}

		// Organizar TOP3
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

				if (totalPontos[j] == totalPontos[i]) {
					if (notaDesign[j] > notaDesign[i]) {
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

		System.out.println("TOP 3:\n");

		if (totalPontos[0] == totalPontos[1]) {
			System.out.println("1) Equipe " + idEquipe[0] + ": " + totalPontos[0] + " Pontos --> Nota de Design: "
					+ notaDesign[0]);
			System.out.println("2) Equipe " + idEquipe[1] + ": " + totalPontos[1] + " Pontos --> Nota de Design: "
					+ notaDesign[1]);
			System.out.println("3) Equipe " + idEquipe[2] + ": " + totalPontos[2] + " Pontos");
		} else if (totalPontos[1] == totalPontos[2]) {
			System.out.println("1) Equipe " + idEquipe[0] + ": " + totalPontos[0] + " Pontos");
			System.out.println("2) Equipe " + idEquipe[1] + ": " + totalPontos[1] + " Pontos --> Nota de Design: "
					+ notaDesign[1]);
			System.out.println("3) Equipe " + idEquipe[2] + ": " + totalPontos[2] + " Pontos --> Nota de Design: "
					+ notaDesign[2]);
		} else {
			System.out.println("1) Equipe " + idEquipe[0] + ": " + totalPontos[0] + " Pontos");
			System.out.println("2) Equipe " + idEquipe[1] + ": " + totalPontos[1] + " Pontos");
			System.out.println("3) Equipe " + idEquipe[2] + ": " + totalPontos[2] + " Pontos");
		}

		System.out.println("\n---------------------------");
		System.out.println("     CONFRONTOS FINAIS ");
		System.out.println("---------------------------\n");

		System.out.println("Como Deseja assistir a segunda rodada ?");
		System.out.println("1 --> Mostrar todas as Lutas");
		System.out.println("2 --> Mostrar resumo das lutas");
		opcao = sc.nextInt();
		
		System.out.println("    Resultados:"); 

		int pontosFINAL[][] = new int[3][2];

		for (int i = 0; i < pontosFINAL.length; i++) {
			for (int j = 0; j < pontosFINAL[i].length; j++) {
				pontosFINAL[i][j] = generator.nextInt(11);
			}
		}

		// zerando arrays
		for (int i = 0; i < nEquipes; i++) {
			vitorias[i] = 0;
			derrotas[i] = 0;
			empates[i] = 0;
			vEmpates[i] = 0;
			totalPontos[i] = 0;
		}

		nBatalha = 0;

		switch (opcao) {
		case 1:
			System.out.println();
			for (int i = 0; i < pontosFINAL.length; i++) {
				for (int j = (i + 1); j < pontosFINAL[i].length + 1; j++) {
					if (idEquipe[i] != idEquipe[j]) {
						nBatalha++;

						System.out.println("---------------------");
						System.out.println("     Batalha " + nBatalha);
						System.out.println("---------------------\n");

						System.out.println(" Equipe " + idEquipe[i] + " x " + "Equipe " + idEquipe[j]);
						System.out.println("        " + pontosFINAL[i][j - 1] + " x " + pontosFINAL[j][i]);

						if (pontos[i][j - 1] == pontos[j][i]) {
							System.out.println("****** EMPATE ********");
							System.out.println("    Notas Design:");
							System.out.println("    Equipe " + idEquipe[i] + " = " + notaDesign[i]);
							System.out.println("    Equipe " + idEquipe[j] + " = " + notaDesign[j]);
							System.out.println("---------------------");

							if (notaDesign[i] > notaDesign[j]) {
								System.out.println("  Equipe " + idEquipe[i] + " venceu!");
								empates[i]++;
								vEmpates[i]++;
								derrotas[j]++;
								totalPontos[i] += 1;

							} else {
								System.out.println("  Equipe " + idEquipe[j] + " venceu!");
								empates[j]++;
								vEmpates[j]++;
								derrotas[i]++;
								totalPontos[j] += 1;

							}
						} else {
							System.out.println("---------------------");
							if (pontosFINAL[i][j - 1] > pontosFINAL[j][i]) {
								System.out.println("  Equipe " + idEquipe[i] + " venceu!");
								totalPontos[i] += 2;
								vitorias[i]++;
								derrotas[j]++;
							} else {
								System.out.println("  Equipe " + idEquipe[j] + " venceu!");
								totalPontos[j] += 2;
								vitorias[j]++;
								derrotas[i]++;
							}
						}
						System.out.println("---------------------");
						System.out.println("\n*****************************\n");

					}
				}

			}
			break;
		case 2:
			System.out.println();
			for (int i = 0; i < pontosFINAL.length; i++) {
				for (int j = (i + 1); j < pontosFINAL[i].length + 1; j++) {
					if (idEquipe[i] != idEquipe[j]) {
						nBatalha++;
						if (pontos[i][j - 1] == pontos[j][i]) {
							if (notaDesign[i] > notaDesign[j]) {
								empates[i]++;
								vEmpates[i]++;
								derrotas[j]++;
								totalPontos[i] += 1;
								totalPontosFase1[i] += 1;
							} else {
								empates[j]++;
								vEmpates[j]++;
								derrotas[i]++;
								totalPontos[j] += 1;
								totalPontosFase1[j] += 1;

							}
						} else {
							if (pontosFINAL[i][j - 1] > pontosFINAL[j][i]) {
								totalPontos[i] += 2;
								totalPontosFase1[i] += 2;
								vitorias[i]++;
								derrotas[j]++;
							} else {
								totalPontos[j] += 2;
								totalPontosFase1[j] += 2;
								vitorias[j]++;
								derrotas[i]++;
							}
						}
					}
				}

			}
			for (int i = 0; i < 3; i++) {
				System.out.print("Equipe " + idEquipe[i] + ": " + vitorias[i] + " vitórias, " + derrotas[i] + " derrotas");
				if (empates[i] >= 1) {
					if (empates[i] > 1) {
						System.out.println(", " + empates[i] + " empates (" + vEmpates[i] + " vitórias).");
					} else {
						System.out.println(", " + empates[i] + " empate (" + vEmpates[i] + " vitórias).");
					}
				} else {
					System.out.println(".");
				}
			}
			break;
		default:
			System.out.println("Opção Inválida");
			break;

		}
		
		
		
		for (int i = 0; i < pontosFINAL.length; i++) {
			for (int j = i + 1; j < pontosFINAL[i].length; j++) {
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
		
		System.out.println();
		for (int i = 0; i <1; i++) {
			System.out.println("A equipe campeã é:");
			System.out.println("Equipe " +idEquipe[i] +" com " +(totalPontos[i]+totalPontosFase1[i]) +" pontos (" +totalPontosFase1[i] +" pontos na primeira rodada, "  +totalPontos[i] +" na segunda rodada)");

		}
	

		// gambiarra made by felipe
	}
}