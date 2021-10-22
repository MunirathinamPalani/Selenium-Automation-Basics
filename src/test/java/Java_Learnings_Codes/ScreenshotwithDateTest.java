package Java_Learnings_Codes;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotwithDateTest {
	
	public static void captureScreen(WebDriver Driver) throws IOException
	{
		Date d=new Date();
		System.out.println(d);
		String Filename=d.toString().replace(":","_").replace(" ","_") + ".png";
		File out=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(out, new File("C:\\Study\\ScreenPrint\\" +Filename));
	}
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.amazon.com");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList-nav-line-1")));
		WebElement a=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions act=new Actions(driver);
		act.moveToElement(a).perform();
		captureScreen(driver);
		WebElement b=driver.findElement(By.className("nav-text"));
		act.moveToElement(b).click().build().perform();
		captureScreen(driver);
		Thread.sleep(1000);
		driver.close();
	}
}
