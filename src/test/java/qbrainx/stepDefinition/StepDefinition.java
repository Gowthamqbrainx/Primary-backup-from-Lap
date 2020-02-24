package qbrainx.stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
public WebDriver driver;

@Given("User has to prepare all the prerequistie items")
public void user_has_to_prepare_all_the_prerequistie_items() {
  System.setProperty("webdriver.chrome.driver", "F:\\Gowtham\\Oxygen workspaces\\BDDCucumberDemo\\Drivers\\chromedriver.exe");
  ChromeOptions notif = new ChromeOptions();
  ChromeOptions disable = notif.addArguments("--disable-notifications");
  driver = new ChromeDriver(disable);
  
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
  
}

@When("User has to launch the browser")
public void user_has_to_launch_the_browser() {
   driver.get("https://www.facebook.com/");
   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}

@When("User has to pass the URL")
public void user_has_to_pass_the_URL() {
   List<WebElement> users = driver.findElements(By.id("email"));
   users.get(0).sendKeys("Abcd@123");
   List<WebElement> passwords = driver.findElements(By.id("pass"));
   passwords.get(0).sendKeys("12345");
}

@Then("User has to verify the browser launch")
public void user_has_to_verify_the_browser_launch() {
  List<WebElement> btns = driver.findElements(By.id("loginbutton"));
  btns.get(0).click();
  System.out.println(driver.getTitle());
}


}
