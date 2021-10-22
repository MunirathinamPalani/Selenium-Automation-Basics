package Java_Learnings_Codes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardAndBackTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.get("http://www.yahoo.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
