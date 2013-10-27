package com.trial.smallestinteger;

import java.util.ArrayList;
import java.util.List;

public class SmallestIntCalculator implements CalculatorType {

	int numberOfDistinctDigits;

	public void setNumberOfDistinctDigits(int numberOfDistinctDigits) {
		this.numberOfDistinctDigits = numberOfDistinctDigits;
	}

	@Override
	public boolean isValid(int number) throws IllegalArgumentException {
		if(numberOfDistinctDigits == 0 ){
			throw new IllegalArgumentException("Number Of Digits should be greater than 1.");
		}
		List<Integer> digits = new ArrayList<Integer>();
		while (number > 0) {
			int unitsDigit = number % 10;
			if (!digits.contains(unitsDigit)) {
				digits.add(unitsDigit);
				if (digits.size() > numberOfDistinctDigits)
					return false;
			}
			number = number / 10;
		}

		if (digits.size() == numberOfDistinctDigits)
			return true;
		return false;
	}

}
