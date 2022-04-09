package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void getScreenshot(WebDriver driver, String name) throws IOException {
		Date dt = new Date();
		String currentDate = dt.toString().replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new  File(AutoConstant.photopath+currentDate+name+".png");
		FileUtils.copyFile(source, destination);
	
	}
}
