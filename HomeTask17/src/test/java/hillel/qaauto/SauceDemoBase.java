package hillel.qaauto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SauceDemoBase {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    final String SAUCE_DEMO_URL = "https://www.saucedemo.com/";
    final String USER_NAME = "standard_user";
    final String PASSWORD = "secret_sauce";
    final String webSiteTitle = "LinkedIn";

    String userNameFieldCssSelector = "#user-name";
    String passwordFieldCssSelector = "#password";
    String logoutButtonCssSelector = "#logout_sidebar_link";
    String loginButtonCssSelector = "#login-button";
    String linkedInButtonSccSelector = ".social_linkedin > a";
    String openSideBarButtonCssSelector = "#react-burger-menu-btn";


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SAUCE_DEMO_URL);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void login(String userName, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(userNameFieldCssSelector))).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(passwordFieldCssSelector))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(loginButtonCssSelector))).click();
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(openSideBarButtonCssSelector))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(logoutButtonCssSelector))).click();
    }

    public void openLinkedIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(linkedInButtonSccSelector))).click();
    }

    public void scrollPageToElement(String elementSelector) {
        WebElement webElement = driver.findElement(By.cssSelector(elementSelector));
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }

}
