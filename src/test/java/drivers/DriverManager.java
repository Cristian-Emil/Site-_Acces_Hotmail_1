package drivers;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManager {

     public static ChromeDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
//        options.addArguments("--remote-allow-origins=*");
//        options.setHeadless(true);                                  // browser invizibil
        System.setProperty("webdriver.chrome.driver" , "ChromeDriver/chromedriver");
//      C:/uers/crist/IdeaProjects/-driver_Selenium-Maven/ChromeDriver/chromedriver
        ChromeDriver driver = new ChromeDriver(options);            // initilizare
//  maximizam ecranul
        driver.manage().window().maximize();
//  setam un wait global (implicit)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return driver;
    }

    public static ChromeDriver getChromeDriverByManager(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

//    public static ChromeDriver getDriver()  {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//
//        ChromeDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }


}
