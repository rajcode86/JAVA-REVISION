package superkeyword;

    /*dog class is child class of animal class.
 * if we need to call child class as well as parent class we will use keyword "super" in child class.
 * 
 */
public class Dog extends Animal {
	
     public void sound() {   //overwrite sound method.
    	 
    	 super.sound();
	System.out.println("Dog Sound");
	
}
}
