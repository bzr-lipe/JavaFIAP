import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[100];
		Random generator = new Random();

		for (int i = 0; i < vect.length; i++) {
			vect[i] = generator.nextInt(100);
			if (vect[i]%2==0) {	
			}else {
				System.out.println(vect[i]);
			}
			

		}

	}
}
