import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","/Users/aclim/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        //     driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("header_logo")));
    }



    @AfterMethod
    public void tearDown() {

        driver.quit();

    }
}
