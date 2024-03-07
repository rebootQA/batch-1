package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery0229 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/");
	

		WebElement accordionTab = driver.findElement(By.xpath("//*[@href='https://jqueryui.com/accordion/']"));

		accordionTab.click();

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));

		WebElement section2 = driver.findElement(By.xpath("//*[@id='ui-id-3']"));
		WebElement section3 = driver.findElement(By.xpath("//*[@id='ui-id-5']"));
		WebElement section4 = driver.findElement(By.xpath("//*[@id='ui-id-7']"));

		Thread.sleep(2000);
		section2.click();
		Thread.sleep(2000);
		section3.click();
		Thread.sleep(2000);
		section4.click();
		Thread.sleep(4000);
		driver.close();
		driver.quit();

	}

}
