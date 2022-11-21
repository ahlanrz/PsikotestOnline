package com.juaracoding.psikotest.step_definitions;

import com.juaracoding.psikotest.step_definitions.pages.Modul;
import com.juaracoding.psikotest.step_definitions.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
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
        extentTest.log(LogStatus.PASS, "Admin click tab task modul");
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
        extentTest.log(LogStatus.PASS, "Admin click button Save");
    }

    @Then("Admin click close tab warning")
    public void admin_click_close_tab_warning() {
        modulpage.closewaning();
        extentTest.log(LogStatus.PASS, "Admin click button Save");
    }


    //add modul valid pilihan ganda leader

    @When("Admin insert nama modul leader")
    public void admin_insert_nama_modul_pg_leader() {
        modulpage.namamodul("Test SQA Batch 10 Leader #");
        extentTest.log(LogStatus.PASS, "admin typing nama modul");
    }

    @And("Admin choose tipe modul pilihan ganda leader")
    public void admin_choose_tipe_modul_pg_leader() {
        modulpage.selecttipemodul("PILIHAN GANDA");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul pilihan ganda");
    }

    @And("Admin insert waktu pengerjaan pilihan ganda leader")
    public void admin_insert_waktu_pengerjaan_pilihan_ganda_leader() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan pilihan ganda");
    }

    @And("Admin insert jumlah soal leader")
    public void admin_insert_jumlah_soal_pg_leader() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal");
    }

    @And("Admin choose kategori modul leader")
    public void admin_choose_kategori_modul_pg_leader() {
        modulpage.selectkategorimodul("LEADER");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul leader");
    }

    @And("Admin insert deskripsi soal leader")
    public void admin_insert_deskripsi_soal_pg_leader() {
        modulpage.deskripsisingkat("Test SQA untuk Batch #10 LEADER");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal");
    }

    @And("Admin choose status modul leader")
    public void admin_choose_status_modul_pg_leader() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul");
    }

    @And("Admin click button Save modul pilihan ganda leader")
    public void admin_click_button_save_pilihan_ganda_pg_leader() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button Save modul pilihan ganda leader");
    }

    @And("Admin choose and click button ok in form pemberitahuan leader")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_pg_leader() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan");
    }

    @Then("Admin click button ok in form pemberitahuan leader")
    public void admin_click_button_ok_in_form_pemberitahuan_pg_leader() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan");
    }

    //add modul valid pilihan ganda staff

    @When("Admin click button add modul pg staff")
    public void admin_click_button_add_modul_pg_staff() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul pg staff");
    }

    @And("Admin insert nama modul pg staff")
    public void admin_insert_nama_modul_pg_staff() {
        modulpage.namamodul("Test SQA Batch 10 STAFF #");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul pg staff");
    }

    @And("Admin choose tipe modul pilihan ganda staff")
    public void admin_choose_tipe_modul_pg_staff() {
        modulpage.selecttipemodul("PILIHAN GANDA");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul pilihan ganda staff");
    }

    @And("Admin insert waktu pengerjaan pilihan ganda staff")
    public void admin_insert_waktu_pengerjaan_pilihan_ganda_staff() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan pilihan ganda staff");
    }

    @And("Admin insert jumlah soal pg staff")
    public void admin_insert_jumlah_soal_pg_staff() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal pg staff");
    }

    @And("Admin choose kategori modul pg staff")
    public void admin_choose_kategori_modul_pg_staff() {
        modulpage.selectkategorimodul("STAFF");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul pg staff");
    }

    @And("Admin insert deskripsi soal pg staff")
    public void admin_insert_deskripsi_soal_pg_staff() {
        modulpage.deskripsisingkat("Test SQA untuk Batch #10 STAFF");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal pg staff");
    }

    @And("Admin choose status modul pg staff")
    public void admin_choose_status_modul_pg_staff() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul pg staff");
    }

    @And("Admin click button save modul pilihan ganda staff")
    public void admin_click_button_save_pilihan_ganda_pg_staff() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul pilihan ganda staff");
    }

    @And("Admin choose and click button ok in form pemberitahuan pg staff")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_pg_staff() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan pg staff");
    }

    @Then("Admin click button ok in form pemberitahuan pg staff")
    public void admin_click_button_ok_in_form_pemberitahuan_pg_staff() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan pg staff");
    }

    //add modul esai free text leader

    @When("Admin click button add modul esai free text leader")
    public void admin_click_button_add_modul_esai_free_text_leader() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul esai free text leader");
    }

    @And("Admin insert nama modul esai free text leader")
    public void admin_insert_nama_modul_esai_free_text_leader() {
        modulpage.namamodul("Test SQA Batch 11 LEADER $");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul esai free text leader");
    }

    @And("Admin choose tipe modul esai free text leader")
    public void admin_choose_tipe_modul_esai_free_text_leader() {
        modulpage.selecttipemodul("ESAI FREE TEXT");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul esai free text leader");
    }

    @And("Admin insert waktu pengerjaan esai free text leader")
    public void admin_insert_waktu_pengerjaan_esai_free_text_leader() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan esai free text leader");
    }

    @And("Admin insert jumlah soal esai free text leader")
    public void admin_insert_jumlah_soal_esai_free_text_leader() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal esai free text leader");
    }

    @And("Admin choose kategori modul esai free text leader")
    public void admin_choose_kategori_modul_esai_free_text_leader() {
        modulpage.selectkategorimodul("LEADER");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul esai free text leader");
    }

    @And("Admin insert deskripsi soal esai free text leader")
    public void admin_insert_deskripsi_soal_esai_free_text_leader() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch $11 Leader");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal esai free text leader");
    }

    @And("Admin choose status modul esai free text leader")
    public void admin_choose_status_modul_esai_free_text_leader() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul esai free text leader");
    }

    @And("Admin click button save modul esai free text leader")
    public void admin_click_button_save_esai_free_text_leader() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul esai free text leader");
    }

    @And("Admin choose and click button ok in form pemberitahuan esai free text leader")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_esai_free_text_leader() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan esai free text leader");
    }

    @Then("Admin click button ok in form pemberitahuan esai free text leader")
    public void admin_click_button_ok_in_form_pemberitahuan_esai_free_text_leader() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan esai free text leader");
    }


    //add modul esai free text staff
    @When("Admin click button add modul esai free text staff")
    public void admin_click_button_add_modul_esai_free_text_staff() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul esai free text staff");
    }

    @And("Admin insert nama modul esai free text staff")
    public void admin_insert_nama_modul_esai_free_text_staff() {
        modulpage.namamodul("Test SQA Batch 11 STAFF $");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul esai free text staff");
    }

    @And("Admin choose tipe modul esai free text staff")
    public void admin_choose_tipe_modul_esai_free_text_staff() {
        modulpage.selecttipemodul("ESAI FREE TEXT");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul esai free text staff");
    }

    @And("Admin insert waktu pengerjaan esai free text staff")
    public void admin_insert_waktu_pengerjaan_esai_free_text_staff() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan esai free text staff");
    }

    @And("Admin insert jumlah soal esai free text staff")
    public void admin_insert_jumlah_soal_esai_free_text_staff() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal esai free text staff");
    }

    @And("Admin choose kategori modul esai free text staff")
    public void admin_choose_kategori_modul_esai_free_text_staff() {
        modulpage.selectkategorimodul("STAFF");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul esai free text staff");
    }

    @And("Admin insert deskripsi soal esai free text staff")
    public void admin_insert_deskripsi_soal_esai_free_text_staff() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch $11 STAFF");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal esai free text staff");
    }

    @And("Admin choose status modul esai free text staff")
    public void admin_choose_status_modul_esai_free_text_staff() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul esai free text staff");
    }

    @And("Admin click button save modul esai free text staff")
    public void admin_click_button_save_esai_free_text_staff() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul esai free text staff");
    }

    @And("Admin choose and click button ok in form pemberitahuan esai free text staff")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_esai_free_text_staff() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan esai free text staff");
    }

    @Then("Admin click button ok in form pemberitahuan esai free text staff")
    public void admin_click_button_ok_in_form_pemberitahuan_esai_free_text_staff() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan esai free text staff");
    }

    //add modul enum (ya/tidak) leader

    @When("Admin click button add modul enum ya tidak leader")
    public void admin_click_button_add_modul_enum_ya_tidak_leader() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul enum (ya/tidak) leader");
    }

    @And("Admin insert nama modul enum ya tidak leader")
    public void admin_insert_nama_modul_enum_ya_tidak_leader() {
        modulpage.namamodul("Test SQA Batch 12 LEADER !");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul enum (ya/tidak) leader");
    }

    @And("Admin choose tipe modul enum ya tidak leader")
    public void admin_choose_tipe_modul_enum_ya_tidak_leader() {
        modulpage.selecttipemodul("ENUM (YA/TIDAK)");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul enum (ya/tidak) leader");
    }

    @And("Admin insert waktu pengerjaan enum ya tidak leader")
    public void admin_insert_waktu_pengerjaan_enum_ya_tidak_leader() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan enum (ya/tidak) leader");
    }

    @And("Admin insert jumlah soal enum ya tidak leader")
    public void admin_insert_jumlah_soal_enum_ya_tidak_leader() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal enum (ya/tidak) leader");
    }

    @And("Admin choose kategori modul enum ya tidak leader")
    public void admin_choose_kategori_modul_enum_ya_tidak_leader() {
        modulpage.selectkategorimodul("LEADER");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul enum (ya/tidak) leader");
    }

    @And("Admin insert deskripsi soal enum ya tidak leader")
    public void admin_insert_deskripsi_soal_enum_ya_tidak_leader() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch 12! Leader");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal enum (ya/tidak) leader");
    }

    @And("Admin choose status modul enum ya tidak leader")
    public void admin_choose_status_modul_enum_ya_tidak_leader() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul enum (ya/tidak) leader");
    }

    @And("Admin click button save modul enum ya tidak leader")
    public void admin_click_button_save_enum_ya_tidak_leader() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul enum (ya/tidak) leader");
    }

    @And("Admin choose and click button ok in form pemberitahuan enum ya tidak leader")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_enum_ya_tidak_leader() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan enum (ya/tidak) leader");
    }

    @Then("Admin click button ok in form pemberitahuan enum ya tidak leader")
    public void admin_click_button_ok_in_form_pemberitahuan_enum_ya_tidak_leader() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan enum (ya/tidak) leader");
    }

    //add modul enum (ya/tidak) staff

    @When("Admin click button add modul enum ya tidak staff")
    public void admin_click_button_add_modul_enum_ya_tidak_staff() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul enum (ya/tidak) staff");
    }

    @And("Admin insert nama modul enum ya tidak staff")
    public void admin_insert_nama_modul_enum_ya_tidak_staff() {
        modulpage.namamodul("Test SQA Batch 12 STAFF !");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul enum (ya/tidak) staff");
    }

    @And("Admin choose tipe modul enum ya tidak staff")
    public void admin_choose_tipe_modul_enum_ya_tidak_staff() {
        modulpage.selecttipemodul("ENUM (YA/TIDAK)");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul enum (ya/tidak) staff");
    }

    @And("Admin insert waktu pengerjaan enum ya tidak staff")
    public void admin_insert_waktu_pengerjaan_enum_ya_tidak_staff() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan enum (ya/tidak) staff");
    }

    @And("Admin insert jumlah soal enum ya tidak staff")
    public void admin_insert_jumlah_soal_enum_ya_tidak_staff() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal enum (ya/tidak) staff");
    }

    @And("Admin choose kategori modul enum ya tidak staff")
    public void admin_choose_kategori_modul_enum_ya_tidak_staff() {
        modulpage.selectkategorimodul("STAFF");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul enum (ya/tidak) staff");
    }

    @And("Admin insert deskripsi soal enum ya tidak staff")
    public void admin_insert_deskripsi_soal_enum_ya_tidak_staff() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch 12! Staff");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal enum (ya/tidak) staff");
    }

    @And("Admin choose status modul enum ya tidak staff")
    public void admin_choose_status_modul_enum_ya_tidak_staff() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul enum (ya/tidak) staff");
    }

    @And("Admin click button save modul enum ya tidak staff")
    public void admin_click_button_save_enum_ya_tidak_staff() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul enum (ya/tidak) staff");
    }

    @And("Admin choose and click button ok in form pemberitahuan enum ya tidak staff")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_enum_ya_tidak_staff() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan enum (ya/tidak) staff");
    }

    @Then("Admin click button ok in form pemberitahuan enum ya tidak staff")
    public void admin_click_button_ok_in_form_pemberitahuan_enum_ya_tidak_staff() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan enum (ya/tidak) staff");
    }

    //add modul esai length leader

    @When("Admin click button add modul esai length leader")
    public void admin_click_button_add_modul_esai_length_leader() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul esai length leader");
    }

    @And("Admin insert nama modul esai length leader")
    public void admin_insert_nama_modul_esai_length_leader() {
        modulpage.namamodul("Test SQA Batch 13 LEADER *");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul esai length leader");
    }

    @And("Admin choose tipe modul esai length leader")
    public void admin_choose_tipe_modul_esai_length_leader() {
        modulpage.selecttipemodul("ESAI LENGTH");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul esai length leader");
    }

    @And("Admin insert waktu pengerjaan esai length leader")
    public void admin_insert_waktu_pengerjaan_esai_length_leader() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan esai length leader");
    }

    @And("Admin insert jumlah soal esai length leader")
    public void admin_insert_jumlah_soal_esai_length_leader() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal esai length leader");
    }

    @And("Admin choose kategori modul esai length leader")
    public void admin_choose_kategori_modul_esai_length_leader() {
        modulpage.selectkategorimodul("LEADER");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul esai length leader");
    }

    @And("Admin insert deskripsi soal esai length leader")
    public void admin_insert_deskripsi_soal_esai_length_leader() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch 13* LEADER");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal esai length leader");
    }

    @And("Admin choose status modul esai length leader")
    public void admin_choose_status_modul_esai_length_leader() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul esai length leader");
    }

    @And("Admin click button save modul esai length leader")
    public void admin_click_button_save_esai_length_leader() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul esai length leader");
    }

    @And("Admin choose and click button ok in form pemberitahuan esai length leader")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_esai_length_leader() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan esai length leader");
    }

    @Then("Admin click button ok in form pemberitahuan esai length leader")
    public void admin_click_button_ok_in_form_pemberitahuan_esai_length_leader() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan esai length leader");
    }

    //add modul esai length staff

    @When("Admin click button add modul esai length staff")
    public void admin_click_button_add_modul_esai_length_staff() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul esai length staff");
    }

    @And("Admin insert nama modul esai length staff")
    public void admin_insert_nama_modul_esai_length_staff() {
        modulpage.namamodul("Test SQA Batch 13 STAFF *");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul esai length staff");
    }

    @And("Admin choose tipe modul esai length staff")
    public void admin_choose_tipe_modul_esai_length_staff() {
        modulpage.selecttipemodul("ESAI LENGTH");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul esai length staff");
    }

    @And("Admin insert waktu pengerjaan esai length staff")
    public void admin_insert_waktu_pengerjaan_esai_length_staff() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan esai length staff");
    }

    @And("Admin insert jumlah soal esai length staff")
    public void admin_insert_jumlah_soal_esai_length_staff() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal esai length staff");
    }

    @And("Admin choose kategori modul esai length staff")
    public void admin_choose_kategori_modul_esai_length_staff() {
        modulpage.selectkategorimodul("STAFF");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul esai length staff");
    }

    @And("Admin insert deskripsi soal esai length staff")
    public void admin_insert_deskripsi_soal_esai_length_staff() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch 13* STAFF");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal esai length staff");
    }

    @And("Admin choose status modul esai length staff")
    public void admin_choose_status_modul_esai_length_staff() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul esai length staff");
    }

    @And("Admin click button save modul esai length staff")
    public void admin_click_button_save_esai_length_staff() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul esai length staff");
    }

    @And("Admin choose and click button ok in form pemberitahuan esai length staff")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_esai_length_staff() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan esai length staff");
    }

    @Then("Admin click button ok in form pemberitahuan esai length staff")
    public void admin_click_button_ok_in_form_pemberitahuan_esai_length_staff() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan esai length staff");
    }

    //add modul pilihan a/b leader

    @When("Admin click button add modul pilihan a b leader")
    public void admin_click_button_add_modul_pilihan_a_b_leader() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul pilihan a b leader");
    }

    @And("Admin insert nama modul pilihan a b leader")
    public void admin_insert_nama_modul_pilihan_a_b_leader() {
        modulpage.namamodul("Test SQA Batch 14 LEADER @");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul pilihan a b leader");
    }

    @And("Admin choose tipe modul pilihan a b leader")
    public void admin_choose_tipe_modul_pilihan_a_b_leader() {
        modulpage.selecttipemodul("PILIHAN A/B");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul pilihan a b leader");
    }

    @And("Admin insert waktu pengerjaan pilihan a b leader")
    public void admin_insert_waktu_pengerjaan_pilihan_a_b_leader() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan pilihan a b leader");
    }

    @And("Admin insert jumlah soal pilihan a b leader")
    public void admin_insert_jumlah_soal_pilihan_a_b_leader() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal pilihan a b leader");
    }

    @And("Admin choose kategori modul pilihan a b leader")
    public void admin_choose_kategori_modul_pilihan_a_b_leader() {
        modulpage.selectkategorimodul("LEADER");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul pilihan a b leader");
    }

    @And("Admin insert deskripsi soal pilihan a b leader")
    public void admin_insert_deskripsi_soal_pilihan_a_b_leader() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch @14 LEADER");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal pilihan a b leader");
    }

    @And("Admin choose status modul pilihan a b leader")
    public void admin_choose_status_modul_pilihan_a_b_leader() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul pilihan a b leader");
    }

    @And("Admin click button save modul pilihan a b leader")
    public void admin_click_button_save_pilihan_a_b_leader() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul pilihan a b leader");
    }

    @And("Admin choose and click button ok in form pemberitahuan pilihan a b leader")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_pilihan_a_b_leader() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan pilihan a b leader");
    }

    @Then("Admin click button ok in form pemberitahuan pilihan a b leader")
    public void admin_click_button_ok_in_form_pemberitahuan_pilihan_a_b_leader() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan pilihan a b leader");
    }

    //add modul pilihan a/b staff

    @When("Admin click button add modul pilihan a b staff")
    public void admin_click_button_add_modul_pilihan_a_b_staff() {
        modulpage.clickaddmodul();
        extentTest.log(LogStatus.PASS, "Admin click button add modul pilihan a b staff");
    }

    @And("Admin insert nama modul pilihan a b staff")
    public void admin_insert_nama_modul_pilihan_a_b_staff() {
        modulpage.namamodul("Test SQA Batch 14 STAFF @");
        extentTest.log(LogStatus.PASS, "Admin insert nama modul pilihan a b staff");
    }

    @And("Admin choose tipe modul pilihan a b staff")
    public void admin_choose_tipe_modul_pilihan_a_b_staff() {
        modulpage.selecttipemodul("PILIHAN A/B");
        extentTest.log(LogStatus.PASS, "Admin choose tipe modul pilihan a b staff");
    }

    @And("Admin insert waktu pengerjaan pilihan a b staff")
    public void admin_insert_waktu_pengerjaan_pilihan_a_b_staff() {
        modulpage.waktupengerjaan(10);
        extentTest.log(LogStatus.PASS, "Admin insert waktu pengerjaan pilihan a b staff");
    }

    @And("Admin insert jumlah soal pilihan a b staff")
    public void admin_insert_jumlah_soal_pilihan_a_b_staff() {
        modulpage.jumlahsoal(2);
        extentTest.log(LogStatus.PASS, "Admin insert jumlah soal pilihan a b staff");
    }

    @And("Admin choose kategori modul pilihan a b staff")
    public void admin_choose_kategori_modul_pilihan_a_b_staff() {
        modulpage.selectkategorimodul("STAFF");
        extentTest.log(LogStatus.PASS, "Admin choose kategori modul pilihan a b staff");
    }

    @And("Admin insert deskripsi soal pilihan a b staff")
    public void admin_insert_deskripsi_soal_pilihan_a_b_staff() {
        modulpage.deskripsisingkat("Test SQA UNTUK Batch @14 STAFF");
        extentTest.log(LogStatus.PASS, "Admin insert deskripsi soal pilihan a b staff");
    }

    @And("Admin choose status modul pilihan a b staff")
    public void admin_choose_status_modul_pilihan_a_b_staff() {
        modulpage.selectstatusmodul("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin choose status modul pilihan a b staff");
    }

    @And("Admin click button save modul pilihan a b staff")
    public void admin_click_button_save_pilihan_a_b_staff() {
        modulpage.savemodul();
        extentTest.log(LogStatus.PASS, "Admin click button save modul pilihan a b staff");
    }

    @And("Admin choose and click button ok in form pemberitahuan pilihan a b staff")
    public void admin_choose_and_click_button_ok_in_form_pemberitahuan_pilihan_a_b_staff() {
        modulpage.saveinformationok();
        extentTest.log(LogStatus.PASS, "Admin choose and click button ok in form pemberitahuan pilihan a b staff");
    }

    @Then("Admin click button ok in form pemberitahuan pilihan a b staff")
    public void admin_click_button_ok_in_form_pemberitahuan_pilihan_a_b_staff() {
        modulpage.informationok();
        extentTest.log(LogStatus.PASS, "Admin click button ok in form pemberitahuan pilihan a b staff");
    }

    //search modul

    @When("Admin choose show page 25")
    public void admin_choose_show_page_25() {
        modulpage.selectshowpage("25");
        extentTest.log(LogStatus.PASS, "Admin choose show page 25");
    }

    @And("Admin search modul Test SQA Batch 10 Leader")
    public void admin_search_modul_test_sqa_batch_10() {
        modulpage.searchmodul("Test SQA Batch");
        extentTest.log(LogStatus.PASS, "Admin search modul Test SQA Batch 10");
    }

    @Then("Admin click button search modul Test SQA Batch 10 Leader")
    public void admin_click_button_search() {
        modulpage.buttonsearchmodul();
        extentTest.log(LogStatus.PASS, "Admin click button search modul Test SQA Batch 10");
    }

    //admin add soal pg leader
    @When("Admin click button form template soal")
    public void admin_click_button_form_template_soal() {
        modulpage.buttonaddtemplatesoalpgleader();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal");
    }

    @And("Admin insert soal PG no 1")
    public void admin_insert_soal_pg() {
        modulpage.insertsoal("sebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan atau belum?");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG");
    }

    @And("Admin insert jawaban PG A")
    public void admin_insert_jawaban_pg_a() {
        modulpage.insertjawabanpga("Software Testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG A");
    }
    @And("Admin insert jawaban PG B")
    public void admin_insert_jawaban_pg_b() {
        modulpage.insertjawabanpgb("Software Designer");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG B");
    }

    @And("Admin insert jawaban PG C")
    public void admin_insert_jawaban_pg_c() {
        modulpage.insertjawabanpgc("Software Engineer");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG C");
    }

    @And("Admin insert jawaban PG D")
    public void admin_insert_jawaban_pg_d() {
        modulpage.insertjawabanpgd("Software House");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG D");
    }

    @And("Admin insert jawaban PG E")
    public void admin_insert_jawaban_pg_e() {
        modulpage.insertjawabanpge("Software Dev?");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG E");
    }

    @And("Admin choose kunci jawaban PG")
    public void admin_choose_kunci_jawaban_pg() {
        modulpage.selectkuncijawabanpg("A");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban PG");
    }

    @And("Admin click button choose file")
    public void admin_click_button_choose_file() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file");
    }

    @And("Admin click button upload gambar")
    public void admin_click_button_upload_gambar() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button uplaod gambar");
    }

    @And("Admin click button cek")
    public void admin_click_button_cek() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek");
    }

    @And("Admin click button ADD")
    public void admin_click_button_add() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD");
    }

    @Then("Admin click button OK")
    public void admin_click_ok() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK");
    }

    //add soal pg leader tanpa gambar
    @When("Admin insert soal PG no 2")
    public void admin_insert_soal_pg_no_2() {
        modulpage.insertsoal("Berikut merupakan non functional testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG no 2");
    }

    @And("Admin insert jawaban PG A no 2")
    public void admin_insert_jawaban_pg_a_no_2() {
        modulpage.insertjawabanpga("Unit Testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG A no 2");
    }
    @And("Admin insert jawaban PG B no 2")
    public void admin_insert_jawaban_pg_b_no_2() {
        modulpage.insertjawabanpgb("Integration Testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG B no 2");
    }

    @And("Admin insert jawaban PG C no 2")
    public void admin_insert_jawaban_pg_c_no_2() {
        modulpage.insertjawabanpgc("Software Engineer");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG C no 2");
    }

    @And("Admin insert jawaban PG D no 2")
    public void admin_insert_jawaban_pg_d_no_2() {
        modulpage.insertjawabanpgd("System Testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG D no 2");
    }

    @And("Admin insert jawaban PG E no 2")
    public void admin_insert_jawaban_pg_e_no_2() {
        modulpage.insertjawabanpge("");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG E no 2");
    }

    @And("Admin choose kunci jawaban PG no 2")
    public void admin_choose_kunci_jawaban_pg_no_2() {
        modulpage.selectkuncijawabanpg("B");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban PG no 2");
    }

    @And("Admin click button ADD no 2")
    public void admin_click_button_add_no_2() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2");
    }

    @Then("Admin click button OK no 2")
    public void admin_click_ok_no_2() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2");
    }

    //Admin edit soal pg leader

    @When("Admin click button edit soal no 2")
    public void admin_click_ok_edit_soal_no_2() {
        modulpage.buttoneditsoal();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal no 2");
    }

    @And("Admin edit jawaban PG E no 2")
    public void admin_edit_jawaban_pg_e_no_2() {
        modulpage.editjawabanpge("Performance Testing");
        extentTest.log(LogStatus.PASS, "Admin edit jawaban PG E no 2");
    }

    @And("Admin edit pilihan kunci jawaban PG no 2")
    public void admin_edit_pilihan_kunci_jawaban_pg_no_2() {
        modulpage.selecteditkuncijawaban("E");
        extentTest.log(LogStatus.PASS, "Admin edit pilihan kunci jawaban PG no 2");
    }

    @And("Admin click button update soal no 2")
    public void admin_click_button_update_soal_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal no 2");
    }

    @And("Admin click close form pemberitahuan update soal no 2")
    public void admin_click_close_pemberitahuan_update_soal_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal no 2");
    }

    @Then("Admin click button close form soal")
    public void admin_click_button_close_form_soal() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal");
    }

    //admin add soal pg staff dengan gambar
    @When("Admin click button form template soal pg staff")
    public void admin_click_button_form_template_soal_pg_staff() {
        modulpage.buttonaddtemplatesoalpgstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal pg staff");
    }

    @And("Admin insert soal PG staff no 1")
    public void admin_insert_soal_pg_staff() {
        modulpage.insertsoal("sebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan atau belum?");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG staff no 1");
    }

    @And("Admin insert jawaban PG staff A")
    public void admin_insert_jawaban_pg_a_staff() {
        modulpage.insertjawabanpga("Software Testing");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban PG staff A");
    }
    @And("Admin insert jawaban PG staff B")
    public void admin_insert_jawaban_pg_b_staff() {
        modulpage.insertjawabanpgb("Software Designer");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban PG staff B");
    }

    @And("Admin insert jawaban PG staff C")
    public void admin_insert_jawaban_pg_c_staff() {
        modulpage.insertjawabanpgc("Software Engineer");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban PG staff C");
    }

    @And("Admin insert jawaban PG staff D")
    public void admin_insert_jawaban_pg_d_staff() {
        modulpage.insertjawabanpgd("Software House");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban PG staff D");
    }

    @And("Admin insert jawaban PG staff E")
    public void admin_insert_jawaban_pg_e_staff() {
        modulpage.insertjawabanpge("Software Dev?");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban PG staff E");
    }

    @And("Admin choose kunci jawaban PG staff")
    public void admin_choose_kunci_jawaban_pg_staff() {
        modulpage.selectkuncijawabanpg("A");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban PG staff");
    }

    @And("Admin click button choose file PG staff")
    public void admin_click_button_choose_file_staff() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file PG staff");
    }

    @And("Admin click button upload gambar PG staff")
    public void admin_click_button_upload_gambar_staff() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar PG staff");
    }

    @And("Admin click button cek PG staff")
    public void admin_click_button_cek_staff() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek PG staff");
    }

    @And("Admin click button ADD PG staff")
    public void admin_click_button_add_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD PG staff");
    }

    @Then("Admin click button OK PG staff")
    public void admin_click_ok_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK PG staff");
    }

    //add soal pg staff tanpa gambar
    @When("Admin insert soal PG staff no 2")
    public void admin_insert_soal_pg_staff_no_2() {
        modulpage.insertsoal("Berikut merupakan non functional testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG staff no 2");
    }

    @And("Admin insert jawaban PG staff A no 2")
    public void admin_insert_jawaban_pg_staff_a_no_2() {
        modulpage.insertjawabanpga("Unit Testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG staff A no 2");
    }
    @And("Admin insert jawaban PG staff B no 2")
    public void admin_insert_jawaban_pg_staff_b_no_2() {
        modulpage.insertjawabanpgb("Integration Testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG staff B no 2");
    }

    @And("Admin insert jawaban PG staff C no 2")
    public void admin_insert_jawaban_pg_staff_c_no_2() {
        modulpage.insertjawabanpgc("Software Engineer");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG staff C no 2");
    }

    @And("Admin insert jawaban PG staff D no 2")
    public void admin_insert_jawaban_pg_staff_d_no_2() {
        modulpage.insertjawabanpgd("System Testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG staff D no 2");
    }

    @And("Admin insert jawaban PG staff E no 2")
    public void admin_insert_jawaban_pg_staff_e_no_2() {
        modulpage.insertjawabanpge("");
        extentTest.log(LogStatus.PASS, "Admin insert soal PG staff E no 2");
    }

    @And("Admin choose kunci jawaban PG staff no 2")
    public void admin_choose_kunci_jawaban_pg_staff_no_2() {
        modulpage.selectkuncijawabanpg("B");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban PG staff no 2");
    }

    @And("Admin click button ADD no 2 PG staff")
    public void admin_click_button_add_no_2_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 PG staff");
    }

    @Then("Admin click button OK no 2 PG staff")
    public void admin_click_ok_no_2_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 PG staff");
    }

    //Admin edit soal pg staff

    @When("Admin click button edit soal pg staff no 2")
    public void admin_click_ok_edit_soal_pg_staff_no_2() {
        modulpage.buttoneditsoal();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal pg staff no 2");
    }

    @And("Admin edit jawaban PG staff E no 2")
    public void admin_edit_jawaban_pg_staff_e_no_2() {
        modulpage.editjawabanpge("Performance Testing");
        extentTest.log(LogStatus.PASS, "Admin edit jawaban PG staff E no 2");
    }

    @And("Admin edit pilihan kunci jawaban PG staff no 2")
    public void admin_edit_pilihan_kunci_jawaban_pg_staff_no_2() {
        modulpage.selecteditkuncijawaban("E");
        extentTest.log(LogStatus.PASS, "Admin edit pilihan kunci jawaban PG staff no 2");
    }

    @And("Admin click button update soal PG staff no 2")
    public void admin_click_button_update_soal_pg_staff_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal PG staff no 2");
    }

    @And("Admin click close form pemberitahuan update soal PG staff no 2")
    public void admin_click_close_pemberitahuan_update_soal_pg_staff_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal PG staff no 2");
    }

    @Then("Admin click button close form soal PG staff")
    public void admin_click_button_close_form_soal_pg_staff() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal PG staff");
    }


    // add soal esai free text leader dengan gambar

    @When("Admin click button form template soal esai free text leader")
    public void admin_click_button_form_template_soal_esai_free_text_leader() {
        modulpage.buttonaddtemplatesoalesaifreetextleader();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal esai free text leader");
    }

    @And("Admin insert soal esai free text leader no 1")
    public void admin_insert_soal_esai_free_text_leader() {
        modulpage.insertsoal("sebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan atau belum?");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai free text leader no 1");
    }


    @And("Admin click button choose file esai free text leader")
    public void admin_click_button_choose_file_esai_free_text_leader() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file esai free text leader");
    }

    @And("Admin click button upload gambar esai free text leader")
    public void admin_click_button_upload_gambar_esai_free_text_leader() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar esai free text leader");
    }

    @And("Admin click button cek esai free text leader")
    public void admin_click_button_cek_esai_free_text_leader() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek esai free text leader");
    }

    @And("Admin click button ADD esai free text leader")
    public void admin_click_button_add_esai_free_text_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD esai free text leader");
    }

    @Then("Admin click button OK esai free text leader")
    public void admin_click_ok_esai_free_text_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK esai free text leader");
    }

    //add soal esai free text leader tanpa gambar
    @When("Admin insert soal esai free text leader no 2")
    public void admin_insert_soal_esai_free_text_leader_no_2() {
        modulpage.insertsoal("yang merupakan non functional testing adalah");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai free text leader no 2");
    }

    @And("Admin click button ADD no 2 esai free text leader")
    public void admin_click_button_add_no_2_esai_free_text_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 esai free text leader");
    }

    @Then("Admin click button OK no 2 esai free text leader")
    public void admin_click_ok_no_2_esai_free_text_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 esai free text leader");
    }

    //Admin edit soal esai free text leader tanpa gambar

    @When("Admin click button edit soal esai free text leader no 2")
    public void admin_click_ok_edit_soal_esai_free_text_leader_no_2() {
        modulpage.buttoneditsoal();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal esai free text leader no 2");
    }

    @And("Admin edit soal esai free text leader no 2 clear")
    public void admin_edit_jawaban_esai_free_text_leader_e_no_2_clear() {
        modulpage.editsoalclear();
        extentTest.log(LogStatus.PASS, "Admin edit soal esai free text leader no 2 clear");
    }

    @And("Admin edit soal esai free text leader no 2")
    public void admin_edit_jawaban_esai_free_text_leader_e_no_2() {
        modulpage.editsoal("Seorang QA Tester diberikan akses bisa melihat code dari aplikasi, pengujian ini dinamakan");
        extentTest.log(LogStatus.PASS, "Admin edit soal esai free text leader no 2");
    }

    @And("Admin click button update soal esai free text leader no 2")
    public void admin_click_button_update_soal_esai_free_text_leader_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal esai free text leader no 2");
    }

    @And("Admin click close form pemberitahuan update soal esai free text leader no 2")
    public void admin_click_close_pemberitahuan_update_soal_esai_free_text_leader_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal esai free text leader no 2");
    }

    @Then("Admin click button close form soal esai free text leader")
    public void admin_click_button_close_form_soal_esai_free_text_leader() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal esai free text leader");
    }

    //admin add soal esai free text staff dengan gambar

    @When("Admin click button form template soal esai free text staff")
    public void admin_click_button_form_template_soal_esai_free_text_staff() {
        modulpage.buttonaddtemplatesoalesaifreetextstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal esai free text staff");
    }

    @And("Admin insert soal esai free text staff no 1")
    public void admin_insert_soal_esai_free_text_staff() {
        modulpage.insertsoal("sebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan atau belum?");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai free text staff no 1");
    }


    @And("Admin click button choose file esai free text staff")
    public void admin_click_button_choose_file_esai_free_text_staff() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file esai free text staff");
    }

    @And("Admin click button upload gambar esai free text staff")
    public void admin_click_button_upload_gambar_esai_free_text_staff() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar esai free text staff");
    }

    @And("Admin click button cek esai free text staff")
    public void admin_click_button_cek_esai_free_text_staff() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek esai free text staff");
    }

    @And("Admin click button ADD esai free text staff")
    public void admin_click_button_add_esai_free_text_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD esai free text staff");
    }

    @Then("Admin click button OK esai free text staff")
    public void admin_click_ok_esai_free_text_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK esai free text staff");
    }

    //add soal esai free text staff tanpa gambar
    @When("Admin insert soal esai free text staff no 2")
    public void admin_insert_soal_esai_free_text_staff_no_2() {
        modulpage.insertsoal("yang merupakan non functional testing adalah");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai free text staff no 2");
    }

    @And("Admin click button ADD no 2 esai free text staff")
    public void admin_click_button_add_no_2_esai_free_text_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 esai free text staff");
    }

    @Then("Admin click button OK no 2 esai free text staff")
    public void admin_click_ok_no_2_esai_free_text_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 esai free text staff");
    }

    //Admin edit soal esai free text staff

    @When("Admin click button edit soal esai free text staff no 2")
    public void admin_click_ok_edit_soal_esai_free_text_staff_no_2() {
        modulpage.buttoneditsoal();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal pg staff no 2");
    }

    @And("Admin edit soal esai free text staff no 2 clear")
    public void admin_edit_jawaban_esai_free_text_staff_e_no_2_clear() {
        modulpage.editsoalclear();
        extentTest.log(LogStatus.PASS, "Admin edit soal esai free text staff no 2 clear");
    }

    @And("Admin edit soal esai free text staff no 2")
    public void admin_edit_jawaban_esai_free_text_staff_e_no_2() {
        modulpage.editsoal("Proses mengidentifikasi dan menghapus bug atau error di dalam kode adalah");
        extentTest.log(LogStatus.PASS, "Admin edit soal esai free text staff no 2");
    }

    @And("Admin click button update soal esai free text staff no 2")
    public void admin_click_button_update_soal_esai_free_text_staff_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal esai free text staff no 2");
    }

    @And("Admin click close form pemberitahuan update soal esai free text staff no 2")
    public void admin_click_close_pemberitahuan_update_soal_esai_free_text_staff_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal esai free text staff no 2");
    }

    @Then("Admin click button close form soal esai free text staff")
    public void admin_click_button_close_form_soal_esai_free_text_staff() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal esai free text staff");
    }


    // admin add soal enum ya/tidak dengan gambar leader

    @When("Admin click button form template soal enum ya tidak leader")
    public void admin_click_button_form_template_soal_enum_ya_tidak() {
        modulpage.buttonaddtemplatesoalenumyatidakleader();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal enum(ya/tidak) leader");
    }

    @And("Admin insert soal enum ya tidak leader no 1")
    public void admin_insert_soal_enum_ya_tidak_leader_no_1() {
        modulpage.insertsoal("Jawa merupakan bahasa pemograman");
        extentTest.log(LogStatus.PASS, "Admin insert soal enum (ya/tidak) leader no 1");
    }

    @And("Admin choose kunci jawaban enum ya tidak leader")
    public void admin_choose_kunci_jawaban_enum_ya_tidak_leader() {
        modulpage.selectkuncijawabanenum("Tidak");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban enum (ya/tidak) leader");
    }

    @And("Admin click button choose file enum ya tidak leader")
    public void admin_click_button_choose_file_enum_ya_tidak_leader() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file enum (ya/tidak) leader");
    }

    @And("Admin click button upload gambar enum ya tidak leader")
    public void admin_click_button_upload_gambar_enum_ya_tidak_leader() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar enum (ya/tidak) leader");
    }

    @And("Admin click button cek enum ya tidak leader")
    public void admin_click_button_cek_enum_ya_tidak_leader() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek enum (ya/tidak) leader");
    }

    @And("Admin click button ADD enum ya tidak leader")
    public void admin_click_button_add_enum_ya_tidak_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD enum (ya/tidak) leader");
    }

    @Then("Admin click button OK enum ya tidak leader")
    public void admin_click_ok_enum_ya_tidak_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK enum (ya/tidak) leader");
    }

    // admin add soal enum ya/tidak tanpa gambar leader

    @When("Admin insert soal enum ya tidak leader no 2")
    public void admin_insert_soal_enum_ya_tidak_leader_no_2() {
        modulpage.insertsoal("HTML merupakan bahasa pemograman");
        extentTest.log(LogStatus.PASS, "Admin insert soal enum (ya/tidak) leader no 2");
    }

    @And("Admin choose kunci jawaban enum ya tidak leader no 2")
    public void admin_choose_kunci_jawaban_enum_ya_tidak_leader_no_2() {
        modulpage.selectkuncijawabanenum("Ya");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban enum (ya/tidak) leader no 2");
    }

    @And("Admin click button ADD no 2 enum ya tidak leader")
    public void admin_click_button_add_no_2_enum_ya_tidak_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 enum (ya/tidak) leader");
    }

    @Then("Admin click button OK no 2 enum ya tidak leader")
    public void admin_click_ok_no_2_enum_ya_tidak_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 enum (ya/tidak) leader");
    }

    // admin edit soal enum (ya/tidak) leader

    @When("Admin click button edit soal enum ya tidak leader no 2")
    public void admin_click_ok_edit_soal_enum_ya_tidak_leader_no_2() {
        modulpage.buttoneditsoalone();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal enum (ya/tidak) leader no 2");
    }

    @And("Admin edit pilihan kunci jawaban enum ya tidak leader no 2")
    public void admin_edit_pilihan_kunci_jawaban_enum_ya_tidak_leader_no_2() {
        modulpage.selectkuncijawabanenumedit("Tidak");
        extentTest.log(LogStatus.PASS, "Admin edit pilihan kunci jawaban enum (ya/tidak) leader no 2");
    }

    @And("Admin click button update soal enum ya tidak leader no 2")
    public void admin_click_button_update_soal_enum_ya_tidak_leader_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal enum (ya/tidak) leader no 2");
    }

    @And("Admin click close form pemberitahuan update soal enum ya tidak leader no 2")
    public void admin_click_close_pemberitahuan_update_soal_enum_ya_tidak_leader_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal enum (ya/tidak) leader no 2");
    }

    @Then("Admin click button close form soal enum ya tidak leader")
    public void admin_click_button_close_form_soal_enum_ya_tidak_leader() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal enum (ya/tidak) leader");
    }

    // admin add soal enum (ya/tidak) staff dengan gambar

    @When("Admin click button form template soal enum ya tidak staff")
    public void admin_click_button_form_template_soal_enum_ya_tidak_staff() {
        modulpage.buttonaddtemplatesoalenumyatidakstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal enum(ya/tidak) staff");
    }

    @And("Admin insert soal enum ya tidak staff no 1")
    public void admin_insert_soal_enum_ya_tidak_staff_no_1() {
        modulpage.insertsoal("HTML merupakan bahasa pemograman");
        extentTest.log(LogStatus.PASS, "Admin insert soal enum (ya/tidak) staff no 1");
    }

    @And("Admin choose kunci jawaban enum ya tidak staff")
    public void admin_choose_kunci_jawaban_enum_ya_tidak_staff() {
        modulpage.selectkuncijawabanenum("Tidak");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban enum (ya/tidak) staff");
    }

    @And("Admin click button choose file enum ya tidak staff")
    public void admin_click_button_choose_file_enum_ya_tidak_staff() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file enum (ya/tidak) staff");
    }

    @And("Admin click button upload gambar enum ya tidak staff")
    public void admin_click_button_upload_gambar_enum_ya_tidak_staff() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar enum (ya/tidak) staff");
    }

    @And("Admin click button cek enum ya tidak staff")
    public void admin_click_button_cek_enum_ya_tidak_staff() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek enum (ya/tidak) staff");
    }

    @And("Admin click button ADD enum ya tidak staff")
    public void admin_click_button_add_enum_ya_tidak_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD enum (ya/tidak) staff");
    }

    @Then("Admin click button OK enum ya tidak staff")
    public void admin_click_ok_enum_ya_tidak_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK enum (ya/tidak) staff");
    }

    // admin add soal enum (ya/tidak) staff tanpa gambar

    @When("Admin insert soal enum ya tidak staff no 2")
    public void admin_insert_soal_enum_ya_tidak_staff_no_2() {
        modulpage.insertsoal("PerformanceTesting merupakan non functional");
        extentTest.log(LogStatus.PASS, "Admin insert soal enum (ya/tidak) staff no 2");
    }

    @And("Admin choose kunci jawaban enum ya tidak staff no 2")
    public void admin_choose_kunci_jawaban_enum_ya_tidak_staff_no_2() {
        modulpage.selectkuncijawabanenum("Tidak");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban enum (ya/tidak) staff no 2");
    }

    @And("Admin click button ADD no 2 enum ya tidak staff")
    public void admin_click_button_add_no_2_enum_ya_tidak_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 enum (ya/tidak) staff");
    }

    @Then("Admin click button OK no 2 enum ya tidak staff")
    public void admin_click_ok_no_2_enum_ya_tidak_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 enum (ya/tidak) staff");
    }

    // admin edit soal enum (ya/tidak) staff

    @When("Admin click button edit soal enum ya tidak staff no 2")
    public void admin_click_ok_edit_soal_enum_ya_tidak_staff_no_2() {
        modulpage.buttoneditsoal();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal enum (ya/tidak) staff no 2");
    }

    @And("Admin edit pilihan kunci jawaban enum ya tidak staff no 2")
    public void admin_edit_pilihan_kunci_jawaban_enum_ya_tidak_staff_no_2() {
        modulpage.selectkuncijawabanenumedit("Ya");
        extentTest.log(LogStatus.PASS, "Admin edit pilihan kunci jawaban enum (ya/tidak) staff no 2");
    }

    @And("Admin click button update soal enum ya tidak staff no 2")
    public void admin_click_button_update_soal_enum_ya_tidak_staff_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal enum (ya/tidak) staff no 2");
    }

    @And("Admin click close form pemberitahuan update soal enum ya tidak staff no 2")
    public void admin_click_close_pemberitahuan_update_soal_enum_ya_tidak_staff_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal enum (ya/tidak) staff no 2");
    }

    @Then("Admin click button close form soal enum ya tidak staff")
    public void admin_click_button_close_form_soal_enum_ya_tidak_staff() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal enum (ya/tidak) staff");
    }


    // admin add soal ESAI LENGTH Leader dengan gambar

    @When("Admin click button form template soal esai length leader")
    public void admin_click_button_form_template_soal_esai_length_leader() {
        modulpage.buttonaddtemplatesoalesailengthleader();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal esai length leader");
    }

    @And("Admin insert soal esai length leader no 1")
    public void admin_insert_soal_esai_length_leader() {
        modulpage.insertsoal("sebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan atau belum?");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai length leader no 1");
    }

    @And("Admin choose maks score esai length leader")
    public void admin_choose_maks_score_esai_length_leader() {
        modulpage.selectmaksscore("10");
        extentTest.log(LogStatus.PASS, "Admin choose maks score esai length leader");
    }

    @And("Admin click button choose file esai length leader")
    public void admin_click_button_choose_file_esai_length_leader() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file esai length leader");
    }

    @And("Admin click button upload gambar esai length leader")
    public void admin_click_button_upload_gambar_esai_length_leader() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar esai length leader");
    }

    @And("Admin click button cek esai length leader")
    public void admin_click_button_cek_esai_length_leader() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek esai length leader");
    }

    @And("Admin click button ADD esai length leader")
    public void admin_click_button_add_esai_length_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD esai length leader");
    }

    @Then("Admin click button OK esai length leader")
    public void admin_click_ok_esai_length_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK esai length leader");
    }

    //add soal esai length leader tanpa gambar
    @When("Admin insert soal esai length leader no 2")
    public void admin_insert_soal_esai_length_leader_no_2() {
        modulpage.insertsoal("yang merupakan non functional testing adalah");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai free text length no 2");
    }

    @And("Admin choose maks score esai length leader no 2")
    public void admin_choose_maks_score_esai_length_leader_no_2() {
        modulpage.selectmaksscore("7");
        extentTest.log(LogStatus.PASS, "Admin choose maks score esai length leader no 2");
    }

    @And("Admin click button ADD no 2 esai length leader")
    public void admin_click_button_add_no_2_esai_length_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 esai length leader");
    }

    @Then("Admin click button OK no 2 esai length leader")
    public void admin_click_ok_no_2_esai_length_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 esai length leader");
    }

    //Admin edit soal esai length leader

    @When("Admin click button edit soal esai length leader no 2")
    public void admin_click_ok_edit_soal_esai_length_leader_no_2() {
        modulpage.buttoneditsoal();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal esai length leader no 2");
    }

    @And("Admin edit soal esai length leader no 2 clear")
    public void admin_edit_jawaban_esai_length_leader_no_2_clear() {
        modulpage.editsoalclear();
        extentTest.log(LogStatus.PASS, "Admin edit soal esai length leader no 2 clear");
    }

    @And("Admin edit soal esai length leader no 2")
    public void admin_edit_jawaban_esai_length_leader_e_no_2() {
        modulpage.editsoal("Seorang QA Tester diberikan akses bisa melihat code dari aplikasi, pengujian ini dinamakan");
        extentTest.log(LogStatus.PASS, "Admin edit soal esai length leader no 2");
    }


    @And("Admin edit maks score esai length no 2")
    public void admin_edit_maks_score_esai_length_no_2() {
        modulpage.selecteditmaksscore("5");
        extentTest.log(LogStatus.PASS, "Admin edit maks score esai length no 2");
    }


    @And("Admin click button update soal esai length leader no 2")
    public void admin_click_button_update_soal_esai_length_leader_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal esai length leader no 2");
    }

    @And("Admin click close form pemberitahuan update soal esai length leader no 2")
    public void admin_click_close_pemberitahuan_update_soal_esai_length_leader_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal esai length leader no 2");
    }

    @Then("Admin click button close form soal esai length leader")
    public void admin_click_button_close_form_soal_esai_length_leader() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal esai length leader");
    }


    // admin add soal esai length staff dengan gambar

    @When("Admin click button form template soal esai length staff")
    public void admin_click_button_form_template_soal_esai_length_staff() {
        modulpage.buttonaddtemplatesoalesailengthstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal esai length staff");
    }

    @And("Admin insert soal esai length staff no 1")
    public void admin_insert_soal_esai_length_staff() {
        modulpage.insertsoal("sebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan atau belum?");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai length staff no 1");
    }

    @And("Admin choose maks score esai length staff")
    public void admin_choose_maks_score_esai_length_staff() {
        modulpage.selectmaksscore("10");
        extentTest.log(LogStatus.PASS, "Admin choose maks score esai length staff");
    }

    @And("Admin click button choose file esai length staff")
    public void admin_click_button_choose_file_esai_length_staff() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file esai length staff");
    }

    @And("Admin click button upload gambar esai length staff")
    public void admin_click_button_upload_gambar_esai_length_staff() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar esai length leader");
    }

    @And("Admin click button cek esai length staff")
    public void admin_click_button_cek_esai_length_staff() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek esai length staff");
    }

    @And("Admin click button ADD esai length staff")
    public void admin_click_button_add_esai_length_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD esai length staff");
    }

    @Then("Admin click button OK esai length staff")
    public void admin_click_ok_esai_length_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK esai length staff");
    }

    //add soal esai length staff tanpa gambar
    @When("Admin insert soal esai length staff no 2")
    public void admin_insert_soal_esai_length_staff_no_2() {
        modulpage.insertsoal("yang merupakan non functional testing adalah");
        extentTest.log(LogStatus.PASS, "Admin insert soal esai free text length staff no 2");
    }

    @And("Admin choose maks score esai staff staff no 2")
    public void admin_choose_maks_score_esai_length_staff_no_2() {
        modulpage.selectmaksscore("7");
        extentTest.log(LogStatus.PASS, "Admin choose maks score esai length staff no 2");
    }

    @And("Admin click button ADD no 2 esai length staff")
    public void admin_click_button_add_no_2_esai_length_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 esai length staff");
    }

    @Then("Admin click button OK no 2 esai length staff")
    public void admin_click_ok_no_2_esai_length_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 esai length staff");
    }

    //Admin edit soal esai length leader

    @When("Admin click button edit soal esai length staff no 2")
    public void admin_click_ok_edit_soal_esai_length_staff_no_2() {
        modulpage.buttoneditsoal();
        extentTest.log(LogStatus.PASS, "Admin click button edit soal esai length staff no 2");
    }

    @And("Admin edit soal esai length staff no 2 clear")
    public void admin_edit_jawaban_esai_length_staff_no_2_clear() {
        modulpage.editsoalclear();
        extentTest.log(LogStatus.PASS, "Admin edit soal esai length staff no 2 clear");
    }

    @And("Admin edit soal esai length staff no 2")
    public void admin_edit_jawaban_esai_length_staff_e_no_2() {
        modulpage.editsoal("Seorang QA Tester diberikan akses bisa melihat code dari aplikasi, pengujian ini dinamakan");
        extentTest.log(LogStatus.PASS, "Admin edit soal esai length staff no 2");
    }


    @And("Admin edit maks score esai length staff no 2")
    public void admin_edit_maks_score_esai_length_staff_no_2() {
        modulpage.selecteditmaksscore("5");
        extentTest.log(LogStatus.PASS, "Admin edit maks score esai length staff no 2");
    }


    @And("Admin click button update soal esai length staff no 2")
    public void admin_click_button_update_soal_esai_length_staff_no_2() {
        modulpage.buttonupdatesoal();
        extentTest.log(LogStatus.PASS, "Admin click button update soal esai length staff no 2");
    }

    @And("Admin click close form pemberitahuan update soal esai length staff no 2")
    public void admin_click_close_pemberitahuan_update_soal_esai_length_staff_no_2() {
        modulpage.buttoncloseeditformsoal();
        extentTest.log(LogStatus.PASS, "Admin click close form pemberitahuan update soal esai length staff no 2");
    }

    @Then("Admin click button close form soal esai length staff")
    public void admin_click_button_close_form_soal_esai_staff_leader() {
        modulpage.buttoncloseformsoal();
        extentTest.log(LogStatus.PASS, "Admin click button close form soal esai length staff");
    }

    // admin add soal pilihan a/b leader dengan gambar

    @When("Admin click button form template soal Pilihan A B leader")
    public void admin_click_button_form_template_pilihan_a_b_leader() {
        modulpage.buttonaddtemplatesoalpilihanableader();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal Pilihan A B leader");
    }

    @And("Admin insert soal Pilihan A B leader no 1")
    public void admin_insert_soal_pilihan_a_b_leader() {
        modulpage.insertsoal("Softsebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan");
        extentTest.log(LogStatus.PASS, "Admin insert soal Pilihan A B leader no 1");
    }

    @And("Admin insert jawaban Pilihan A B leader A")
    public void admin_insert_jawaban_a_pilihan_a_b_leader() {
        modulpage.insertjawabanpga("Software Testing");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban Pilihan A B leader A");
    }
    @And("Admin insert jawaban Pilihan A B leader B")
    public void admin_insert_jawaban_b_pilihan_a_b_leader() {
        modulpage.insertjawabanpgb("Software Designer");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban Pilihan A B leader B");
    }

    @And("Admin choose kunci jawaban Pilihan A B leader")
    public void admin_choose_kunci_jawaban_pilihan_a_b_leader() {
        modulpage.selectkuncijawabanpg("A");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban Pilihan A B leader");
    }

    @And("Admin click button choose file Pilihan A B leader")
    public void admin_click_button_choose_file_pilihan_a_b_leader() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file Pilihan A B leader");
    }

    @And("Admin click button upload gambar Pilihan A B leader")
    public void admin_click_button_upload_gambar_pilihan_a_b_leader() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar Pilihan A B leader");
    }

    @And("Admin click button cek Pilihan A B leader")
    public void admin_click_button_cek_pilihan_a_b_leader() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek Pilihan A B leader");
    }

    @And("Admin click button ADD Pilihan A B leader")
    public void admin_click_button_add_pilihan_a_b_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD Pilihan A B leader");
    }

    @Then("Admin click button OK Pilihan A B leader")
    public void admin_click_ok_pilihan_a_b_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK Pilihan A B leader");
    }

    //add soal Pilihan A B leader tanpa gambar
    @When("Admin insert soal Pilihan A B leader no 2")
    public void admin_insert_soal_pilihan_a_b_leader_no_2() {
        modulpage.insertsoal("Berikut merupakan non functional testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal Pilihan A B leader no 2");
    }

    @And("Admin insert jawaban A Pilihan A B leader no 2")
    public void admin_insert_jawaban_a_pilihan_a_b_leader_no_2() {
        modulpage.insertjawabanpga("Unit Testing");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban A Pilihan A B leader no 2");
    }
    @And("Admin insert jawaban B Pilihan A B leader no 2")
    public void admin_insert_jawaban_b_pilihan_a_b_leader_no_2() {
        modulpage.insertjawabanpgb("Integration Testing");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban B Pilihan A B leader no 2");
    }

    @And("Admin choose kunci jawaban Pilihan A B leader no 2")
    public void admin_choose_kunci_jawaban_pilihan_a_b_leader_no_2() {
        modulpage.selectkuncijawabanpg("B");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban Pilihan A B leader no 2");
    }

    @And("Admin click button ADD no 2 Pilihan A B leader")
    public void admin_click_button_add_no_2_pilihan_a_b_leader() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 Pilihan A B leader");
    }

    @Then("Admin click button OK no 2 Pilihan A B leader")
    public void admin_click_ok_no_2_pilihan_a_b_leader() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 Pilihan A B leader");
    }

    //

    // Admin add soal Pilihan (A/B) STAFF dengan gambar

    @When("Admin click button form template soal Pilihan A B staff")
    public void admin_click_button_form_template_pilihan_a_b_staff() {
        modulpage.buttonaddtemplatesoalpilihanabstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form template soal Pilihan A B staff");
    }

    @And("Admin insert soal Pilihan A B staff no 1")
    public void admin_insert_soal_pilihan_a_b_staff() {
        modulpage.insertsoal("Softsebuah metode yang dijalankan perusahaan untuk memeriksa apakah aplikasi sudah sesuai dengan persyaratan yang diharapkan");
        extentTest.log(LogStatus.PASS, "Admin insert soal Pilihan A B staff no 1");
    }

    @And("Admin insert jawaban Pilihan A B staff A")
    public void admin_insert_jawaban_a_pilihan_a_b_staff() {
        modulpage.insertjawabanpga("Software Testing");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban Pilihan A B staff A");
    }
    @And("Admin insert jawaban Pilihan A B staff B")
    public void admin_insert_jawaban_b_pilihan_a_b_staff() {
        modulpage.insertjawabanpgb("Software Designer");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban Pilihan A B staff B");
    }

    @And("Admin choose kunci jawaban Pilihan A B staff")
    public void admin_choose_kunci_jawaban_pilihan_a_b_staff() {
        modulpage.selectkuncijawabanpg("A");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban Pilihan A B staff");
    }

    @And("Admin click button choose file Pilihan A B staff")
    public void admin_click_button_choose_file_pilihan_a_b_staff() {
        modulpage.buttonchoosefile();
        extentTest.log(LogStatus.PASS, "Admin click button choose file Pilihan A B staff");
    }

    @And("Admin click button upload gambar Pilihan A B staff")
    public void admin_click_button_upload_gambar_pilihan_a_b_staff() {
        modulpage.buttonuploadgambar();
        extentTest.log(LogStatus.PASS, "Admin click button upload gambar Pilihan A B staff");
    }

    @And("Admin click button cek Pilihan A B staff")
    public void admin_click_button_cek_pilihan_a_b_staff() {
        modulpage.buttoncekgambar();
        extentTest.log(LogStatus.PASS, "Admin click button cek Pilihan A B staff");
    }

    @And("Admin click button ADD Pilihan A B staff")
    public void admin_click_button_add_pilihan_a_b_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD Pilihan A B staff");
    }

    @Then("Admin click button OK Pilihan A B staff")
    public void admin_click_ok_pilihan_a_b_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK Pilihan A B staff");
    }

    //add soal Pilihan A B leader tanpa gambar
    @When("Admin insert soal Pilihan A B staff no 2")
    public void admin_insert_soal_pilihan_a_b_staff_no_2() {
        modulpage.insertsoal("Berikut merupakan non functional testing");
        extentTest.log(LogStatus.PASS, "Admin insert soal Pilihan A B staff no 2");
    }

    @And("Admin insert jawaban A Pilihan A B staff no 2")
    public void admin_insert_jawaban_a_pilihan_a_b_staff_no_2() {
        modulpage.insertjawabanpga("Unit Testing");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban A Pilihan A B staff no 2");
    }
    @And("Admin insert jawaban B Pilihan A B staff no 2")
    public void admin_insert_jawaban_b_pilihan_a_b_staff_no_2() {
        modulpage.insertjawabanpgb("Integration Testing");
        extentTest.log(LogStatus.PASS, "Admin insert jawaban B Pilihan A B staff no 2");
    }

    @And("Admin choose kunci jawaban Pilihan A B staff no 2")
    public void admin_choose_kunci_jawaban_pilihan_a_b_staff_no_2() {
        modulpage.selectkuncijawabanpg("B");
        extentTest.log(LogStatus.PASS, "Admin choose kunci jawaban Pilihan A B staff no 2");
    }

    @And("Admin click button ADD no 2 Pilihan A B staff")
    public void admin_click_button_add_no_2_pilihan_a_b_staff() {
        modulpage.buttonaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button ADD no 2 Pilihan A B staff");
    }

    @Then("Admin click button OK no 2 Pilihan A B staff")
    public void admin_click_ok_no_2_pilihan_a_b_staff() {
        modulpage.buttonokaddsoal();
        extentTest.log(LogStatus.PASS, "Admin click button OK no 2 Pilihan A B staff");
    }

    //

    // admin add deskripsi dan ketentuan modul PG Leader

    @When("Admin click button form add deskripsi dan ketentuan modul PG leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_pg_leader() {
        modulpage.buttonadddeskripsidanketentuanmodulpgleader();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul PG Leader");
    }

    @And("Admin edit Deskripsi Modul PG leader")
    public void admin_edit_deskripsi_modul_pg_leader() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 10 leader");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul PG Leader");
    }

    @And("Admin edit Ketentuan Soal PG leader")
    public void admin_ketentuan_soal_modul_pg_leader() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal PG Leader");
    }

    @And("Admin click button ADD deskripsi dan ketentuan pg leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_pg_leader() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan pg leader");
    }

    @Then("Admin click button close form deskripsi dan ketentuan pg leader")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_pg_leader() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan pg leader");
    }


    // admin add deskripsi dan ketentuan pg staff

    @When("Admin click button form add deskripsi dan ketentuan modul PG staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_pg_staff() {
        modulpage.buttonadddeskripsidanketentuanmodulpgstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul PG staff");
    }

    @And("Admin edit Deskripsi Modul PG staff")
    public void admin_edit_deskripsi_modul_pg_staff() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 10 staff");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul PG staff");
    }

    @And("Admin edit Ketentuan Soal PG staff")
    public void admin_ketentuan_soal_modul_pg_staff() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal PG staff");
    }

    @And("Admin click button ADD deskripsi dan ketentuan pg staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_pg_staff() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan pg staff");
    }

    @Then("Admin click button close form deskripsi dan ketentuan pg staff")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_pg_staff() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan pg staff");
    }

    // admin add deskripsi dan ketentuan esai free text leader

    @When("Admin click button form add deskripsi dan ketentuan modul esai free text leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_esai_free_text_leader() {
        modulpage.buttonadddeskripsidanketentuanmodulesaifreetextleader();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul esai free text leader");
    }

    @And("Admin edit Deskripsi Modul esai free text leader")
    public void admin_edit_deskripsi_modul_esai_free_text_leader() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 11 leader");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul esai free text leader");
    }

    @And("Admin edit Ketentuan Soal esai free text leader")
    public void admin_ketentuan_soal_modul_esai_free_text_leader() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal esai free text leader");
    }

    @And("Admin click button ADD deskripsi dan ketentuan esai free text leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_esai_free_text_leader() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan esai free text leader");
    }

    @Then("Admin click button close form deskripsi dan ketentuan esai free text leader")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_esai_free_text_leader() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan esai free text leader");
    }

    // admin add deskripsi dan ketentuan esai free text staff

    @When("Admin click button form add deskripsi dan ketentuan modul esai free text staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_esai_free_text_staff() {
        modulpage.buttonadddeskripsidanketentuanmodulesaifreetextstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul esai free text staff");
    }

    @And("Admin edit Deskripsi Modul esai free text staff")
    public void admin_edit_deskripsi_modul_esai_free_text_staff() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 11 staff");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul esai free text staff");
    }

    @And("Admin edit Ketentuan Soal esai free text staff")
    public void admin_ketentuan_soal_modul_esai_free_text_staff() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal esai free text staff");
    }

    @And("Admin click button ADD deskripsi dan ketentuan esai free text staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_esai_free_text_staff() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan esai free text staff");
    }

    @Then("Admin click button close form deskripsi dan ketentuan esai free text staff")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_esai_free_text_staff() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan esai free text staff");
    }


    //admin add deskripsi dan ketentuan enum (ya/tidak) leader

    @When("Admin click button form add deskripsi dan ketentuan modul enum ya tidak leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_enum_ya_tidak_leader() {
        modulpage.buttonadddeskripsidanketentuanmodulenumyatidakleader();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul enum ya tidak leader");
    }

    @And("Admin edit Deskripsi Modul enum ya tidak leader")
    public void admin_edit_deskripsi_modul_enum_ya_tidak_leader() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 12 leader");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul enum ya tidak leader");
    }

    @And("Admin edit Ketentuan Soal enum ya tidak leader")
    public void admin_ketentuan_soal_modul_enum_ya_tidak_leader() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal enum ya tidak leader");
    }

    @And("Admin click button ADD deskripsi dan ketentuan enum ya tidak leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_enum_ya_tidak_leader() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan enum ya tidak leader");
    }

    @Then("Admin click button close form deskripsi dan ketentuan enum ya tidak leader")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_enum_ya_tidak_leader() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button close form deskripsi dan ketentuan enum ya tidak leader");
    }

    // admin add deskripsi dan ketentuan  enum (ya/tidak) staff

    @When("Admin click button form add deskripsi dan ketentuan modul enum ya tidak staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_enum_ya_tidak_staff() {
        modulpage.buttonadddeskripsidanketentuanmodulenumyatidakstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul enum ya tidak staff");
    }

    @And("Admin edit Deskripsi Modul enum ya tidak staff")
    public void admin_edit_deskripsi_modul_enum_ya_tidak_staff() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 12 staff");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul enum ya tidak staff");
    }

    @And("Admin edit Ketentuan Soal enum ya tidak staff")
    public void admin_ketentuan_soal_modul_enum_ya_tidak_staff() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal enum ya tidak staff");
    }

    @And("Admin click button ADD deskripsi dan ketentuan enum ya tidak staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_enum_ya_tidak_staff() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan enum ya tidak staff");
    }

    @Then("Admin click button close form deskripsi dan ketentuan enum ya tidak staff")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_enum_ya_tidak_staff() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button close form deskripsi dan ketentuan enum ya tidak staff");
    }

    // admin add deskripsi dan ketentuan esai length leader

    @When("Admin click button form add deskripsi dan ketentuan modul esai length leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_esai_length_leader() {
        modulpage.buttonadddeskripsidanketentuanmodulesailengthleader();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul esai length leader");
    }

    @And("Admin edit Deskripsi Modul esai length leader")
    public void admin_edit_deskripsi_modul_esai_length_leader() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 13 leader");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul esai length leader");
    }

    @And("Admin edit Ketentuan Soal esai length leader")
    public void admin_ketentuan_soal_modul_esai_length_leader() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal esai length leader");
    }

    @And("Admin click button ADD deskripsi dan ketentuan esai length leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_esai_length_leader() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan esai length leader");
    }

    @Then("Admin click button close form deskripsi dan ketentuan esai length leader")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_esai_length_leader() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button close form deskripsi dan ketentuan esai length leader");
    }

    // admin add deskripsi dan ketentuan esai length staff

    @When("Admin click button form add deskripsi dan ketentuan modul esai length staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_esai_length_staff() {
        modulpage.buttonadddeskripsidanketentuanmodulesailengthstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul esai length staff");
    }

    @And("Admin edit Deskripsi Modul esai length staff")
    public void admin_edit_deskripsi_modul_esai_length_staff() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 13 staff");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul esai length staff");
    }

    @And("Admin edit Ketentuan Soal esai length staff")
    public void admin_ketentuan_soal_modul_esai_length_staff() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal esai length staff");
    }

    @And("Admin click button ADD deskripsi dan ketentuan esai length staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_esai_length_staff() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan esai length staff");
    }

    @Then("Admin click button close form deskripsi dan ketentuan esai length staff")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_esai_length_staff() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button close form deskripsi dan ketentuan esai length staff");
    }

    // admin add deskripsi dan ketentuan pilihan (A/B) leader

    @When("Admin click button form add deskripsi dan ketentuan modul pilihan a b leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_pilihan_a_b_leader() {
        modulpage.buttonadddeskripsidanketentuanmodulpilihanableader();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul pilihan a b leader");
    }

    @And("Admin edit Deskripsi Modul pilihan a b leader")
    public void admin_edit_deskripsi_modul_esai_pilihan_a_b_leader() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 14 leader");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul pilihan a b leader");
    }

    @And("Admin edit Ketentuan Soal pilihan a b leader")
    public void admin_ketentuan_soal_modul_pilihan_a_b_leader() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal pilihan a b leader");
    }

    @And("Admin click button ADD deskripsi dan ketentuan pilihan a b leader")
    public void admin_click_button_add_deskripsi_dan_ketentuan_pilihan_a_b_leader() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan pilihan a b leader");
    }

    @Then("Admin click button close form deskripsi dan ketentuan pilihan a b leader")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_pilihan_a_b_leader() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button close form deskripsi dan ketentuan esai pilihan a b leader");
    }

    // admin add deskripsi dan ketentuan pilihan (A/B) staff

    @When("Admin click button form add deskripsi dan ketentuan modul pilihan a b staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_modul_pilihan_a_b_staff() {
        modulpage.buttonadddeskripsidanketentuanmodulpilihanabstaff();
        extentTest.log(LogStatus.PASS, "Admin click button form add deskripsi dan ketentuan modul pilihan a b staff");
    }

    @And("Admin edit Deskripsi Modul pilihan a b staff")
    public void admin_edit_deskripsi_modul_esai_pilihan_a_b_staff() {
        modulpage.editdeskripsimodul("ujian untuk test sqa batch 14 leader");
        extentTest.log(LogStatus.PASS, "Admin edit Deskripsi Modul pilihan a b staff");
    }

    @And("Admin edit Ketentuan Soal pilihan a b staff")
    public void admin_ketentuan_soal_modul_pilihan_a_b_staff() {
        modulpage.editketentuansoal("tidak boleh searching");
        extentTest.log(LogStatus.PASS, "Admin edit Ketentuan Soal pilihan a b staff");
    }

    @And("Admin click button ADD deskripsi dan ketentuan pilihan a b staff")
    public void admin_click_button_add_deskripsi_dan_ketentuan_pilihan_a_b_staff() {
        modulpage.buttonadddescription();
        extentTest.log(LogStatus.PASS, "Admin click button ADD deskripsip dan ketentuan pilihan a b staff");
    }

    @Then("Admin click button close form deskripsi dan ketentuan pilihan a b staff")
    public void admin_click_button_close_form_deskripsi_dan_ketentuan_pilihan_a_b_staff() {
        modulpage.buttoncloseformdesc();
        extentTest.log(LogStatus.PASS, "Admin click button close form deskripsi dan ketentuan esai pilihan a b staff");
    }


    //Admin edit modul PG LEADER //

    @When("Admin click button edit modul PG leader")
    public void admin_click_button_edit_modul_pg_leader() {
        modulpage.buttoneditmodulpgleader();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul PG leader");
    }

    @And("Admin edit status modul PG leader")
    public void admin_edit_status_modul_pg_leader() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul PG leader");
    }

    @And("Admin click button UPDATE pg leader")
    public void admin_click_button_update_pg_leader() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE pg leader");
    }

    @Then("Admin click button OK pemberitahuan pg leader")
    public void admin_click_button_ok_pemberitahuan_pg_leader() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan pg leader");
    }

    //Admin edit modul PG STAFF //

    @When("Admin click button edit modul PG staff")
    public void admin_click_button_edit_modul_pg_staff() {
        modulpage.buttoneditmodulpgstaff();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul PG staff");
    }

    @And("Admin edit status modul PG staff")
    public void admin_edit_status_modul_pg_staff() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul PG staff");
    }

    @And("Admin click button UPDATE pg staff")
    public void admin_click_button_update_pg_staff() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE pg staff");
    }

    @Then("Admin click button OK pemberitahuan pg staff")
    public void admin_click_button_ok_pemberitahuan_pg_staff() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan pg staff");
    }

    //Admin edit modul Esai free text leader

    @When("Admin click button edit modul esai free text leader")
    public void admin_click_button_edit_modul_esai_free_text_leader() {
        modulpage.buttoneditmodulesaifreetextleader();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul esai free text leader");
    }

    @And("Admin edit status modul esai free text leader")
    public void admin_edit_status_modul_esai_free_text_leader() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul esai free text leader");
    }

    @And("Admin click button UPDATE esai free text leader")
    public void admin_click_button_update_esai_free_text_leader() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE esai free text leader");
    }

    @Then("Admin click button OK pemberitahuan esai free text leader")
    public void admin_click_button_ok_pemberitahuan_esai_free_text_leader() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan esai free text leader");
    }

    //Admin edit modul esai free text staff

    @When("Admin click button edit modul esai free text staff")
    public void admin_click_button_edit_modul_esai_free_text_staff() {
        modulpage.buttoneditmodulesaifreetextstaff();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul esai free text staff");
    }

    @And("Admin edit status modul esai free text staff")
    public void admin_edit_status_modul_esai_free_text_staff() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul esai free text staff");
    }

    @And("Admin click button UPDATE esai free text staff")
    public void admin_click_button_update_esai_free_text_staff() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE esai free text staff");
    }

    @Then("Admin click button OK pemberitahuan esai free text staff")
    public void admin_click_button_ok_pemberitahuan_esai_free_text_staff() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan esai free text staff");
    }

    //Admin edit modul enum (ya/tidak) leader

    @When("Admin click button edit modul enum ya tidak leader")
    public void admin_click_button_edit_modul_enum_leader() {
        modulpage.buttoneditmodulenumleader();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul enum ya tidak leader");
    }

    @And("Admin edit status modul enum leader")
    public void admin_edit_status_modul_enum_leader() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul enum ya tidak leader");
    }

    @And("Admin click button UPDATE enum ya tidak leader")
    public void admin_click_button_update_enum_leader() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE enum ya tidak leader");
    }

    @Then("Admin click button OK pemberitahuan enum ya tidak leader")
    public void admin_click_button_ok_pemberitahuan_enum_leader() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan enum ya tidak leader");
    }

    //Admin edit modul enum (ya/tidak) staff

    @When("Admin click button edit modul enum ya tidak staff")
    public void admin_click_button_edit_modul_enum_staff() {
        modulpage.buttoneditmodulenumstaff();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul enum ya tidak staff");
    }

    @And("Admin edit status modul enum staff")
    public void admin_edit_status_modul_enum_staff() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul enum ya tidak staff");
    }

    @And("Admin click button UPDATE enum ya tidak staff")
    public void admin_click_button_update_enum_staff() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE enum ya tidak staff");
    }

    @Then("Admin click button OK pemberitahuan enum ya tidak staff")
    public void admin_click_button_ok_pemberitahuan_enum_staff() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan enum ya tidak staff");
    }

    //Admin edit modul esai length leader

    @When("Admin click button edit modul esai length leader")
    public void admin_click_button_edit_modul_esai_length_leader() {
        modulpage.buttoneditmodulesailengthleader();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul esai length leader");
    }

    @And("Admin edit status modul esai length leader")
    public void admin_edit_status_modul_esai_length_leader() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul esai length leader");
    }

    @And("Admin click button UPDATE esai length leader")
    public void admin_click_button_update_esai_length_leader() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE esai length leader");
    }

    @Then("Admin click button OK pemberitahuan esai length leader")
    public void admin_click_button_ok_pemberitahuan_esai_length_leader() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan esai length leader");
    }

    //Admin edit modul esai length staff

    @When("Admin click button edit modul esai length staff")
    public void admin_click_button_edit_modul_esai_length_staff() {
        modulpage.buttoneditmodulesailengthstaff();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul esai length staff");
    }

    @And("Admin edit status modul esai length staff")
    public void admin_edit_status_modul_esai_length_staff() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul esai length staff");
    }

    @And("Admin click button UPDATE esai length staff")
    public void admin_click_button_update_esai_length_staff() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE esai length staff");
    }

    @Then("Admin click button OK pemberitahuan esai length staff")
    public void admin_click_button_ok_pemberitahuan_esai_length_staff() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan esai length staff");
    }

    //Admin edit modul PILIHAN A/B leader
    @When("Admin click button edit modul pilihan a b leader")
    public void admin_click_button_edit_modul_pilihan_a_b_leader() {
        modulpage.buttoneditmodulpilihanableader();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul pilihan a b leader");
    }

    @And("Admin edit status modul pilihan a b leader")
    public void admin_edit_status_modul_pilihan_a_b_leader() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul pilihan a b leader");
    }

    @And("Admin click button UPDATE pilihan a b leader")
    public void admin_click_button_update_pilihan_a_b_leader() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE pilihan a b leader");
    }

    @Then("Admin click button OK pemberitahuan pilihan a b leader")
    public void admin_click_button_ok_pemberitahuan_pilihan_a_b_leader() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan pilihan a b leader");
    }


    //Admin edit modul PILIHAN A/B staff

    @When("Admin click button edit modul pilihan a b staff")
    public void admin_click_button_edit_modul_pilihan_a_b_staff() {
        modulpage.buttoneditmodulpilihanabstaff();
        extentTest.log(LogStatus.PASS, "Admin click button edit modul pilihan a b staff");
    }

    @And("Admin edit status modul pilihan a b staff")
    public void admin_edit_status_modul_pilihan_a_b_staff() {
        modulpage.selecteditstatusmodul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Admin edit status modul pilihan a b staff");
    }

    @And("Admin click button UPDATE pilihan a b staff")
    public void admin_click_button_update_pilihan_a_b_staff() {
        modulpage.buttonupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button UPDATE pilihan a b staff");
    }
    @Then("Admin click button OK pemberitahuan pilihan a b staff")
    public void admin_click_button_ok_pemberitahuan_pilihan_a_b_staff() {
        modulpage.buttonokupdatemodul();
        extentTest.log(LogStatus.PASS, "Admin click button OK pemberitahuan pilihan a b staff");
    }

}
