package amin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "(//*[text()='Admin'])[1]")
    public WebElement adminButton;
    @FindBy(xpath = "(//*[@class='arrow'])[2]")
    public WebElement jobButton;
    @FindBy(xpath = "//*[text()='Job Titles']")
    public WebElement jobTitleButton;
}
