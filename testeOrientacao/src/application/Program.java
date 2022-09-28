package application;

import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		int pCerveja=6, qntdClientes=0;
		Cliente c1, c2, c3, c4, c5;
		c1 = new Cliente();
		c2 = new Cliente();
		c3 = new Cliente();
		c4 = new Cliente();
		c5 = new Cliente();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bem-vindx ao sistema de entrega de cevejas");
		System.out.println("Começe digitando seu nome completo: ");
		c1.nome=sc.nextLine();
		System.out.println("Digite sua idade: ");
		c1.idade=sc.nextInt();
		System.out.println("Digite a quantidade de cervejas desejadas: ");
		c1.qntdCervejas=sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o endereço: ");
		c1.endereco=sc.nextLine();
		
		qntdClientes++;
		
		
		System.out.println("1) Para para efetuar um novo pedido\n2) Resumo dos pedidos ");
		int option=sc.nextInt();
		
		if (option==2) {
			System.out.println("Escolha o pedido (Min=1, Max=" +qntdClientes +")");
			option=sc.nextInt();
			if (option==1) {
				System.out.println("-----------------------------------------------------");
				System.out.println("Nome: " +c1.nome +"\nIdade: " +c1.idade +"\nEndereço: " +c1.endereco +"\nQuantidade: " +c1.qntdCervejas +" cervejas.\n\nValor Total: R$" +(c1.qntdCervejas*pCerveja));
				System.out.println("-----------------------------------------------------");
				
					if (c1.idade>=18) {
						System.out.println("Pedido Pronto para ser enviado!");
					}else {
						System.out.println("Idade Mínima não atingida, Pedido Cancelado");
						
					}
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
