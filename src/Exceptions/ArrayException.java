package Exceptions;

public class ArrayException {

	public static void main(String[] args) {
		System.out.println("Beginning");
		try {
		int i[] = new int[4];
		
	i [5] =100;

		}catch (Exception e) {
			System.out.println("error occurred");  //what to do when occurs--take an screenshot,send email with attached screenshot and 
			                                      //also print error message in email subject.
			e.printStackTrace();
		}
		
		System.out.println("Ending");
		
		
		
		
	}

}
