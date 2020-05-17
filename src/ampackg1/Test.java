package ampackg1;

public class Test {

	public int publicvariable = 10;
	private int privatevariable =20;
	protected int protectedvariable= 30;
	 int defaultvariable = 40;

	public static void main (String[]args) {
		Test obj=new Test();
		
		System.out.println(obj.privatevariable); //not accessible outside class
		System.out.println(obj.protectedvariable);
		System.out.println(obj.publicvariable);
		System.out.println(obj.defaultvariable);
		
		/*Inheritance--> one class object will inherit another class properties.
		 * there are two keywords for inheritance--> extends and implements
		 * 
		 * 
		 */
		
	}
	
	
	
	
	
	
	
}
