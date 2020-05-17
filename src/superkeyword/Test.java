package superkeyword;

public class Test {

	public static void main(String[] args) {
		
		/*if we need to call child class as well as parent class we will use keyword "super" in child class.
		 * Super keyword is used to access the component of the super class only,there has to be inheritance when using super keyword.
		 * it is used to call the super class version of the over ridden method of the sub class.
		 * if in case you call the original behavior of the class,you want the over ridden method to be called as well
		 */
		Dog d = new Dog();
		d.sound();
	}

}
