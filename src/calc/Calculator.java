package calc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	public static int add(String numbers) throws NegativeNumberException {
		Integer sum = 0;
		String delimiter = ",|\n";
		if(numbers.contains("//")) {
			delimiter = String.valueOf(numbers.split("//")[1].charAt(0)) + "|\n";
			numbers = numbers.substring(4, numbers.length());
		}
		String[] numbStrList = numbers.split(delimiter);
		List<Integer> negativeNumberList = new ArrayList<>();
		for(int i = 0; i < numbStrList.length; i++) {
			Integer currentNumber = Integer.parseInt(numbStrList[i].trim());
			if(currentNumber < 0) {
				negativeNumberList.add(currentNumber);
			}
			if(negativeNumberList.size() == 0) {
				sum = sum + currentNumber;
			}
		}
		if(negativeNumberList.size() > 0) {
			String message = "negative numbers not allowed " + negativeNumberList.toString();
			throw new NegativeNumberException(message);
		}
		return sum;
	}
}
