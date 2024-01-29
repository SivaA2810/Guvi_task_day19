package src.B;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launching_FireFOX {
	
	
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("http://google.com");
	String currentUrl = driver.getCurrentUrl();System.out.println("current pageURL - "+currentUrl);
	String title = driver.getTitle();System.out.println("PageTitle - "+title);
	
	//driver.close();
	
	
}
}
