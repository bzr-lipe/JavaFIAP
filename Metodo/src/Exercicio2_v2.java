import java.util.Scanner;

public class Exercicio2_v2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.print("Lado 1 --> ");
		lado1 = teclado.nextInt();
		System.out.print("Lado 2 --> ");
		lado2 = teclado.nextInt();
		System.out.print("Lado 3 --> ");
		lado3 = teclado.nextInt();
		
		if(validar(lado1, lado2, lado3)) {
			classificar(lado1, lado2, lado3);
		} else {
			System.out.println("os valores não formam um triângulo");
		}
	}

	public static boolean validar(int lado1, int lado2, int lado3) {
		return (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2);
	}
	
	public static void classificar(int x, int y, int z) {
		if(x == y && y == z) {
			System.out.println("Triângulo equilátero");
		} else if(x == y || x == z || y == z) {
			System.out.println("Triângulo isósceles");
		} else {
			System.out.println("Triângulo escaleno");
		}
	}
	
}
