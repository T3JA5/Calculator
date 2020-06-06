package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static Double addNumber(Double n1, Double n2) {

		Double total = n1 + n2;
		System.out.println("Result : "+total);
		return total;
	}

	public static Double subtractNumber(Double n1, Double n2) {

		Double total = n1 - n2;
		System.out.println("Result : "+total);
		return total;
	}

	public static Double multiplyNumber(Double n1, Double n2) {

		Double total = n1 * n2;
		System.out.println("Result : "+total);
		return total;
	}

	public static Double divideNumber(Double n1, Double n2) {

		Double total = n1 / n2;
		System.out.println("Result : "+total);
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the method name between (1. Add, 2. Sub, 3. Multiply, 4. Divide)");
		String method = in.next();
		System.out.println("Method selected is "+method);
		System.out.println("Enter the first number");
		double n1 = in.nextDouble();
		System.out.println("Enter the second number");
		double n2 = in.nextDouble();
		
		switch(method) {
		
		case "Add":
			addNumber(n1, n2);
			break;
		
		  case "Sub": 
			  subtractNumber(n1, n2); 
			  break;
		  
		  case "Multiply": 
			  multiplyNumber(n1, n2); 
			  break;
		  
		  case "Divide": 
			  divideNumber(n1, n2); 
			  break;
		 	
		default:
			System.out.println("Please select valid method");
			break;
		}
		
	}

}
