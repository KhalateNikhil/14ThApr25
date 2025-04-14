package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass
{
   //create reusable script for Handling Drop Down
	
	
	public static void selectByVisibleText(WebElement wb, String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			Select sel= new Select(wb);
			sel.selectByVisibleText(value);
		}
	}
	
	
	
}
