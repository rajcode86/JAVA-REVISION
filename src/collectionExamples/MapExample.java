package collectionExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		
        map.put("FirstName", "Rajdeep")  ;       //we will use map.put to put values in map.
        map.put("LastName", "Kaur")  ;       //duplicate keys are not allowed in map as well.
        map.put("Subject", "Selenium")  ;
        System.out.println(map);
        System.out.println(map.size());  //it will give result 3 coz key and value count as single element.
        
        //want to fetch value from map
        System.out.println(map.get("FirstName"));
      
        //how to print all values from map? the best approach is following:
       Set<String>keys =  map.keySet();
        for(String key:keys) {
        	System.out.println("key-->"+key+"   Value is -->"+map.get(key));
        	
        }
        
        //if we need to store couple of things in map then 
        Map<String,List<String> >map1 = new HashMap<String,List<String>>(); //then we need to add list of values
       
        List<String> ListofEmails = new ArrayList<String>();
        ListofEmails.add("trainer@gmail.com");
        ListofEmails.add("way2automation@gmail.com");
        ListofEmails.add("seleniumcoaching@gmail.com");
        ListofEmails.add("info@gmail.com");
        
        
	}
	 
}
