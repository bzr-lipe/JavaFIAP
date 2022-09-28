import java.util.Scanner;

public class Exercicio5 {

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
					System.out.print(dia[i] +": " +grafico.repeat((int) tempDia[i])+"\n");
				}
			}
	}


