package Scrips;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage1;

public class Sesion1 {
	private WebDriver driver;
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		GooglePage1 gp = new GooglePage1(driver);
		Thread.sleep(3000);
		//Busqueda en google
		gp.typeOnSearchBar("Nintendo Wikipedia");
		//Click en el primer resultado
		Thread.sleep(1000);
		//gp.printFirsResult();
		//gp.clickFirstResult();
		gp.clickSecondResult();
		gp.printSecondResult();
	}
	
	@After
	public void teardown() {
		
		//driver.quit();
	}
}
