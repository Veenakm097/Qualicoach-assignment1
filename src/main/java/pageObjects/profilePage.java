package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class profilePage {
	
	public WebDriver driver;
	
	By users=By.cssSelector("a[href='#linkusers']");
	

	
	public profilePage(WebDriver driver2) {
		
		this.driver=driver2;
	}
	public WebElement getUsers()
	{
		return driver.findElement(users);
	}
	}

	

