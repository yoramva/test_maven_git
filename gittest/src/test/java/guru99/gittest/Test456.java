package guru99.gittest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class Test456 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\git\\test1\\gittest\\src\\test\\java\\guru99\\gittest\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.waves.com/plugins");
		  Actions action = new Actions(driver);
		  WebElement products = driver.findElement(By.id("top-menu-nav")).findElement(By.cssSelector("li[data-id='products']"));
		  action.moveToElement(products).perform();
		  WebElement e = driver.findElement(By.cssSelector("div[class='tab box']"));
		  List<WebElement> footlinks = e.findElements(By.tagName("a"));
		 
		  int i = footlinks.size(); //Get number of links
		  
		  for(int j = 0;j<i;j++)
		  {    //create loop based upon number of links to traverse all links
			  action.moveToElement(footlinks.get(j)).click().perform(); 
				   
		  }
			      
		  /*
		  Actions action = new Actions(driver);
		  action.moveToElement(categories).perform();
		  action.moveToElement(subMenu).perform();
		  action.moveToElement(course).click().perform();
		  */
	}

}
