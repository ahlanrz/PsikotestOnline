package com.juaracoding.psikotest.step_definitions.utils;

public enum TestScenarios {
    T1("User valid login"),
    T2("TCC.PO.001 Mencari user calon pelamar yang berhasil  perbulan dari kalender awal"),
    T3("TCC.PO.002 Mencari user calon pelamar yang berhasil  perbulan dari kalender akhir"),
    T4("TCC.PO.003 Mencari user calon pelamar yang berhasil perminggu dari kalender awal"),
    T5("TCC.PO.004 Mencari user calon pelamar yang berhasil perminggu dari kalender akhir"),
    T6("TCC.PO.005 Mencari user calon pelamar yang berhasil perhari dari kalender awal"),
    T7("TCC.PO.006 Mencari user calon pelamar yang berhasil perhari dari kalender akhir"),
    T8("TCC.PO.007 Menampilkan user calon data pelamar yang berhasil perbulan dari kalender awal"),
    T9("TCC.PO.008 Menampilkan user calon data  pelamar yang berhasil perbulan dari kalender akhir"),
    T10("TCC.PO.009 Menampilkan user calon data  pelamar yang berhasil perminggu dari kalender awal"),
    T11("TCC.PO.010 Menampilkan user calon data pelamar yang berhasil perminggu dari kalender akhir"),
    T12("TCC.PO.011 Menampilkan user calon data pelamar yang berhasil perhari dari kalender awal"),
    T13("TCC.PO.012 Menampilkan user calon data pelamar yang berhasil perhari dari kalender akhir"),
    T14("TCC.PO.013 Menambahkan tampilan data yang yang ingin dilihat dari 10"),
    T15("TCC.PO.014 menambahkan tampilan data yang yang ingin dilihat dari 25"),
    T16("TCC.PO.015 menambahkan tampilan data yang yang ingin dilihat dari 50"),
    T17("TCC.PO.016 menambahkan tampilan data yang yang ingin dilihat dari 100"),
    T18("TCC.PO.017 menambahkan tampilan data yang yang ingin dilihat dari 500"),
    T19("TCC.PO.018 Memindahkan data kosong ke bentuk Excel"),
    T20("TCC.PO.019 Memindahkan data isi ke bentuk Excel"),
    T21("TCC.PO.020 menginput alamat email tanpa gmail dari data"),
    T22("TCC.PO.021 menginput alamat gmail lengkap dari data"),
    T23("TCC.PO.022 menginput 4 angka nomor telepon dari data"),
    T24("TCC.PO.023 menginput angka nomor telepon lengkap dan menampilkan data"),
    T25("TCC.PO.024 menginput 2 inisial nama user dari nama lengkap dari data nya"),
    T26("TCC.PO.025 menginput nama lengkap user dari tampilan  datanya"),
    T27("TCC.PO.026 menginput huruf kapital yang di dalam datanya"),
    T28("TCC.PO.027 Mencari dan menampilkan data alamat email tanpa gmail dari data"),
    T29("TCC.PO.028 Mencari dan Menampilkan alamat gmail lengkap dari data"),
    T30("TCC.PO.029 Mencari dan menampilkan beberapa data dengan inisial 2 huruf"),
    T31("TCC.PO.030 Mencari dan Menampilkan beberapa data dengan nama yang lengkap"),
    T32("TCC.PO.031 Mencari dan menampilkan data dengan 4 no telepon"),
    T33("TCC.PO.032 Mencari dan menampilkan data dengan nomor telepon lengkap"),
    T34("TCC.PO.033 Mencari dan menampilkan data dengan huruf kapital"),
    T35("TCC.PO.034 menambahkan tampilan data yang ingin dilihat dari 10"),
    T36("TCC.PO.035 menambahkan tampilan data yang ingin dilihat dari 25"),
    T37("TCC.PO.036 menambahkan tampilan data yang ingin dilihat dari 50"),
    T38("TCC.PO.037 menambahkan tampilan data yang yang ingin dilihat dari 100"),
    T39("TCC.PO.038 menambahkan tampilan data yang yang ingin dilihat dari 500"),
    T40("TCC.PO.039 Info pemberitahuan ingin di hapus atau tidak"),
    T41("TCC.PO.040 memilih status iya untuk menghapus"),
    T42("TCC.PO.041 memilih status tidak untuk kembali");
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
