package tests;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.ChooseEmailPage;
import pageObjects.ChooseYourAccount;
import pageObjects.SignInPage;

import java.util.Set;

import static utils.TestData.ADMIN_PASSWORD;
import static utils.TestData.ADMIN_USERNAME;

public class Login_Logout_TestPage extends BaseTest {


    @Test
    public void testLogInAdminVailidCredential() throws InterruptedException {
        driver.manage().window().maximize();

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(500);
        SignInPage.getSignInButton().click();
        Thread.sleep(500);

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window : windowHandles) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        ChooseYourAccount chooseYourAccount = PageFactory.initElements(driver, ChooseYourAccount.class);
        Thread.sleep(1000);

        ChooseYourAccount.getUserName().sendKeys(ADMIN_USERNAME);
        Thread.sleep(1500);
        SignInPage.getNext().click();
        Thread.sleep(5000);

        ChooseYourAccount.getPassword().sendKeys(ADMIN_PASSWORD);
        Thread.sleep(2000);
        SignInPage.getSignInAccount().click();
        Thread.sleep(1000);

        ChooseYourAccount.getNoButton().click();
        Thread.sleep(1000);

        ChooseEmailPage chooseEmailPage = PageFactory.initElements(driver, ChooseEmailPage.class);
        Thread.sleep(1000);

        ChooseEmailPage.getClickCysiamFolder().click();
        Thread.sleep(5000);

        ChooseEmailPage.getClickSent_Items().click();
        Thread.sleep(5000);


//        WebElement message = driver.findElement (By.xpath("//*[@id=\"__next\"]/div[2]/div/ul/a[4]/li"));
//        softAssert.assertEquals(message.getText(),"Questions","Test 1 - elementul nu exista, test invalid");
//        System.out.println(message.getText());
//        System.out.println(message.getAttribute("title= "));
//        Thread.sleep(5000);


Thread.sleep(15000);
        driver.quit();

    }
}
