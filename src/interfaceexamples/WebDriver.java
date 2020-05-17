package interfaceexamples;

    /*Interface is purely abstract class which contains only abstract methods.
     * interface is always abstract whether we mention it or not.
 * Declaration:-- to declare an interface need to use keyword 'interface'. eg. public interface MyInterface{}
 * we cannot create any concrete methods in an interface.
 * also cannot create interface final. so cannot override method in final keyword.
 * abstract methods don't have any body.
 * package interface examples ch class bnaun di jagah interface create kita named webdriver.then create couple of methods.
 * after making an interface named webdriver we made class named firefox driver with main method.we cannot make an object of webdriver.
 * same way if any class implementing the interface,it is actually provide definition to all the methods which are inside the interface.
 */
public interface WebDriver {  
	
         public void click();
         public void sendKeys();



}
