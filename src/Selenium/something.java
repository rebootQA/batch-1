package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POJO.jQuery_widgets;


public class something {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		jQuery_widgets widgets = new jQuery_widgets(driver);
		
		driver.get("https://jqueryui.com/");

		widgets.clickAccordion();
		widgets.goTo_iFrame();

		driver.findElement(By.xpath("//*[@id='ui-id-1']")).click();
		driver.findElement(By.xpath("//*[@id='ui-id-3']")).click();

	}

}
