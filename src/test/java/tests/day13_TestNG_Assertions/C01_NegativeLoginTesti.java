package tests.day13_TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuFormPage;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_NegativeLoginTesti {

    @Test
    public void test01(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        //2- login linkine basin
        // 3- 3 farkli test method’u olusturun.
        // - gecerli username, gecersiz password
        // - gecersiz username, gecerli password
        // - gecersiz username, gecersiz password.
        //4- Login butonuna basarak login olun
        //5- Basarili olarak giris yapilamadigini test edin
    }

    @Test(groups = {"haftalik","smoke"})
    public void gecersizPasswordTesti(){

        ////1- https://www.testotomasyonu.com/ anasayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        ////2- login linkine basin


        TestOtomasyonuPage testOtomasyonuPage =new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();

        ////3- gecerli username, gecersiz password

        testOtomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("togecerliemail"));
        testOtomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("togecersizPassword"));

        ////4- Login butonuna basarak login olun
        testOtomasyonuPage.loginButonu.click();

        ////5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testOtomasyonuPage.emailKutusu.isEnabled());

        Driver.quitDriver();


    }
    @Test(groups = "smoke")
            public void test02(){

       ////1- https://www.testotomasyonu.com/ anasayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        ////2- login linkine basin


        TestOtomasyonuPage testOtomasyonuPage =new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();

        ////3- gecerli username, gecersiz password

        testOtomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        testOtomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("togecerliPassword"));

        ////4- Login butonuna basarak login olun
        testOtomasyonuPage.loginButonu.click();

        ////5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testOtomasyonuPage.emailKutusu.isEnabled());

        Driver.quitDriver();



    }

    @Test(groups = "smoke")
    public void test03(){

        ////1- https://www.testotomasyonu.com/ anasayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        ////2- login linkine basin


        TestOtomasyonuPage testOtomasyonuPage =new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();

        ////3- gecerli username, gecersiz password

        testOtomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        testOtomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("togecerliPassword"));

        ////4- Login butonuna basarak login olun
        testOtomasyonuPage.loginButonu.click();

        ////5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testOtomasyonuPage.emailKutusu.isEnabled());

        Driver.quitDriver();







    }




}
