import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.naukri.com/");
			Thread.sleep(5000);
			
			
			ArrayList<String> AllWindowHandles  = new ArrayList<String> (driver.getWindowHandles());
		     System.out.println(AllWindowHandles.size());
		
			//Switch to new child1 window
			driver.switchTo().window(AllWindowHandles.get(1));
			System.out.println(driver.getTitle());
			driver.close();//do some action in new child1 window
			Thread.sleep(5000);
			
			//Switch to new child2 window
			driver.switchTo().window(AllWindowHandles.get(2));
			System.out.println(driver.getTitle());//do some action in new child2 window
		
			driver.close();
			Thread.sleep(5000);
			
			//Switch to new child3 window
			driver.switchTo().window(AllWindowHandles.get(3));
			System.out.println(driver.getTitle());//do some action in new child2 window
				
			driver.close();
			Thread.sleep(5000);
			//Switch to main/parent window
				driver.switchTo().window(AllWindowHandles .get(0));
				System.out.println(driver.getTitle());//do some action in main window
				driver.close();

	}

}
