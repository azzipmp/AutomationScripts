package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateAccountPage {

	//webelements  - objects repository
	WebDriver driver;
	@FindBy(tagName="body")
	WebElement bodytag;
	
	
	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//operations  - methods
	
	public String getbodytext()
	{
	
	//String  sActualValue=driver.findElement(By.tagName("Body")).getText();
	
	String  sActualValue=bodytag.getText();
	return sActualValue;
	}
	
	
	
}
