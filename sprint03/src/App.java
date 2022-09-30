import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("Quantas equipes participarão da competição?");
		int nEquipes = sc.nextInt();
		int qtdLutas;

		int[] idEquipes = new int[nEquipes];

		System.out.println("\nOs competidores são:");

		for (int i = 0; i < nEquipes; i++) {
			idEquipes[i] = generator.nextInt(10, 100);
		}

		for (int i = 0; i < nEquipes; i++) {
			for (int j = i + 1; j < nEquipes; j++) {
				while (idEquipes[i] == idEquipes[j]) {
					idEquipes[j]=generator.nextInt();						   				}
			}
			System.out.println("Equipe " + idEquipes[i]);
		}

		System.out.println();

		System.out.println("Quantas lutas cada time participará?");
		qtdLutas = sc.nextInt();

		int[] vitoria = new int[nEquipes];
		int[] derrota = new int[nEquipes];
		int[] empate = new int[nEquipes];

		for (int i = 0; i < nEquipes; i++) {
			int sorteio = 0;
			for (int j = 0; j < qtdLutas; j++) {
				sorteio = generator.nextInt(1, 4);
				if (sorteio == 1) {
					vitoria[i]++;
				} else if (sorteio == 2) {
					derrota[i]++;
				} else if (sorteio == 3) {
					empate[i]++;
				}
			}
			System.out.println("Equipe " + idEquipes[i] + " ---> " + vitoria[i] + " vitórias, " + derrota[i]
					+ " derrotas, " + empate[i] + " empates");
		}

		System.out.println();

		int[] design = new int[nEquipes];

		for (int i = 0; i < nEquipes; i++) {
			System.out.println("Qual a nota de design da equipe " + idEquipes[i] + "?");
			design[i] = sc.nextInt();
		}

		System.out.println("\nPlacar Final:");

		int[] totalPontos = new int[nEquipes];

		for (int i = 0; i < nEquipes; i++) {
			totalPontos[i] = ((vitoria[i] * 5) + (empate[i] * 3));
		}

		int ordena, ordenaTime, ordenaNota;

		for (int i = 0; i < nEquipes - 1; i++) {
			for (int j = i + 1; j < nEquipes; j++) {
				if (totalPontos[j] > totalPontos[i]) {
					ordena = totalPontos[j];
					totalPontos[j] = totalPontos[i];
					totalPontos[i] = ordena;

					ordenaTime = idEquipes[j];
					idEquipes[j] = idEquipes[i];
					idEquipes[i] = ordenaTime;

					ordenaNota = design[j];
					design[j] = design[i];
					design[i] = ordenaNota;
				}
			}
		}

		System.out.println();

		for (int i = 0; i < nEquipes; i++) {
			System.out.println((i + 1) + "º LUGAR --> Equipe " + idEquipes[i] + ": Pontos: " + totalPontos[i]
					+ " - Nota Design: " + design[i]);
		}

		String empateMensagem = "\nHOUVE UM EMPATE, A NOTA DE DESIGN SERÁ O CRITÉRIO DE DESEMPATE\n";

		for (int i = 0; i < nEquipes; i++) {
			for (int j = i + 1; j < nEquipes; j++) {
				if (totalPontos[i] == totalPontos[j]) {
					System.out.print(empateMensagem);
					if (design[j] > design[i]) {
						ordena = totalPontos[j];
						totalPontos[j] = totalPontos[i];
						totalPontos[i] = ordena;

						ordenaTime = idEquipes[j];
						idEquipes[j] = idEquipes[i];
						idEquipes[i] = ordenaTime;

						ordenaNota = design[j];
						design[j] = design[i];
						design[i] = ordenaNota;
					}
					empateMensagem = "";
				}

			}
		}

		System.out.println();
		for (int i = 0; i < nEquipes; i++) {
			System.out.println((i + 1) + "º LUGAR --> Equipe " + idEquipes[i] + ": Pontos: " + totalPontos[i]
					+ " - Nota Design: " + design[i]);
		}
	}
}
