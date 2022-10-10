import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		int[] binario = new int[32];
		int num;
		int contador;
		
		do {
			System.out.println("Digite o número que deseja converter");
			 num = sc.nextInt();
		}while(num<1);

		for (contador = 0; num > 0; contador++) {
			binario[contador] = num % 2;
			num = num / 2;

		}
		
		System.out.println("\nResultado em Binário:");
		for (int j = contador - 1; j >= 0; j--) {
			System.out.print(binario[j] + "");
		}
		
		

	};

}
