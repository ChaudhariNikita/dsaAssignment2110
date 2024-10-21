package assignment2110;

import java.util.Scanner;

public class ReverseWord {
	public static String reverseEachWord(String input) {
		StringBuilder result = new StringBuilder();
		Stack stack = new Stack(input.length());

		for (int i = 0; i <= input.length(); i++) {
			char currentChar = (i < input.length()) ? input.charAt(i) : ' ';

			if (currentChar != ' ') {
				stack.push(currentChar);
			} else {
				while (!stack.isEmpty()) {
					result.append(stack.pop());
				}
				result.append(' ');
			}
		}

		return result.toString().trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		String output = reverseEachWord(input);
		System.out.println("Output: " + output);

	}

}
