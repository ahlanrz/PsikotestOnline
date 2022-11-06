package com.juaracoding.psikotestonline;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-reports.html");

}