package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Row_Colom_count {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Documents/Row_Colom.html");
	//count total row in the list box
	List<WebElement> rows= driver.findElements(By.xpath("//tr"));
	int row_count=rows.size();
	System.out.println("rows count in list box -> "+row_count);
	//count total coloms in the list box
	List<WebElement> coloms = driver.findElements(By.xpath("//td"));
	int colom_count=coloms.size();
	System.out.println("coloms count in the list box -> "+colom_count);
	//count total cells in the list box
	List<WebElement> allcells = driver.findElements(By.xpath("//tr|//td"));
	int allcells_count = allcells.size();
	System.out.println("allcells count in the list box ->"+allcells_count);
	int countvalue=0;
	int sum=0;
	for(WebElement all:allcells) {
		String alltext=all.getText();
		try {
			int number = Integer.parseInt(alltext);
			System.out.println(number);
			countvalue++;
			sum=sum+countvalue;
		}
		catch(Exception e) {
			
		}
	}
	System.out.println("total count value -> "+countvalue);
	System.out.println("total sum -> "+sum);
	driver.close();
}
}
