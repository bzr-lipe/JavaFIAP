package application;

import java.util.Scanner;

import entities.triangulo;

public class Program {

	public static void main(String[] args) {
		triangulo retangulo= new triangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert width: ");
		retangulo.width=sc.nextDouble();
		
		System.out.println("Insert heigth: ");
		retangulo.height=sc.nextDouble();
		
		System.out.println(retangulo);
		
	}

}
