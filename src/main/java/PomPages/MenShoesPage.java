package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenShoesPage {

	@FindBy(xpath = "(//span[text()='All'])[2]")
	private WebElement allbtn;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutbtn;
	
	public MenShoesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void allbtn() {
		allbtn.click();
	}
	
	public void signoutbtn() {
		signoutbtn.click();
	}
}
