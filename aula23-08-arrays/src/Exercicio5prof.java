import java.util.Scanner;

public class Exercicio5prof {

	public static void main(String[] args) {
		String[] dia= {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
		double[] tempDia = new double [7];
		double media=0;
		String grafico="-";
		
		Scanner sc= new Scanner(System.in);
		
		for (int i=0; i< tempDia.length; i++) {
			System.out.print("Insira a temperatura de " +dia[i] );
			tempDia[i]=sc.nextDouble();
		}
			
			
			for (int i=0; i<tempDia.length; i++) {					
					System.out.print(String.format("%7s", dia[i]) + "");
					for(int j=0; j< tempDia[i]; j++) {
						System.out.print("-");
					}
					System.out.println();
				}
			}
	}


