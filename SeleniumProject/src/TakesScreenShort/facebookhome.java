package TakesScreenShort;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class facebookhome {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File(".//screenshot\\facebookhomepage.png");
	Files.copy(src, trg);
	Thread.sleep(3000);
	driver.close();
}
}
