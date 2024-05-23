package tests.day15_crossBroswerTesti;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

import java.util.List;

import static utilities.Driver.driver;

public class C01_ToAramaTesti extends TestBaseCross {

    @Test
    public void crossBrowserAramaTesti(){

        // testotomasyonu anasayfaya gidin
        driver.get(ConfigReader.getProperty("toUrl"));
        // belirlenmis aranacak kelime icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime") + Keys.ENTER);
        // arama sonucunda urun bulunabildigini test edin
        List<WebElement> bulunanUrunElementleriListesi =
                driver.findElements(By.xpath("//*[@*='product-box my-2  py-1']"));

        Assert.assertTrue(bulunanUrunElementleriListesi.size()>0);
        ReusableMethods.bekle(3);
    }


}


