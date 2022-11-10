package com.juaracoding.psikotest.step_definitions;

import com.juaracoding.psikotest.step_definitions.pages.Report;
import com.juaracoding.psikotest.step_definitions.pages.RemoveActivity;
import com.juaracoding.psikotest.step_definitions.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestReport {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Report report = new Report();

    public TestReport() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
@When("User go to Web Psikotest Online")
    public void user_go_to_Web_Psikotest_Online() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web Psikotest Online");
}

@And ("Admin klik menu Report")
    public void admin_klik_menu_Report() {
        report.clickMenuReport();
        extentTest.log(LogStatus.PASS, "Admin klik menu Report");
}

@And ("Admin klik submenu Report")
    public void admin_klik_submenu_Report() {
        report.clickReport();
        extentTest.log(LogStatus.PASS, "Admin klik submenu Report");
}

@Then("Tampil halaman Report")
    public void tampil_halaman_report() {
        Assert.assertEquals(report.getTxtReport(), "Report psikotest");
        extentTest.log(LogStatus.PASS, "Tampil halaman Report");
}

@And("TCC.PO.005 Mencari user calon pelamar yang berhasil perhari dari kalender awal")
 public void mencari_user_calon_pelamar_yang_berhasil_perhari_dari_kalender_awal() {
report.clickDateFirst();
for (int i=0; i<3; i++) {
    report.clickDateNext();
}
report.clickTglFirst();
extentTest.log(LogStatus.PASS, "TCC.PO.005 Mencari user calon pelamar yang berhasil perhari dari kalender awal");
}

@And("TCC.PO.006 Mencari user calon pelamar yang berhasil perhari dari kalender akhir")
    public void mencari_user_calon_pelamar_yang_berhasil_perhari_dari_kalender_akhir() {
     report.clickDateLast();
     for (int i=0; i<3; i++) {
         report.clickDatePrev();
     }
     report.clickTglFirst();
     extentTest.log(LogStatus.PASS, "mencari_user_calon_pelamar_yang_berhasil_perhari_dari_kalender_akhir");
    }

    @And("Admin klik view untuk menampilkan data")
    public void admin_klik_view_untuk_menampilkan_data(){
        report.clickView();
        extentTest.log(LogStatus.PASS, "Admin klik view untuk menampilkan data");
    }

    @Then("Tidak ada data yang tampil")
    public void tidak_ada_data_yang_tampil(){
        Assert.assertEquals(report.getTxtEntries(), "no entries");
        extentTest.log(LogStatus.PASS, "list Report tampil" );
    }

    @And("TCC.PO.003 Mencari user calon pelamar yang berhasil perminggu dari kalender awal")
    public void mencari_user_calon_pelamar_yang_berhasil_perminggu_dari_kalender_awal () {
        report.clickTglFirst();
        for (int i=0; i<3; i++) {
            report.clickDatePrev();
        }
        report.clickTglFirst();
        extentTest.log(LogStatus.PASS, "TCC.PO.003 Mencari user calon pelamar yang berhasil perminggu dari kalender awal");
    }

    @And("TCC.PO.010 Menampilkan user calon data pelamar yang berhasil perminggu dari kalender akhir")
    public void menampilkan_user_calon_data_pelamar_yang_berhasil_perminggu_dari_kalender_akhir () {
        report.clickDateLast();
        for (int i=0; i<3; i++) {
        }
            report.clickTglLast();
            extentTest.log(LogStatus.PASS, "menampilkan user calon data pelamar yang berhasil perminggu dari kalender akhir");
        }

        @And("Admin klik tombol View")
        public void admin_klik_tombol_View(){
        report.clickView();
        extentTest.log(LogStatus.PASS,"Admin klik tombol View" );
    }

    @Then("List report tampil")
    public void list_report_tampil() {
        Assert.assertEquals(report.getTxtEntries(), "Showing");
     extentTest.log(LogStatus.PASS, "List report tampil");
    }

   @And("TCC.PO.007 Menampilkan user calon data  pelamar yang berhasil  perbulan dari kalender awal")
    public void menampilkan_user_calon_data_pelamar_yang_berhasil_perbulan_dari_kalender_awal() {
        report.clickDateFirst();
        for (int i=0; i<3; i++) {
            report.clickDatePrev();
        }
        report.clickTglFirst();
        extentTest.log(LogStatus.PASS, "Menampilkan user calon data  pelamar yang berhasil  perbulan dari kalender awal");
    }

    @And("TCC.PO.008 Menampilkan user calon data  pelamar yang berhasil perbulan dari kalender akhir")
    public void menampilkan_user_calon_data_pelamar_yang_berhasil_perbulan_dari_kalender_akhir(){
        report.clickDateLast();
        report.clickTglFirst();
        extentTest.log(LogStatus.PASS, "TCC.PO.008 Menampilkan user calon data pelamar yang berhasil perbulan dari kalender akhir");
    }
    @And("TCC.PO.019 Memindahkan data isi ke bentuk Excel")
    public void memindahkan_data_isi_ke_bentuk_Excel() {
        report.clickView();
        report.clickExport();
        report.clickExport();
        extentTest.log(LogStatus.PASS, "TCC.PO.019 Memindahkan data isi ke bentuk Excel");
    }
    @Then("Validasi file menggunakan size")
    public void Validasi_file_menggunakan_size () {
        Assert.assertEquals(report.getTxtReport(), "Validasi file");
        extentTest.log(LogStatus.PASS, "Validasi file menggunakan size");
    }
}
