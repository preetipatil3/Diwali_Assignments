package com.demo.main;

public class LongestString {
   
	    public static int longestStringLength(String[] arr) {
	        int maxLength = 0;
	        for (String s : arr) {
	            if (s.length() > maxLength) {
	                maxLength = s.length();
	            }
	        }
	        return maxLength;
	    }

	    public static void main(String[] args) {
	        String[] arr = {"apple", "banana", "cherry", "date"};
	        System.out.println("Length of longest string: " + longestStringLength(arr));
	    }

}
