package Synchronization;

//explicit wait - if we get exception like NoSuchElementVisible or ElementNotInteractableException
//if we want to increase wait time for a particular element we use explicit wait

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		String title = driver.getTitle();
		System.out.println(title);

		// enter username
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("manprit");
		// click on next
		driver.findElement(By.xpath("//*[@id='identifierNext']/span")).click();

		// enter password
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("chandigarh1");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("chandigarh1");

		// click on next
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();

		// get text of password incorrect
		System.out.println(driver
				.findElement(By
						.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"))
				.getText());

		driver.close();

	}
}
