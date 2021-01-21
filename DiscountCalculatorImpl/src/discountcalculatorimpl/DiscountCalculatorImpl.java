package discountcalculatorimpl;

import discountcalculator.DiscountCalculatorInterface;

public class DiscountCalculatorImpl implements DiscountCalculatorInterface {

	@Override
	public double calculateDiscount(double initialPrice, double discount) {
		 return (100-discount)*initialPrice/100;
	}

}
