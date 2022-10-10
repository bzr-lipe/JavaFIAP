import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();

		int nMercados;
		int nProdutos;

		System.out.println("Quantos Mercados serão visitados? ");
		nMercados = sc.nextInt();

		System.out.println();

		int decidir;
		int dzContador = 0;

		
		
		System.out.println("1)Usar quantidades geradas aleatóriamente\n2)Usar quantidades do PDF do CHECKPOINT");

		do {
			System.out.println("\nDigite sua opção: ");
			decidir = sc.nextInt();
		}while (decidir !=1 && decidir !=2);
		

		if (decidir == 1) {

			System.out.println("Quantos Produtos serão comprados?");
			nProdutos = sc.nextInt();

			double quantidade[] = new double[nProdutos];

			double tabela[][] = new double[nMercados][nProdutos];

			System.out.println();
			System.out.println("Quantidade Desejada: \n");
			for (int i = 0; i < quantidade.length; i++) {
				quantidade[i] = generator.nextDouble(1, 10);
				int gerarMedida = generator.nextInt(3);

				if (gerarMedida == 0) {
					if (dzContador == 0) {
						if (quantidade[i] > 1) {
							System.out.print("Produto " + (i + 1) + ": ");
							System.out.print((int) quantidade[i] + " Duzias");
							dzContador = 1;
						} else {
							System.out.print("Produto " + (i + 1) + ": ");
							System.out.println((int) quantidade[i] + " Duzia");
						}
						System.out.println();
					} else {
						gerarMedida++;
					}
				}

				if (gerarMedida == 1) {
					System.out.print("Produto " + (i + 1) + ": ");
					if (quantidade[i] < 1) {
						System.out.print((int) quantidade[i] + " Kg");

					} else {
						System.out.print(String.format("%.2f", quantidade[i]) + " kgs");
					}
					System.out.println();
				}

				if (gerarMedida == 2) {
					System.out.print("Produto " + (i + 1) + ": ");
					if (quantidade[i] > 1) {
						System.out.print(String.format("%.1f", quantidade[i]) + " Litros");
					} else {
						System.out.print((int) quantidade[i] + " Litro");
					}
					System.out.println();
				}
			}

			System.out.println();
			System.out.print("                 ");

			for (int i = 0; i < nProdutos; i++) {
				if (i < 10) {
					System.out.print("Produto " + (i + 1) + "      ");
				} else if (i > 10) {
					System.out.print("Produto " + (i + 1) + "    ");
				}
			}

			System.out.println();

			for (int i = 0; i < tabela.length; i++) {
				if ((i + 1) >= 10) {
					System.out.print("Mercado " + (i + 1) + "--->   ");
				} else {
					System.out.print("Mercado " + (i + 1) + "---->   ");
				}

				for (int j = 0; j < tabela[i].length; j++) {
					tabela[i][j] = generator.nextDouble(1, 9);
					System.out.print(String.format(" R$ %.2f", tabela[i][j]) + "   |   ");
				}
				System.out.println();
			}

			System.out.println();
			System.out.println("TOTAL:");

			double total = 0;
			double MercadoBarato[] = new double[nMercados];

			for (int i = 0; i < nMercados; i++) {
				System.out.print("\nMercado " + (i + 1) + ": R$");
				for (int j = 0; j < nProdutos; j++) {
					total += (quantidade[j] * tabela[i][j]);
				}
				MercadoBarato[i] = total;
				System.out.printf("%.2f", total);
				total = 0;
			}

			double aux1 = MercadoBarato[0];
			int aux2=0;

			for (int i = 0; i < MercadoBarato.length; i++) {
				if (MercadoBarato[i] < aux1) {
					aux1 = MercadoBarato[i];
					aux2 = i;
				}
			}
			System.out.println("\n");
			System.out.println("O mercado mais barato é o Mercado " + (aux2 + 1) + " com toda a compra saindo por: R$ "
					+ String.format("%.2f", aux1));
		}

		else if (decidir == 2) {

			double tabela[][] = new double[nMercados][4];

			int farinha = 4, acucar = 3, leite = 3, ovo = 1;

			System.out.println();
			System.out.println("Quantidade Desejada: \n");

			int arr[] = { 4, 3, 3, 1 };

			System.out.println("Farinha: " + arr[0] + " Kgs\n" + "A�ucar:  " + arr[1] + " Kgs\n" + "Leite:   " + arr[2]
					+ " L\n" + "ovo:     " + arr[3] + " Duzia\n");

			System.out.println();
			System.out.print("                 ");

			
			System.out.print("Farinha (R$/kg)      ");
			System.out.print("Acucar (R$/kg)      ");
			System.out.print("Leite (R$/l)      ");
			System.out.print("   Ovo (R$/dz)      ");

			System.out.println();

			for (int i = 0; i < tabela.length; i++) {
				if ((i + 1) >= 10) {
					System.out.print("Mercado " + (i + 1) + "--->    ");
				} else {
					System.out.print("Mercado " + (i + 1) + "---->    ");
				}
				for (int j = 0; j < tabela[i].length; j++) {
					tabela[i][j] = generator.nextDouble(1, 9);
					System.out.print(String.format(" R$ %.2f", tabela[i][j]) + "      |      ");
				}
				System.out.println();
			}

			System.out.println();
			System.out.println("TOTAL: ");

			double total = 0;
			double MercadoBarato[] = new double[nMercados];

			for (int i = 0; i < nMercados; i++) {

				System.out.print("\nMercado " + (i + 1) + ": R$");
				for (int j = 0; j < 4; j++) {
					total += (arr[j] * tabela[i][j]);

				}
				MercadoBarato[i] = total;
				System.out.printf(" %.2f", total);
				total = 0;
			}
			
			
			double aux1 = MercadoBarato[0];
			int aux2=0;

			for (int i = 0; i < MercadoBarato.length; i++) {
				if (MercadoBarato[i] < aux1) {
					aux1 = MercadoBarato[i];
					aux2 = i;
				}
			}
			System.out.println("\n");
			System.out.println("O mercado mais barato é o Mercado " + (aux2 + 1) + " com toda a compra saindo por: R$ "
					+ String.format("%.2f", aux1));

		}else {
			System.out.println("Opção Inválida");
		}
	}
}

