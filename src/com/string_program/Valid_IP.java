package com.string_program;

public class Valid_IP {
	//base case
	//A defanged IP address replaces every period "." with "[.]".
	public static String defangIPaddr(String address) {
//		return address.replace(".", "[.]");
//		return address.replaceAll(".", "[.]");
//		return String.join("[.]", address.split("\\."));
		StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            sb.append(c == '.' ? "[.]" : c);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		String str = "1.1.1.1";
		System.out.println(defangIPaddr(str));
	}

}
