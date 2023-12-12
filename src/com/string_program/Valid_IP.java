package com.string_program;

public class Valid_IP {
	//base case
	//A defanged IP address replaces every period "." with "[.]".
	public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
	public static void main(String[] args) {
		String str = "1.1.1.1";
		System.out.println(defangIPaddr(str));
	}

}
