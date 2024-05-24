package JavascriptExectore;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterTextUsingJavascript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	wait.until(ExpectedConditions.jsReturnsValue("return document.getElementById('email').value='id attribute';"));
	js.executeScript("return document.getElementById('email').value='id attribute';");
	wait.until(ExpectedConditions.jsReturnsValue("return document.getElementsByName('email')[0].value='name attribute';"));
	js.executeScript("return document.getElementsByName('email')[0].value='name attribute';");
	wait.until(ExpectedConditions.jsReturnsValue("return document.getElementsByClassName('inputtext _55r1 _6luy')[0].value='classname';"));
	js.executeScript("return document.getElementsByClassName('inputtext _55r1 _6luy')[0].value='classname';");
	wait.until(ExpectedConditions.jsReturnsValue("return document.getElementsByTagName('input')[2].value='tagname';"));
	js.executeScript("return document.getElementsByTagName('input')[2].value='tagname';");
	wait.until(ExpectedConditions.jsReturnsValue("return document.querySelector('#email').value='CssSelector';"));
	js.executeScript("return document.querySelector('#email').value='CssSelector';");
	wait.until(ExpectedConditions.jsReturnsValue("return document.evaluate(\\\"//input[@type='text']\\\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='xpath';"));
	js.executeScript("return document.evaluate(\"//input[@type='text']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='xpath';");
	driver.close();
}
}
