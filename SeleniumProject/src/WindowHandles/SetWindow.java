package WindowHandles;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindow {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	Dimension d = new Dimension(500, 500);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	Point p = new Point(500,500);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
}
