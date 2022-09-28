import java.util.Scanner;

public class Exercicio6prof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdAluno, qtdSala;
		int[] nota;
		double media, porcentagem;

		System.out.println("Quantidade de salas: ");
		qtdSala = sc.nextInt();

		for (int sala = 1; sala <= qtdSala; sala++) {
			System.out.println("\nSala #" + sala);
			System.out.print("Quantidade de Alunos: ");
			qtdAluno = sc.nextInt();
			nota = new int[qtdAluno];
			media = 0;
			for (int j = 0; j < qtdAluno; j++) {
				System.out.print("Nota do aluno # " + (j + 1) + " ");
				nota[j] = sc.nextInt();
				media += nota[j];

			}
			media /= qtdAluno;
			System.out.println("Média da sala: " + String.format("%.3f", media));
			porcentagem = 0;
			for (int i = 0; i < nota.length; i++) {
				if (nota[i] > media) {
					porcentagem++;

				}
				
			}porcentagem = porcentagem / qtdAluno * 100;
			System.out.println("Acima da média: " + String.format("%.3f", porcentagem) +"%");
		}

	}

}
