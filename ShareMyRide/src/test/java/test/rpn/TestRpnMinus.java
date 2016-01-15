package test.rpn;

import main.rpn.RPNCalculator;
import junit.framework.TestCase;

public class TestRpnMinus extends TestCase {
	
	public void testCase1() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 2 -";
		double result = calculator.calculate(data);
		assertEquals(3.0d, result);
	}
	
	public void testCase2() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 - 2";
		double result = calculator.calculate(data);
		assertEquals(200.0d, result);
	}
	
	public void testCase3() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 1 2 +";
		double result = calculator.calculate(data);
		assertEquals(100.0d, result);
	}
	
	public void testCase4() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 1 2 + -";
		double result = calculator.calculate(data);
		assertEquals(2.0d, result);
	}
	
	public void testCase5() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5.2 1 2 + 4 * + 3 -";
		double result = calculator.calculate(data);
		assertEquals(14.2d, result);
	}
	
	public void testCase6() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5.2 2.2 %";
		double result = calculator.calculate(data);
		assertNotNull(result);
	}

}
