package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;



public class HomePage extends UtilityMethods
{
HomePage(WebDriver driver)
{
  PageFactory.initElements(driver,this);	
}
	@FindBy(xpath ="//select[@class=\"product_sort_container\"]")
	WebElement dropDownProdu;
	
	public void clickOnDrpdown()
	{
       clickAction(dropDownProdu);
	}
	
	
	
}
