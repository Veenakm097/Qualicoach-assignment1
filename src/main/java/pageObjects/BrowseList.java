package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowseList {
	
	WebDriver driver;
	
	By BrowseList=By.xpath("//li/a[text()='Browse list of users']");
	
	public BrowseList(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getBrowseList()
	{
		return driver.findElement(BrowseList);
	}
	

}
