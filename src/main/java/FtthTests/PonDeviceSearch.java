package FtthTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



/**
 * Created by Mert Can DOĞAN
 * Date : 08.02.2021
 */


public class PonDeviceSearch extends TestBase {

    //private boolean acceptNextAlert = true;


    @Test
    public void testPonDeviceSearch() throws Exception {
        try {
            kullaniciGirisiYap(driver, Kullanici.GENELKULLANICI);
        } catch (Exception e) {
            System.out.println("giriş yapılamadı.");
        }




        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/form/div[2]/div[2]/div")));
        driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/form/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        driver.get("https://10.98.42.82:32500/dashboard");
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cihaz Sorgulama")));
        driver.findElement(By.linkText("Cihaz Sorgulama")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Pon")));
        driver.findElement(By.linkText("Pon")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div/div/div/div[2]/div/div/div")));
        driver.findElement(By.xpath("//form/div/div/div/div[2]/div/div/div")).click();
        driver.findElement(By.id("react-select-2-option-6")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='pr_id_1_content']/div/form/div[2]/div/div/div[2]/div/div/div")));
        driver.findElement(By.xpath("//div[@id='pr_id_1_content']/div/form/div[2]/div/div/div[2]/div/div/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-3-option-1")));
        driver.findElement(By.id("react-select-3-option-1")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='pr_id_1_content']/div/form/div[3]/div/div/div[2]/div/div/div")));
        driver.findElement(By.xpath("//div[@id='pr_id_1_content']/div/form/div[3]/div/div/div[2]/div/div/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-4-option-1")));
        driver.findElement(By.id("react-select-4-option-2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[2]/button[2]/i")));
        driver.findElement(By.xpath("//td[2]/button[2]/i")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[44]")));
        driver.findElement(By.xpath("(//button[@type='button'])[44]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='root']/div[2]/div[2]/div/div/main/div/div/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td/button/span")));
        driver.findElement(By.xpath("//div[@id='root']/div[2]/div[2]/div/div/main/div/div/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td/button/span")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("pr_id_5_header")));
        compareTwoField(driver.findElement(By.id("pr_id_5_header")).getText(), "Detay");
        






    }
}




