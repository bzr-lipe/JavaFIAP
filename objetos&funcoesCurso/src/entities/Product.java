package entities;

public class Product {
	public String productName;
	public double productValue;
	public int quantity;
	
	
	public double TotalValueInStock() {
		return (quantity*productValue);
	}
	
	public void AddProducts(int x) {
		quantity +=x;
	}
	
	public void RemoveProducts(int x) {
		quantity-=x;
	}
	
	public String toString() {
		return productName
			   +", $ "
			   +String.format("%.2f", productValue)
			   +", "
			   +quantity
			   +" units, Total: $ "
			   +String.format("%.2f", TotalValueInStock()) ;
	}
}
