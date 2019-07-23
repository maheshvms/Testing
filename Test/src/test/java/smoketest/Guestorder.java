package smoketest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import smoketest_test.Guestorder_test;

public class Guestorder {
	
	
	@Test
	public void test_Guestorder() throws InterruptedException {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:/workspace/New folder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stagingbeta.younique-qa.io");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Guestorder_test	guest = new Guestorder_test(driver);
		
		
		guest.Home_page();
		Thread.sleep(3000);
		guest.kudos_click();
        guest.selection1_click();
		Thread.sleep(3000);
		guest.Select_mauverose();
		
	}

}
