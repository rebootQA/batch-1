package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POJO.jQuery_widgets;

public class jquery0318 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");
	

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		jQuery_widgets widgets = new jQuery_widgets(driver);
		System.out.println("hello");
		System.out.println("print me");

		try {
			driver.get("https://jqueryui.com/");
			widgets.clickAccordion();
			Thread.sleep(1500);
			widgets.clickAutoComplete();
			Thread.sleep(1500);
			widgets.clickButton();
			Thread.sleep(1500);
			widgets.clickCheckBoxRadio();
			Thread.sleep(1500);
			widgets.clickControlGroup();
			Thread.sleep(1500);
			widgets.clickDatePicker();
			Thread.sleep(1500);
			widgets.clickDialog();
			Thread.sleep(1500);
			widgets.clickMenu();
			Thread.sleep(1500);
			widgets.clickProgressBar();
			Thread.sleep(1500);
			widgets.clickSelectMenu();
			Thread.sleep(1500);
			widgets.clickSlider();
			Thread.sleep(1500);
			widgets.clickSpinner();
			Thread.sleep(1500);
			widgets.clickTabs();
			Thread.sleep(1500);
			widgets.clickToolTip();
			Thread.sleep(3000);
			System.out.println("test passed. clicked on every tab.");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.close();
			driver.quit();
		}
	}
}
