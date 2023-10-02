package org.java.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	static Calculator c = null;
	
	static final float x = 10f;
	static final float y = 20f;
	
	@BeforeAll
	public static void init() {
		
		c = new Calculator();
	}
	
	@Test
	public void testAddPositiveNumber() {
		
		float res = 30;
		
		float testRes = c.add(x, y);
		
		assertEquals(res, testRes);
	}
	
	@Test
	public void testSubtractNegativeNumber() {
		
		float res = -10;
		
		float testRes = c.subtract(x, y);
		
		assertEquals(res, testRes);
	}
	
	@Test
	public void testDividePositiveNumber() {
		
		float res = .5f;
		
		float testRes = c.divide(x, y);
		
		assertEquals(res, testRes);
	}
	
	@Test
	public void testMultiplyPositiveNumber() {
		
		float res = 200;
		
		float testRes = c.multiply(x, y);
		
		assertEquals(res, testRes);
	}
}
