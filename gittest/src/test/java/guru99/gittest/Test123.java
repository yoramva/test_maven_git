package guru99.gittest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Test123 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\git\\test1\\gittest\\src\\test\\java\\guru99\\gittest\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.waves.com/plugins");
		  WebElement footer= driver.findElement(By.cssSelector("div.vmenu-list"));  // Get Footer element which contains all footer links
		  System.out.println(footer.findElements(By.tagName("a")).size()) ;
		  List<WebElement> footlinks = footer.findElements(By.tagName("a"));
		  int i = footer.findElements(By.tagName("a")).size(); //Get number of links

		  for(int j = 0;j<i;j++){    //create loop based upon number of links to traverse all links
		   footer= driver.findElement(By.cssSelector("div.vmenu-list"));    // We are re-creating "footer" webelement as DOM changes after navigate.back()
		   footer.findElements(By.tagName("a")).get(j).getText();
		   footer.findElements(By.tagName("a")).get(j).click();
		   
		   System.out.println(driver.getTitle());
		      if(driver.getTitle().contains("404")) {
		       System.out.println("404 Found");
		      }
		      driver.navigate().back();
		  
		  }
}
}
