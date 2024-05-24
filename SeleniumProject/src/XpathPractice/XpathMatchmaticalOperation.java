package XpathPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMatchmaticalOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#google_vignette");
		driver.findElement(By.xpath("//td[text()=5000]")); // equal operatior
		driver.findElement(By.xpath("//td[text()<5000]")); // less then operation
		driver.findElement(By.xpath("//td[text()>5000]")); // grater then operation
		driver.findElement(By.xpath("//td[text()<=5000]")); // lessthen or equal operation
		driver.findElement(By.xpath("//td[text()>=5000]")); // graterthen or equal operation
		driver.findElement(By.xpath("//td[text()!=5000]")); // not equal operation
	}
}
