package gittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestHomePage {
	public static WebDriver driver;
	 @Before
		public void setUp() throws Exception{
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--test-type");        
	        options.addArguments("start-maximized");
	        driver = new ChromeDriver(options);
	        driver.get("http://www.amazon.in");
	 }
	 @Test
	 public void testSample()throws Exception{
		 System.out.println("Testcase is running");
		 assertTrue("amazon page is not displayed", driver.findElement(By.xpath("//*[@id='nav-logo']")).isDisplayed());
	 }
	 @After
	 public void tearDown() throws Exception {
		 driver.quit();
	 }
	 

}
