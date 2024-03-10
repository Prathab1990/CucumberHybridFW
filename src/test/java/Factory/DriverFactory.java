package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	static WebDriver driver =null;
	public static void initializeBrowser(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}else if
		(browserName.equalsIgnoreCase("Edge")) {
			 driver = new EdgeDriver();
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
