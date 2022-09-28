import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[10];
		Random generator = new Random();
		boolean repetido;
		
		for (int i=0; i<vect.length;) {
			vect[i]=generator.nextInt(10);
			repetido=false;
			for (int j=0; j<i; j++) {
				if (vect[j]==vect[i]) {
					repetido=true;
					break;
				}
			}
			if (!repetido) {
				System.out.println(vect[i] +"");
				i++;
			}
		}
		
		
		
	}

}
