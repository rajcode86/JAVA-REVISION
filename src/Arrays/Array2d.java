package Arrays;

public class Array2d {
/*Multi dimensional arrays are nothing but 'array of arrays' where each element represents the single dimensional array.
 * myArray represents very first bracket. [2][3] which means two indexes have three elements.
 * 
 * 
 */
	public static void main(String[] args) {
		int [] [] myArray = new int [2][3];
    myArray[0][0]= 1;
    myArray[0][1]= 2;
    myArray[0][2]= 3;
    
    
    myArray[1][0]= 4;
    myArray[1][1]= 5;
    myArray[1][2]= 6;
    
      /* System.out.println(myArray[1][2]);
    
    System.out.println(myArray[0].length);  //to know length of 2 dimensional array.
      */
    //to get all values of arrays used loop.
    
    for (int i=0; i<myArray.length; i++) {
    	
    	for (int j=0; j<myArray[0].length; j++) {
    		
    		System.out.print(myArray[i][j]+" ");  //if we want values in tabular form then just remove ln from printing line.
    	}
  //for printing second array in next line put another printing line 	
    	
    	System.out.println();
    }
    
    
	}

}
