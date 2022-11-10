package com.juaracoding.psikotest.step_definitions.pages;

import com.juaracoding.psikotest.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveActivity {
    private WebDriver driver;

    public RemoveActivity() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "//*[@id=\"ui-id-11\"]")
    private WebElement btnMenuReport;

    @FindBy(xpath = "//*[@id=\"52836_query\"]/span")
    private WebElement btnRemoveActivity;

    @FindBy(xpath = "//*[@id=\"53431_query\"]/span")
    private WebElement btnView;

    @FindBy(xpath = "//*[@id=\"--_text\"]")
    private WebElement btnDelete;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[1]/span")
    private WebElement btnYa;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]/span")
    private WebElement btnTidak;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
    private WebElement btnOK;

    @FindBy(xpath = "/html/body/div[8]/div[1]/button")
    private WebElement btnSilang;

    @FindBy(xpath = "//*[@id=\"tl_remove_activity--53435_text\"]")
    private WebElement inputSearch;

    @FindBy(id = "//*[@id=\"tl_remove_activity--53426_text\"]")
    private WebElement txtRemoveActivity;

    @FindBy(xpath = "//*[@id=\"tl_remove_activity--53429-header\"]/th[3]")
    private WebElement txtNik;

    @FindBy(xpath = "//*[@id=\"tl_remove_activity--53429-header\"]/th[4]")
    private WebElement txtNama;

    @FindBy(xpath = "//*[@id=\"tl_remove_activity--53429-header\"]/th[5]")
    private WebElement txtEmail;

    @FindBy (xpath = "//*[@id=\"tl_remove_activity--53429-header\"]/th[6]")
    private WebElement txtTelepon;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p/span")
    private WebElement txtDihapus;

    @FindBy(xpath = "//*[@id=\"tl_remove_activity--53429\"]/div[8]")
    private WebElement txtNoEntries;

    public void clickMenuReport() {
        btnMenuReport.click();
    }

    public void clickRemoveActivity() {
        btnRemoveActivity.click();
    }

    public void clickView() {
        btnView.click();
    }

    public void clickDelete() {
        btnDelete.click();
    }

    public void clickYa() {
        btnYa.click();
    }

    public void clickTidak() {
        btnTidak.click();
    }

    public void clickSilang() {
        btnSilang.click();
    }

    public void inputSearch(String search) {
        this.inputSearch.sendKeys(search);
    }

    public void inputInvalidSearch(String search) {
        if (!search.equals("")){
            this.inputSearch.sendKeys(search);
        }
    }

    public String getTxtRemoveAct() {
    return txtRemoveActivity.getAttribute("value");
    }

    public String getTxtNik() {
    return txtNik.getText();
    }

    public String getTxtNama(){
    return txtNama.getText();
    }

    public String getTxtEmail() {
        return txtEmail.getText();
    }

    public String getTxtTelepon() {
        return txtTelepon.getText();
    }

    public String getTxtDihapus() {
        return txtDihapus.getText();
    }

    public String getTxtEntries() {
        return txtNoEntries.getText();
    }
}