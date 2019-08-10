package exception;

import java.util.Arrays;

public class StringUtilsImpl implements StringUtils {

	@Override
	public double div(String number1, String number2) {
		if (number1 == null || number2 == null) {
			throw new NullPointerException("Number1 or number2 cannot be null");
		}
		if (number1.matches("[-+]?\\d*\\.?\\d+") == false || number2.matches("[-+]?\\d*\\.?\\d+") == false) {
			throw new NumberFormatException("One of the numbers entered incorrectly");
		}
		if (Double.parseDouble(number2) == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return Double.parseDouble(number1) / Double.parseDouble(number2);
	}

	@Override
	public double[] findNumbers(String text) throws NumberFormatException {
		StringBuilder doubleBuilder = new StringBuilder();
		double[] numbersArray = new double[text.length()];
		int arrayIndex = 0;
		boolean numberWasFound = false;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isDigit(ch) || ch == '.' && shouldDotBeWritten(doubleBuilder)) {
				doubleBuilder.append(ch);
				numberWasFound = true;
			} else if (numberWasFound = true) {
				numbersArray[arrayIndex] = Double.valueOf(doubleBuilder.toString());
				doubleBuilder = new StringBuilder();
				if (ch == '.' && shouldDotBeWritten(doubleBuilder)) {
					doubleBuilder.append(ch);
				}
				arrayIndex++;
				numberWasFound = false;
			}
		}
		if (numberWasFound) {
			numbersArray[arrayIndex] = Double.valueOf(doubleBuilder.toString());
			arrayIndex++;
		}
		return Arrays.copyOfRange(numbersArray, 0, arrayIndex);
	}

	private boolean shouldDotBeWritten(StringBuilder doubleBuilder) {
		return doubleBuilder.toString().isEmpty() || !doubleBuilder.toString().contains(" . ");
	}

	@Override
	public int[] findWords(String text, String word) {
		if (text == null || word == null) {
			throw new NullPointerException();
		}
		int[] result = new int[text.length()];
		int indexOfSymbol = text.indexOf(word);
		int arrayIndex = 0;
		if (indexOfSymbol != -1) {
			result[arrayIndex] = indexOfSymbol;
			while ((indexOfSymbol = text.indexOf(word, indexOfSymbol + word.length())) != -1) {
				arrayIndex++;
				result[arrayIndex] = indexOfSymbol;
			}
			return Arrays.copyOfRange(result, 0, arrayIndex + 1);
		} else {
			return null;
		}

	}

}
