package WebDriverAdvanceFeatures;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopupsAndTabs {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("-----Generating window ids from first window--------");

		Set<String> winids = driver.getWindowHandles();

		Iterator<String> itr = winids.iterator();
		System.out.println("First window id: " + itr.next());

		driver.findElement(By.id("loginsubmit")).click();
		
		System.out.println("-----Generating window ids from second window--------");

		winids = driver.getWindowHandles();

		itr = winids.iterator();
		itr.next(); //first window
		String secwin = itr.next(); //second window
		System.out.println("Second window id: " + secwin);
		
		driver.switchTo().window(secwin);

		// 2nd window
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id='customertab1']/div[1]/div[1]/p[2]/strong/a/span")).click();
		
		System.out.println("-----Generating window ids from third window--------");

		winids = driver.getWindowHandles();

		itr = winids.iterator();
		itr.next(); //first window
		itr.next(); //second window
		String thiwin = itr.next(); //third window
		System.out.println("Third window id: " + thiwin);
		
		driver.switchTo().window(thiwin);

		// 3rd window
		// contains returns boolean value whether it is true or false
		System.out.println(driver.getTitle().contains("Welcome to HDFC Bank NetBanking"));
		
		driver.quit();

	}

}
