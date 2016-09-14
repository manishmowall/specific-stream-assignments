package Vendors.Veg;

import Customers.Veg.VegetableCustomer;

public interface VegetableVendor {
	boolean inquiryVegetable(String name);
	double discountToSpecificCustomer(VegetableCustomer customer);
	double getCostOfSpecificVegetable();
	void sellSpecificVegetable();
	LIst<Vegetable> getListOfVegetables();
}

class Vegetable {
	private String vegetableName;

	public String getVegetableName() {
		re
	}
}