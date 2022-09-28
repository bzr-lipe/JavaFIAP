package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <employees> list = new ArrayList<>();
		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee: #" +(i+1));
			System.out.print("ID: ");
			Integer id=sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary");
			Double salary=sc.nextDouble();
			
			employees emp = new employees(id, name, salary);
			
			list.add(emp);		
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Integer position = hasID(list, idsalary);
		
		if (position ==null) {
			System.out.println("This id does not exist");
		}else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(position).increaseSalary(percent);
		}
		
		
		
		sc.close();
	}
	
	public static Integer hasID(List<employees> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}	
		return null;
	}

}
