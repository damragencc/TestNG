package tests.day14_xmlDosyaKullanimi_htmlraporOlusturma;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C03_RaporluPozitifLoginTesti extends TestBaseRapor {

    @Test
    public void test01(){

        extentTest = extentReports.createTest("Pozitif login testi","Gecerli kullanici adi ve sifre ile giris yapılabilmeli");

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanici testotomasyonu anasayfasina gider");

        //2- account linkine basin
        TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();
        extentTest.info("account linkine basar");

        //3- Kullanici email'i olarak gecerli email girin
        testOtomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        extentTest.info("Kullanici emaili olarak gecerli email girer");

        //4- Kullanici sifresi olarak gecerli password girin
        testOtomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        extentTest.info("Kullanici sifresi olarak gecerli password girer");


        //5- Login butonuna basarak login olun
        testOtomasyonuPage.loginButonu.click();
        extentTest.info("Login butonuna basarak login olur");

        //6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(testOtomasyonuPage.logoutButonu.isDisplayed());
        extentTest.pass("Basarili olarak giris yapabildigini test eder");

        ReusableMethods.bekle(2);
        testOtomasyonuPage.logoutButonu.click();
        extentTest.info("Logout butonuna basarak logout olur");


        Driver.quitDriver();
    }
}
