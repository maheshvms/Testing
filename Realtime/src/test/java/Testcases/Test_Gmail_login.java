package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pagefactory.Gmail_login;

public class Test_Gmail_login {
	
	WebDriver driver;
	Gmail_login mail;
	
	@Test (dataProvider="login")
	public void login1(String username, String password) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/Realtime/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://accounts.google.com/signin");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		mail = new Gmail_login(driver);
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys(username);
		mail.click_next();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(password);
		mail.click_next();
		Thread.sleep(3000);
		driver.close();
		
		
	}	
	
	@DataProvider(name="login")
	public Object[][] passdata()
	{
		
		Object[][] data = new Object[3][2];
		
		data [0][0] = "vmahesh1415@gmail.com";
		data [0][1] = "Silpavaka@1";
				
		data [1][0] = "mahesh.vaka.royal@gmail.com";
		data [1][1] = "silpamahesh";
		
		data [2][0] = "maheshvaka896@gmail.com";
		data [2][1] = "silpavaka";
		
		return data;
	}
}
	
	
