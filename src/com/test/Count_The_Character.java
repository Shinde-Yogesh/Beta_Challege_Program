//package imported

package com.test;

public class Count_The_Character {
	public static void main(String[] args) {

		String value = "Hello World";
		System.out.println(character_in_String(value));
		System.out.println((reverse(value)));
	}

	public static int character_in_String(String str) {
		return str.length();
	}
	
	
	public static String reverse(String str)
	{
		
        // StringBuffer sb = new StringBuffer(str);
        // return sb.reverse();
	// another approach thread safe
	    StringBuilder builder = new StringBuilder(str);
          return builder.reverse();
	}
}
