package day12_testNGFrameWork;

import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_WebuniversityTest {

    @Test
    public void test01(){

        //1."http://webdriveruniversity.com/" adresine gidin

        Driver.getDriver().get("http://webdriveruniversity.com/");

        //2."Login Portal" a kadar asagi inin

        //3."Login Portal" a tiklayin
        WebUniversityPage webUniversityPage=new WebUniversityPage();
        webUniversityPage.LoginPortal.click();

        //4.Diger window'a gecin


        //5."username" ve "password" kutularina deger yazdirin
        //6."login" butonuna basin
        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        //8.Ok diyerek Popup'i kapatin
        //9.Ilk sayfaya geri donun
        //10.Ilk sayfaya donuldugunu test edin



    }




}
