package interfaceexamples;
      
      /*then we made an interface named "RemoteWebdriver". now inherit interface to interface keyword used "extends".
       * RemoteWebdriver to webdriver
 * then we make new class chrome driver and implements remote web driver 
 * then it will override methods from remotewebdriver and from parent interface webdriver too
 * 
 * 
 */
public interface RemoteWebdriver extends WebDriver {
	
	public void windowMaximize();

}
