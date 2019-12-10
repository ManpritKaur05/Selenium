package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Action-an interface which represents a single user-interaction

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manprit\\Documents\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com//droppable//");
		
		WebElement from = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement to = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(from, to).build().perform();
	}

}
