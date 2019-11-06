package guru99.gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

	protected WebDriver driver;
	@Test
	public void myt() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\git\\test1\\gittest\\src\\test\\java\\guru99\\gittest\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //driver.get("http://www.google.com");
		 driver.get("http://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("abcdefg");
	}
}
