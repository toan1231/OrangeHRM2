package orangeHRMLoginPage;

import Utilities.utilities.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMLoginPageTest {

    WebDriver driver;
    OrangeHRMLoginPage ob;
    @BeforeMethod
    public void method(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.url"));
       ob=new OrangeHRMLoginPage(driver);

    }


    @Test
    public void userLogin() {


        ob.login(ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.username"),
                ConfigurationReader.getProperty("orangeHRM.properties","yollhrm.password"));




    }

    }

