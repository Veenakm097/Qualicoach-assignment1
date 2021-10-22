package Academy;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.addNewUser;
import pageObjects.addUserPage;
import pageObjects.profilePage;
import resources.base;


public class createUserTest extends base{
	
	
	@Test
	public  void basePageNavigation() throws IOException
	{
		driver=intializeDriver();
		driver.get("https://test.qualicoach.org/admin/search.php");
		
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys("admin57");
		lp.getPassword().sendKeys("Admin@8125");
        lp.getLogin().click();
        
        profilePage pp=new profilePage(driver);
        pp.getUsers().click();
        
        
        addNewUser nu=new addNewUser(driver);
        nu.getaddNewUser().click();
        
        
        addUserPage up=new addUserPage(driver);
        up.auname().sendKeys("admin07");
        up.PwClick().click();
        
        up.pwdClick().sendKeys("Admin@09");
        up.fname().sendKeys("User");
       
        up.lname().sendKeys("m");
        up.email().sendKeys("kmveena827@gmail.com"); 
        scrollDown(471,1650);
        up.submitButton().click();
        
		
	}

	private void scrollDown(int x, int y) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(471,1650)","");
		
		
	}

	
    
}
