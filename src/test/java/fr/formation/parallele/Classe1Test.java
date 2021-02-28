package fr.formation.parallele;

import org.testng.annotations.Test;

public class Classe1Test {

	@Test
	public void test2Classe1() throws InterruptedException {
		Thread.sleep(500);
	}

	@Test(groups = { "important", "classe1" })
	public void test1Classe1() throws InterruptedException {
		Thread.sleep(500);

	}

	@Test
	public void test4Classe1() throws InterruptedException {
		Thread.sleep(500);

	}

	@Test(groups = { "regression", "classe1" })
	public void test3Classe1() throws InterruptedException {
		Thread.sleep(500);

	}

}
