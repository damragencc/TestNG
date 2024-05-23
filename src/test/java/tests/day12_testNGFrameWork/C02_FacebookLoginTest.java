package tests.day12_testNGFrameWork;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookLoginPage;
import pages.TestOtomasyonuPage;
import utilities.Driver;

public class C02_FacebookLoginTest {

    @Test
    public void loginTesti(){

        //1 - https://www.facebook.com/ adresine gidin
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        //4- Basarili giris yapilamadigini test edin


        Driver.getDriver().get("https://www.facebook.com");



        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin



        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        Faker faker=new Faker();

        FaceBookLoginPage faceBookLoginPage=new FaceBookLoginPage();

        faceBookLoginPage.email.sendKeys(faker.internet().emailAddress());

        faceBookLoginPage.pass.sendKeys(faker.internet().password());

        faceBookLoginPage.login.click();


        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(faceBookLoginPage.girisYapılamadi.isDisplayed());

        //sayfati kapatin
        Driver.quitDriver();







    }
}
