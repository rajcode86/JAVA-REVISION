package Exceptions;

public class finally_block {

	/*what is difference between final and finally? Finally keyword is used for exception handling.
	 * final keyword is used for int values an any other values to fix values. final word has nothing to do with exception handling.
	 * 
	 */
	
	public static void main(String[] args) {
		try {     /*we have data base connections
			       * execute some queries
			       * validating the data and comparing from web sites
			       * closing connection 
			       */
		//int i[]=new int[4];
		//i[5]=100;
			
		}  catch (Throwable t){
			System.out.println("error occured");
			
		}finally {
			System.out.println("Closing the DB connection in finally block");
			
		}
	}

}
