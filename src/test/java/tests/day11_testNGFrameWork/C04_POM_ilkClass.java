package tests.day11_testNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_POM_ilkClass {

    /*
        Page Object Model (POM), Javada'ki OOP konseptini kullanarak dinamik ve kolay surdurulebilir
        bira framework olusturmustur.

         ANA AMAC
         Test datalari, Webdriver ve Locate gibi degisken elemanlari
         farkli class'larda olusturup
         @Test methodlarinda bunlari dinamik olarak kullanabilmektir.


         Boylece hem kod tekrarlarindan kurtulmak,
         hem de framework'un surdurulebilirligini kolaylastırmak mumkun olacaktir.
     */

    @Test(groups = {"smoke","regression"})
    public void test01(){
        Driver.getDriver().get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip aratalim

        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("global-search"));
        aramaKutusu.sendKeys("Phone" + Keys.ENTER);

        ReusableMethods.bekle(5);

        Driver.quitDriver();

    }
}
