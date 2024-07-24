package Allpractiedsecession;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicate {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/HP/Documents/dropdown.html");
	WebElement list=driver.findElement(By.id("mtr"));
	Select s = new Select(list);
	List<WebElement> alloptions=s.getOptions();
	int count1=alloptions.size();
	System.out.println(count1);
	HashSet<String> hs = new HashSet<String>();
	for(int i=0; i<count1; i++) {
		String text=alloptions.get(i).getText();
		System.out.println(text);
		hs.add(text);
	}
	int count2=hs.size();
	System.out.println(count2);
	if(count1==count2) {
		System.out.println("list box has no duplcate values.");
	}
	else {
		System.out.println("list box has duplicate values.");
	}
	System.out.println(hs);
	driver.close();
}
}
