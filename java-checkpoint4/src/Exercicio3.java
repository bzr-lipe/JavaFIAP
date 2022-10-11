import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Triangulos serão armazenados?");
		int qntdTriangulos = sc.nextInt();
		
		
		int ladoA[]= new int[qntdTriangulos];
		int ladoB[]= new int[qntdTriangulos];
		int ladoC[]= new int[qntdTriangulos];
		

		
		for (int i = 0; i < qntdTriangulos; i++) {
			System.out.println("\n\n\t  Triangulo " +(i+1) +"\n");
			System.out.println("\tDigite o Lado A:");
			ladoA[i]=sc.nextInt();
			System.out.println("\tDigite o Lado B:");
			ladoB[i]=sc.nextInt();
			System.out.println("\tDigite o Lado C:");
			ladoC[i]=sc.nextInt();
			if (  (ladoA[i]>(ladoB[i]+ladoC[i]))  || (ladoB[i]>(ladoA[i]+ladoC[i]))  ||  (ladoC[i]>(ladoA[i]+ladoB[i])) ) {
				System.out.println("\n   ---------------------------\n     Digite medidas válidas. \n   ---------------------------");
				System.out.print("\t       |\n\t       |\n\t       V");
				i--;
			}else {
				System.out.print("----------------------------------------");
			}
			
			
		}
		
		System.out.println("-------------\n");
		
		for (int i = 0; i < qntdTriangulos; i++) {
			System.out.print("O Triangulo " +(i+1) +" é ");
			if (ladoA[i]==ladoB[i] && ladoB[i]==ladoC[i]) {
				System.out.println("Equilatero (Todos os lados iguais)");
			}else if ((ladoA[i]!=ladoB[i] && ladoB[i]==ladoC[i]) || (ladoA[i]==ladoB[i] && ladoB[i]!=ladoC[i])) {
				System.out.println("Isóceles (Dois lados iguais)");
			}else {
				System.out.println("Escaleno (Todos os lados diferentes)");
			}
		}
		
		System.out.println("\n-----------------------------------------------------");
	}

}
