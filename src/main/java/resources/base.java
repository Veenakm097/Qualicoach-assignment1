package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class base {
	
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException
	{
	prop=new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\Veena K M\\git\\repository6\\E2EProject\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Veena K M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://test.qualicoach.org/login/index.php");
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	}	
}


