import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandlesandWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.rcreddyiasstudycircle.com/");
			Thread.sleep(500);
			System.out.println(driver.getTitle());
			
			
			driver.switchTo().window(driver.getWindowHandle());
			
			//Thread.sleep();
			
			
		//driver.findElement(By.id("om-lightbox-coupon-optin-email")).sendKeys("hanumanth.lgit@gmail.com");
		
		//String Entered_email=driver.findElement(By.id("om-lightbox-coupon-optin-email")).getAttribute("value");
		//System.out.println(Entered_email);
		
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		}

	}
