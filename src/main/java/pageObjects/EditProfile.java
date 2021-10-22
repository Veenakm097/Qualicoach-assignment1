package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EditProfile {
	
	WebDriver driver;
	
		By EditProfile=By.cssSelector("a[href='#linkusers']");
		
		public EditProfile(WebDriver driver) 
		{
			
			this.driver=driver;
		}
		public WebElement getEditProfile()
		{
			return driver.findElement(EditProfile);
		}
}
	
	
	


