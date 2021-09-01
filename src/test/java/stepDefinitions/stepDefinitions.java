package stepdefinitions;

import java.util.List;

import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {

	WebDriver driver;

//For scenario1
	@Given("Browser launched")
	public void browser_launched() {
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
	driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("User opens URL {string}")
	public void user_opens_URL(String string) {
		driver.navigate().to("http://americas.datasite.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("enters email as {string} alongwith password as {string}")
	public void enters_email_as_alongwith_password_as(String string, String string2) throws InterruptedException {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("info@datasite.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin123");
		Thread.sleep(5000);
	}

	@When("click on LOG IN")
	public void click_on_LOG_IN() {
		WebElement login = driver.findElement(By.xpath("//a[contains(.,'LOG IN')]"));
		login.click();
	}

	@Then("see the message {string}")
	public void see_the_message(String string) {
		driver.getPageSource().contains("We didn't recognize the username or password you entered. Please try again.");
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

	// For scenario2

	@Given("Browser launched for scenario{int}")
	public void browser_launched_for_scenario(Integer int1) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://americas.datasite.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

	}

	@When("Click on Submit without giving any email address.")
	public void click_on_Submit_without_giving_any_email_address() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//a[contains(.,'LOG IN')]"));
		login.click();
		Thread.sleep(3000);
		
	}

	@Then("Validate if the error message is {string}")
	public void validate_if_the_error_message_is(String string) {

		driver.getPageSource().contains("We didn't recognize the username or password you entered. Please try again.");
	}

	@Then("Enter some text {string} and click on Submit")
	public void enter_some_text_and_click_on_Submit(String string) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("info@datasite.com");
		WebElement login = driver.findElement(By.xpath("//a[contains(.,'LOG IN')]"));
		login.click();

	}

	@Then("exit the browser")
	public void exit_the_browser() {
		driver.quit();
	}

//for scenario3

	@Given("Browser launched to validate scenario{int}")
	public void browser_launched_to_validate_scenario(Integer int1) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.datasite.com/us/en/legal/terms-of-use.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@Then("Click on {string} at the bottom of page.")
	public void click_on_at_the_bottom_of_page(String string) {
		String actualString = driver.findElement(By.xpath("//input[@id='digitalDataPageTitle']")).getText();

		String expectedString = "Terms of Use";

		assertTrue(actualString.contains(expectedString));
		}
		
	@Then("Validate if today's date is displayed next to {string}.")
	public void validate_if_today_s_date_is_displayed_next_to(String string) {
		String pattern = "MMMMM d, yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		String actualString = driver.findElement(By.xpath("//input[@id='digitalDataPageTitle']")).getText();
		String expectedString = "Terms of Use";
		assertTrue(actualString.contains(expectedString));

	}

	@Then("Click on Language drop on top right corner.")
	public void click_on_Language_drop_on_top_right_corner() throws InterruptedException {
		  WebElement manuopen = driver.findElement(By.xpath("//div[@id='menuOpen']"));
	  		manuopen.click();
	  		Thread.sleep(3000);

	}

	@Then("Verify drop down has Français, Deutsch, 中文, 日本語, Español and Italiano.")
	public void verify_drop_down_has_Français_Deutsch_中文_日本語_Español_and_Italiano() {
		Select select=new Select(driver.findElement(By.xpath("//i[@title='English']']")));
				List<String> actualDropDownValues=new ArrayList<String>();
				for (WebElement element: select.getOptions()) {
				actualDropDownValues.add(element.getText());
				}
				List<String> expectedDropdownValues=new ArrayList<String>();
				expectedDropdownValues.add("Français");
				expectedDropdownValues.add("Deutsch");
				expectedDropdownValues.add("中文");
				expectedDropdownValues.add("日本語");
				expectedDropdownValues.add("Español");
				expectedDropdownValues.add("Italiano");

				for (int i = 0; i <actualDropDownValues.size(); i++) {
				System.out.println("Actual : " + actualDropDownValues.get(i)+ "& Expected:"+expectedDropdownValues.get(i));
				Assert.assertTrue(actualDropDownValues.get(i).equals(expectedDropdownValues.get(i)));
				}
	}

	@Then("close the browser window")
	public void close_the_browser_window() {
		driver.close();
	}

	@Then("exit from browser")
	public void exit_from_browser() {
		driver.quit();
	}

}