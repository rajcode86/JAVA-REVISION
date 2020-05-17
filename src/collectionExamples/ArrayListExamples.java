package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList ();     //cannot create an object of list because it is an interface.
		System.out.println(list);            //it will show empty list.
		
		
	System.out.println(list.size());         //to check the size of arraylist
	
	//how to add values in list?
	list.add(10)  ;                    //any value we will store it will actually converted into an object.
	 list.add("rajdeep");                //list can store any type of value.numeric,string etc.
	list.add(10.25);
	list.add('c');
	list.add("nihal");
	list.add(null);
	list.add("rajdeep");
	
	//there is one drawback when we add values in arraylist.
	//i need to fetch value at the zeroth index.will do 
	/*System.out.println(list.get(0));
	Object var = list.get(0);
	//System.out.println(20+var); */    //we cannot add primitive value to an object.there were so many type casting issues so here introduced 'generic'
	
	System.out.println(list);
	System.out.println(list.size());
	
	//how to fetch the values from list?
	//there is method to retrieve value from list is 'get'. the index of the list starts from zero as array.
	
	//list.get(0);
	System.out.println(list.get(2));   //it will return an object.
	System.out.println(list.get(4));
	
	//if want to remove any value method is list.remove();
	
list.remove(6);
System.out.println(list);
System.out.println(list.size());

//To print all the values from list.there are couple of approaches.
  
/*for (int i=0; i<list.size(); i++) {   //this is one method for printing values .
	System.out.println(list.get(i));  
	
}*/
//second method is 

for (Object var:list) {     //syntax is (type of variable which is object that is super class, variable:list)
System.out.println(var)	;
}

//third method to retrieve values is iterated.
   
 /* Iterator itr= list.iterator()  ;    //iterator is basically an interface

while(itr.hasNext()) {
	

System.out.println(itr.next());
}*/








	
	
	
	}

}
