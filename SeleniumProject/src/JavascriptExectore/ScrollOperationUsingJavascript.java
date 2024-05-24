package JavascriptExectore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOperationUsingJavascript {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,500);");
	js.executeScript("window.scrollBy(0,500);");
	js.executeScript("document.getElementById('ty_footer').scrollIntoView();");
	js.executeScript("document.getElementsByClassName('title')[6].scrollIntoView();");
	String title =driver.getTitle();
    System.out.println("page title :"+title);
	driver.close();
}
}
