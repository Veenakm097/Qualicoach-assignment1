package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchUname {
	
	WebDriver driver;
	
	By searchUname=By.id("id_realname");
	By AddFilter=By .id("id_addfilter");
	By Edit=By.xpath("//img[@alt='Edit']");
	
	
	
public searchUname(WebDriver driver2) {
		
		this.driver=driver2;
	}
	public WebElement getsearchUname()
	{
		return driver.findElement(searchUname);
	}
	
	public WebElement getAddFilter() {
		// TODO Auto-generated method stub
		return driver.findElement(AddFilter);
	}
	
	public WebElement getEdit() {
		// TODO Auto-generated method stub
		return driver.findElement(Edit);
		
	}
}
	
	


