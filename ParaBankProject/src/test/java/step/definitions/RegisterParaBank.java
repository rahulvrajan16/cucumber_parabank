package step.definitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterParaBank {
    WebDriver driver = null;
    RegisterPage login = new RegisterPage();

    @Given("user click Register link from HomePage")
    public void user_click_register_link_from_home_page() {
        System.setProperty("webdriver.chrome.driver","C:/Users/rahul/IdeaProjects/ParaBankProject/src/test/resources/drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id='loginPanel']/p[2]/a")).click();


    }

    @When("user enter FirstName, LastName, Address, City, State")
    public void user_enter_first_name_last_name_address_city_state(DataTable testData) {
        List<String>details = testData.transpose().asList(String.class);
//        LoginPage.registerUserPart1(details.get(0),details.get(1),details.get(2),details.get(3),details.get(4));
//        LoginPage.Hi();

        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys(details.get(0));
        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys(details.get(1));
        driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys(details.get(2));
        driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys(details.get(3));
        driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys(details.get(4));

    }
    @And("enter {int}, {int}, {int}, Jewel2021, Jewel2021, Jewel2021")
    public void enter_jewel2021_jewel2021_jewel2021(Integer int1, Integer int2, Integer int3) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys(int1.toString());
        driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys(int2.toString());
        driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys(int3.toString());
        driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("Jewel2033");
        driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("Jewel2033");
        driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("Jewel2033");
        Thread.sleep(4000);
    }

    @And("click on Register Button")
    public void click_on_register_button() {
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
    }

    @Then("message {string} should be displayed in Welcome Page")
    public void message_should_be_displayed_in_welcome_page(String expectedMessage) throws InterruptedException {
        WebElement text =driver.findElement(By.xpath("//div[@id='rightPanel']/p"));
        String actualText = text.getAttribute("innerText");
//        System.out.println("EXPECTED "+expectedMessage);
        Assert.assertEquals(actualText,expectedMessage);
        Thread.sleep(4000);
        driver.close();
        driver.quit();
    }


    @Given("Click Register link from HomePage")
    public void click_register_link_from_home_page() {
        System.setProperty("webdriver.chrome.driver","C:/Users/rahul/IdeaProjects/ParaBankProject/src/test/resources/drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id='loginPanel']/p[2]/a")).click();

    }
    @When("Enter FirstName, LastName, Address, City, State, Zipcode, PhoneNum, SSN, UserName, Password, Confirm")
    public void enter_first_name_last_name_address_city_state_zipcode_phone_num_ssn_user_name_password_confirm(DataTable dataTable) throws InterruptedException {
//       String a = dataTable.cell(0,0);
//        System.out.println("Value "+a);
//        System.out.println(dataTable.cell(0,1));
//        System.out.println(dataTable.cell(0,2));
//        System.out.println(dataTable.cell(0,3));
//        System.out.println(dataTable.cell(0,4));
//        System.out.println(dataTable.cell(0,5));


        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys(dataTable.cell(0,0));
        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys(dataTable.cell(0,1));
        driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys(dataTable.cell(0,2));
        driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys(dataTable.cell(0,3));
        driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys(dataTable.cell(0,4));
        driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys(dataTable.cell(0,5));
        driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys(dataTable.cell(0,6));
        driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys(dataTable.cell(0,7));
        driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys(dataTable.cell(0,8));
        driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys(dataTable.cell(0,9));
        driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys(dataTable.cell(0,10));
        Thread.sleep(4000);
    }
    @When("Click Register Button")
    public void click_register_button() {
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
    }
    @Then("Message {string} should be displayed.")
    public void message_should_be_displayed(String expectedMessage) throws InterruptedException {
        WebElement text =driver.findElement(By.xpath("//div[@id='rightPanel']/p"));
        String actualText = text.getAttribute("innerText");
//        System.out.println("EXPECTED "+expectedMessage);
        Assert.assertEquals(actualText,expectedMessage);
        Thread.sleep(4000);
        driver.close();
        driver.quit();
    }



}
