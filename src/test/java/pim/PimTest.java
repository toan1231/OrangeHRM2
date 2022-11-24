package pim;

import Utilities.utilities.ConfigurationReader;
import orangeHRMLoginPage.OrangeHRMLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest {
    WebDriver driver;
    OrangeHRMLoginPage ob;
    PimPage pimPage;

    @BeforeMethod
    public void method(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.url"));
        ob=new OrangeHRMLoginPage(driver);
        pimPage=new PimPage(driver);
        ob.login(ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.username"),
                ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.password"));

    }
    @Test
public void user_fill_out_information() throws InterruptedException {


    Thread.sleep(2000);
    pimPage.pimButton.click();
    pimPage.addEmployeeButton.click();
    pimPage.firstNameButton.sendKeys("Chau");
    pimPage.middleNameButton.sendKeys("Ngoc");
    pimPage.lastNameButton.sendKeys("Thai");


    }
    @Test
public void user_verify_employee_id_is_not_empty(){
        pimPage.pimButton.click();
        pimPage.addEmployeeButton.click();
        pimPage.firstNameButton.sendKeys("Chau");
        pimPage.middleNameButton.sendKeys("Ngoc");
        pimPage.lastNameButton.sendKeys("Thai");
      boolean aaa=driver.findElement(By.id("employeeId")).isDisplayed();
      Assert.assertTrue(aaa);
      pimPage.saveButton.click();
      //this is de



}
}
