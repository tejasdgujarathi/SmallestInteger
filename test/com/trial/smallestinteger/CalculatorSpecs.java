package com.trial.smallestinteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.trial.smallestinteger.Calculator;
import com.trial.smallestinteger.MultipleOfFiveCalculator;
import com.trial.smallestinteger.SmallestIntCalculator;

public class CalculatorSpecs {

	@Test(expected = IllegalArgumentException.class)
	public void itThrowsExceptionWhenNumberOfDigitsNotProvided()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(54);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		calculator.getCalculatedNumber();
	}

	@Test
	public void itVerifiesMessageOfExceptionWhenExceptionIsThrown() {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(54);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		try {
			calculator.getCalculatedNumber();
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Number Of Digits should be greater than 1.");
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void itThrowsExceptionWhenZeroIsProvidedAsNumberOfDigits()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(54);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		smallestIntCalculator.setNumberOfDistinctDigits(0);
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		calculator.getCalculatedNumber();
	}

	@Test
	public void itReturnsSmallestIntForAnyDistinctElementWhenStartingNumberNotProvided()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		smallestIntCalculator.setNumberOfDistinctDigits(3);
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		int value = calculator.getCalculatedNumber();

		// Then
		assertEquals(102, value);
	}

	@Test
	public void itReturnsSmallestIntForOneDistinctElement()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(54);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		smallestIntCalculator.setNumberOfDistinctDigits(1);
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		int value = calculator.getCalculatedNumber();

		// Then
		assertEquals(55, value);
	}

	@Test
	public void itReturnsSmallestIntForTwoDistinctElements()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(69);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		smallestIntCalculator.setNumberOfDistinctDigits(2);
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		int value = calculator.getCalculatedNumber();

		// Then
		assertEquals(69, value);
	}

	@Test
	public void itReturnsSmallestIntForThreeDistinctElements()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(101);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		smallestIntCalculator.setNumberOfDistinctDigits(3);
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		int value = calculator.getCalculatedNumber();

		// Then
		assertEquals(102, value);
	}

	@Test
	public void itReturnsSmallestIntForFourDistinctElements()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(12364);
		// calculator.setNumber(1009);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		smallestIntCalculator.setNumberOfDistinctDigits(4);
		calculator.setCalculatorTypes(smallestIntCalculator);

		// When
		int value = calculator.getCalculatedNumber();

		// Then
		assertEquals(12366, value);
	}

	@Test
	public void itAppliesSmalestIntAndPalindromeCalculatorTypesOnTheNumber()
			throws IllegalArgumentException {
		// Given
		Calculator calculator = new Calculator();
		calculator.setNumber(132);
		SmallestIntCalculator smallestIntCalculator = new SmallestIntCalculator();
		smallestIntCalculator.setNumberOfDistinctDigits(2);
		calculator.setCalculatorTypes(smallestIntCalculator);
		
		MultipleOfFiveCalculator multipleOfFiveCalculator = new MultipleOfFiveCalculator();
		calculator.setCalculatorTypes(multipleOfFiveCalculator);
		// When
		int value = calculator.getCalculatedNumber();
		
		// Then
		assertEquals(135, value);
	}

}
