package abstractclass;

/*Abstract method is a method which doesn't contain any body and must be overridden in concrete class.
 * Properties:-- 1. abstract class should always use the keyword 'Abstract' and in declaration it must be without body.
* 2. The class of an abstract method must be an abstract class. Abstract method cannot be declare in a concrete class.
* 3. The abstract method must be overridden by first concrete class  which extends the abstract class. 
* how can we call concrete class from abstract method:-- only with the help of inheritance.
* Concrete class is basically that class where we can create object of that class.These classes can be instantiated.
* concrete class is immediate child of abstract class.
* 'Abstract' keyword is used with method then it must be overridden in first concrete class.
*/


public abstract class WebDriver {
	
	public abstract void click();
	public abstract void sendKeys();
	public abstract void getTitle();
	
	

}
