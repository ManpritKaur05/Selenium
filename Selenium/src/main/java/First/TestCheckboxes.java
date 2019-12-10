package First;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {
	
	public static WebDriver driver;

//	public static boolean isElementPresent(By by) {
//
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//
//	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://www.tizag.com//htmlT//htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//div[4]/input[1]")).click();
		
//		for (int i=1 ; i<=4; i++) {
//			
//			driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
//		}
		
		//OR
		
//		int i=1;
//		int count=0;
//		
//		while(isElementPresent(By.xpath("//div[4]/input[" + i + "]"))) {
//			
//			driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
//			i++;
//			count++;
//		}
//		
//		System.out.println("Total no. of checkboxes: " + count);
		
		//OR
		
		WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		
		System.out.println("Total no. of checkboxes: " + checkboxes.size());
		
		for(WebElement ele : checkboxes) {
			
			ele.click();
		}
		
	}
}
