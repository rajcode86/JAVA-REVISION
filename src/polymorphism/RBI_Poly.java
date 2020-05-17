package polymorphism;
        
/* Ploymorphism:-- it is the ability of an entity to take several forms. same name+multiple forms(action/behavior)
 * Types of ploymorphism:--Compile time.Also called early binding,overloading,static binding.
 * Overloading means same method and different signatures means in same class we have multiple methods with same name and different signatures.
 * Method signature is combination of method name and parameters.
 * A polymorphism that is resolved during compile time is known as static polymorphism. overlaoding is an example.
 * 
 * Runtime polymorhism:--also named late binding/dynamic binding/overriding. Dynamic polymorphism is a process in which a call to an 
 * overridden method is resolved at runtime.
 * 
 */
public class RBI_Poly {

	public void getHomeLoanROI (String bankName) {       //method signature
	
	}
	
	public void getHomeLoanROI (String bankName, int Amount) {   //same method name but different signature by adding parameter amount
		/*this is one method of overloading ,we can also have single parameters by different datatyes.
		 * second method is we can have same datatype parameters by changing its sequence like (string,int)and (int ,string)
		 * 
		 * 
		 */
	}

}
