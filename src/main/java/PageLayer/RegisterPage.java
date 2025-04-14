package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Utilsclass;

public class RegisterPage extends BaseClass
{
//create object repository using @FindBy and @FindBys annotaion
	
	@FindBy(id="cpvLocationPO")
	private WebElement passbutton ;
	
	
	
	@FindBy(name="dcdrLocation")
	private WebElement poffice;
	
	@FindBy(name="givenName")
	private WebElement fname;
	
	@FindBy(name="surname")
	private WebElement lname ;
	
	@FindBy(name="dob")
	private WebElement bday;
	
	@FindBy(name="email")
	private WebElement mail ;
	
	
	@FindBys(@FindBy(name="emailloginSame"))
	private WebElement yesno;
	
	
	@FindBy(name="loginId")
	private WebElement loginid;
	
	@FindBy(name="pwd")
	private WebElement pass ;
	
	@FindBy(name="confirmPwd")
	private WebElement cpass ;
	
	@FindBy(name="hintQues")
	private WebElement hque;
	
	@FindBy(name="hintAns")
	private WebElement hans ;
	
	
	//initialize object repository by using PageFactory.initElements()method in constructor
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	//create associated methods for each and every object repository without entering test data
	
	
	public void registerNewUser(String passffice,String firstname,String lastname,String date,
			String mailid,String loginID,
			String password,String cpassword,String hintq,String hintans)
	{
		passbutton.click();
		
		HandleDropDown.selectByVisibleText(poffice, passffice);
		
		Utilsclass.sendKeys(fname, firstname);
		Utilsclass.sendKeys(lname, lastname);
		Utilsclass.sendKeys(bday, date);
		Utilsclass.sendKeys(mail, mailid);
		yesno.click();
		Utilsclass.sendKeys(loginid, loginID);
		Utilsclass.sendKeys(pass, password);
		Utilsclass.sendKeys(cpass, cpassword);
		HandleDropDown.selectByVisibleText(hque, hintq);
		Utilsclass.sendKeys(hans, hintans);
		System.out.println("RegisterPage TC created by Rushi Tester");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
