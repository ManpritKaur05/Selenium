package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//till the time when element is not found immediately it will wait for 10 seconds
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//enter username
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("manpritkv");
		//click on next
		driver.findElement(By.xpath("//*[@id='identifierNext']/span")).click();
		
		//Using thread to solve the problem of synchronization is not good approach as it can increase the time of execution.
		//if an element takes 5sec to execute and we have given 10sec in sleep, 5sec will be wasted and increases execution time.
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//enter password
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("chandigarh1");	
		
		driver.close();
	}

}
