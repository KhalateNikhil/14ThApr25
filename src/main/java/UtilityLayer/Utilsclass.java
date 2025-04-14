package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Utilsclass extends BaseClass
{//create reusable method for elemenet is displayed and enabled or not
	
	
	
	public static void sendKeys(WebElement wb,String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}
		
	}
	

}
