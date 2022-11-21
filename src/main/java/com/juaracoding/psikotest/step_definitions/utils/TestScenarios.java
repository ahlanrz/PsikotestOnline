package com.juaracoding.psikotest.step_definitions.utils;

public enum TestScenarios {

    T0("User valid login"),
    T1("TCC.PO.001 Mencari user calon pelamar yang berhasil perbulan dari kalender awal"),
    T2("TCC.PO.002 Mencari user calon pelamar yang berhasil perbulan dari kalender akhir"),
    T3("TCC.PO.003 Mencari user calon pelamar yang berhasil perminggu dari kalender awal"),
    T4("TCC.PO.004 Mencari user calon pelamar yang berhasil perminggu dari kalender akhir"),
    T5("TCC.PO.005 Mencari user calon pelamar yang berhasil perhari dari kalender awal"),
    T6("TCC.PO.006 Mencari user calon pelamar yang berhasil perhari dari kalender akhir"),
    T7("TCC.PO.007 Menampilkan user calon data pelamar yang berhasil perbulan dari kalender awal"),
    T8("TCC.PO.008 Menampilkan user calon data pelamar yang berhasil  perbulan dari kalender akhir"),
    T9("TCC.PO.009 Menampilkan user calon data pelamar yang berhasil perminggu dari kalender awal"),
    T10("TCC.PO.010 Menampilkan user calon data pelamar yang berhasil perminggu dari kalender akhir"),
    T11("TCC.PO.011 Menampilkan user calon data pelamar yang berhasil perhari dari kalender awal"),
    T12("TCC.PO.012 Menampilkan user calon data pelamar yang berhasil perhari dari kalender akhir"),
    T13("TCC.PO.013 menambahkan tampilan data yang yang ingin dilihat dari 10"),
    T14("TCC.PO.014 menambahkan tampilan data yang yang ingin dilihat dari 25"),
    T15("TCC.PO.015 menambahkan tampilan data yang yang ingin dilihat dari 50"),
    T16("TCC.PO.016 menambahkan tampilan data yang yang ingin dilihat dari 100"),
    T17("TCC.PO.017 menambahkan tampilan data yang yang ingin dilihat dari 500"),
    T18("TCC.PO.018 Memindahkan data isi ke bentuk Excel "),
    T19("TCC.PO.019 menginput NIK lengkap dari data"),
    T20("TCC.PO.020 menginput Nama calon dari data"),
    T21("TCC.PO.021 menginput alamat gmail dari data"),
    T22("TCC.PO.022 menginput angka nomor telepon lengkap dari data"),
    T23("TCC.PO.023 menginput nilai hasil dari data nya"),
    T24("TCC.PO.024 menginput tipe modul dari datanya"),
    T25("TCC.PO.025 menginput nama modul di dalam datanya"),
    T26("TCC.PO.026 Menampilkan dari NIK yang input dari data"),
    T27("TCC.PO.027 Menampilkan nama lengkap yang di input dari data"),
    T28("TCC.PO.028 Menampilkan alamat gmail yang di input dari data "),
    T29("TCC.PO.029 Menampilkan nomor telepon yang di input dari datanya"),
    T30("TCC.PO.030 Menampilkan data dari nilai hasil yang di input"),
    T31("TCC.PO.031 Menampilkan data dari tipe modul yang di input"),
    T32("TCC.PO.032 Menampilkan nama modul dari data yang di input"),
    T33("TCC.PO.033 menambahkan tampilan data yang ingin dilihat dari 10"),
    T34("TCC.PO.034 menambahkan tampilan data yang ingin dilihat dari 25"),
    T35("TCC.PO.035 menambahkan tampilan data yang ingin dilihat dari 50"),
    T36("TCC.PO.036 menambahkan tampilan data yang yang ingin dilihat dari 100"),
    T37("TCC.PO.037 menambahkan tampilan data yang yang ingin dilihat dari 500"),
    T38("TCC.PO.038 Info pemberitahuan ingin di hapus atau tidak"),
    T39("TCC.PO.039 memilih status iya untuk menghapus"),
    T40("TCC.PO.040 memilih status tidak untuk kembali");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
