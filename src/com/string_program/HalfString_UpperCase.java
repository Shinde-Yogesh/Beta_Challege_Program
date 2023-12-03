package com.string_program;

public class HalfString_UpperCase {
	public static void uppercaseString(String str) {
	String first = str.substring(0,str.length()/2);
	String second = str.substring(str.length()/2).toUpperCase();
	
	String output = first.concat(second);
	System.out.println("First part : "+first);
	System.out.println("Second part : "+second);
	System.out.println(output);
	}
	
	public static void main(String[] args) {
		String str = "Winner is Coming";
		System.out.println(str.length());
		uppercaseString(str);
	}
}
