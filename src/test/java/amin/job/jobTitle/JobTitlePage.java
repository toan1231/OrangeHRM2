package amin.job.jobTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JobTitlePage {
    WebDriver driver;
    public JobTitlePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
