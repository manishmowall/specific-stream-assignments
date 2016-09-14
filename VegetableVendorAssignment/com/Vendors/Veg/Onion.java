package Vendors.Veg;

public class Onion implements Vegetable {
	private static final double UNIT_PRICE = 10;

	public double calculatePrice(int quantity) {
		return quantity * UNIT_PRICE;

	} 
}