import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex6funcs {
	int[][] x;
	
	public void preencher(int y) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("Quantas linhas/colunas terá a Matriz?");
		y=sc.nextInt();
		this.x= new int[y][y];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j]=generator.nextInt(100);
			}
		}
	}
	
	public void mostrarMatriz() {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.println(x[i][j]);
			}
			System.out.println();
		}
	}
	
	public int mostarMaiorPorLinha() {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.println();
			}
		}
	}
}
