package org.java.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	static Calculator c = null;
	
	@BeforeAll
	public static void init() {
		
		c = new Calculator();
	}
	
	@Test
	public void testAddPositiveNumber() {
		
		float x = 10;
		float y = 20;
		float res = 30;
		float testRes = c.add(x, y);
		
		assertEquals(res, testRes);
	}
	
	@Test
	public void testSubtractNegativeNumber() {
		
		float x = 10;
		float y = 20;
		float res = -10;
		float testRes = c.subtract(x, y);
		
		assertEquals(res, testRes);
	}
	
	@Test
	public void testDividePositiveNumber() {
		
		float x = 10;
		float y = 20;
		float res = .5f;
		float testRes = c.divide(x, y);
		
		assertEquals(res, testRes);
	}
	
	@Test
	public void testMultiplyPositiveNumber() {
		
		float x = 10;
		float y = 20;
		float res = 200;
		float testRes = c.multiply(x, y);
		
		assertEquals(res, testRes);
	}
}
