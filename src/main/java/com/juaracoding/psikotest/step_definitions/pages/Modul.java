package com.juaracoding.psikotest.step_definitions.pages;

import com.juaracoding.psikotest.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Modul {
    private WebDriver driver;

    public Modul() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //ADD MODUL

    @FindBy(xpath = "//h3[@id='ui-id-9']")
    WebElement tabtask;

    @FindBy(xpath = "//span[normalize-space()='Modul']")
    WebElement btnmodul;

    @FindBy(xpath = "//span[normalize-space()='+ Add Modul']")
    WebElement btnaddmodul;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53182_text\"]")
    WebElement namamodul;

    @FindBy(id = "tl_add_modul--53206_text")
    WebElement tipemodul;

    @FindBy(id = "tl_add_modul--53183_text")
    WebElement waktupengerjaan;

    @FindBy(id = "tl_add_modul--53184_text")
    WebElement jumlahsoal;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53185_text\"]")
    WebElement kategori;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53207_text\"]")
    WebElement deskripsisingkat;

    @FindBy(xpath = "//*[@id=\"tl_add_modul--53186_text\"]")
    WebElement statusmodul;

    @FindBy(xpath = "//*[@id=\"53201_query\"]/span")
    WebElement btnsavemodul;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]/span")
    WebElement btnsavemodulok;

    @FindBy(xpath = "/html/body/div[8]/div[1]/button")
    WebElement btnclosewarning;

    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    WebElement btninformationclose;

    @FindBy(xpath = "//div[9]//ul[1]//li[2]//a[1]")
    WebElement btnpageone;

    @FindBy(xpath = "//*[@id=\"tl_dis_agree--52812\"]/div[9]/ul/li[8]/a")
    WebElement btnpageright;

    @FindBy(xpath = "//*[@id=\"tl_dis_agree--52812_page\"]")
    WebElement btnpageleft;

    @FindBy(xpath = "//*[@id=\"tl_dis_agree--52808_text\"]")
    WebElement txtsearch;

    //add soal

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btnformsoal;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53142_text']")
    WebElement textboxsoal;

    @FindBy(xpath = "//*[@id=\"tl_template_soal--53146_text\"]")
    WebElement txtjawabanpilihan_a;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53144_text']")
    WebElement txtjawabanpilihan_b;

    @FindBy(xpath = "//*[@id=\"tl_template_soal--53146_text\"]")
    WebElement txtjawabanpilihan_c;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53145_text']")
    WebElement txtjawabanpilihan_d;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53152_text']")
    WebElement txtjawabanpilihan_e;

    @FindBy(xpath = "//*[@id=\"tl_template_soal--53153_text\"]")
    WebElement selectkuncijawabanpg;

    @FindBy(xpath = "//*[@id=\"tl_template_soal--53224_text\"]")
    WebElement selectkuncijawabanenum;

    @FindBy(xpath = "//*[@id=\"tl_template_soal--53167_text\"]")
    WebElement selectkuncijawabanesailength;

    @FindBy(xpath = "//*[@id=\"tl_template_soal--53161_text\"]")
    WebElement btnchoosefile;

    @FindBy(xpath = "//*[@id=\"53156_query\"]/span")
    WebElement btnuploadgambar;

    @FindBy(xpath = "//*[@id=\"53160_query\"]/span")
    WebElement btncekgambar;

    @FindBy(xpath = "//*[@id=\"53143_query\"]/span")
    WebElement btnaddsoal;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
    WebElement btnok;

    @FindBy(xpath = "/html/body/div[9]/div[1]/div/button/span[1]")
    WebElement btncloseform;

    @FindBy(xpath = "//*[@id=\"--\"]")
    WebElement btneditsoal;

    @FindBy(xpath = "//*[@id=\"53105_query\"]/span")
    WebElement btnupdatesoal;

    @FindBy(xpath = "/html/body/div[10]/div[1]/div/button/span[1]")
    WebElement btncloseformeditsoal;

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btndeletesoal;

    //form add deskripsi

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btnformdescription;

    @FindBy(xpath = "//textarea[@id='tl_user_activity--53055_text']")
    WebElement textareaketentuansoal;

    @FindBy(xpath = "//*[@id=\"53069_query\"]/span")
    WebElement btnadddescription;

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btneditdescription;

    @FindBy(xpath = "//*[@id=\"tl_edit_desk--53340_text\"]")
    WebElement textareadescsoal;

    @FindBy(xpath = "//*[@id=\"tl_edit_desk--53338_text\"]")
    WebElement textareaketentualsoal;

    @FindBy(xpath = "//*[@id=\"53332_query\"]/span")
    WebElement btnupdatedesc;

    @FindBy(xpath = "/html/body/div[10]/div[1]/div/button/span[1]")
    WebElement btncloseformeditdesc;

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btndeletedescription;

    @FindBy(xpath = "///html/body/div[9]/div[1]/div/button/span[1]")
    WebElement closeformdesc;

    //form edit modul

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btneditmodul;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53273_text\"]")
    WebElement textareaeditnamamodul;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53297_text\"]")
    WebElement comboboxedittipemodul;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53274_text\"]")
    WebElement textareaeditwaktu;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53275_text\"]")
    WebElement textareaeditjumlahsoal;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53276_text\"]")
    WebElement comboboxeditkategorimodul;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53298_text\"]")
    WebElement textareadeskripsisingkat;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53277_text\"]")
    WebElement comboboxstatusmodul;

    @FindBy(xpath = "//*[@id=\"53292_query\"]/span")
    WebElement btnupdatemodul;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
    WebElement btnokupdatemodul;

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btndeletemodul;

    public void clicktabtask() { tabtask.click();}

    public void clickmodul() { btnmodul.click();}

    public void clickaddmodul() { btnaddmodul.click();}

    public void namamodul(String namamodul) {
        this.namamodul.sendKeys(namamodul);
    }

    public void selecttipemodul(String selecttipemodul) {
        Select tipemodul = new Select(this.tipemodul);

        tipemodul.selectByValue(selecttipemodul);
    }

    public void waktupengerjaan(Integer waktupengerjaan) {
        this.waktupengerjaan.sendKeys("10");
    }

    public void jumlahsoal(Integer jumlahsoal) {
        this.jumlahsoal.sendKeys("2");
    }


    public void savemodul() { btnsavemodul.click();}

    public void closewaning() { btnclosewarning.click();}

    public void selectkategorimodul(String selectkategorimodul) {
        Select kategori = new Select(this.kategori);

        kategori.selectByValue(selectkategorimodul);
    }

    public void deskripsisingkat(String deskripsisingkat) {
        this.deskripsisingkat.sendKeys(deskripsisingkat);
    }

    public void selectstatusmodul(String selectstatusmodul) {
        Select statusmodul = new Select(this.statusmodul);

        statusmodul.selectByValue(selectstatusmodul);
    }

    public void saveinformationok() { btnsavemodulok.click();}

    public void informationok() { btninformationclose.click();}

}
