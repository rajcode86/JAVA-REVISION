package com.rajdeep.basics;

public class RandomNumber {

	public static void main(String[] args) {
		
		/*type cast --> type casting is way to remove or reduce decimal values. 
		 * if we want values without decimal then we will put int eg. int num=(int)(Math.random()*10);.
		 * if need values with decimal but not long decimals then double as Double num = (int)(Math.random()*10);
		 * 
		 */
		
		
		int num =(int)(Math.random()*10);               //if multiply by 10 or 100
		System.out.println(num);
		
	}

}
