package com.capgemini.string.assignment;

import java.util.Scanner;

public class Reverse {
	 public static void main(String args[])
	  {
	    String original, rev = "";
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = in.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      rev = rev + original.charAt(i);

	    System.out.println("Reverse of the string: " + rev);
	  }
	}
