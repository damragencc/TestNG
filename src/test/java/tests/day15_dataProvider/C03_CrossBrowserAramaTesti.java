package tests.day15_dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

import java.util.List;

public class C03_CrossBrowserAramaTesti extends TestBaseCross {

    /*
        Cross browser calistirma cok ozel bir duzenleme gerektirir

        1- toplu calistirmayi .xml dosyasindan yaptigimiz icin
           orada calistirilacak testlerin hangi browser ile calisacagini
           parametre olarak tanimladik

           parametre adi : kullanilacakBrowser


        2- .xml dosyasi kullanilacakBrowser parametresi ile birlikte
            calistirilacak class'a gelir
            calisacal clss'da .xmld'den gelen parametrenin alinmasi icin
            ozel bir notasyon gereklidir
            her class'da o notasyonu ve gerekli ayarlari yapmak zorunda OLMAMAK icin TestBasecross class'i olusturuyoruz


        3- TestBaseCross kullandigi @parameters notasyonu ile
           .xml dosyasindan gelen kullanilacakBrowser bilgisini alip
           kullanilacak browser'i DriverCross class'inda olusturuyor
           ve "driver" olarak kaydediyor

        4- .xml'den parametre olarak gonderilip
            TestBaseCross'da yakalanan ve DriverCross'da
             olusturulan driver objesi ile istedigimiz testleri yapacagiz

        5- CrossBrowser calistirmak istedigimiz test class'larini
        TestBaseCross'

     */


}
