package FtthTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Created by Mert Can DOĞAN
 * Date : 08.02.2021
 */


public class Poncodetry extends TestBase {

    private boolean acceptNextAlert = true;


    @Test
    public void testPoncodetry() throws Exception {

        kullaniciGirisiYap(driver, Kullanici.GENELKULLANICI);


        try {


            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/form/div[2]/div[2]/div")));
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/form/div[2]/div[2]/div")).click();
            Thread.sleep(2000);
            driver.get("https://10.98.42.82:32500/dashboard");
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cih Sorgulama")));
            driver.findElement(By.linkText("Cih Sorgulama")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Pon")));
            driver.findElement(By.linkText("Pon")).click();
            Thread.sleep(2500);
            assertEquals("Pon", driver.findElement(By.linkText("Pon")).getText());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='root']/div[2]/div[2]/div/div/main/div/div/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td/button/span")));
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div[2]/div/div/main/div/div/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td/button/span")).click();
            Thread.sleep(2500);
            assertEquals("Alt Cihaz ", driver.findElement(By.id("pr_id_5_header")).getText());


            } catch (Exception e) {
            takeSnapShot(driver, "C:\\Users\\mertdogan\\Desktop\\otomasyonhata\\");
            Assert.fail();
            //System.out.println("Test Başarısız.");
        }

            }
        }









