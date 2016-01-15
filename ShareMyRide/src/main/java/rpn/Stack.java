package rpn;

import java.util.Vector;

public class Stack {

	Vector<Float> vec = new Vector<Float>();

	public float calculator(String data) {
		float result = 0;
		try {

			String testData[] = data.split(" ");
			for (int i = 0; i < testData.length; i++) {
				if (testData[i].equals("+")) {
					if (vec.size() >= 2) {
						int top = vec.size() - 1;
						float rs = vec.get(top) + vec.get(top - 1);
						vec.remove(top);
						vec.remove(top - 1);
						vec.add(rs);
						result = rs;
					} else {
						return 200; // Error
					}
				}
				if (testData[i].equals("-")) {
					if (vec.size() >= 2) {
						int top = vec.size() - 1;
						float rs = vec.get(top - 1) - vec.get(top);
						vec.remove(top);
						vec.remove(top - 1);
						vec.add(rs);
						result = rs;
					} else {
						return 200; // Error
					}
				}
				if (testData[i].equals("*")) {
					if (vec.size() >= 2) {
						int top = vec.size() - 1;
						float rs = vec.get(top - 1) * vec.get(top);
						vec.remove(top);
						vec.remove(top - 1);
						vec.add(rs);
						result = rs;
					} else {
						return 200; // Error
					}
				}
				if (testData[i].equals("/")) {
					if (vec.size() >= 2) {
						int top = vec.size() - 1;
						if (vec.get(top) == 0) {
							return 300;
						}
						float rs = vec.get(top - 1) / vec.get(top);
						vec.remove(top);
						vec.remove(top - 1);
						vec.add(rs);
						result = rs;
					} else {
						return 200; // Error
					}
				}
				if (testData[i].equals("%")) {
					if (vec.size() >= 2) {
						int top = vec.size() - 1;
						float rs = vec.get(top - 1) * vec.get(top) / 100;
						vec.remove(top);
						vec.remove(top - 1);
						vec.add(rs);
						result = rs;
					} else {
						return 200; // Error
					}
				}

				else
				{
					vec.add(Float.parseFloat(testData[i]));
				}

			}
		} catch (Exception ex) {

		}
		
		if (vec.size() > 1) {
			return 100; // Error Scenario
		}
		return result;
	}
}
