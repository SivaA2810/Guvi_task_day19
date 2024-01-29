package src.B;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWikipediya {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.wikipedia.org/");
			driver.manage().window().maximize();
			
			WebElement searchbox = driver.findElement(By.id("searchInput"));
			searchbox.sendKeys("Artificial intelligence");
			searchbox.submit();
			WebElement history = driver.findElement(By.id("toc-History"));
			history.click();
			
			String title = driver.getTitle();System.out.println("currentPage title - "+title);
			
		
		}}
