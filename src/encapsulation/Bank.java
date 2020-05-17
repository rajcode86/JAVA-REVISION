package encapsulation;

   /*Encapsulation:-- firstly create one class named bank and set variables.
 * then make another class named atm.
 * 
 * 
 */
public class Bank {

	public int accountNo= 12345;
	private int pinNo = 1234;//provide encapsulation by making pin no private.
	private double balanceamount=100000;
	
	public void withdrawAmount(int accNo, int pin, int amount) {
		if (accNo==accountNo && pin==pinNo) {
			
			if (amount<=balanceamount) {
				
				balanceamount=balanceamount-amount;
				
				System.out.println("Amount withdraw:  "+amount);
				
			}else {
				System.out.println("Insufficient Balance!!!");
				
			}	
			
		    }else {
			System.out.println("Invalid Crerdentials!!!");
	
		}
	}        //if need to update pin no.

	public void updatepin (int accNo, int oldpin, int newpin ) {
		if (accNo==accountNo && oldpin==pinNo) {
			pinNo=newpin;
			System.out.println("Pin changed suuccessfully!!");
			
		}else {
			System.out.println("Invalid credentials");
		}
	
	
	
	}
	
	
	
	
	
}



	
	
	
	

