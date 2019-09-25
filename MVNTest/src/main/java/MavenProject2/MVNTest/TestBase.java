package MavenProject2.MVNTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase extends Utills{

	
	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;

	 public void init(String browser) throws IOException, Exception{
		 loadPropertiesFile();
		 selectBrowser(Repository.getProperty(browser));
		 Thread.sleep(1000);
		 driver.get(Repository.getProperty("url"));
		 
		 
	 }
	 
	 public void loadPropertiesFile() throws IOException {
		 f = new File(System.getProperty("User.dir")+"\\config.properties");
		 FI = new FileInputStream(f);
		 Repository.load(FI);
		 
		 f = new File(System.getProperty("User.dir")+"\\config.properties");
		 FI = new FileInputStream(f);
		 Repository.load(FI);
		 
		 
	 }
	

}
