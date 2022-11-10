Feature: user Remove Activity

  Scenario: Admin masuk ke Remove Activity
    When User Admin go to Web Remove Activity
    And Admin klik menu Remove Activity
    And Admin klik submenu Remove Activity
    Then Tampil halaman Remove Activity

    Scenario: Admin input mencari data
      When TCC.PO.020 menginput NIK lengkap dari data
      And TCC.PO.027 Menampilkan dari NIK yang input dari data
      Then Admin input nomor Nik

      Scenario: Admin input mencari data dengan nama lengkap
      When TCC.PO.021 Menginput Nama calon dari data
      And TCC.PO.028 Menampilkan nama lengkap yang di input dari data
      Then Admin input nama lengkap

