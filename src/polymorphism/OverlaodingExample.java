package polymorphism;

public class OverlaodingExample {
/*What is the need of overloading?:--> if need to add two numbers we will call method with two parameter signature.
 *                                     if we need to add three numbers we call method with three parameter signature in same class.
 *qstn:- Can we achieve overloading by keeping the method signature same and changing the return type?Answer is NO. 
 * 2. can we overload the main method in java? answer is YES, but the signature has to be different.
 * println method is also overloading.
 */
	public static void main(String[] args) {
		//OverlaodingExample obj = new OverlaodingExample();
		//obj.add(a, b, c);
	}
	public void add(int a,int b) {
		
	}
	public void add(int a,int b,int c) {
		
	}

}

