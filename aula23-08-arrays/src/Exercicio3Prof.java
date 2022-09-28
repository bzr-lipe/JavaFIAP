import java.util.Random;
import java.util.Scanner;

public class Exercicio3Prof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[50];
		Random generator = new Random();
		int total;
		
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = generator.nextInt(1, 50);
			System.out.print(vect[i] + " ");
		}
		
		System.out.println("\n");
		for (int i=0; i<vect.length; i++) {
			total =0;
			for (int j=0; j<vect[i];j++) {
				if(vect[i]%j==0) {
					total++;
				}
			}
			if (total==2) {
				System.out.print(vect[i] + " ");
			}
		}
		
	}
}
