import java.util.Scanner;

public class Exercicio4_v1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		
		System.out.print("valor de a --> ");
		a = teclado.nextDouble();
		if(a == 0) {
			System.out.println("não é uma equação do 2o grau");
		} else {
			System.out.print("valor de b --> ");
			b = teclado.nextDouble();
			System.out.print("valor de c --> ");
			c = teclado.nextDouble();
			delta = calcularDelta(a, b, c);
			if(delta < 0) {
				System.out.println("A equação não tem raiz real");
			} else {
				x1 = calcularx1(a, b, delta);
				x2 = calcularx2(a, b, delta);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}			
		}
	}

	public static double calcularDelta(double a, double b, double c) {
		return (b * b - 4 * a * c);
	}
	
	public static double calcularx1(double a, double b, double delta) {
		double x;
		x = (-b + Math.sqrt(delta)) / (2 * a);
		return x;
	}
	
	public static double calcularx2(double a, double b, double delta) {
		double x;
		x = (-b - Math.sqrt(delta)) / (2 * a);
		return x;
	}
}
