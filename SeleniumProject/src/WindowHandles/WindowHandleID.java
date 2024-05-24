package WindowHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleID {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	String window=driver.getWindowHandle();
	System.out.println(window);
	driver.close();
}
}
