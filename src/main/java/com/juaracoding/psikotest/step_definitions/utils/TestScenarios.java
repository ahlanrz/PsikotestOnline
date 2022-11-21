package com.juaracoding.psikotest.step_definitions.utils;

public enum TestScenarios {

    T1("User valid login"),
    T2("Admin Open Tab Task Modul"),
    T3("Admin Save Blank Modul"),
    T4("Admin Add Modul Pilihan Ganda Leader"),
    T5("Admin Add Modul Pilihan Ganda Staff"),
    T6("Admin Add Modul Esai Free Text Leader"),
    T7("Admin Add Modul Esai Free Text Staff"),
    T8("Admin Add Modul Enum (YA/TIDAK) Leader"),
    T9("Admin Add Modul Enum (YA/TIDAK) Staff"),
    T10("Admin Add Modul Esai Length Leader"),
    T11("Admin Add Modul Esai Length Staff"),
    T12("Admin Add Modul Pilihan A/B Leader"),
    T13("Admin Add Modul Pilihan A/B Staff"),
    T14("Admin Search Modul"),
    T15("Admin Add Soal PG dengan gambar"),
    T16("Admin Add Soal PG tanpa gambar"),
    T17("Admin Edit Soal"),
    T18("Admin Add Soal PG STAFF dengan gambar"),
    T19("Admin Add Soal PG STAFF tanpa gambar"),
    T20("Admin Edit Soal STAFF"),
    T21("Admin Add Soal ESAI FREE TEXT LEADER dengan gambar"),
    T22("Admin Add Soal ESAI FREE TEXT LEADER tanpa gambar"),
    T23("Admin Edit ESAI FREE TEXT LEADER"),
    T24("Admin Add Soal ESAI FREE TEXT STAFF dengan gambar"),
    T25("Admin Add Soal ESAI FREE TEXT STAFF tanpa gambar"),
    T26("Admin Edit ESAI FREE TEXT STAFF"),
    T27("Admin Add Soal ENUM (YA/TIDAK) LEADER dengan gambar"),
    T28("Admin Add Soal ENUM (YA/TIDAK) LEADER tanpa gambar"),
    T29("Admin Edit ENUM (YA/TIDAK) LEADER"),
    T30("Admin Add Soal ENUM (YA/TIDAK) STAFF dengan gambar"),
    T31("Admin Add Soal ENUM (YA/TIDAK) STAFF tanpa gambar"),
    T32("Admin Edit ENUM (YA/TIDAK) STAFF"),
    T33("Admin Add Soal ESAI LENGTH LEADER dengan gambar"),
    T34("Admin Add Soal ESAI LENGTH LEADER tanpa gambar"),
    T35("Admin Edit ESAI LENGTH LEADER"),
    T36("Admin Add Soal ESAI LENGTH STAFF dengan gambar"),
    T37("Admin Add Soal ESAI LENGTH STAFF tanpa gambar"),
    T38("Admin Edit ESAI LENGTH STAFF"),
    T39("Admin Add Soal PILIHAN (A/B) LEADER dengan gambar"),
    T40("Admin Add Soal PILIHAN (A/B) LEADER tanpa gambar"),
    T41("Admin Add Soal PILIHAN (A/B) STAFF dengan gambar"),
    T42("Admin Add Soal PILIHAN (A/B) STAFF tanpa gambar"),
    T43("Admin Add Deskripsi dan Ketentuan Soal PG LEADER"),
    T44("Admin Add Deskripsi dan Ketentuan Soal PG STAFF"),
    T45("Admin Add Deskripsi dan Ketentuan Soal ESAI FREE TEXT LEADER"),
    T46("Admin Add Deskripsi dan Ketentuan Soal ESAI FREE TEXT STAFF"),
    T47("Admin Add Deskripsi dan Ketentuan Soal Enum (Ya/Tidak) LEADER"),
    T48("Admin Add Deskripsi dan Ketentuan Soal Enum (Ya/Tidak) STAFF"),
    T49("Admin Add Deskripsi dan Ketentuan Soal ESAI LENGTH LEADER"),
    T50("Admin Add Deskripsi dan Ketentuan Soal ESAI LENGTH STAFF"),
    T51("Admin Add Deskripsi dan Ketentuan Soal PILIHAN (A/B) LEADER"),
    T52("Admin Add Deskripsi dan Ketentuan Soal PILIHAN (A/B) STAFF"),
    T53("Admin Edit Modul PG Leader"),
    T54("Admin Edit Modul PG Staff"),
    T55("Admin Edit Modul Esai Free Text Leader"),
    T56("Admin Edit Modul Esai Free Text Staff"),
    T57("Admin Edit Modul ENUM (YA/TIDAK) Leader"),
    T58("Admin Edit Modul ENUM (YA/TIDAK) Staff"),
    T59("Admin Edit Modul ESAI LENGTH Leader"),
    T60("Admin Edit Modul ESAI LENGTH Staff"),
    T61("Admin Edit Modul PILIHAN (A/B) Leader"),
    T62("Admin Edit Modul PILIHAN (A/B) Staff"),











    ;
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
