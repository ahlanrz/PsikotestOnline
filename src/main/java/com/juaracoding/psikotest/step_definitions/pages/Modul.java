package com.juaracoding.psikotest.step_definitions.pages;

import com.juaracoding.psikotest.step_definitions.drivers.DriverSingleton;
import com.juaracoding.psikotest.step_definitions.utils.Constants;
import com.juaracoding.psikotest.step_definitions.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Modul {
    private WebDriver driver;
    int detik = 5;


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

    @FindBy(xpath = "//select[@id='tl_dis_agree--52812_show_text']")
    WebElement btncomboboxshowpage;

    @FindBy(xpath = "//input[@id='tl_dis_agree--52808_text']")
    WebElement txtsearch;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnsearchmodul;

    //add soal

    @FindBy(id = "--_text")
    WebElement btnaddtemplatesoal;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53142_text']")
    WebElement textboxsoal;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53146_text']")
    WebElement txtjawabanpilihan_a;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53144_text']")
    WebElement txtjawabanpilihan_b;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53145_text']")
    WebElement txtjawabanpilihan_c;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53151_text']")
    WebElement txtjawabanpilihan_d;

    @FindBy(xpath = "//textarea[@id='tl_template_soal--53152_text']")
    WebElement txtjawabanpilihan_e;

    @FindBy(xpath = "//*[@id=\"tl_template_soal--53153_text\"]")
    WebElement kuncijawabanpg;

    @FindBy(xpath = "//select[@id='tl_template_soal--53167_text']")
    WebElement maksscore;

    @FindBy(xpath = "//*[@id=\"tl_template_script_edit--53231_text\"]")
    WebElement editmaksscore;

    @FindBy(xpath = "//select[@id='tl_template_soal--53224_text']")
    WebElement kuncijawabanenum;

    @FindBy(xpath = "//select[@id='tl_template_script_edit--53228_text']")
    WebElement editkuncijawabanenum;


    @FindBy(xpath = "//*[@id=\"53156_query\"]/span")
    WebElement btnuploadgambar;

    @FindBy(xpath = "//*[@id=\"53160_query\"]/span")
    WebElement btncekgambar;

    @FindBy(xpath = "//span[normalize-space()='ADD SOAL']")
    WebElement btnaddsoal;

    @FindBy(xpath = "/html/body/div[8]/div[1]/button/span[1]")
    WebElement btnokaddsoal;

    @FindBy(xpath = "/html/body/div[9]/div[1]/div/button/span[1]")
    WebElement btncloseformaddsoal;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[1]/div[4]/div[6]/table[1]/tbody[1]/tr[2]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
    WebElement btneditsoal;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[1]/div[4]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
    WebElement btneditsoal1;

    @FindBy(xpath = "//*[@id=\"tl_template_script_edit--53166_text\"]")
    WebElement txteditsoaljawabane;

    @FindBy(xpath = "//*[@id=\"tl_template_script_edit--53102_text\"]")
    WebElement txteditsoaljawabanb;

    @FindBy(xpath = "//textarea[@id='tl_template_script_edit--53087_text']")
    WebElement textareaeditsoal;

    @FindBy(xpath = "//select[@id='tl_template_script_edit--53104_text']")
    WebElement selecteditkuncijawabane;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[1]/div[4]/div[6]/table[1]/tbody[1]/tr[2]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/img[1]")
    WebElement btndeletesoal;

    @FindBy(xpath = "//span[normalize-space()='Update']")
    WebElement btnupdatesoal;

    @FindBy(xpath = "/html/body/div[8]/div[1]/button/span[1]")
    WebElement btncloseformeditsoal;


    //form add deskripsi

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btnformdescription;

    @FindBy(xpath = "//textarea[@id='tl_user_activity--53077_text']")
    WebElement textareadeskripsimodul;

    @FindBy(xpath = "//textarea[@id='tl_user_activity--53055_text']")
    WebElement textareaketentuansoal;

    @FindBy(xpath = "//*[@id=\"53069_query\"]/span")
    WebElement btnadddescdanketentuan;

    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement btncloseformdesc;


    //form edit modul

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btneditmodul;

    @FindBy(xpath = "//select[@id='tl_edit_modul--53277_text']")
    WebElement comboboxstatusmodul;

    @FindBy(xpath = "//span[normalize-space()='UPDATE']")
    WebElement btnupdatemodul;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
    WebElement btnokupdatemodul;

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    WebElement btndeletemodul;

    public void clicktabtask() {
        tabtask.click();
    }

    public void clickmodul() {
        btnmodul.click();
    }

    public void clickaddmodul() {
        btnaddmodul.click();
    }

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


    public void savemodul() {
        btnsavemodul.click();
    }

    public void closewaning() {
        btnclosewarning.click();
    }

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

    public void saveinformationok() { delay(detik);
        btnsavemodulok.click();
    }

    public void informationok() {
        btninformationclose.click();
    }

    public void selectshowpage(String selectshowpage) {
        Select btncomboboxshowpage = new Select(this.btncomboboxshowpage);

        btncomboboxshowpage.selectByValue(selectshowpage);
    }

    public void searchmodul(String searchmodul) { delay(detik);
        this.txtsearch.sendKeys(searchmodul);
    }

    public void buttonsearchmodul() { delay(detik);
        delay(detik);
        btnsearchmodul.click();
        delay(detik);
    }

    public void buttonaddtemplatesoalpgleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }


    public void insertsoal(String insertsoal) {
        this.textboxsoal.sendKeys(insertsoal);
    }

    public void insertjawabanpga(String insertjawabanpga) {
        this.txtjawabanpilihan_a.sendKeys(insertjawabanpga);
    }

    public void insertjawabanpgb(String insertjawabanpgb) {
        this.txtjawabanpilihan_b.sendKeys(insertjawabanpgb);
    }

    public void insertjawabanpgc(String insertjawabanpgc) {
        this.txtjawabanpilihan_c.sendKeys(insertjawabanpgc);
    }

    public void insertjawabanpgd(String insertjawabanpgd) {
        this.txtjawabanpilihan_d.sendKeys(insertjawabanpgd);
    }

    public void insertjawabanpge(String insertjawabanpge) {
        this.txtjawabanpilihan_e.sendKeys(insertjawabanpge);
    }

    public void selectkuncijawabanpg(String selectkuncijawabanpg) { delay(detik);
        Select kuncijawabanpg = new Select(this.kuncijawabanpg);

        kuncijawabanpg.selectByValue(selectkuncijawabanpg);
    }

    public void buttonchoosefile() {  delay(detik);

        WebElement upload_file = driver.findElement(By.xpath("//input[@id='tl_template_soal--53161_text']"));

        upload_file.sendKeys("C:\\Users\\zakar\\Desktop\\contoh gambar QA\\2.png");

        ;
    }

    public void buttonuploadgambar() { delay(detik);

        btnuploadgambar.click();

        ;
    }


    public void buttoncekgambar() { delay(detik);

        btncekgambar.click();
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,500)");

    }

    public void buttonaddsoal() {  delay(detik);

        btnaddsoal.click();
    }

    public void buttonokaddsoal() {  delay(detik);
        btnokaddsoal.click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1000)");
    }

    public void buttoneditsoal() {  delay(detik);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(0,1000)");

        btneditsoal.click();
    }

    public void buttoneditsoalone() { delay(detik);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(0,500)");

        btneditsoal1.click();
    }


    public void editjawabanpge(String editjawabanpge) {  delay(detik);

        this.txteditsoaljawabane.sendKeys(editjawabanpge);

    }

    public void selecteditkuncijawaban(String selecteditkuncijawaban) {  delay(detik);

        Select selecteditkuncijawabane = new Select(this.selecteditkuncijawabane);

        selecteditkuncijawabane.selectByValue(selecteditkuncijawaban);

    }

    public void buttonupdatesoal() { delay(detik);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,1000)");

        btnupdatesoal.click();

    }

    public void buttoncloseeditformsoal() { delay(detik);

        btncloseformeditsoal.click();
    }

    public void buttoncloseformsoal() { delay(detik);

        btncloseformaddsoal.click();}



    public void buttonaddtemplatesoalpgstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }


    public void buttonaddtemplatesoalesaifreetextleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }


    public void editsoalclear() { delay(detik);

        this.textareaeditsoal.clear();

    }

    public void editsoal(String texteditsoal) { delay(detik);

        this.textareaeditsoal.sendKeys(texteditsoal);

    }

    public void buttonaddtemplatesoalesaifreetextstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonaddtemplatesoalenumyatidakleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonaddtemplatesoalenumyatidakstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }


    public void selectkuncijawabanenum(String selectkuncijawabanenum) { delay(detik);

        Select kuncijawabanenum = new Select(this.kuncijawabanenum);

        kuncijawabanenum.selectByValue(selectkuncijawabanenum);

    }

    public void selectkuncijawabanenumedit(String selectkuncijawabanenumedit) { delay(detik);

        Select editkuncijawabanenum = new Select(this.editkuncijawabanenum);

        editkuncijawabanenum.selectByValue(selectkuncijawabanenumedit);

    }



    public void buttonaddtemplatesoalesailengthleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonaddtemplatesoalesailengthstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void selectmaksscore(String selectmaksscore) {  delay(detik);
        Select maksscore = new Select(this.maksscore);

        maksscore.selectByValue(selectmaksscore);
    }

    public void selecteditmaksscore(String selecteditmaksscore) { delay(detik);

        Select editmaksscore = new Select(this.editmaksscore);

        editmaksscore.selectByValue(selecteditmaksscore);

    }

    public void buttonaddtemplatesoalpilihanableader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(9) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonaddtemplatesoalpilihanabstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(10) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void editjawabanpilihanabclear() {

        this.txteditsoaljawabanb.clear();

    }

    public void editjawabanpilihanab(String editjawabanpilihanab) { delay(detik);

        this.txteditsoaljawabanb.sendKeys(editjawabanpilihanab);

    }

    public void buttonadddeskripsidanketentuanmodulpgleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void editdeskripsimodul(String editdeskripsimodul) { delay(detik);

        this.textareadeskripsimodul.sendKeys(editdeskripsimodul);

    }

    public void editketentuansoal(String editketentuansoal) { delay(detik);

        this.textareaketentuansoal.sendKeys(editketentuansoal);

    }

    public void buttonadddescription() {  delay(detik);
        btnadddescdanketentuan.click();
    }


    public void buttonadddeskripsidanketentuanmodulpgstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulesaifreetextleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulesaifreetextstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulenumyatidakleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulenumyatidakstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulesailengthleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulesailengthstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulpilihanableader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(9) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttonadddeskripsidanketentuanmodulpilihanabstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(10) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoncloseformdesc() {  delay(detik);

        btncloseformdesc.click();
    }

    public void buttoneditmodulpgleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void selecteditstatusmodul(String selecteditstatusmodul) {  delay(detik);
        Select comboboxstatusmodul = new Select(this.comboboxstatusmodul);

        comboboxstatusmodul.selectByValue(selecteditstatusmodul);
    }
    public void buttonupdatemodul() {  delay(detik);

        btnupdatemodul.click();
    }

    public void buttonokupdatemodul(){  delay(detik);
        btnokupdatemodul.click();
    }

    public void buttoneditmodulpgstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulesaifreetextleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulesaifreetextstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulenumleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulenumstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulesailengthleader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulesailengthstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulpilihanableader() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(9) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }

    public void buttoneditmodulpilihanabstaff() { delay(detik);

        WebElement buttonaddtemplatesoal = driver.findElement(By.id("--_text"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(10) > td:nth-child(10) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > img:nth-child(3)\").click();", buttonaddtemplatesoal);

        ;
    }


    static void delay(int detik) {


        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
