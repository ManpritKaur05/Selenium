package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manprit\\Documents\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.javatpoint.com");   
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("window.scrollBy(0,4500)"); //scroll down
//		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //scroll till end of web page
		
		WebElement Element = driver.findElement(By.linkText("1st August - Tableau Bar Chart")); //scroll upto when element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}
}
