package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}

	@Test
	public void testGetTotal() {
		Calculator test = new Calculator();
		assertEquals(0, test.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator test = new Calculator();
		test.add(5);
		assertEquals(5, test.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator test = new Calculator();
		test.add(5);
		test.subtract(3);
		assertEquals(2, test.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator test = new Calculator();
		test.add(5);
		test.multiply(2);
		assertEquals(10, test.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator test = new Calculator();
		test.add(5);
		test.divide(2);
		assertEquals(2, test.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator test = new Calculator();
		test.add(5);
		assertEquals("0 + 5", test.getHistory());
		test.subtract(2);
		test.multiply(3);
		test.divide(3);
		assertEquals("0 + 5 - 2 x 3 / 3", test.getHistory());
	}

}