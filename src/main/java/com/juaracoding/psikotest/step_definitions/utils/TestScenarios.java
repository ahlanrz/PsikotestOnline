package com.juaracoding.psikotest.step_definitions.utils;

public enum TestScenarios {

    //POSITIVE TEST CASE

    T1("User valid login"),
    T2("Admin Open Tab Task Modul"),
    T3("Admin Add Modul Pilihan Ganda Leader"),
    T4("Admin Add Modul Pilihan Ganda Staff"),
    T5("Admin Add Modul Esai Free Text Leader"),
    T6("Admin Add Modul Esai Free Text Staff"),
    T7("Admin Add Modul Enum (YA/TIDAK) Leader"),
    T8("Admin Add Modul Enum (YA/TIDAK) Staff"),
    T9("Admin Add Modul Esai Length Leader"),
    T10("Admin Add Modul Esai Length Staff"),
    T11("Admin Add Modul Pilihan A/B Leader"),
    T12("Admin Add Modul Pilihan A/B Staff"),
    T13("Admin Search Modul"),
    T14("Admin Add Soal PG dengan gambar"),
    T15("Admin Add Soal PG tanpa gambar"),
    T16("Admin Edit Soal"),
    T17("Admin Add Soal PG STAFF dengan gambar"),
    T18("Admin Add Soal PG STAFF tanpa gambar"),
    T19("Admin Edit Soal STAFF"),
    T20("Admin Add Soal ESAI FREE TEXT LEADER dengan gambar"),
    T21("Admin Add Soal ESAI FREE TEXT LEADER tanpa gambar"),
    T22("Admin Edit ESAI FREE TEXT LEADER"),
    T23("Admin Add Soal ESAI FREE TEXT STAFF dengan gambar"),
    T24("Admin Add Soal ESAI FREE TEXT STAFF tanpa gambar"),
    T25("Admin Edit ESAI FREE TEXT STAFF"),
    T26("Admin Add Soal ENUM (YA/TIDAK) LEADER dengan gambar"),
    T27("Admin Add Soal ENUM (YA/TIDAK) LEADER tanpa gambar"),
    T28("Admin Edit ENUM (YA/TIDAK) LEADER"),
    T29("Admin Add Soal ENUM (YA/TIDAK) STAFF dengan gambar"),
    T30("Admin Add Soal ENUM (YA/TIDAK) STAFF tanpa gambar"),
    T31("Admin Edit ENUM (YA/TIDAK) STAFF"),
    T32("Admin Add Soal ESAI LENGTH LEADER dengan gambar"),
    T33("Admin Add Soal ESAI LENGTH LEADER tanpa gambar"),
    T34("Admin Edit ESAI LENGTH LEADER"),
    T35("Admin Add Soal ESAI LENGTH STAFF dengan gambar"),
    T36("Admin Add Soal ESAI LENGTH STAFF tanpa gambar"),
    T37("Admin Edit ESAI LENGTH STAFF"),
    T38("Admin Add Soal PILIHAN (A/B) LEADER dengan gambar"),
    T39("Admin Add Soal PILIHAN (A/B) LEADER tanpa gambar"),
    T40("Admin Add Soal PILIHAN (A/B) STAFF dengan gambar"),
    T41("Admin Add Soal PILIHAN (A/B) STAFF tanpa gambar"),
    T42("Admin Add Deskripsi dan Ketentuan Soal PG LEADER"),
    T43("Admin Add Deskripsi dan Ketentuan Soal PG STAFF"),
    T44("Admin Add Deskripsi dan Ketentuan Soal ESAI FREE TEXT LEADER"),
    T45("Admin Add Deskripsi dan Ketentuan Soal ESAI FREE TEXT STAFF"),
    T46("Admin Add Deskripsi dan Ketentuan Soal Enum (Ya/Tidak) LEADER"),
    T47("Admin Add Deskripsi dan Ketentuan Soal Enum (Ya/Tidak) STAFF"),
    T48("Admin Add Deskripsi dan Ketentuan Soal ESAI LENGTH LEADER"),
    T49("Admin Add Deskripsi dan Ketentuan Soal ESAI LENGTH STAFF"),
    T50("Admin Add Deskripsi dan Ketentuan Soal PILIHAN (A/B) LEADER"),
    T51("Admin Add Deskripsi dan Ketentuan Soal PILIHAN (A/B) STAFF"),
    T52("Admin Edit Modul PG Leader"),
    T53("Admin Edit Modul PG Staff"),
    T54("Admin Edit Modul Esai Free Text Leader"),
    T55("Admin Edit Modul Esai Free Text Staff"),
    T56("Admin Edit Modul ENUM (YA/TIDAK) Leader"),
    T57("Admin Edit Modul ENUM (YA/TIDAK) Staff"),
    T58("Admin Edit Modul ESAI LENGTH Leader"),
    T59("Admin Edit Modul ESAI LENGTH Staff"),
    T60("Admin Edit Modul PILIHAN (A/B) Leader"),
    T61("Admin Edit Modul PILIHAN (A/B) Staff"),


    //NEGATIVE TEST CASE

    T62("TCC.PO.002 Admin Save Blank Modul"),
    T63("TCC.PO.004 Admin Mengisi Nama Modul dan Save"),
    T64("TCC.PO.006 Admin Memilih Tipe Modul dan Save"),
    T65("TCC.PO.008 Admin Mengisi waktu pengerjaan dan Save"),
    T66("TCC.PO.010 Admin Mengisi jumlah soal dan Save"),
    T67("TCC.PO.012 Admin Memilih Kategori dan Save"),
    T68("TCC.PO.014 Admin Mengisi deskripsi dan Save"),
    T69("TCC.PO.016 Admin Memilih status modul dan Save"),
    T70("TCC.PO.100 Admin Menambahkan soal tanpa mengisi soal,jawaban dan kunci jawaban pg"),
    T71("TCC.PO.111 Admin Menambahkan soal tanpa mengisi soal,jawaban dan kunci jawaban esai free text"),
    T72("TCC.PO.122 Admin Menambahkan soal tanpa mengisi soal,jawaban dan kunci jawaban enum ya tidak"),
    T73("TCC.PO.134 Admin Menambahkan soal tanpa mengisi soal,jawaban dan kunci jawaban esai length"),
    T74("TCC.PO.146 Admin Menambahkan soal tanpa mengisi soal,jawaban dan kunci jawaban pilihan a b"),



    ;
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
