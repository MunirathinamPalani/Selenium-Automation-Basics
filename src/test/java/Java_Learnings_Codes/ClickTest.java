package Java_Learnings_Codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		if(driver.findElement(By.linkText("Forgotten password?")).isDisplayed())
		{
			driver.findElement(By.id("email")).sendKeys("muni");
			driver.findElement(By.id("pass")).sendKeys("word");
			driver.findElement(By.linkText("Forgotten password?")).click();
			System.out.println("If");
		}
		System.out.println("working");
		driver.close();
	}

}
