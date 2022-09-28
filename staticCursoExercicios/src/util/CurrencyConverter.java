package util;

public class CurrencyConverter {
	public static final double IOF=0.06;
	
	public static double dollarPrice;
	
	
	public static double Convert(double x) {
		dollarPrice*=x;
		dollarPrice-=(dollarPrice*IOF);
		return dollarPrice;
	}
}
