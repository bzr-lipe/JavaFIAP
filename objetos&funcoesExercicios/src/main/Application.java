package main;

import java.util.Scanner;

import entitiesEx2.Scalculator;

public class Application {

	public static void main(String[] args) {
		Scalculator func1 = new Scalculator();
		double percentage;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Name: ");
		func1.name=sc.nextLine();
		
		System.out.println("Gross Salary: ");
		func1.grossSalary=sc.nextDouble();
		
		System.out.println("Tax: ");
		func1.tax=sc.nextDouble();
		
		System.out.println("Employe: " +func1.toString());
		
		System.out.println("Witch percentage to increase salary? ");
		percentage=sc.nextDouble();
		
		func1.increaseSalary(percentage);
		
		System.out.println("Updated Data: " +func1.toString());
	}

}
