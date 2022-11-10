package com.juaracoding.psikotest.step_definitions.pages;

import com.juaracoding.psikotest.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"tl_login-1-51550_text\"]")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"tl_login-1-51551_text\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"51552_query\"]/span")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtWelcome;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtInvalidCredentials;

    @FindBy(xpath = "/html/body/div[10]/div[3]/div/button/span")
    WebElement btnOkeInvalid;

//    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
//    WebElement txtRequired;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public String getTxtWelcome(){
        return txtWelcome.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }
//    public String getTxtRequired(){
//        return txtRequired.getText();
//    }

    public void clickBtnOkeInvalid() {
        btnOkeInvalid.click();
    }

}
