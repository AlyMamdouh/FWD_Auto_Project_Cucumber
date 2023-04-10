package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    WebDriver driver;
    // initilize the driver which will used in this class
    public void Login_page(WebDriver driver)
    {
    this.driver = driver;
    PageFactory.initElements(driver ,this);
    }

    @FindBy (id = "Email")
    WebElement EmailTxtBox_PF ;

    @FindBy (id = "Password")
    WebElement PassTxtBox_PF;

    @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement LoginBTN;

    @FindBy (xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement Logout_Link ;

    @FindBy ( xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement MyAccount ;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
    WebElement ErrMsg ;

    // repeated steps grouped in one class to allow to call this class to perform what inside
    public void LoginSteps(String Login_Email,String Password)
    {
        EmailTxtBox_PF.clear();
        EmailTxtBox_PF.sendKeys(Login_Email);

        PassTxtBox_PF.clear();
        PassTxtBox_PF.sendKeys(Password);
    }

    public String Assertion_Invalid ()
    {
        ErrMsg.getText();
        return null;
    }

    public void LoginBTN ()
    {
        LoginBTN.click();
    }

    public void LoginAssertion()
    {
        Logout_Link.getText();
       // MyAccount.getText();
    }
}
