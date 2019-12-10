package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleWebpage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manprit\\Documents\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.testandquiz.com//selenium//testing.html");
		
		String sampleText = driver.findElement(By.className("col-md-offset-2")).getText();
		System.out.println(sampleText);
		
		driver.findElement(By.linkText("This is a link")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.id("fname")).sendKeys("Manprit Kaur");
		
		driver.findElement(By.id("idOfButton")).click();
		
		driver.findElement(By.id("female")).click(); //to click on radio button
		
		driver.findElement(By.cssSelector("input.Automation")).click(); //using css selector clicking on selector
		
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Performance Testing");
		
		driver.close();
	}


}
