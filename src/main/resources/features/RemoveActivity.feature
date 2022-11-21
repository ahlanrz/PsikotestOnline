Feature: user Remove Activity

  Scenario: Admin masuk ke Remove Activity
    When User Admin go to Web Remove Activity
    And Admin klik menu Remove Activity
    And Admin klik submenu Remove Activity
    Then Tampil halaman Remove Activity

    Scenario: Admin input mencari data
      When TCC.PO.019 menginput NIK lengkap dari data
      And TCC.PO.026 Menampilkan dari NIK yang input dari data
      Then Admin input nomor Nik

      Scenario: Admin input mencari data dengan nama lengkap
      When TCC.PO.020 Menginput Nama calon dari data
      And TCC.PO.027 Menampilkan nama lengkap yang di input dari data
      Then Admin input nama lengkap

   Scenario: Admin input email dari data
     When TCC.PO.021 Menginput alamat gmail dari data
     And TCC.PO.028 Menampilkan alamat gmail yang di input dari data
     Then Admin mencari dan menampilkan dari data gmail

Scenario: Admin input nomor telepon dari data
  When TCC.PO.022 Menginput angka nomor telepon lengkap dari data
  And  TCC.PO.029 Menampilkan nomor telepon yang di input dari datanya
  Then Admin menginput nomor telepon dari data

  Scenario: Admin tidak jadi menghapus data
    When TCC.PO.038 Info pemberitahuan ingin di hapus atau tidak
    And TCC.PO.040 Memilih status tidak untuk kembali
    Then Admin klik TIDAK

    Scenario: Admin menghapus data
      When TCC.PO.039 memilih status iya untuk menghapus
      And Admin klik YA
      Then Muncul pop up data berhasil dihapus
      Then Admin klik OK