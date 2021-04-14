package FtthTests;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.time.LocalDateTime;



/**
 * Created by Mert Can DOĞAN
 * Date : 05.02.2021
 */


public class TestBase extends TestCase {
    protected WebDriver driver ;
    protected StringBuffer verificationErrors = new StringBuffer();
    protected WebDriverWait wait;
    protected JavascriptExecutor scroll;
    //protected Fairy fairy = Fairy.create();
    //protected TextProducer text = Fairy.create().textProducer();
    //protected Person p = Fairy.create().person();

    //take a screenshot when u need.
    public void takeSnapShot(WebDriver webdriver,String folder) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        String fileWithPath = getPath(folder);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);//like: this.takeSnapShot(driver, "c://test.png") ;
    }



public String getPath(String folder) {
        LocalDateTime now = LocalDateTime.now();
    int year = now.getYear();
    int month = now.getMonthValue();
    int day = now.getDayOfMonth();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    return folder.concat(String.valueOf(day).concat("_").concat(String.valueOf(month)).concat("_").concat(String.valueOf(year)).concat("_")
            .concat(String.valueOf(hour)).concat("_").concat(String.valueOf(minute)).concat("_").concat(String.valueOf(second))).concat(".png")  ;

}

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "\\chromedriver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://10.98.42.82:32500/login");
        wait = new WebDriverWait(driver, 30);
        scroll = (JavascriptExecutor) driver;

        //left Scroll to bottom -- scroll.executeScript("$('.sidebar-scroll-content').animate({scrollTop:$(document).height()}, 'slow');", "");
        //scroll to find -- scroll.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//li[2]/ul/li[8]/ul/li/div/span[3]/span/span")));

    }
    public void kullaniciGirisiYap(WebDriver driver,Kullanici kullanici) {
        try{
            driver.manage().window().maximize();
            //for certificate problem
            driver.findElement(By.id("details-button")).click();
            Thread.sleep(1500);
            //for certificate problem
            driver.findElement(By.id("proceed-link")).click();
            Thread.sleep(1500);
            driver.findElement(By.name("username")).sendKeys(kullanici.getAd());
            driver.findElement(By.name("password")).sendKeys(kullanici.getSifre());
            driver.findElement(By.id("loginBtn")).click();
            //take logs
            //((RemoteWebDriver) driver).setLogLevel(Level.INFO);

        }catch (Exception e)
        {
            System.out.println("giriş yapılamadı.");
        }
    }


    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }

    }

    public void compareTwoField(String fieldLocator, String field) throws Exception {
        if(!(fieldLocator.equalsIgnoreCase(field))){
            takeSnapShot(driver,"C:\\Users\\mertdogan\\Desktop\\otomasyonhata\\");
            Assert.fail(fieldLocator + " Not Equal "+ field);
        }else{
            System.out.printf("Test Başarılı");
        }
    }
}