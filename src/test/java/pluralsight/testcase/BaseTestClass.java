package pluralsight.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

public class BaseTestClass {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void startUpBrowser(){

        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goToHome(){
        driver.get("C:\\Users\\hp\\Downloads\\automated-tests-java-fluent-interface-webdriver-selenium\\automated-tests-in-java-with-fluent-interface-using-webdriver-selenium-exercise-files\\website\\HomePage.html");
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser(){
        driver.close();
    }

}