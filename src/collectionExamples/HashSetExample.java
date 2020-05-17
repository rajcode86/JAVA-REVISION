package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		/*make a class named hashset, in this class made a object then import.java.util.hashset.
		 * index will in an unordered way not same as list provided, hashset allows only unique values. 
		 *indexes are not ordered in set so there is no get method so cannot fetch values index wise in set 
		 */
        Set<String> set = new HashSet<String>();  //if we change hashset to set then it will give us unique value.
        
        set.add("Rajdeep");
        set.add("Way2Automation");  
        set.add("Selenium");
        set.add("Rajdeep");
        set.add("Appium");
        System.out.println(set);
        
      //if we need to print the values in set will use for each.
    /*	for(String var:set) {
    		System.out.println(var);
    	}*/
    	
    	//second way to print values in set is iterator.
    	     
    	Iterator<String> itr= set.iterator();
    	while (itr.hasNext()) {
    		//if we want to print only "appium" value we will use but it will value next to appium. it will jump to next value uses itr.next.
    		//then we should do
    		String var=itr.next();  //it will give error coz in iterator didn't set generics.
    		if (var.equals("Appium")){
    				
    		System.out.println(var); 
    		}
    	}
	}
	

}
