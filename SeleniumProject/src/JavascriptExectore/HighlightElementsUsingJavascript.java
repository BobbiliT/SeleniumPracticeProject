package JavascriptExectore;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElementsUsingJavascript {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("return document.getElementById('email').style.border='2px red solid';");
	Thread.sleep(1000);
	js.executeScript("return document.getElementById('passContainer').style.border='2px red solid';");
	Thread.sleep(1000);
	js.executeScript("return document.getElementById('email').style.background='yellow';");
	Thread.sleep(1000);
	js.executeScript("document.getElementById('passContainer').style.background='yellow';");
	Thread.sleep(1000);
	js.executeScript("document.getElementById('email').setAttribute('style','border:2px black solid;background:blue');");
	Thread.sleep(1000);
	js.executeScript("document.getElementById('passContainer').setAttribute('style','border:2px black solid;background:blue');");
	Thread.sleep(1000);
	String title=driver.getTitle();
	System.out.println("page title :"+title);
	String url=driver.getCurrentUrl();
	System.out.println("page url :"+url);
	driver.close();
}
}
