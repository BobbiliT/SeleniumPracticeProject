package Allpractiedsecession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/HP/Documents/dropdown.html");
	WebElement listid=driver.findElement(By.id("mtr"));
	Select s = new Select(listid);
	List<WebElement> allelements=s.getOptions();
	int totalelements=allelements.size();
	System.out.println("total elements in the list box -> "+totalelements);
	for(WebElement lists:allelements) {
		String text=lists.getText();
		System.out.println(text);
	}
	s.selectByIndex(0);
	s.selectByValue("v");
	s.selectByVisibleText("POORI");
	List<WebElement> selectlist=s.getAllSelectedOptions();
	int selsize=selectlist.size();
	System.out.println(selsize);
	for(WebElement selectoption:selectlist) {
		String seltext=selectoption.getText();
		System.out.println(seltext);
	}
	boolean check=s.isMultiple();
	System.out.println(check);
	driver.close();
}
}
