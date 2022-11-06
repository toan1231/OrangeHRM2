package orangeHRMLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
    public OrangeHRMLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    public WebElement usernameButton;
    @FindBy(id = "txtPassword")
    public WebElement passwordButton;
    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    public void login(String userName, String passWord) {
        usernameButton.sendKeys(userName);
        passwordButton.sendKeys(passWord);
        loginButton.click();
    }
}
