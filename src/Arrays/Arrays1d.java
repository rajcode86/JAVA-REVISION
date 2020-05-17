package Arrays;

public class Arrays1d {

     /*Arrays one dimensional; 
 * Arrays are the collection of similar datatypes. Each variable in array is known as 'array element'.
 * Each variable of array is  referenced by a particular integer is known as 'array index'. The total number of variables in array decides the length of array. 
 * In java aarays are objects. [ ] something in square brackets are arrays.we must to give datatype to array.
 * syntax: int[] array = new int[10];
 * we need to store values first in arrays.
 */
	public static void main(String[] args) {

		int[] array = new int[5];
		
		String[] myarray = new String[13];
		
		//System.out.println(array.length);
		
		array[0]= 2;
		array[1]= 6;
		array[2]= 8;
		array[3]= 5;
		array[4]= 7;
		
		//System.out.println(array[4]);
		
	//to print all values
	    for (int index=0; index<array.length; index++) {
	    	array[index]= (int) (Math.random()*1000);
	    //	System.out.println(array[index]);
	    	
	     }
	//there is another way with for each loop
	    for(int var:array) {
	     	System.out.println(var);
	  //one drawback of this loop is that it only print straight forward values,not in reverse.  	
	    }
	    //print in reverse order
	    
	    System.out.println("-----reverse order----");
	    for (int index=array.length-1; index>=0; index--) {
	    	System.out.println(array[index]);
	    	
	    }
	    
		

	}

}
