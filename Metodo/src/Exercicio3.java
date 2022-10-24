import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Primeiro valor --> ");
		x = teclado.nextInt();
		System.out.print("Segundo valor --> ");
		y = teclado.nextInt();
		System.out.print("Terceiro valor --> ");
		z = teclado.nextInt();
		
		System.out.println("maior valor = " + acharMaior(x, y, z));

	}
	
	public static int acharMaior(int x, int y, int z) {		
		if(x > y && x > z) {
			return x;
		}
		if(y > z) {
			return y;
		}
		return z;
		
	}

}
