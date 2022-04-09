package GenericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	public void dropdown(WebElement dropdown, String text ) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
	}
	
	public void mousehover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void scrollbar(JavascriptExecutor driver, int x, int y) {
		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void doubleclick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void dragdrop(WebDriver driver, WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source,target).perform();
	}
	
	public void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void switchtab(WebDriver driver) {
	Set<String> child = driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
	 }
	}
	
	public void popup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	
	
	
}
