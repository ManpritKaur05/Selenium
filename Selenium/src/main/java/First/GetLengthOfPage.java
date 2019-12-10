package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLengthOfPage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manprit\\Documents\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.javatpoint.com");   
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		int titleLength = driver.getTitle().length();  
		
		System.out.println("Title of web page - " + title);
		System.out.println("Length of title of web page - "+ titleLength); // prints the length of title and counts spaces also
		
		int pagelength = driver.getPageSource().length();
		
		System.out.println("Length of Page source - " + pagelength); // prints the length of page
		
		driver.close();
	}

}
