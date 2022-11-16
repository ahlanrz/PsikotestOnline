Feature: Modul Admin

  Scenario: Admin Open Tab Task Modul
    When Admin click tab task
    Then Admin click tab task modul

  Scenario: Admin Save Blank Modul
    When Admin click button add modul invalid
    And Admin click button Save
    Then  Admin click close tab warning

  Scenario: Admin Add Modul Pilihan Ganda Leader
    When Admin insert nama modul leader
    And Admin choose tipe modul pilihan ganda leader
    And Admin insert waktu pengerjaan pilihan ganda leader
    And Admin insert jumlah soal leader
    And Admin choose kategori modul leader
    And Admin insert deskripsi soal leader
    And Admin choose status modul leader
    And Admin click button Save modul pilihan ganda leader
    And Admin choose and click button ok in form pemberitahuan leader
    Then Admin click button ok in form pemberitahuan leader

  Scenario: Admin Add Modul Pilihan Ganda Staff
    When Admin click button add modul staff
    And Admin insert nama modul staff
    And Admin choose tipe modul pilihan ganda staff
    And Admin insert waktu pengerjaan pilihan ganda staff
    And Admin insert jumlah soal staff
    And Admin choose kategori modul staff
    And Admin insert deskripsi soal staff
    And Admin choose status modul staff
    And Admin click button Save modul pilihan ganda staff
    And Admin choose and click button ok in form pemberitahuan staff
    Then Admin click button ok in form pemberitahuan staff

