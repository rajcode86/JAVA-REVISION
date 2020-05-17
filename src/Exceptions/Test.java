package Exceptions;

public class Test {
	
    /* Exception-- An exception is a problem that arises during the execution of the program.it can occur from many reasons.
 * Checked exceptions--It is typically a user error or a problem that can not be foreseen by the programmer.
 * Runtime Exception--it could have been avoided by programmer.
 * Errors--These are not exceptions,but problems that arise beyond the control of the user of the programmer.
 * Exception has two classes---IO exception class and runtime exception class.
 * we use try and catch block for exceptions
 * we can have multiple try and catch blocks.
 */
	
	
	
	public static void main(String[] args) {
		try {       //je koi v problem (error) hoyegi within try block it will directly jump to catch block.aftrt that it will execute 
			         //throwable is the super class for error as well as exception. we can call directly the exception class instead of throwable.
			
		System.out.println("Beginning");
		int divide = 10/0;       //if divide by zero it will throw error.
		System.out.println(divide);
		} catch (Exception e ) {     //exception is class and e is object.
			System.out.println("Error Occured");
			System.out.println(e.getMessage());  //can call object e to get message what is error in program.
			 //e.printStackTrace();                                    //we can print error too.
		}
		
		
		System.out.println("After catch block");
		
		
		
		
		
	}

}
