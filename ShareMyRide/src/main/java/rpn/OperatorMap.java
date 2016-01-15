package rpn;

import java.util.HashMap;

import java.util.Map;

public class OperatorMap {

	@SuppressWarnings("serial")
	public static Map<String, String> myMap = new HashMap<String, String>() {
		{
			put("+", "B");
			put("-", "B");
			put("/", "B");
			put("*", "B");
			put("%", "B");
			put("^", "U");
		}
	};
}
