package com.string_program;

public class Performing_Operation {
	 public static int finalValueAfterOperations(String[] operations) {
	        int x = 0;
	        for(String o : operations) x += (44 - o.charAt(1));
	        return x;
	    }
	 public static int new_Approach(String[] operations) {
	    	int val = 0;
	    	for(int i=0;i<operations.length;i++) {
	    		if(operations[i].charAt(1)=='+') val++;
	    		else val--;
	    	}
	    	return val;        
	    }

	public static void main(String[] args) {
		String array[] = { "--X","X++","X++" };
		System.out.println(new_Approach(array));
	}
}
