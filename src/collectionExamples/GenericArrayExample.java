package collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayExample {

	public static void main(String[] args) {
		//used polymorgraphic reference that is an interface.
		
   List<Integer> list= new ArrayList<Integer>();   //we need to add angular brackets in which we defined the type of values we stored,that will not be primitive type 
                                    //that will be of class.add full name of class type values like integer not int(primitive type)
   list.add(10);    //with this method we can add integer values in arraylist. there is no type casting.
   
   int i = list.get(0);
   System.out.println(i);
   
	}

}
