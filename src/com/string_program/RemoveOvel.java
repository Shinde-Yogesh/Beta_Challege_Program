package com.string_program;

public class RemoveOvel {
	public static void removeOvel(String str) {
		// aeio
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
					|| (str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i')
					|| (str.charAt(i) == 'o')) {
			} else {
				output = output + str.charAt(i);
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String str = "aeioSOMEAEIO";
		removeOvel(str);
	}

}
