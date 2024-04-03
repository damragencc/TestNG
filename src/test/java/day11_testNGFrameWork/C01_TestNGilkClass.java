package day11_testNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C01_TestNGilkClass {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void teardown(){

        driver.quit();
    }



    @Test
    public void test01(){

        // Testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // phone icin arama yapin

        WebElement aramaKutusu=driver.findElement(By.id("global-seacrh"));

        aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin

        List<WebElement> sonuc=driver.findElements(By.xpath("//*[@*='product-box my-2  py-1']"));


        Assert.assertTrue(sonuc.size()>0);



        // tum sayfa screenshoot alıp kaydedin








    }
}
