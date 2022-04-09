package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(xpath = "//span[text()=' for men']")
	private WebElement searchbtn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void searchbox(String name) {
		searchbox.sendKeys(name);
	}
	
	public void searchbtn() {
		searchbtn.click();
	}
}
