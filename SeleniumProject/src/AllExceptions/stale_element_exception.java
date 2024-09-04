package AllExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class stale_element_exception {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int size = driver.findElements(By.xpath("//div[@id='LinkList1']//a")).size();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0; i<=size; i++) {
//			String xpathText = "(//div[@id='LinkList1']//a)["+i+"]";
			driver.findElement(By.xpath("//a[text()='onlytestingblog']")).click();
			driver.findElement(By.id("text1")).sendKeys("tejesh");
			js.executeScript("document.getElementById('text2').value='bobbili';");
			js.executeScript("return document.getElementById('hidden2').value='bobbiliteju';");
			driver.findElement(By.id("check1")).click();
			driver.findElement(By.id("radio1")).click();
			WebElement one = driver.findElement(By.id("Carlist"));
			Select ss = new Select(one);
			Thread.sleep(1000);
			ss.selectByVisibleText("Toyota");
			WebElement two = driver.findElement(By.name("FromLB"));
			Select sss = new Select(two);
			sss.selectByVisibleText("Mexico");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='button']/..//td[2]//input[1]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
		}
		
	}
}
