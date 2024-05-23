package tests.day15_crossBroswerTesti;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;

public class C04_NegatifLoginTesti extends TestBaseCross {

    //1- https://www.testotomasyonu.com/ anasayfasina gidin
    //2- login linkine basin
    // 3- 3 farkli test method’u olusturun.
    // - gecerli email, gecersiz password
    // - gecersiz email, gecerli password
    // - gecersiz email, gecersiz password.
    //4- Login butonuna basarak login olmayi deneyin
    //5- Basarili olarak giris yapilamadigini test edin

    @Test
    public void gecersizPasswordTesti(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        driver.get(ConfigReader.getProperty("toUrl"));

        //2- account linkine basin

        driver.findElement(By.xpath("//*[text()='Account']")).click();

        // - gecerli email, gecersiz password

        driver.findElement(By.id("email")).sendKeys(ConfigReader.getProperty("togecerliemail"));

        driver.findElement(By.id("password")).sendKeys(ConfigReader.getProperty("togecersizPassword"));

        driver.findElement(By.id("submitlogin")).click();

        Assert.assertTrue(driver.findElement(By.id("email")).isEnabled());




    }


}
