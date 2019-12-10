package WebDriverAdvanceFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyboardEvents {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// enter username
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("manpritkv");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		//driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(Keys.ENTER);
		
//		action.sendKeys(Keys.CONTROL+"a").perform();
//		action.sendKeys(Keys.CONTROL+"c").perform();
//		action.sendKeys(Keys.CONTROL+"v").perform();
	}

}
