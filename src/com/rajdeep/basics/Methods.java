package com.rajdeep.basics;

public class Methods {
	
	

//Methods are block of statements which are used to do specific task.These are generally used to divide a large code into manageable parts of code.
	/*Method decalaration rules
	1. access and non access modifier
	 2.return type = void is return type-->datatype of the value return by the method.it could be any datatype.
	                 we need to use keyword-->return when we use any other datatype. 
	3.method name(parameter list)-- variable list. it can be nothing,one or more than one. multiple parameters separated by comma.
	                  eg. public void display(int i ,float g, string f, char c)
	4.{ start of body
	    method body/statement block
	6.} end of body
	execution of body stops either on 'return' statement or closing curely braces }    
	*/
	
	
	public void display() //declare method (we cannot initialize method,we define method)
	{
		
	/*
	 * body of method(all definitions goes here)
	 * 
	 * 	
	 */
	System.out.println("Inside Display Method");
	
	//String x = "Hello";
	//return 'Hello'; //it will be last statement of body of method.
	}
	
	
	public static void main(String[] args) {
 
   /*How to call a method? if we need call anything from class we need to make copy of that class. we can't call directly methods.
    * firstly we need to create object of the class.
     Methods m = new Methods();
     m.(method name);
    * 
    * 
    */
		
		
		
		/*Variables v = new Variables(); // v(class) -->object --> i=10;
		v.i++; //object1 -->i=11;
		
		Variables v2 = new Variables(); //v2 -->object2 --> i=10;
		System.out.println(v2.i); //10*/
		
		Calculator calc = new Calculator();
		int i = calc.getSub(23, 45); //when we put values after calling method called arguments.
		//need to get results we have to put datatype.
		System.out.println("the SUb is : "+ i);
		
		System.out.println(calc.getMult(45, 23));
		
		System.out.println(calc.getSum(45, 45));
		
		System.out.println(calc.getDiv(45, 4));
	
				
	}

	}

/* there are also some pre-defined methods in java which we can use(call) directly. eg. MATH.random();
 * if the method is static we can use that method directly without creating an object.
 * 
 * 
 */
 

