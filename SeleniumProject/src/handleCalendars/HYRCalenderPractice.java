package handleCalendars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRCalenderPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("first_date_picker")).click();
		selectdate("28", "May", "2025");
		Thread.sleep(3000);
		driver.close();
		
	}
	public static String[] getmonthyear(String monthyearvalue) {
		return monthyearvalue.split(" ");
	}
	public static void selectdate(String Exdate, String Exmonth, String Exyear) {
		String monthyearvalue=driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyearvalue);
		while(!(getmonthyear(monthyearvalue)[0].equals(Exmonth)&&getmonthyear(monthyearvalue)[1].equals(Exyear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthyearvalue=driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyearvalue);
		}
		driver.findElement(By.xpath("//a[text()='"+Exdate+"']")).click();
	}
}
