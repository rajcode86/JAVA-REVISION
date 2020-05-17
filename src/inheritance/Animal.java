package inheritance;

/*Inheritance -->it can be defined as the process in which one object acquires the properties of others. Inheritance is the relationship
 * between super class and sub class. eg. animal is superclass and dogs,cats are sub classes.
 * By using inheritance,information can be more manageable an in a hierarchical order. eg. vehicle --cars--race cars 
 * Super class--> the class which contains common features of sub class.
 * Sub class --> which inherits common features of super class.
 * Inheritance relationship is created by using keyword "extends".
 * In inheritance objects always be of child class and properties of parent class.
 * Types of inheritance: Single, Multiple, Multilevel, Hybrid, Hierarchical
 * Inheritance can be applied at two levels: Class  and interface
 * Class inherits class/interface inherits interface using word "extends".
 * class inherits interface using word "implements"
 * Interface (multiple,single, multilevel and hierarchical)
 * Class level inheritance possible in single, multilevel and hierarchical.
 * When Superclass(parent class) has two or multiple sub classes(Child classes) which inherits properties of parent class is called Hierarchical inheritance.
 * interview question why multiple inheritance is not possible?-->multiple inheritance means a child has multiple parents.
 *so child cannot inherit properties of many parents. JVM might get confused in runtime.
 */

         public class Animal {


	public void sound () {
		System.out.println("Generate Sound");
	}

	

}
