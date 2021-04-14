package FtthTests;


import org.eclipse.jetty.util.log.Log;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by Mert Can DOĞAN
 * Date : 05.02.2021
 */


public class topologyServiceNumberFind extends TestBase {

    private boolean acceptNextAlert = true;

    @Test
    public void testtopologyServiceNumberFind() throws Exception, ComparisonFailure {
        try {
            kullaniciGirisiYap(driver, Kullanici.GENELKULLANICI);
        } catch (Exception e) {
            System.out.println("giriş yapılamadı.");
        }



            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/form/div[2]/div[2]/div")));
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/form/div[2]/div[2]/div")).click();
            Thread.sleep(2000);
            driver.get("https://10.98.42.82:32500/dashboard");
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Envanter Sorgulama")));
            driver.findElement(By.linkText("Envanter Sorgulama")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Topoloji")));
            driver.findElement(By.linkText("Topoloji")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("field")));
            driver.findElement(By.id("field")).click();
            new Select(driver.findElement(By.id("field"))).selectByVisibleText("Hizmet No");
            wait.until(ExpectedConditions.elementToBeClickable(By.id("value")));
            driver.findElement(By.id("value")).sendKeys("1794254347");
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-pill.btn.btn-primary > span")));
            driver.findElement(By.cssSelector("button.btn-pill.btn.btn-primary > span")).click();
            //Log.setLogToParent(String.valueOf(new PrintStream(new FileOutputStream("C:\\output.txt"))));//(new PrintStream(new FileOutputStream("C:\\output.txt")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='root']/div[2]/div[2]/div/div/main/div/div/div/div/div/div[4]/div[6]/div/div/div[3]")));
           compareTwoField(driver.findElement(By.xpath("//div[@id='root']/div[2]/div[2]/div/div/main/div/div/div/div/div/div[4]/div[6]/div/div/div[3]")).getText(),"HGW Hizmet No1");
           


    }





}
