package Java_Learnings_Codes;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest extends ScreenshotDateMethod{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		if(driver.findElement(By.linkText("English (UK)")).isDisplayed())
		{
			driver.findElement(By.linkText("English (UK)")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("muni");
			driver.findElement(By.id("pass")).sendKeys("word");
			driver.findElement(By.linkText("Forgotten password?")).click();	
			System.out.println("if");
			captureScreenshot(driver);
		}
		else if(driver.findElement(By.linkText("Forgotten password?")).isDisplayed())
		{
			driver.findElement(By.id("email")).sendKeys("muni");
			driver.findElement(By.id("pass")).sendKeys("word");
			driver.findElement(By.linkText("Forgotten password?")).click();
			System.out.println("else if");
			captureScreenshot(driver);
		}
			System.out.println("working");
			captureScreenshot(driver);
			driver.close();
		}

}
