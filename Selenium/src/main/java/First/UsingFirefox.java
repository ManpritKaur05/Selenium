package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UsingFirefox {

	public static void main(String[] args) {

		// System.setProperty("webdriver.ie.driver",
		// "C:\\Users\\Manprit\\Documents\\selenium jar files\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Manprit\\Documents\\selenium jar files\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		// Using desired capabilities class
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(cap);

		//OR
		
		// System.setProperty("webdriver.firefox.marionette",
		// "C:\\Users\\Manprit\\Documents\\selenium jar
		// files\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		driver.navigate().to("https://www.javatpoint.com");

		driver.close();

	}

}
