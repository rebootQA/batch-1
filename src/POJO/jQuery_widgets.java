package POJO;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jQuery_widgets {

	private WebDriver driver;

	private By accordion = By.xpath("//*[@href='https://jqueryui.com/accordion/']");
	private By autoComplete = By.xpath("//*[@href='https://jqueryui.com/autocomplete/']");
	private By button = By.xpath("//*[@href='https://jqueryui.com/button/']");
	private By checkBoxRadio = By.xpath("//*[@href='https://jqueryui.com/checkboxradio/']");
	private By controlGroup = By.xpath("//*[@href='https://jqueryui.com/controlgroup/']");
	private By datePicker = By.xpath("//*[@href='https://jqueryui.com/datepicker/']");
	private By dialog = By.xpath("//*[@href='https://jqueryui.com/dialog/']");
	private By menu = By.xpath("//*[@href='https://jqueryui.com/menu/']");
	private By progressBar = By.xpath("//*[@href='https://jqueryui.com/progressbar/']");
	private By selectMenu = By.xpath("//*[@href='https://jqueryui.com/selectmenu/']");
	private By slider = By.xpath("//*[@href='https://jqueryui.com/slider/']");
	private By spinner = By.xpath("//*[@href='https://jqueryui.com/spinner/']");
	private By tabs = By.xpath("//*[@href='https://jqueryui.com/tabs/']");
	private By toolTip = By.xpath("//*[@href='https://jqueryui.com/tooltip/']");

	private By iFrame = By.xpath("//*[@class='demo-frame']");

	public jQuery_widgets(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAccordion() {
		driver.findElement(accordion).click();
	}

	public void clickAutoComplete() {
		driver.findElement(autoComplete).click();
		;
	}

	public void clickButton() {
		driver.findElement(button).click();

	}

	public void clickCheckBoxRadio() {
		driver.findElement(checkBoxRadio).click();
	}

	public void clickControlGroup() {
		driver.findElement(controlGroup).click();
	}

	public void clickDatePicker() {
		driver.findElement(datePicker).click();
	}

	public void clickDialog() {
		driver.findElement(dialog).click();
	}

	public void clickMenu() {
		driver.findElement(menu).click();
	}

	public void clickProgressBar() {
		driver.findElement(progressBar).click();
	}

	public void clickSelectMenu() {
		driver.findElement(selectMenu).click();
	}

	public void clickSlider() {
		driver.findElement(slider).click();
	}

	public void clickSpinner() {
		driver.findElement(spinner).click();
	}

	public void clickTabs() {
		driver.findElement(tabs).click();
	}

	public void clickToolTip() {
		driver.findElement(toolTip).click();
	}

	public void goTo_iFrame() {
		driver.switchTo().frame(driver.findElement(iFrame));
	}

	public List<By> getAllWidgets(){
		List<By> allWidgets = new ArrayList<>();
		allWidgets.add(accordion);
		allWidgets.add(autoComplete);
		allWidgets.add(button);
		allWidgets.add(checkBoxRadio);
		allWidgets.add(controlGroup);
		allWidgets.add(datePicker);
		allWidgets.add(dialog);
		allWidgets.add(menu);
		allWidgets.add(progressBar);
		allWidgets.add(selectMenu);
		allWidgets.add(slider);
		allWidgets.add(spinner);
		allWidgets.add(tabs);
		allWidgets.add(toolTip);
		
		return allWidgets;

	}
	
	
	
}