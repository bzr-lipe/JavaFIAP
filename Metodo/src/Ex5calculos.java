import java.util.Scanner;

public class Ex5calculos {
	
	Scanner sc = new Scanner(System.in);
	int y;
	String[] x;

	
	
	public void setarQtndNomes () {
		System.out.println("Quantas pessoas serão Cadastras ?");
		this.y=sc.nextInt();
		sc.nextLine();
		this.x = new String[y];
	}
	
	public void preencher() {
		for (int i = 0; i < x.length; i++) {
			System.out.println("Digite o nome da Pessoa " +(i+1));
			x[i]=sc.nextLine();
		}
	}
	
	public void mostrarNomes() {
		for (int i = 0; i < x.length; i++) {
			System.out.println("Pessoa " +(i+1) +": " +x[i]);
		}
	}
	
	public void inverterNomes() {
		String aux;
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				aux=x[i];
				x[i]=x[j];
				x[j]=aux;
			}
		}
		System.out.println("---------------Nomes Trocados---------------");

	}
}

