package com.juaracoding.psikotest.step_definitions.pages;

import com.juaracoding.psikotest.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Modul {
    private WebDriver driver;

    public Modul() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //ADD MODUL

    @FindBy(xpath = "//*[@id=\"ui-id-9\"]")
    WebElement tabtask;

    @FindBy(xpath = "//span[normalize-space()='Modul']")
    WebElement btnmodul;

    @FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
    WebElement btnaddmodul;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53182_text\"]")
    WebElement namamodul;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53206_text\"]")
    WebElement tipemodul;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53206_text\"]")
    WebElement waktupengerjaan;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53184_text\"]")
    WebElement jumlahsoal;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53185_text\"]")
    WebElement kategori;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53207_text\"]")
    WebElement deskripsisingkat;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53182_text\"]")
    WebElement txtnamamodul;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53186_text\"]")
    WebElement statusmodul;

    @FindBy(xpath = "//*[@id=\"53201_query\"]/span")
    WebElement btnsavemodul;
}
