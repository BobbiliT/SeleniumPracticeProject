package TakesScreenShort;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class facebooklogo {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement el=driver.findElement(By.xpath("//img[@alt='Facebook']"));
	String tagname=el.getTagName();
	System.out.println(tagname);
	File src = el.getScreenshotAs(OutputType.FILE);
	File trg = new File(".//screenshot//logopage.png");
	Files.copy(src, trg);
	Thread.sleep(3000);
	driver.close();
}
}
