package WebDriverAdvanceFeatures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToIFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");  //id of the frame
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent(); //move out of the frame
		
		//To get total no. of frames
		
		List<WebElement> frames = driver.findElements(By.tagName("iframeResult"));
		
		System.out.println("Total no. of frames in web page: " + frames.size());
		
		for(WebElement ele : frames) {
			
			System.out.println(ele.getAttribute("id"));
		}
	}
}
