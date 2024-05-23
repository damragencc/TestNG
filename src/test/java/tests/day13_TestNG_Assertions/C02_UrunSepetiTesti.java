package tests.day13_TestNG_Assertions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C02_UrunSepetiTesti {

    @Test(groups = "smoke")
    public void urunSepetiTesti(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        //2- phone icin arama yapin

        TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // 3- Listelenen sonuclardan ilkini tiklayi
        testOtomasyonuPage.bulunanUrunElementleriList.get(0).click();

        //4- urun ismini kaydedin ve sepete ekleyin

        String SecilenurunIsmi=testOtomasyonuPage.urunIsimElementi.getText();
        testOtomasyonuPage.addTocardButonu.click();


        //5- your cart linkine tiklayin

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

        testOtomasyonuPage.yourCardLinki.click();

        //6- kaydettiginiz urun ismi ile sepetteki urun isminin ayni oldugunu test edin

        String sepettekİUrunIsmi=testOtomasyonuPage.sepettekiUrunIsimElementi.getText();
        Assert.assertTrue(SecilenurunIsmi.equalsIgnoreCase(sepettekİUrunIsmi));



        //7- sayfayi kapatin
        Driver.quitDriver();
    }
}
