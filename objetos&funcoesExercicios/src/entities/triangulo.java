package entities;

public class triangulo {
	public double width, height;
	
	public double area() {
		double area;
		area=width*height;
		return area;
	}
	
	public double perimeter() {
		double perimeter;
		perimeter= (width*2)+(height*2);
		return perimeter;
	}
	
	public double Diagonal() {
		double diagonal;
		diagonal= Math.sqrt((width*width+height*height));
		return diagonal;
	}
	
	public String toString() {
		return area()
				+"\n"
				+perimeter()
				+"\n"
				+Diagonal();
	}
}
