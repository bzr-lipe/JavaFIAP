import java.util.Random;

public class Exercicio9 {

	public static void main(String[] args) {
		Random generator= new Random();
		int[] x= new int[10];
		int aux;
		
		//Preenche e imprime antes da ordenação
	for(int i=0; i<x.length; i++) {
		x[i]=generator.nextInt(15, 378);
		System.out.print(x[i] + " ");
		
	}
	
	//ordenação dos dados
	for(int j=1; j<=x.length; j++) {
		for(int i=0; i<x.length-1; i++) {
			if(x[i]>x[i+1]) {
				aux =x[i];
			
				x[i]= x[i+1];
				x[i+1]= aux;
				}
		}
	}
			
	System.out.println("\nApós a ordenação: ");
	for(int i=0; i<x.length; i++) {
		System.out.print(x[i] + " ");
		
	}
	
	
		
	}
	
	
	}
