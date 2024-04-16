package tests.day12_testNGFrameWork;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.Driver;

public class C01_POM_ilkTest {

    @Test
    public void aramaTesti(){


        //testotomasyonu ana sayfaya gidin

        Driver.getDriver().get("https://www.testotomasyonu.com");

        //phone ıcın arama yapin

      TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
      testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);


        //arama sonucunda urun bulunabildigini test edin

        Assert.assertTrue(testOtomasyonuPage.bulunanUrunElementleriList.size()>0);

        //ilk urunu tıklayin

        testOtomasyonuPage.bulunanUrunElementleriList.get(0).click();

        //urun fiyatinin 1000$ 'dan dusuk oldugunu test edin

        int expectedFitay=1000;

        String actualFiyatStr=testOtomasyonuPage.urunFiyatElementi.getText();
        actualFiyatStr=actualFiyatStr.replaceAll("\\D","");//
        int actualFiyatInt=Integer.parseInt(actualFiyatStr)/100;

        Assert.assertTrue(actualFiyatInt<expectedFitay);

        Driver.quitDriver();

    }
}
