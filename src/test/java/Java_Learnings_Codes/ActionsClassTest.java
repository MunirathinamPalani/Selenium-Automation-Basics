package Java_Learnings_Codes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {
	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://www.facebook.com/"; 
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		builder.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
			//.keyDown(Keys.SHIFT).sendKeys(Keys.ENTER).keyUp(Keys.SHIFT)
			.build().perform() ;
		/*WebElement a=driver.findElement(By.xpath("//*[@LinkText='Cut']"));
		a.click();*/
		Thread.sleep(2000);
		WebElement elementOpen = driver.findElement(By.linkText("Emoji")); /*This will select menu after right click */

		elementOpen.click();
		
		
}
}
