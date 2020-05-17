package constructors;

public class Students {
	
	/*Constructors are the code which gets executed whenever the class is instantiated.
	 *
	 * constructors basically used to initialize instance variable of the class at the time of object creation.
	 * Constructors have the same name as of the class name. it has access modifiers(public,private)
	 * 
	 * if constructor is private it will not accessible in other classes. it will not visible in other class.
	 * 
	 * Types of constructors:1. default cons:-when there is no constructor created explicitly.JVM creates its own default const whenever you created object of the class
	 * 2.no-argument constructor
	 * 3.parameterized cons
	 *  
	 */
	
	
	 public Students() {
		 
		 System.out.println("Calling Constructors");
		 
	 }
	// public static void main (String[] args) {
		 
		 //Students st = new Students();
		 
		 
		 //Test t = new Test();//it is throwing an error because this const is private
	 
	    String studentName;
	    int rollNum;
		
	    
	   public Students(String studentName, int rollNum ) {  //parameterized const.
		   this.studentName=studentName; //when need to call global variable use keyword "this". also known as const chaining.
		                                 //"this" is also used for const overloading.const within the const.
		  this. rollNum=rollNum;
	   }

	public static void main(String[] args) {
		
		Students st=new Students("Nihal",111);
		System.out.println(st.rollNum);
		System.out.println(st.studentName);
		new Students();//const within the cons. const overlaoding 
	}

}
