package day12_testNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuFormPage;
import utilities.Driver;

public class C04_CheckboxTesti {

    @Test
    public void test01(){

        //1 - https://testotomasyonu.com/form adresine gidin

        Driver.getDriver().get("https://www.testotomasyonu.com");

        //2- Sirt Agrisi yazisindan ve carpinti'yi checkbox clik yapın

        TestOtomasyonuFormPage tofp =new TestOtomasyonuFormPage();
        tofp.sirtAgrisiYAziElementi.click();
        tofp.carpintiCheckBox.click();

        //3- Sirt Agrisi ve Carpinti checkbox’larininin seçili olduğunu test edin
        Assert.assertTrue(tofp.sirtAgrisiChexkBox.isSelected());
        Assert.assertTrue(tofp.carpintiCheckBox.isSelected());
        //4- Seker ve Epilepsi checkbox’larininin seçili olmadigini test edin

        //5- sayfayi kapatin

        Driver.quitDriver();


    }
}
