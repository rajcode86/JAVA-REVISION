package inheritance;



/*dog class cannot call directly to animal class 
* if we create one more class named bulldog then it will inherit properties of dog class which is child to animal class.its called multilevel inheritance.
* if we make another method in dog class(child class) then JVM calls the method of dog class not animal class.same to bulldog class too.
* 
*/
public class Dog extends Animal {
	

	public static void main(String[] args) {
		
			Dog obj = new Dog();
		obj.sound();	
			
		}
		public void sound() {
			System.out.println("wooff wooff");
		}

	}


