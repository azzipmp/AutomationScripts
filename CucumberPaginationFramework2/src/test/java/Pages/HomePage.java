package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	//webelements  - objects repository
	WebDriver driver;
	
	@FindBy(linkText="REGISTER")
	WebElement registerlink;
	@FindBy(linkText="SIGN-ON")
	WebElement signonlink;
	
	@FindBy(name="userName")
	WebElement usernametextfield;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//operations  - methods
	
	
	
	
	
	public void clickonregisterlink()
	{
		registerlink.click();
		//driver.findElement(By.linkText("REGISTER")).click();
	}
	
}
