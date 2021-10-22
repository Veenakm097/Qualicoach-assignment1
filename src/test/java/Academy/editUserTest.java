package Academy;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.BrowseList;
import pageObjects.EditProfile;

import pageObjects.LoginPage;
import pageObjects.addUserPage;
import pageObjects.searchUname;
import resources.base;

public class editUserTest extends base {
	@Test
	public  void basePageNavigation() throws IOException
	{
		driver=intializeDriver();
		driver.get("https://test.qualicoach.org/admin/search.php");
		
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys("admin57");
		lp.getPassword().sendKeys("Admin@8125");
        lp.getLogin().click();
        
        EditProfile pp=new EditProfile(driver);
        pp.getEditProfile().click();
        
        BrowseList nu=new BrowseList(driver);
        nu.getBrowseList().click();
        
        searchUname su=new searchUname(driver);
        su.getsearchUname().sendKeys("user m");
        
        su.getAddFilter().click();
        
        
	}
}
       // EditPage
        
        

	
        


	


