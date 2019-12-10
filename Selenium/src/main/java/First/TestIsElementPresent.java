package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {

	public static WebDriver driver;

	public static boolean isElementPresent(By by) {

		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// checks visibility of the element
		//System.out.println(driver.findElement(By.xpath("//*[@id='js-link-box-en']/strong")).isDisplayed());
		
		System.out.println(isElementPresent(By.xpath("//*[@id='js-link-box-en']/strong")));
	}

}
