import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).submit();
		
		
		
	}

}
