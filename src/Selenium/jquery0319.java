package Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POJO.jQuery_widgets;

public class jquery0319 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		jQuery_widgets widgets = new jQuery_widgets(driver);
		driver.manage().window().maximize();

		try {
			driver.get("https://jqueryui.com/");
			List<By> widgetLocators = widgets.getAllWidgets();

			for (int i = 0; i < widgetLocators.size(); i++) {
				if(i % 2 == 0 ) {
					
				driver.findElement(widgetLocators.get(i)).click();

				}
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.close();
			driver.quit();
		}
	}

}
