package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manprit\\Documents\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//for opening web page		
		driver.navigate().to("http://www.google.com"); // or
		// driver.get("http://www.google.com");
		
		//locating forms and sending input
		driver.findElement(By.className("gLFyf")).sendKeys("Java");

		driver.findElement(By.name("btnK")).click(); //to click
		
		//fetching data over web element
		// driver.findElement(By.id("element567")).getText(); 

		//navigating backward or forward in browser history
		// driver.navigate().forward();
		// driver.navigate().back();
		
		//driver.navigate().refresh();  
		
		// driver.close(); //closing browser
		
		//driver.quit(); // closing browser and all other tabs
		
		//driver.switchTo().window("windowName");  // switch between windows
		
		//driver.switchTo().frame("frameName");  //moving between frames
	}

}
