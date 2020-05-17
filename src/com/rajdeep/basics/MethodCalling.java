package com.rajdeep.basics;

public class MethodCalling {

	public static void main(String[] args) {
		
		
		
// Static component can never call non static component directly
	//static can direct call to static component without creating an object.
		//non static  to non static component. but non static component direct call to static component. 
		//non static components cannot be called without making an object
		
		
    //MethodCalling m = new MethodCalling();
   // m.go();
   /* m.go1();
    m.go2();*/
    
   // go3();   //static component
    
    
    
	}
	
	/*
	public static void go3() {
		System.out.println("inside go3 Method");
	}*/
	
	
	public void go() {  //if we put static before void it becomes static which will not call go1 method coz that is non static.
		
	     System.out.println("Inside go Method"); //if need to call method directly it should be in same class. 
	     go1();
	}
	
	public void go1() {
		
	     System.out.println("Inside go1 Method");
	     go2();
	}
	
	public void go2() {
		
	     System.out.println("Inside go2 Method");
	     
	}
	

	
	
}
