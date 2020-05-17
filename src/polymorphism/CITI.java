package polymorphism;

public class CITI extends RBI_overriding {

	/*lets make other class citi bank that child class of RBI. then use inheritance use extends keyword.
 * lets make another class named HSBC which have different interest rates. so they can implement different value.
 * 
 * 
 */
	public static void main(String[] args) {
		CITI obj =new CITI() ;
        System.out.println( obj.getHomeLoanROI());
		
	}
	 public double getHomeLoanROI() {
	    	
	    	return 10.3;
	    	
	    }

}
