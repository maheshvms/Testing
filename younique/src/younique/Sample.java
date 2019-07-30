package younique;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:/workspace/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stagingbeta.younique-qa.io");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"corp\"]/header/div/div/div[2]/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//a[@class='block padMd ctr']")).click();
		driver.findElement(By.name("email")).sendKeys("YouniqueTesting+1562222497@outlook.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-menu-root\"]/div[1]/span")).click();

		
	}

}
