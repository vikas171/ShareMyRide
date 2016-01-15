package main.rpn;

public class CalculationFactory {
	
	public BinaryOperator getOperator(String operator)
	{
		BinaryOperator op = null;
		if (operator.equals("+"))
		{
			op =  new PlusOperator();
		}
		else if (operator.equals("-"))
		{
			op =  new MinusOperator();
		}
		else if (operator.equals("/"))
		{
			op =  new DevideOperator();
		}
		else if (operator.equals("*"))
		{
			op =  new MultiplyOperator();
		}
		else if (operator.equals("%"))
		{
			op =  new PercentageOperator();
		}
		return op;
	}

}
