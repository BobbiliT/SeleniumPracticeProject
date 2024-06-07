package handleCalendars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class anothertypecalander {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
		selectdate("24","May","2026");
		driver.close();
		
	}
	public static String[] getmonthyear(String monthyear) {
		return monthyear.split(" ");
	}
	public static void selectdate(String date, String month, String year) {
		String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthyear);
		while(!(getmonthyear(monthyear)[0].equals(month)&&getmonthyear(monthyear)[1].equals(year))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthyear);
		}
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}
}
