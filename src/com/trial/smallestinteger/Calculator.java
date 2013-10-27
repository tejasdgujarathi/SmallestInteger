package com.trial.smallestinteger;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	private int number;
	private List<CalculatorType> calculatorTypes = new ArrayList<CalculatorType>();

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCalculatedNumber() throws IllegalArgumentException {
		int result = number;
		for (CalculatorType calculatorType : calculatorTypes) {
			for (int iterator = result;; iterator++) {
				if (calculatorType.isValid(iterator)) {
					result = iterator;
					break;
				}
			}
		}
		return result;
	}

	public void setCalculatorTypes(CalculatorType calculator) {
		calculatorTypes.add(calculator);
	}
}
