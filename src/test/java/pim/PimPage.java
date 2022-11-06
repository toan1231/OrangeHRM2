package pim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
    WebDriver driver;

    public PimPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimButton;
    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeButton;
    @FindBy(id ="firstName")
    public WebElement firstNameButton;
    @FindBy(id = "middleName")
    public WebElement middleNameButton;
    @FindBy(id ="lastName")
    public WebElement lastNameButton;
    @FindBy(id = "btnSave")
    public WebElement saveButton;


}