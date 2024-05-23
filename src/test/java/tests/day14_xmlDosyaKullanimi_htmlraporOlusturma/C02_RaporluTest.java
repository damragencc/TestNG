package tests.day14_xmlDosyaKullanimi_htmlraporOlusturma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_RaporluTest extends TestBaseRapor {

    /*
          TestNG direk rapor hazirlamaz, bunun icin ek dependecny gerekiyor
          1- avenstack dependency'yi pom.xml'e ekledik
          2- Bir rapor olusturmak icin, 3 objeye ihtiyacımiz var
             bu objeleri olusturup ilk deger atamalarini yapmak icin
             TestbaseRapor class'i olusturduk,
             Raporlama yapacagimiz her class'i TestBaseRapor'a child yapmaliyiz

           3- Rapor'a

     */

    @Test
    public void phoneTesti(){
        extentTest = extentReports.createTest("Arama testi","Kullanıcı testotomasyonu sayfasinda istedigi urunu aratabilmeli");

        // 1- test otomasyonu anasayfaya gidin
        Driver.getDriver().get("https:www.testotomasyonu.com");
        extentTest.info("Kullanici test otomasyon anasayfaya gider");

        //  - phone icin arama yapin
        TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
        extentTest.info("phone icin arama yapar");

        //  - urun bulunabildigini test edin
        Assert.assertTrue(testOtomasyonuPage.bulunanUrunElementleriList.size()>0);

        extentTest.pass("urun bulunabildigini test eder");



    }
}
