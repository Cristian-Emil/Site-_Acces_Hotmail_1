package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseYourAccount {
    public ChooseYourAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // ---------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"i0116\"]")
    private static WebElement userName;
    public static WebElement getUserName() { return userName; }

    // ---------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"i0118\"]")
    private static WebElement password;
    public static WebElement getPassword() { return password; }

// ---------------------------------------------------------------------------

    @FindBy (xpath="/html/body/header/div/aside/div/nav/ul/li[2]/a")
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton;  }

// ---------------------------------------------------------------------------

    @FindBy (xpath="//*[@id=\"idBtn_Back\"]")
    private static WebElement noButton;
    public static WebElement getNoButton() { return noButton;  }


// ---------------------------------------------------------------------------



}
