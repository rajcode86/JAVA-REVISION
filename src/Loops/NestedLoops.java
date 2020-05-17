package Loops;

public class NestedLoops {

	/* The placing of one loop inside the body of another loop is known as Nesting of loops.
	 * in nesting loop the outer loop will change only when inner loop is completely finished.
     * if we have scenario while loop =3 
     *                     for loop = 4
     *                     do while = 5
     * it will run 60 times by multiplying 3 loops. 3*4*5=60
     */
	
	public static void main(String[] args) {
		
		int i = 0;
		int count =0;
		while (i<3) 
		{
			
			for (int j=0; j<4; j++) 
			{
			int k=0;
				do {
					System.out.println("i = "+i  +"   j = "+j +"   k = "+k);
					k++;
					count++;
				} 
				while(k<5);
		}
			i++;	
			
		}
		System.out.println("Total count is: "+count);

	}

}
