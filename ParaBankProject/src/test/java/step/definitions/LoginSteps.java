package step.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.RegisterPage;

import java.util.Arrays;
import java.util.Collections;

public class LoginSteps  {

    WebDriver driver = null;

    @Given("user is on login page")
    public static void user_is_on_login_page() {

        System.out.println("Step inside - user is on login page");
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeDriver driver = new ChromeDriver();
        ChromeOptions chromeSettings = getChromeBrowserSettings();
        RegisterPage rg = new RegisterPage();
        rg.driverInit(driver);
//        driver.get("https://cucumber.io/docs/installation/");
        driver.close();
    }

    private static ChromeOptions getChromeBrowserSettings() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(Arrays.asList("--test-type", "test-type=browser", "--disable-default-apps",
                "--enable-precise-memory-info", "--js-flags=--expose-gc", "--disable-infobars", "--start-maximized",
                "--ignore-certificate-errors", "--disable-popup-blocking", "--allow-running-insecure-content",
                "--disable-notifications", "--disable-save-password", "--disable-translate",
                "--always-authorize-plugins", "--incognito"));
        options.setExperimentalOption("useAutomationExtension", false);
        //options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        return options;
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Step inside - enter username and password");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Step inside - Click on login button");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {

        System.out.println("Step inside - user navigate to home page");
        driver.close();
        driver.quit();
    }
}
