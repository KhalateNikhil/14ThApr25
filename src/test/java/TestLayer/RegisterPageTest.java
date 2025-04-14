package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass
{
	private static RegisterPage registerpage;
	@BeforeMethod
	public void setup()
	{
		BaseClass.initialization();
	}
	
	@Test(priority=1)
	public void validateRegisterpage()
	{
		 registerpage= new RegisterPage();
		 registerpage.registerNewUser("Mumbai", "Nikhil", "Khalate", "03/12/2024", "nk@gmail.com", "RK2346464", "nsk@123", "nsk@123", "Birth City", "Lonand");
		
	}
	
	@Test(priority=2)
	public void validatenewregisterpage()
	{
		 registerpage= new RegisterPage();
		 registerpage.registerNewUser("Pune", "Sonali", "Khalate", "11/12/2024", "sk@gmail.com", "SK2324342", "ssk@1342", "ssk@1342", "Birth City", "Phaltan");
	}
	
	
	
	
	
	
	
	
	
	
	
		
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
		
	
	
	
}
