package com.trial.smallestinteger;

public class MultipleOfFiveCalculator implements CalculatorType {

	@Override
	public boolean isValid(int number) throws IllegalArgumentException {
		return isMultipleOfFive(number);
	}

	private boolean isMultipleOfFive(int number) {
		return number%5 == 0;
	}

}
