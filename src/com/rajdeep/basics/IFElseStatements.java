package com.rajdeep.basics;

public class IFElseStatements {

	public static void main(String[] args) {
		
		/* If statement will execute when condition is only true.
		 * If else statement --> in this case ELSE condition will execute if and only if condition false.
		 * If-Else-If --> this is combination of if-else conditions.
		 * If (condition)
		 * statements;
		 * else if (condition)
		 * statement;
		 * else
		 * statements; 
		 */
		
		
		int num =(int)(Math.random()*20);               
		System.out.println(num);
		if (num>=15)
			System.out.println(num+" is greater than 15");
		
		else if (num<=10 && num>=5)
			System.out.println(num+" between 5 an 10");
		
		else 
			System.out.println(num+" is less than 15");
		
		

	}

}
