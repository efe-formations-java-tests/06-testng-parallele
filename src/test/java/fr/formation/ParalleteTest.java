
package fr.formation;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParalleteTest {

	private long debut;
	
	@BeforeClass
	public void avant() {
		debut = System.currentTimeMillis();
	}

	@AfterClass
	public void apres() {
		System.out.println((System.currentTimeMillis() - debut) + " ms");
	}
	
	@Test(invocationCount = 50, threadPoolSize = 20, timeOut = 1500)
	public void testPlusieursFois() throws InterruptedException {

		int a = new Random().nextInt(500);
		Thread.sleep(a);
		assertTrue(a < 500);
	}
}
