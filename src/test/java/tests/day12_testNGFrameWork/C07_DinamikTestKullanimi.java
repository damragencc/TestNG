package tests.day12_testNGFrameWork;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuFormPage;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C07_DinamikTestKullanimi extends TestBaseRapor {

    @Test
    public void test01(){

         extentTest =extentReports.createTest("dinamik Test","aranacak urun  sonucu");
        //testotomasyounu anasayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));




        // belirlenen aranacak kelime icin arama yapin

        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime")+Keys.ENTER);


        // arama sonucunda urun bulunabildigini test edin

        Assert.assertTrue(testOtomasyonuPage.bulunanUrunElementleriList.size()>0);

        extentTest.pass("Test basarili");

        // sayfayi kapatin


        ReusableMethods.bekle(2);




    }

}
