package com.juaracoding.psikotest.step_definitions.pages;

import com.juaracoding.psikotest.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report {
    private WebDriver driver;

    public Report(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "//*[@id=\"ui-id-11\"]")
    private WebElement btnMenuReport;

    @FindBy(xpath = "//*[@id=\"52828_query\"]/span")
    private WebElement btnReport;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/button")
    private WebElement btnView;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[4]/div/button")
    private WebElement btnExport;

    @FindBy(xpath = "/html/body/div[9]/div/a[1]")
    private WebElement btnDatePrev;

    @FindBy(xpath = "/html/body/div[9]/div/a[2]")
    private WebElement btnDatenext;

    @FindBy(linkText = "1")
    private WebElement btnTglFirst;

    @FindBy(xpath = "/html/body/div[9]/table/tbody/tr[2]/td[1]/a")
    private WebElement btnTglLast;

    @FindBy(id = "//*[@id=\"tl_report_setuju--53453_finder\"]")
    private WebElement DateFirst;

    @FindBy(id = "//*[@id=\"tl_report_setuju--53460_finder\"]")
    private WebElement DateLast;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[1]/div[1]/table/tbody/tr/td/div/input")
    private WebElement txtReport;

    @FindBy(xpath = "//*[@id=\"tl_report_setuju--53453_text\"]")
    private WebElement txtTgl;

    @FindBy(xpath = "//*[@id=\"tl_report_setuju--53457\"]/div[8]")
    private WebElement txtEntries;

    public void clickMenuReport(){
        btnMenuReport.click();
    }

    public void clickReport(){
        btnReport.click();
    }

    public void clickView() {
        btnView.click();
    }

    public void clickExport() {
        btnExport.click();
    }

    public void clickDateFirst() {
        DateFirst.click();
    }

    public void clickDateLast() {
        DateLast.click();
    }

    public void clickDatePrev() {
        btnDatePrev.click();
    }

    public void clickDateNext() {
        btnDatenext.click();
    }

    public void clickTglFirst() {
        btnTglFirst.click();
    }

    public void clickTglLast() {
        btnTglLast.click();
    }

    public String getTxtReport() {
        return  txtReport.getText();
    }

    public String getTxtTgl() {
        return txtTgl.getText();
    }

    public String getTxtEntries() {
        return txtEntries.getText();
    }
}