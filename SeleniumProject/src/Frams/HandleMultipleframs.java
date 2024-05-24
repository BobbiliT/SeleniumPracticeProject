package Frams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleframs {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("tejesh");
		driver.switchTo().frame("frm3");
		WebElement dd = driver.findElement(By.id("selectnav1"));
		Select s = new Select(dd);
		s.selectByVisibleText("- English");
		WebElement infr = driver.findElement(By.id("name"));
		infr.sendKeys("b.tejesh");
		driver.switchTo().frame("frm1");
		WebElement dd1 = driver.findElement(By.id("course"));
		Select ss = new Select(dd1);
		ss.selectByVisibleText("Java");
		driver.switchTo().parentFrame();
		infr.clear();
		infr.sendKeys("b.tejesh");
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("tejesh");
		driver.findElement(By.id("lastName")).sendKeys("b.tejesh");
		driver.close();
	}
}
