package practice_here;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class webstarurant {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://www.webstaurantstore.com/");
			WebElement searchBox = driver.findElement(By.xpath("(//*[@id='searchval'])[1]"));
			searchBox.click();
			searchBox.sendKeys("stainless work table\n");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='itemDescription']")));

			List<WebElement> productTitles = driver.findElements(By.xpath("//*[@data-testid='itemDescription']"));

			boolean allTitlesContainTable = true;
					for (WebElement titles : productTitles) {
						if(!titles.getText().toLowerCase().contains("tables")) {
							break;
						}
					}

			if (allTitlesContainTable) {
				System.out.println("All product titles contain 'table'");
			} else {
				System.out.println("Not all product titles contain 'table'");
			}
			WebElement lastPage = driver.findElement(By.xpath("//*[@aria-label='last page, page 9']"));
			lastPage.click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='itemDescription']")));

			productTitles = driver.findElements(By.xpath("//*[@data-testid='itemDescription']"));

			if (!productTitles.isEmpty()) {
				WebElement lastItem = productTitles.get(productTitles.size() - 1);
				wait.until(ExpectedConditions.elementToBeClickable(lastItem)).click();

				WebElement addToCartButton = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='itemAddCart']")));
				addToCartButton.click();
			}

			WebElement cartButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='/viewcart.cfm']")));
			cartButton.click();

			WebElement emptyCartButton = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div[1]/div/div[1]/div/button")));
			emptyCartButton.click();

		} catch (Exception e) {
			System.out.println("Error was found: " + e.getMessage());

		} finally {
			driver.quit();
		}
	}
}