package Dropdowns;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectandPrintAllElements {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Documents/dropdown.html");
		WebElement listbox = driver.findElement(By.id("mtr"));
		Select s = new Select(listbox);
		// total elements inside the listbox
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("number of elements present indside the list box :" + size);
		// print names present inside the listbox
		System.out.println("print all option inside the list box.");
		for (WebElement elements : options) {
			String names = elements.getText();
			System.out.println(names);
		}
		// select by list box option using the index
		s.selectByIndex(0);
		// select by list box option using the value
		s.selectByValue("v");
		// select by list box option using the visibletest
		s.selectByVisibleText("POORI");
		// print all selected option into the listbox
		System.out.println("print selected option inside the listbox");
		List<WebElement> alloptions = s.getAllSelectedOptions();
		for (WebElement allelements : alloptions) {
			System.out.println(allelements.getText());
		}
		// check its multi selected or not
		boolean multi = s.isMultiple();
		System.out.println(multi + " - yes it is multi selected.");
		if (multi) {
			WebElement firstoption = s.getFirstSelectedOption();
			System.out.println(firstoption.getText() + " - first selected option.");
		}
		// deselected option by using index
		s.deselectByIndex(0);
		WebElement firstoption1 = s.getFirstSelectedOption();
		System.out.println(firstoption1.getText() + " - first selected option");
		// deselected option by using value
		s.deselectByValue("v");
		WebElement firstoption2 = s.getFirstSelectedOption();
		System.out.println(firstoption2.getText() + " - first selected option");
		// deselected option by using visible test
		s.deselectByVisibleText("POORI");
		Thread.sleep(3000);
		driver.close();
	}
}
