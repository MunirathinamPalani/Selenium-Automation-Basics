package Java_Learnings_Codes;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator; 
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesTest
{ 
	public void capture(WebDriver driver) throws IOException
	{
		Date d=new Date();
		String name=d.toString().replace(":","_").replace(" ","_")+".png";
		File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File ("C:\\Screenshot\\"+name));		
	}
	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//WebDriverWait wait=new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	driver.get("http://www.naukri.com/");
	//Actions a =new Actions(driver);
	//a.moveToElement(null).perform();
	//a.moveToElement(null).click().build().perform();
	String parent=driver.getWindowHandle();
	Set <String> s=driver.getWindowHandles();
	Iterator<String> it=s.iterator();
	while(it.hasNext())
	{
		Thread.sleep(1000);
		String child=it.next();
		if(!parent.equals(child))
		{
			driver.switchTo().window(child);
			System.out.println(driver.getCurrentUrl());
			String out=driver.getTitle();
			System.out.println(out);
			driver.close();
			Thread.sleep(1000);
		}
		driver.switchTo().window(parent);
		System.out.println("Test Run Success");
	}
	driver.close();
	}
}
