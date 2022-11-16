package com.juaracoding.psikotest.step_definitions;

import com.juaracoding.psikotest.step_definitions.pages.Modul;
import com.juaracoding.psikotest.step_definitions.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestModul {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Modul modulpage = new Modul();

    public TestModul() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //open tab task modul

    @When("Admin click tab task")
    public void admin_click_tab_task() {
        modulpage.clicktabtask();
        extentTest.log(LogStatus.PASS, "Admin click tab task");
    }

    @Then("Admin click tab task modul")
    public void admin_click_tab_task_modul() {
        modulpage.clickmodul();
        extentTest.log(LogStatus.PASS,"Admin click tab task modul");
    }

    //add blank modul

    @When("Admin click button add modul invalid")
    public void admin_click_button_add_modul_invalid() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul invalid");
    }

    @And("Admin click button Save")
    public void admin_click_button_save() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS,"Admin click button Save");
    }

    @Then("Admin click close tab warning")
    public void admin_click_close_tab_warning() {
        modulpage.closewaning();
        extentTest.log(LogStatus.PASS,"Admin click button Save");
    }


    //add modul valid pilihan ganda leader

    @When("Admin insert nama modul leader")
    public void admin_insert_nama_modul_leader() {
        modulpage.namamodul("Test SQA Batch #10");
        extentTest.log(LogStatus.PASS,"admin typing nama modul");
    }

    @And("Admin choose tipe modul pilihan ganda leader")
    public void admin_choose_tipe_modul_leader() {
        modulpage.selecttipemodul("PILIHAN GANDA");
        extentTest.log(LogStatus.PASS,"Admin choose tipe modul pilihan ganda");
    }

    @And("Admin insert waktu pengerjaan pilihan ganda leader")
    public void admin_insert_waktu_pengerjaan_pilihan_ganda_leader() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS,"Admin insert waktu pengerjaan pilihan ganda");
    }

    @And("Admin insert jumlah soal leader")
    public void admin_insert_jumlah_soal_leader() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS,"Admin insert jumlah soal");
    }

    @And("Admin choose kategori modul leader")
    public void admin_choose_kategori_modul_leader() {
        modulpage.selectkategorimodul("LEADER");
        extentTest.log(LogStatus.PASS,"Admin choose kategori modul leader");
    }

    @And("Admin insert deskripsi soal leader")
    public void admin_insert_deskripsi_soal_leader() {
        modulpage.deskripsisingkat("Test SQA untuk Batch #10");
        extentTest.log(LogStatus.PASS,"Admin insert deskripsi soal");
    }

    @And("Admin choose status modul leader")
    public void admin_choose_status_modul_leader() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS,"Admin choose status modul");
    }

    @And("Admin click button Save modul pilihan ganda leader")
    public void admin_click_button_save_pilihan_ganda_leader() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS,"Admin click button Save modul pilihan ganda leader");
    }

    @And("Admin choose and click button ok in form pemberitahuan leader")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_leader() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS,"Admin choose and click button ok in form pemberitahuan");
    }

    @Then("Admin click button ok in form pemberitahuan leader")
    public void admin_click_button_ok_in_form_pemberitahuan_leader() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS,"Admin click button ok in form pemberitahuan");
    }

    //add modul valid pilihan ganda staff

    @When("Admin click button add modul staff")
    public void admin_click_button_add_modul_staff() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul");
    }

    @And("Admin insert nama modul staff")
    public void admin_insert_nama_modul_staff() {
        modulpage.namamodul("Test SQA Batch #10S");
        extentTest.log(LogStatus.PASS,"admin typing nama modul");
    }

    @And("Admin choose tipe modul pilihan ganda staff")
    public void admin_choose_tipe_modul_staff() {
        modulpage.selecttipemodul("PILIHAN GANDA");
        extentTest.log(LogStatus.PASS,"Admin choose tipe modul pilihan ganda");
    }

    @And("Admin insert waktu pengerjaan pilihan ganda staff")
    public void admin_insert_waktu_pengerjaan_pilihan_ganda_staff() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS,"Admin insert waktu pengerjaan pilihan ganda");
    }

    @And("Admin insert jumlah soal staff")
    public void admin_insert_jumlah_soal_staff() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS,"Admin insert jumlah soal");
    }

    @And("Admin choose kategori modul staff")
    public void admin_choose_kategori_modul_staff() {
        modulpage.selectkategorimodul("STAFF");
        extentTest.log(LogStatus.PASS,"Admin choose kategori modul leader");
    }

    @And("Admin insert deskripsi soal staff")
    public void admin_insert_deskripsi_soal_staff() {
        modulpage.deskripsisingkat("Test SQA untuk Batch #10S");
        extentTest.log(LogStatus.PASS,"Admin insert deskripsi soal");
    }

    @And("Admin choose status modul staff")
    public void admin_choose_status_modul_staff() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS,"Admin choose status modul");
    }

    @And("Admin click button Save modul pilihan ganda staff")
    public void admin_click_button_save_pilihan_ganda_staff() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS,"Admin click button Save modul pilihan ganda staff");
    }

    @And("Admin choose and click button ok in form pemberitahuan staff")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_staff() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS,"Admin choose and click button ok in form pemberitahuan");
    }

    @Then("Admin click button ok in form pemberitahuan staff")
    public void admin_click_button_ok_in_form_pemberitahuan_staff() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS,"Admin click button ok in form pemberitahuan");
    }



}
