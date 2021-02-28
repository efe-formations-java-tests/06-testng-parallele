package fr.formation.parallele;

import org.testng.annotations.Test;

public class Classe3Test {

	
	@Test
	public void test1Classe3() throws InterruptedException {
		Thread.sleep(500);
	
	}
	
	@Test(groups = "regression")
	public void test2Classe3() throws InterruptedException {
		Thread.sleep(500);
	
	}
	
	@Test
	public void test3Classe3() throws InterruptedException {
		Thread.sleep(500);
	
	}
	
	@Test
	public void test4Classe3() throws InterruptedException {
		Thread.sleep(500);
	
	}
}
