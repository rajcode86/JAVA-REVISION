package ampckg2;

import ampackg1.ClassA;
import ampackg1.ClassB;

public class ClassTest {
	
	public static void main(String[ ]args) {
		/*package2 bnaya os vich test class copy kiti then import class A from package1
		 * we try to import class B but it didnt import because it is default class.
		 * if we make class B piblic in package 1 so we can import class B as well.
		 * 
		 * 
		 * 
		 */
		ClassA obj = new ClassA();
		obj.add();
		
		ClassB obj2= new ClassB();
		obj2.show();
		
		
		
		
	}
	
	

}
