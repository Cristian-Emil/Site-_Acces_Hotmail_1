package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/header/div/aside/div/nav/ul/li[2]/a")
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton; }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(id="idSIButton9")
    private static WebElement next;
    public static WebElement getNext() { return next; }

     // ---------------------------------------------------------------------------------------------------------------------

    @FindBy(id="idSIButton9")
//  xpath = "//*[@id="idSIButton9"]"
//  id="idSIButton9"
    private static WebElement signInAccount;
    public static WebElement getSignInAccount() { return signInAccount; }


}
