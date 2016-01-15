package rpn;

import java.util.Vector;

public class RPNCalculator {

	Vector<Double> vec = new Vector<Double>();
	public double calculate(String data) {
		double result = 0;
		String inpStr[] = data.split(" ");
		
		for (int i = 0; i < inpStr.length; i++) {
			//OperatorMap.myMap.
			if (OperatorMap.myMap.containsKey(inpStr[i]))
			//if (OperatorList.myList.contains(inpStr[i]))
			{
				
				if (vec.size() >= 2) {
					double rs = 0;
					int top = vec.size() - 1;
					CalculationFactory cf = new CalculationFactory();
					BinaryOperator op = cf.getOperator(inpStr[i]);
					
					rs = op.doCalculation(vec.get(top -1), vec.get(top));
					vec.remove(top);
					vec.remove(top - 1);
					vec.add(rs);;
					result = rs;
				} else {
					return 200; // Error
				}
			}
			else
			{
				vec.add(Double.parseDouble(inpStr[i]));
			}
		}
		if (vec.size() > 1) {
			return 100; // Error Scenario
		}
		
		return result;
	}

}
