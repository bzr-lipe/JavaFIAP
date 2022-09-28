package entitiesEx2;

public class Scalculator {
	public String name;
	public double grossSalary, tax;
	public double cSalary;
	
	
	public double netSalary () {
		cSalary=grossSalary-tax;
		return cSalary;
	}
	
	public void increaseSalary(double x) {
		grossSalary=grossSalary+(grossSalary*(x/100));
	}
	
	public String toString() {
		return name
				+", $"
				+netSalary();
	}
}
