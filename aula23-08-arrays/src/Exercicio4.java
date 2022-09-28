import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		String[] dia= {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
		double[] tempDia = new double [7];
		double media=0;
		
		Scanner sc= new Scanner(System.in);
		
		for (int i=0; i< tempDia.length; i++) {
			System.out.print("Insira a temperatura de " +dia[i] );
			tempDia[i]=sc.nextDouble();
			media += tempDia[i];
		}
			media /= tempDia.length;
			
			System.out.println("A média da semana é de: "+String.format("%.2f", media));
			
			for (int i=0; i<tempDia.length; i++) {
				if (tempDia[i]>media) {
					System.out.print(dia[i]);
				}
			}
	}

}
