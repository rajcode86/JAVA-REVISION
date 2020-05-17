package com.rajdeep.basics;

public class DataTypes {

	public static void main(String[] args) {
		//primitive datatypes//when we are assigning any value to datatype or variable is called initialization.
		//when we write int,float or any other datatype we are doing declaration.//
		
		int i = 1234567890;     //i-->integer//	
		float f = 1.234f;       //float separates by f, suffix l is must otherwise compiler will treat it like integer.//	
		long l = 233445445544l;    //it is separates by l, suffix f is must otherwise it will treat like double.//
		double d = 3.445567709333203344;
		boolean b = true;    //in boolean condition can be true or false//
		char c = 'a';
		String s = "This is java revision";  //string is also a class//
		
       DataTypes dt;
       //we use camel casing in java. that means long string break with capital letters. eg. darkknights= DarkKnights//
       
       String abc = new String();
       abc = "Hello";
       
       String abc1 = "Hello";
       
       //Java String= String is a class,not a datatype,it can be instantiated like other classes. String s =new String();
       //and String concatenation = it is way to combine two or more strings in one string. it is done by using '+' operator.
       //String s = "way"+"to"+"automation"+".";
       //it also can be used with any other datatype. boolean b = true; // String s = "this is"+ " "+b;//
       
       String s1 = "Way  ";
       String s2 = "2  ";
       String s3 = "Automation";
        String s4 = s1 + s2 + s3;
        //in string which thing is under double quoted are counted.//string +string= concatenated string//
        
        System.out.println(s4);
        
        //same with int too//int + int =int//
        
        int num1 = 10;
        int num2 = 10;
        System .out.println(num1+num2);
        System .out.println(num1+num2+"after");
        System .out.println("before"+(num1+num2)+"after"); //need to put brackets around integer otherwise it will compile int as string bcoz of strings//
        
        //*12 + 45 //(12 and 45)operands, + is operator
        //Arithmetic operators +,-,*,%(remainder),/ devision
        
        //*unary operators-->single operands (++,--, '!' logical works with true and false conditions)
        System.out.println(!true); //logical operators ! works as not
        
        //equality and relational operators ='==' equals to, '!=' not equals to,'>','<','<=','>='.(binary operators)
        System.out.println(78==78); //give result in boolean.
        
        //*binary operators-->double operands = conditional operators--> '&&" conditional-And, '||' condition-OR 
        
        
        System.out.println((34==34) || (45<=45));
      //*ternary operators--> 3 operands  , '?' ternary operator.
        
        
        
        
	}

}
