package MavenProject2.MVNTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/**
 * Hello world!
 *
 */
public class WebDriverTesting 
{
   // public static void main( String[] args )
   
       // {
	
	
           WebDriver driver = new FirefoxDriver();
        	 //@BeforeTest - Run before Executing all test cases 
       @BeforeTest
        public void openbrowser() { 

        	  driver.manage().window().maximize();
        	  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=yfXxV8TwDaPv8wei9ICICg&gws_rd=ssl");
        	 }

        	//@AfterTest - Run After Executing all test cases
        	 @AfterTest
        	 public void closebrowser() {
        	  System.out.print("\nBrowser close");
        	  driver.quit();
        	 }
        	 
        	 @Test
        	 public void verifyTitle() {
        	   String title = driver.getTitle();
        	   System.out.print("Current page title is : "+title);
        	  Assert.assertEquals(title,"Google");
        	 }
        	 
}