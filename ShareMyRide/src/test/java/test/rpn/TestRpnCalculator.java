package test.rpn;

import main.rpn.RPNCalculator;
import junit.framework.TestCase;

public class TestRpnCalculator extends TestCase {

	public void testCase1() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 2 +";
		double result = calculator.calculate(data);
		assertEquals(7d, result);
	}
	public void testCase2() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 +";
		double result = calculator.calculate(data);
		assertEquals(200d, result);
	}
	
	public void testCase3() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 2";
		double result = calculator.calculate(data);
		assertEquals(100d, result);
	}
	
	public void testCase4() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 + 2";
		double result = calculator.calculate(data);
		assertEquals(200d, result);
	}
	
	public void testCase5() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 2 + 3";
		double result = calculator.calculate(data);
		assertEquals(100d, result);
	}
	
	public void testCase6() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "5 2 3 +";
		double result = calculator.calculate(data);
		assertEquals(100d, result);
	}
	
	public void testCase7() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "+";
		double result = calculator.calculate(data);
		assertEquals(200d, result);
	}
	
	public void testCase8() {
		RPNCalculator calculator = new RPNCalculator();
		String data = "+ 8";
		double result = calculator.calculate(data);
		assertEquals(200d, result);
	}
}
