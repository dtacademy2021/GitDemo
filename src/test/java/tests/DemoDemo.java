package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Driver;

public class DemoDemo extends TestBase {
	
	@Test
	public void test1() {
		
			
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//      
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        assertTrue(Driver.getDriver().getTitle().equals("Web Orders"));
        
//
	}

}
