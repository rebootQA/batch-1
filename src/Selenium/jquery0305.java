package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery0305 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String expectedTitle = "Section 1";

		try {

			driver.get("https://jqueryui.com/accordion/");

			driver.switchTo().frame(driver.findElement(By.xpath("//*[@class = 'demo-frame']")));

			WebElement section1 = driver.findElement(By.xpath("//*[@id='ui-id-1']"));
			String title = section1.getText();
			if (title.equals(expectedTitle)) {
				System.out.println("We have a match! PASSS");
			} else {
				System.out.println("ERROR. no match was found");
				System.out.println("current title: " + title);
				System.out.println("expected title: " + expectedTitle);
			}

		} catch (Exception e) {
			System.out.println("error found: " + e.getMessage());
		} finally {
			driver.close();
			driver.quit();
		}

	}

}

//WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
//
//driver.switchTo().frame(iframe);
//
//WebElement age = driver.findElement(By.xpath("//*[@id='age']"));
//
//age.click();
//age.sendKeys("200");
