package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {


   public static WebDriver driver =null;


    By txt_firstname = By.xpath("//*[@id=\"customer.firstName\"]");
     By txt_lastname = By.xpath("//*[@id=\"customer.lastName\"]");
     By txt_street = By.xpath("//*[@id=\"customer.address.street\"]");
     By txt_city =By.xpath("//*[@id=\"customer.address.city\"]");
     By txt_state = By.xpath("//*[@id=\"customer.address.state\"]");
     By txt_zipcode = By.xpath("//*[@id=\"customer.address.zipCode\"]");
     By txt_phoneNumber =By.xpath("//*[@id=\"customer.phoneNumber\"]");
     By txt_ssn = By.xpath("//*[@id=\"customer.ssn\"]");
     By txt_username = By.xpath("//*[@id=\"customer.username\"]");
     By txt_password = By.xpath("//*[@id=\"customer.password\"]");
     By txt_confirmPassword = By.xpath("//*[@id=\"repeatedPassword\"]");
     By btn_register = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    public void  driverInit(WebDriver driver){
        this.driver = driver;
        driver.get("https://cucumber.io/docs/installation/");
    }


    public void registerUserPart1(String firstname, String lastname, String street, String city, String state
    ){

        driver.findElement(txt_firstname).sendKeys(firstname);
        driver.findElement(txt_lastname).sendKeys(lastname);
        driver.findElement(txt_street).sendKeys(street);
        driver.findElement(txt_city).sendKeys(city);
        driver.findElement(txt_state).sendKeys(state);

    }
    public void registerUserPart2( String zipcode, String phoneNumber, String ssn, String username, String password,
                                   String confirmPassword){
        driver.findElement(txt_zipcode).sendKeys(zipcode);
        driver.findElement(txt_phoneNumber).sendKeys(phoneNumber);
        driver.findElement(txt_ssn).sendKeys(ssn);
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(txt_confirmPassword).sendKeys(confirmPassword);
        driver.findElement(btn_register).click();

    }






    public void enterFirstname(String firstname){
        driver.findElement(txt_firstname).sendKeys(firstname);
    }
    public void enterLastname(String lastname){
        driver.findElement(txt_lastname).sendKeys(lastname);
    }
    public void enterStreet(String street){
        driver.findElement(txt_street).sendKeys(street);
    }
    public void enterCity(String city){
        driver.findElement(txt_city).sendKeys(city);
    }
    public void enterState(String state){
        driver.findElement(txt_state).sendKeys(state);
    }

    public void enterZipCode(String zipcode){
        driver.findElement(txt_zipcode).sendKeys(zipcode);
    }

    public void enterPhoneNumber(String phoneNumber){
        driver.findElement(txt_phoneNumber).sendKeys(phoneNumber);
    }

    public void enterSsn(String ssn){
        driver.findElement(txt_ssn).sendKeys(ssn);
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){
        driver.findElement(txt_confirmPassword).sendKeys(confirmPassword);
    }

    public void clickOnRegisterButton(){
        driver.findElement(btn_register).click();
    }




}
