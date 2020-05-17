package Loops;

public class BreakandContinue {
/*break and continue statements are used to change the normal flow of compound statement. 
 * the break statement immediately jumps to the end of the compound statement.
 * the continue statement immediately jumps to the next iteration of the compound statement. it continues to next cycle and skip the iteration.
 * 
 * break statement works only in loop or switch not in method.
 * 
 */
	
	/*public void go() {
		System.out.println("First");
		
		
		
		System.out.println("Last");
	}
	*/
	public static void main(String[] args) {
		/*BreakandContinue b =new BreakandContinue();
		b.go();*/
		
		for (int i=0; i<10; i++) {
		//if (i>=5 && i<=7)
			//continue;
		//if(i==5)
			//break;
		System.out.println(i);
		}
		
		System.out.println("outside the loop");

	}

}
