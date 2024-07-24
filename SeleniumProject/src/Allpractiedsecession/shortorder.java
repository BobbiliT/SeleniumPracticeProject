package Allpractiedsecession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class shortorder {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/HP/Documents/dropdown.html");
	WebElement list=driver.findElement(By.id("mtr"));
	Select s = new Select(list);
	List<WebElement> allelements=s.getOptions();
	int size=allelements.size();
	System.out.println(size);
	ArrayList<String> ar = new ArrayList<String>();
	for(WebElement all:allelements) {
		String text=all.getText();
		System.out.println(text);
		ar.add(text);
	}
	Collections.sort(ar);
	for(String sort:ar) {
		System.out.println(sort);
	}
}
}
