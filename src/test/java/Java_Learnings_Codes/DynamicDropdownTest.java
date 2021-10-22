package Java_Learnings_Codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class DynamicDropdownTest {
	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://www.Spicejet.com/"; 
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[text()='MAA']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
		driver.close();
}
}
