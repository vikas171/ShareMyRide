package rpn;

public class PercentageOperator implements BinaryOperator {
	public double doCalculation(double num1, double num2)
	{
		return num1 * num2/100;
	}
}
