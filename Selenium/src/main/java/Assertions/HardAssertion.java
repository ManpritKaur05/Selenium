package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Hard Assert throws an AssertException immediately when an assert statement fails and test suite continues with next @Test

public class HardAssertion {

	@Test
	public void hardassert() {

		Assert.assertEquals("MANPRIT", "MANPRIT");
	}

	public static void main(String[] args) {

		String expectedTitle = "Google";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manprit\\Documents\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		HardAssertion h = new HardAssertion();
		h.hardassert(); // the execution of code proceeds when it is true

		driver.navigate().to("http://www.google.com");

		Assert.assertEquals(driver.getTitle(), expectedTitle);
		// validate that whether actual title == expected title

		Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
		// it will return true

		Assert.assertFalse(expectedTitle.equals(driver.getTitle()), "Title does not match");
		// it will fail and execution stops there only

		driver.manage().window().maximize();

		driver.close();
	}
}
