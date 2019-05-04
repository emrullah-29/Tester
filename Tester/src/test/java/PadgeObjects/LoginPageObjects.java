package PadgeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

public LoginPageObjects (WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

@FindBy(id="ctl00_MainContent_username")
public WebElement email;

@FindBy(id="ctl00_MainContent_password")
public WebElement password;

@FindBy(id= "ctl00_MainContent_login_button")            
public WebElement LogIn;
	
}
