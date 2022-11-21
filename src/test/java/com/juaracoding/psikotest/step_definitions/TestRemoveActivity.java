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
    public void tampil_halaman_remove_activity() {
        Assert.assertEquals(removeActivity.getTxtRemoveAct(), "Remove psikotest");
        extentTest.log(LogStatus.PASS, "Tampil halaman Remove Activity");
    }

    @When("TCC.PO.019 menginput NIK lengkap dari data")
    public void menginput_NIK_lengkap_dari_data() {
        removeActivity.inputSearch("1301051412930002");
        extentTest.log(LogStatus.PASS, "TCC.PO.020 menginput NIK lengkap dari data");
    }

    @And("TCC.PO.026 Menampilkan dari NIK yang input dari data")
    public void Menampilkan_dari_NIK_yang_input_dari_data() {
        removeActivity.clickView();
        extentTest.log(LogStatus.PASS, "TCC.PO.027 Menampilkan dari NIK yang input dari data");
    }

    @Then("Admin input nomor Nik")
    public void admin_input_nomor_Nik() {
        Assert.assertEquals(removeActivity.getTxtNik(), "input nomor Nik");
        extentTest.log(LogStatus.PASS, "input nomor Nik");
    }

    @When("TCC.PO.020 Menginput Nama calon dari data")
    public void menginput_Nama_calon_dari_data() {
        removeActivity.inputSearch("Ahlan Rezki");
        extentTest.log(LogStatus.PASS, "TCC.PO.021 Menginput Nama calon dari data");
    }

    @And("TCC.PO.027 Menampilkan nama lengkap yang di input dari data")
    public void menampilkan_nama_lengkap_yang_di_input_dari_data() {
        removeActivity.clickView();
        extentTest.log(LogStatus.PASS, "TCC.PO.028 Menampilkan nama lengkap yang di input dari data");
    }

    @Then("Admin input nama lengkap")
    public void admin_nama_lengkap() {
        Assert.assertEquals(removeActivity.getTxtNama(), "input nama lengkap");
        extentTest.log(LogStatus.PASS, "input nama lengkap");
    }

    @When("TCC.PO.021 Menginput alamat gmail dari data")
    public void menginput_alamat_gmail_dari_data() {
        removeActivity.inputSearch("ahlanrezki@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.PO.021 Menginput alamat gmail dari data");
    }

    @And("TCC.PO.028 Menampilkan alamat gmail yang di input dari data")
    public void menampilkan_alamat_gmail_yang_di_input_dari_data() {
        removeActivity.clickView();
        extentTest.log(LogStatus.PASS, "TCC.PO.028 Menampilkan alamat gmail yang di input dari data");
    }

    @Then("Admin mencari dan menampilkan dari data gmail")
    public void Admin_mencari_dan_menampilkan_dari_data_gmail() {
        Assert.assertEquals(removeActivity.getTxtEmail(), "input email dari data");
        extentTest.log(LogStatus.PASS, "input email dari data");
    }

    @When("TCC.PO.022 Menginput angka nomor telepon lengkap dari data")
    public void menginput_angka_nomor_telepon_lengkap_dari_data() {
        removeActivity.inputSearch(" 0855771341820");
        extentTest.log(LogStatus.PASS, "TCC.PO.022 Menginput angka nomor telepon lengkap dari data");
    }

    @And("TCC.PO.029 Menampilkan nomor telepon yang di input dari datanya")
    public void menampilkan_nomor_telepon_yang_di_input_dari_datanya() {
        removeActivity.clickView();
        extentTest.log(LogStatus.PASS, "TCC.PO.029 Menampilkan nomor telepon yang di input dari datanya");
    }

    @Then("Admin menginput nomor telepon dari data")
    public void admin_menginput_nomor_telepon_dari_data() {
        Assert.assertEquals(removeActivity.getTxtTelepon(), "Admin menginput nomor telepon dari data");
    }

    @When("TCC.PO.038 Info pemberitahuan ingin di hapus atau tidak")
    public void Info_pemberitahuan_ingin_di_hapus_atau_tidak() {
        removeActivity.clickDelete();
        extentTest.log(LogStatus.PASS, "TCC.PO.038 Info pemberitahuan ingin di hapus atau tidak");
    }

    @And("TCC.PO.040 Memilih status tidak untuk kembali")
    public void memilih_status_tidak_untuk_kembali() {
        Assert.assertEquals(removeActivity.getTxtDihapus(), "Yakin ingin menghapus ini ?");
        extentTest.log(LogStatus.PASS, "Memilih status tidak untuk kembali");
    }

    @Then("Admin klik TIDAK")
    public void admin_klik_tidak() {
        removeActivity.clickTidak();
        extentTest.log(LogStatus.PASS, "Admin klik TIDAK");
    }

    @When("TCC.PO.039 memilih status iya untuk menghapus")
    public void admin_klik_icon_delete() {
        removeActivity.clickDelete();
        extentTest.log(LogStatus.PASS, "Admin klik icon delete");
    }

    @And("Admin klik YA")
    public void admin_klik_ya() {
        removeActivity.clickDelete();
        extentTest.log(LogStatus.PASS, "Admin klik YA");
    }

    @Then("Muncul pop up data berhasil dihapus")
    public void muncul_pop_up_data_berhasil_dihapus() {
        Assert.assertEquals(removeActivity.getTxtDihapus(), "Data berhasil dihapus!");
        extentTest.log(LogStatus.PASS, "Muncul pop up data berhasil dihapus");
    }

    @Then("Admin klik OK")
    public void admin_klik_ok() {
        removeActivity.clickYa();
        extentTest.log(LogStatus.PASS, "Admin klik OK");
    }
}
