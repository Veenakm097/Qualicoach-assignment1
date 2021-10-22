package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addNewUser {
	
	public WebDriver driver;
	
	By addNewUser=By.xpath("//li/a[text()='Add a new user']");
	
	
	public addNewUser(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public WebElement getaddNewUser()
	{
		return driver.findElement(addNewUser);
	}
	


	
}