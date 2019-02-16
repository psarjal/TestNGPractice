package rough;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG {

	@Test
	public void doLogin() {
		System.out.println("Hi..........");
		Assert.assertTrue(true);
	}
	
	@Test
	public void doLogin1() {
		System.out.println("Hi..........");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="doLogin1")
	public void doLogin2() {
		System.out.println("Hi..........");
		Assert.assertTrue(true);
	}
	
	@Test
	public void doLogin3() {
		System.out.println("Hi..........");
		Assert.assertTrue(true);
	}
}
