package exception;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		StringUtils utils = new StringUtilsImpl();
		String text = "aaaa";
		String word = "aa";
		System.out.println(Arrays.toString(utils.findWords(text, word)));
		
		String textWithDoubles = "dfasf11.22.3fasdfsd.31fsd12";
		System.out.println(Arrays.toString(utils.findNumbers(textWithDoubles)));
	}

}
