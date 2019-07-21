package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gmail_login {

	WebDriver driver;

	public Gmail_login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "identifierId")
	WebElement send_email;

	
	public void send_email(String Username) {
		send_email.sendKeys(Username);

	}

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement click_next;

	public void click_next() {
		click_next.click();

	}

	@FindBy(name = "password")
	WebElement send_pass;
	
	public void send_pass(String Password) {
		send_pass.sendKeys(Password);
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	



















