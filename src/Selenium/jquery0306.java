package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery0306 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String expectedTitle = "Accordion";
		String expectedS1 = "Section 1";
		String expectedS2 = "Section 2";
		String expectedS3 = "Section 3";
		String expectedS4 = "Section 4";

		try {

			driver.get("https://jqueryui.com/accordion/");
			WebElement title = driver.findElement(By.xpath("//*[@class='entry-title']"));
			String resultTitle = title.getText();
			if (resultTitle.equals(resultTitle)) {
				System.out.println("Test Passs!");
				System.out.println("Result: " + resultTitle);
				System.out.println("Expected: " + expectedTitle);
				System.out.println();


			} else {
				System.out.println("Test Failed. Titles do not match");
			}

			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			driver.switchTo().frame(iframe);

			WebElement section1 = driver.findElement(By.xpath("//*[@id='ui-id-1']"));
			section1.click();
			String resultSection1 = section1.getText();
			if (resultSection1.equals(expectedS1)) {
				System.out.println("Test Passs!");
				System.out.println("Result: " + resultSection1);
				System.out.println("Expected: " + expectedS1);
				System.out.println();

			} else {
				System.out.println("Test Failed. No matching Section 1");
			}

			WebElement section2 = driver.findElement(By.xpath("//*[@id='ui-id-3']"));
			section2.click();
			String resultSection2 = section2.getText();
			if (resultSection2.equals(expectedS2)) {
				System.out.println("Test Passs!");
				System.out.println("Result: " + resultSection2);
				System.out.println("Expected: " + expectedS2);
				System.out.println();

			} else {
				System.out.println("Test Failed. No matching Section 2");
			}

			WebElement section3 = driver.findElement(By.xpath("//*[@id='ui-id-5']"));
			section3.click();
			String resultSection3 = section3.getText();
			if (resultSection3.equals(expectedS3)) {
				System.out.println("Test Passs!");
				System.out.println("Result: " + resultSection3);
				System.out.println("Expected: " + expectedS3);
				System.out.println();
			} else {
				System.out.println("Test Failed. No matching Section 3");
			}

			WebElement section4 = driver.findElement(By.xpath("//*[@id='ui-id-7']"));
			section4.click();
			String resultSection4 = section4.getText();
			if (resultSection4.equals(expectedS4)) {
				System.out.println("Test Passs!");
				System.out.println("Result: " + resultSection4);
				System.out.println("Expected: " + expectedS4);
				
			} else {
				System.out.println("Test Failed. No matching Section 4");
			}

		} catch (Exception e) {

			System.out.println("error message: " + e.getMessage());

		} finally {
			driver.close();
			driver.quit();

		}

	}

}
