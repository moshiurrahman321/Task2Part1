package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElement {
	public WebDriver driver;
	By selectHere=By.xpath("//a[contains(text(),'HERE')]");
	By selectHelp=By.cssSelector("a.help-form__help-button");
	
	
	
	public BaseElement(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Here() {
		return driver.findElement(selectHere);
	}
	public WebElement Help() {
		return driver.findElement(selectHelp);
	}
	
}
