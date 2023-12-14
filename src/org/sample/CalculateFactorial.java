package org.sample;

import java.util.Scanner;

public class CalculateFactorial {
public static void main(String[] args) {
	System.out.println("This program is for calculating the factorial");
	System.out.println("Enter the factorial number");
	Scanner s= new Scanner(System.in);
	int a = s.nextInt();
	int fact=1;
	for (int i = 1; i <=a; i++) {
		fact*=i;
	}System.out.println(fact);
}
}
