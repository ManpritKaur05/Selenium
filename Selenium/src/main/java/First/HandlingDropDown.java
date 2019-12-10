package First;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Manprit\\Documents\\selenium jar
		// files\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.navigate().to("http://way2automation.com//way2auto_jquery//index.php");
		driver.navigate().to("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// or driver.findElement(By.name("country")).sendKeys("Germany");

		// 'Select' class in Selenium WebDriver is used for selecting and
		// deselecting option in a dropdown

		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		Select drop = new Select(dropdown);

		// drop.selectByVisibleText("Dansk");
		drop.selectByValue("et");
		// drop.selectByIndex("1");

		List<WebElement> values = driver.findElements(By.tagName("option"));

		// starts from 0 - size-1(61-1=60)
		System.out.println("Total values are: " + values.size()); // return
																	// total
																	// size of
																	// values

		System.out.println(values.get(7).getText());
		
		//printing all links in web page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement ele : links) {
			
			System.out.println(ele.getText() + "URL is - " + ele.getAttribute("href"));
		}
		
		driver.close();

	}

}
