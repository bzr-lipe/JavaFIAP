package entities;

public class employees {
	private Integer id;
	private String name;
	private Double salary;
	
	public employees() {
	}
	
	public employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary (double percentage) {
		salary += salary*=(percentage/100);
	}
	
	

}
