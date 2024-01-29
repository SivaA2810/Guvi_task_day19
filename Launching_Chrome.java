package src.B;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launching_Chrome {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		String actual_title = driver.getTitle();System.out.println("Actual title - "+actual_title);
		String expected_title = "STORE"; 
		
		if(actual_title.equals(expected_title)){
			System.out.println("Page landed on currect webpage");
		}
		else {
			System.out.println("Page not landed on correct webpage");
		}
		driver.close();
	}

	
	
	
}
