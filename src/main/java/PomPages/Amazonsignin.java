package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonsignin {

	@FindBy(id = "ap_email")
	private WebElement useridtab;
	
	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	@FindBy(id = "ap_password")
	private WebElement pwdtab;
	
	@FindBy(id = "signInSubmit")
	private WebElement signinbtn;
	
	public Amazonsignin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usertab(String user) {
		useridtab.sendKeys(user);
	}
	
	public void continuebutton() {
		continuebtn.click();
	}
	
	public void passwordtab(String password) {
		pwdtab.sendKeys(password);
	}
	
	public void siginbutton() {
		signinbtn.click();
	}
}
