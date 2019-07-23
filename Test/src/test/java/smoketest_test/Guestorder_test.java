package smoketest_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guestorder_test {

	WebDriver driver;
	
	// Home_page click
	@FindBy(xpath = "//img[contains(@id,'siteLogo')]")
	WebElement Home_page;
	

	public void Home_page() {
		Home_page.click();
	}
	
	// Click on Kudos
	@FindBy(xpath = "(//a[contains(text(),'Kudos')])[2]")
	WebElement kudos_click;
		
		public void kudos_click() {
			kudos_click.click();
		}
		
		// Click on MOODSTRUCK pressed blusher selection_1
		@FindBy(xpath = "//div[contains(text(),'Make a selection...')]")
		WebElement selection1_click;
		
		public void selection1_click() {
			selection1_click.click();
		}
		
		
		// Click select mauve rose
		@FindBy(xpath = "//div[contains(text(),'Seductive - Matte mauve rose')]")
		WebElement Select_mauverose;
		
		public void Select_mauverose() {
			Select_mauverose.click();
		}
		
		
		// Initialisation
		public Guestorder_test(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
}
	
	

