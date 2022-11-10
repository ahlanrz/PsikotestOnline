Feature: Report user

  Scenario: Admin mengecek data menggunakan kalender
    When User go to Web Psikotest Online
    And Admin klik menu Report
    And Admin klik submenu Report
    Then Tampil halaman Report

    Scenario: Admin mengecek data perhari
    And TCC.PO.005 Mencari user calon pelamar yang berhasil perhari dari kalender awal
    And TCC.PO.006 Mencari user calon pelamar yang berhasil perhari dari kalender akhir
    And Admin klik view untuk menampilkan data
    Then Tidak ada data yang tampil

    Scenario: Admin mengecek data perminggu
    And TCC.PO.003 Mencari user calon pelamar yang berhasil perminggu dari kalender awal
    And TCC.PO.010 Menampilkan user calon data pelamar yang berhasil perminggu dari kalender akhir
    And Admin klik tombol View
    Then List report tampil

    Scenario: Admin mengecek data perbulan
    And TCC.PO.007 Menampilkan user calon data  pelamar yang berhasil  perbulan dari kalender awal
    And TCC.PO.008 Menampilkan user calon data  pelamar yang berhasil perbulan dari kalender akhir
    And TCC.PO.019 Memindahkan data isi ke bentuk Excel
    Then Validasi file menggunakan size