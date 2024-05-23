package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookLoginPage {

    public FaceBookLoginPage(){


        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="pass")
    public WebElement pass;

    @FindBy(name="login")
    public WebElement login;

    @FindBy(className = "_9ay7")
    public WebElement girisYapılamadi;

    @FindBy(xpath = "//*[text()='Allow all cookies']")
    public WebElement cookie;




}
