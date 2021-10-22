package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditLogin {

	WebDriver driver;

	
	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("loginbtn");
	
	public  EditLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		
		return driver.findElement(login);
	}
}
