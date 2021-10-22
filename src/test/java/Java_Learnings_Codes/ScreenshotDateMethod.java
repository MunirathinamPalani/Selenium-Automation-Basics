package Java_Learnings_Codes;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotDateMethod {
		protected static void captureScreenshot(WebDriver webdriver) throws IOException {
			Date d = new Date();
			String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
			File ss = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ss, new File("C:\\Study\\ScreenPrint\\" + FileName));
		}
}