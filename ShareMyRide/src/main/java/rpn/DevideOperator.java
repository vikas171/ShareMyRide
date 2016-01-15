package main.rpn;

public class DevideOperator implements BinaryOperator  {
	public double doCalculation(double num1, double num2)
	{
		double rs = 0;
		try
		{
			if(num2 == 0)
			{
				return 300; //Error
			}
			rs = num1 / num2;
		}
		catch(Exception ex)
		{
			//Todo
		}
		return rs;
		
	}
}
