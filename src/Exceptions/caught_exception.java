package Exceptions;

public class caught_exception {

	public static void main(String[] args) throws InterruptedException {     //interrupted exception is the child class of the exception
		int i[] = new int[4];                                              //it is example of caught exception.
		
		i [5] =100;
		Thread.sleep(1000); //there is an error in thread.sleep method because it demands try and catch block every time.
                           //jinni var thread method use krna try and catch block launa pena thats not feasible.
		                  //so we move cursor on error it shows add throwable declaration.so use it.
	}

}
