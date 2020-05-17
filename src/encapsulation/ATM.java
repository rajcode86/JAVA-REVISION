package encapsulation;

import encapsulation.Bank;

public class ATM {
	public static void main(String[] args) {//create an object of class bank
		Bank obj = new Bank();
		//if genuine customer wants to change pin number.
		
		obj.updatepin(12345, 1234, 2345);
		obj.withdrawAmount(12345, 2345, 1000);
		
		
	/* je kise da card mispalce hoje tan koi v ceredentials change krke amount withdraw kar skda 
	 * so pin no, amount should be private variable
	 * 
	 * 
	 * 
	 * 
	 * 	
	 */
	}
}
