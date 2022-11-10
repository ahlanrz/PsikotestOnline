package com.juaracoding.psikotest.step_definitions;

import com.juaracoding.psikotest.step_definitions.pages.RemoveActivity;
import com.juaracoding.psikotest.step_definitions.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRemoveActivity {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private RemoveActivity removeActivity = new RemoveActivity();

    public TestRemoveActivity() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Admin go to Web Remove Activity")
    public void admin_go_to_web_Remove_Activity() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Admin go to Web psikotes online");
    }

    @And("Admin klik menu Remove Activity")
    public void admin_klik_menu_Remove_Activity() {
        removeActivity.clickMenuReport();
        extentTest.log(LogStatus.PASS, "Admin klik menu Remove Activity");
    }

    @And("Admin klik submenu Remove Activity")
    public void admin_klik_submenu_Remove_Activity() {
        removeActivity.clickRemoveActivity();
        extentTest.log(LogStatus.PASS, "Admin klik submenu Remove Activity");
    }

    @Then("Tampil halaman Remove Activity")
        public void tampil_halaman_remove_activity(){
        Assert.assertEquals(removeActivity.getTxtRemoveAct(),"Remove psikotest");
        extentTest.log(LogStatus.PASS, "Tampil halaman Remove Activity");
        }

        @When("TCC.PO.020 menginput NIK lengkap dari data")
        public void menginput_NIK_lengkap_dari_data() {
        removeActivity.inputSearch("1301051412930002");
        extentTest.log(LogStatus.PASS, "TCC.PO.020 menginput NIK lengkap dari data");
        }

        @And("TCC.PO.027 Menampilkan dari NIK yang input dari data")
        public void Menampilkan_dari_NIK_yang_input_dari_data(){
        removeActivity.clickView();
        extentTest.log(LogStatus.PASS, "TCC.PO.027 Menampilkan dari NIK yang input dari data");
    }

        @Then("Admin input nomor Nik")
        public void admin_input_nomor_Nik() {
        Assert.assertEquals(removeActivity.getTxtEmail(), "input nomor Nik");
        extentTest.log(LogStatus.PASS, "input nomor Nik");
        }

        @When("TCC.PO.021 Menginput Nama calon dari data")
        public void menginput_Nama_calon_dari_data() {
        removeActivity.inputSearch("Ahlan Rezki");
        extentTest.log(LogStatus.PASS,"TCC.PO.021 Menginput Nama calon dari data");
        }

        @And("TCC.PO.028 Menampilkan nama lengkap yang di input dari data")
       public void menampilkan_nama_lengkap_yang_di_input_dari_data() {
        removeActivity.clickView();
        extentTest.log(LogStatus.PASS, "TCC.PO.028 Menampilkan nama lengkap yang di input dari data");
        }

        @Then("Admin input nama lengkap")
        public void admin_nama_lengkap(){
        Assert.assertEquals(removeActivity.getTxtNama(), "input nama lengkap");
        extentTest.log(LogStatus.PASS, "input nama lengkap");
        }
}