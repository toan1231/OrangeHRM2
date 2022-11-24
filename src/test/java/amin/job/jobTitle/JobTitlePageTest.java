package amin.job.jobTitle;

import Utilities.utilities.ConfigurationReader;
import amin.AdminPage;
import orangeHRMLoginPage.OrangeHRMLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class JobTitlePageTest {
    WebDriver driver;
    OrangeHRMLoginPage orangeHRMLoginPage;
    AdminPage adminPage;

    @BeforeClass
    public void beforeClass() {
        System.out.println("our test start");

    }


    @AfterClass
    public void afterClass() {
        System.out.println("our test finished");
    }
    @Parameters("browser")
    @BeforeMethod
    public void beforeMethod(String browser) {
       if(browser.equals("chrome")){
           System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
           driver=new ChromeDriver();
           orangeHRMLoginPage=new OrangeHRMLoginPage(driver);
           adminPage=new AdminPage(driver);
       }
        }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.url"));
        String username=ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.username");
        String password=ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.password");
        orangeHRMLoginPage.login(username,password);
        Thread.sleep(3000);



    }
    @Test
    public void userClickOnAdminTab() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.url"));
        String username=ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.username");
        String password=ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.password");
        orangeHRMLoginPage.login(username,password);
        adminPage.adminButton.click();
        adminPage.jobButton.click();
        adminPage.jobTitleButton.click();
        Thread.sleep(5000);

    }
}






