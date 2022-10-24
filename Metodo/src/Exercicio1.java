import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.print("Valor inteiro e positivo --> ");
		valor = teclado.nextInt();
		
		if(valor <= 0) {
			System.out.println("o valor deve ser positivo");
		} else {
			imprimir(valor);
		}
	}
	
	public static void imprimir(int y) {
		for(int cont = -y; cont <= y; cont++) {
			if(cont != 0 && y % cont == 0) {
				System.out.print(cont + "  ");
			}
		}
	}
}


