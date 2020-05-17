package polymorphism;

public class HSBC_overriding extends RBI_overriding {

	public static void main(String[] args) {
		
		HSBC_overriding obj =new HSBC_overriding() ;
        System.out.println( obj.getHomeLoanROI());
		
		
	}
	 public double getHomeLoanROI() {
	    	
	    	return 10.25;
	    	
	    }

}
