import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nAlunos, nSalas, media=0; 
		
		
		System.out.print("Numero de salas: ");
		nSalas=sc.nextInt();
		
		System.out.println("Numero de alunos: ");
		nAlunos=sc.nextInt();
		
		int[] notas = new int[nAlunos];
		
		for (int i=0; i<notas.length; i++) {
			System.out.println("Digite a média");
			notas[i]=sc.nextInt();
			media+=notas[i];
		}
		
			media=media/nAlunos;
			
			
			System.out.println(media);
		
		
		
		
	}

}
