package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Product p1 = new Product();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product Data: ");
		System.out.print("Name: ");
		p1.productName=sc.nextLine();
		
		System.out.print("Price: ");
		p1.productValue=sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		p1.quantity=sc.nextInt();
		
		System.out.println("Product Data: " +p1.toString());
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		int qntdProdutos=sc.nextInt();
		p1.AddProducts(qntdProdutos);
		
		
		System.out.println("\nUpdated Data: " +p1.productName +", " +p1.productValue +", " +p1.quantity 
				+", Total: R$ " +p1.TotalValueInStock() );
		
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		int qntdRemoved=sc.nextInt();
		p1.RemoveProducts(qntdRemoved);
		
		System.out.println("\nUpdated Data: " +p1.toString());
	
		
		
	}

}
