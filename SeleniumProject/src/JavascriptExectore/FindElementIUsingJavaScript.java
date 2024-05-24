package JavascriptExectore;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementIUsingJavaScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement id=(WebElement)js.executeScript("return document.getElementById('email');");
	id.sendKeys("id,");
	WebElement name=(WebElement)js.executeScript("return document.getElementsByName('email')[0];");
	name.sendKeys("name,");
	WebElement classname = (WebElement)js.executeScript("return document.getElementsByClassName('inputtext _55r1 _6luy')[0];");
	classname.sendKeys("ClassName,");
	WebElement tagname=(WebElement)js.executeScript("return document.getElementsByTagName('input')[2];");
	tagname.sendKeys("TagName,");
	WebElement css=(WebElement)js.executeScript("return document.querySelector('#email');");
	css.sendKeys("CssSelector,");
	WebElement xpath = (WebElement)js.executeScript("return document.evaluate(\"//input[@type='text']\", document,null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
	xpath.sendKeys("XPath");
	String text=driver.findElement(By.id("email")).getAttribute("value");
	System.out.println("total find elements :"+text);
	driver.close();
}
}
