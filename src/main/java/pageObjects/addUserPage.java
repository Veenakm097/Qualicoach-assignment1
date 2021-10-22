package pageObjects;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addUserPage {
	
	
	public WebDriver driver;
	
	public addUserPage(WebDriver driver3)
	{
		this.driver=driver3;
	}

	public WebElement auname()
	{
		return driver.findElement(By.id("id_username"));
		
	}
	public WebElement PwClick()
	{
		return driver.findElement(By.xpath("//em[text()='Click to enter text']"));
	}
	public WebElement pwdClick()
	{
		return driver.findElement(By.id("id_newpassword"));
		
	}
	public WebElement fname()
	{
		return driver.findElement(By.id("id_firstname"));
	}
	
	public WebElement lname()
	{
		return driver.findElement(By.id("id_lastname"));
	}
	public WebElement email()
	{
		return driver.findElement(By.id("id_email"));
	}
	public WebElement submitButton() {
		
		return driver.findElement(By.id("id_submitbutton"));
	}
	
	
	
	
	
	
	
	
}
