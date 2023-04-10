package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

    WebDriver driver;

    public void Register_Page( WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

        @FindBy (xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement Reg_Link ;

       @FindBy (id = "gender-male")
    WebElement Male_Gender;

       @FindBy (id = "gender-female")
    WebElement Fem_Gender;

       @FindBy (id = "FirstName")
    WebElement FirstNameTxtBox;

       @FindBy (id = "LastName")
    WebElement LastNameTxtBox;

       @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
    WebElement Birthdate_Day;

       @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
    WebElement Birthdate_Month;

       @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
    WebElement Birthdate_Year;

       @FindBy (id = "Email")
    WebElement Email_Txt;

      @FindBy (id = "Company")
    WebElement Company_name;

      @FindBy (id = "Password")
    WebElement PasswordTxt;

      @FindBy (id = "ConfirmPassword")
    WebElement Re_PasswordTxt;

      @FindBy (id = "register-button")
    WebElement Register_BTN;

}
