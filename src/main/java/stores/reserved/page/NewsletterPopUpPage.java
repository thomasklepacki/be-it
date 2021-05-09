package stores.reserved.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Wait;

public class NewsletterPopUpPage {

	private WebDriver driver;

	public NewsletterPopUpPage(WebDriver driver) {
	this.driver = driver;
	}

	public void closeNewsletterPopUp() {
		Wait.waitForOneSecond();
		if (!driver.findElements(By.xpath("//*[@id='newsletterContainer']/div[@class='close']")).isEmpty()) {
			driver.findElement(By.xpath("//*[@id='newsletterContainer']/div[@class='close']")).click();
		}
	}
}