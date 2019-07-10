package HomeWork4;

public class MethodTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int max = findMaximum(arr);
		System.out.println("Максимальное число равно " + max);
	}

	public static int findMaximum(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return findMaximum(arr);
	}

	public static void drawRectangle(int hight, int width) {

		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int findWordNumber(String str) {

		str = str.trim();
		String[] words = str.split("\\s+");

		return words.length;
	}


}

