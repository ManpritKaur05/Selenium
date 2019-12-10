package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Soft Assert collects errors during @Test. Soft Assert does not throw an exception when an assert fails and would continue with the next step after the assert statement.

public class SoftAssertion {

	@Test
	public void sassert() {

		SoftAssert soft = new SoftAssert();
		System.out.println("soft assert is defined");
		soft.assertTrue(false);
		System.out.println("soft assert is executed");

	}

}
