package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseEmailPage {

    public ChooseEmailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//  Accesam folderul de CYSIAM :"

    //  Accesam folderul cu email-uri de la Cysiam din EMAIL INBOX:
    @FindBy(xpath = "//*[@id=\"MainModule\"]/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div/span[1]")
    private static WebElement clickCysiamFolder;
    public static WebElement getClickCysiamFolder() { return clickCysiamFolder; }
//----------------------------------------------------------------------------------------------------------------------
//  Accesam folderul de SENT ITEMS:"

    @FindBy(xpath = "//*[@id=\"MainModule\"]/div/div/div[1]/div/div/div[1]/div/div[2]/div[5]/div/span[1]")
    private static WebElement clickSent_Items;
    public static WebElement getClickSent_Items() { return clickSent_Items; }









//---------------------------------------------------------------------------------------------------------------------
//    @FindBy(xpath = "//*[@id=\"idSIButton9\"]")
//    private static WebElement nextButton;
//    public static WebElement getNextButton() { return nextButton; }

//----------------------------------------------------------------------------------------------------------------------

//    @FindBy(xpath = "//*[@id=\"idSIButton9\"]")
//    private static WebElement signInButton1;
////    public static WebElement getSignInButton1() { return signInButton1; }

//----------------------------------------------------------------------------------------------------------------------

//    @FindBy(xpath = "//*[@id=\"idBtn_Back\"]")
//    private static WebElement BackButton;
//    public static WebElement getBackButton() { return BackButton; }

//----------------------------------------------------------------------------------------------------------------------

//  Accesam folderul cu email-uri de la Cysiam din EMAIL INBOX:
//    @FindBy(xpath = "//*[@id=\"MainModule\"]/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div/span[1]")
//    private static WebElement clickCysiamFolder;
//    public static WebElement getClickCysiamFolder() { return clickCysiamFolder; }

//----------------------------------------------------------------------------------------------------------------------

//    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div/div/div/div[1]/div/div")
//    private static WebElement clickEmail;
//    public static WebElement getClickEmail() { return clickEmail; }

//  /html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[3]/div/div[3]/div[1]/div[4]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/div[1]
//  //*[@id="AQAABlL+5d8BAAAGWEbGqQAAAAA="]/div
//  id ="ktp-layer-id"

//----------------------------------------------------------------------------------------------------------------------

}
