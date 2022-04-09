package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
	private WebElement signintab;
	
	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	private WebElement signinbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSignintab() {
		return signintab;
	}

	public void signbtn() {
		signinbtn.click();
	}
}
