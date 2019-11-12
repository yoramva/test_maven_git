package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args )
    {
        
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();		 
		 driver.get("http://www.google.com");
		 System.out.println( "Hello World!" );
    }
}
