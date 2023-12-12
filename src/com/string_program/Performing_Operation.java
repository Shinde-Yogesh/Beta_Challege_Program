package com.string_program;

public class Performing_Operation {
	public static int finalValueAfterOperations(String[] operations) {

		// ++X and X++ increments the value of the variable X by 1.
		int value = 0;
		for (String string : operations) {
			if ((string == "X++") || (string == "++X")) {
				value++;
			} else if ((string == "X--") || (string == "--X")) {
				value--;
			}
		}

		return value;
	}

	public static void main(String[] args) {
		String array[] = { "--X","X++","X++" };
		System.out.println(finalValueAfterOperations(array));
	}
}
