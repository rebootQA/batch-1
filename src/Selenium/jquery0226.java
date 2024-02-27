package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery0226 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");
		Thread.sleep(5000);
		driver.get("https://jqueryui.com/tabs/");
		Thread.sleep(5000);

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(5000);

		WebElement tab2 = driver.findElement(By.id("ui-id-2"));

		tab2.click();
		Thread.sleep(5000);

		driver.close();
		driver.quit();
	}

}
