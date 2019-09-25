package MavenProject2.MVNTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utills {

	public static WebDriver driver;
	//Based on Config Properties file input browser will be decided and that browser will
	//be invoked from this method
	public static WebDriver selectBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("chrome browser");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if(browser.equalsIgnoreCase("IE")){
			System.out.println("Internet Explorer");
			System.setProperty("webdriver.IE.driver", System.getProperty("user.dir")+"iexplore.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
	}
		return null;
	}
	
}
