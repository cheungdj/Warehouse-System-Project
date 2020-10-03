package ca.uwo.pricingStrategies.individual;

public class IndividualPricingStrategy1 implements IndividualPricingStrategy {

	@Override
	public double calculate(int quantity, double price) {
		double calculation = quantity * price;
		return calculation;
	}

}
