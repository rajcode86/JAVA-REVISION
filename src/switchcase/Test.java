package switchcase;

public class Test {

	public static void main(String[] args) {
		
	//need to print so many days and condition we will use switch case rather than if else condition.
		//varibale and case should be same datatype.
		//we need to add break statement after each case statment
		int day = 6;
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursady");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			
		default:
			System.out.println("No case Matched!!!");
		
		
		
		
		
		
		
		}	
		

	}

}
