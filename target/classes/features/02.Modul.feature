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
    When Admin click button add modul pg staff
    And Admin insert nama modul pg staff
    And Admin choose tipe modul pilihan ganda staff
    And Admin insert waktu pengerjaan pilihan ganda staff
    And Admin insert jumlah soal pg staff
    And Admin choose kategori modul pg staff
    And Admin insert deskripsi soal pg staff
    And Admin choose status modul pg staff
    And Admin click button save modul pilihan ganda staff
    And Admin choose and click button ok in form pemberitahuan pg staff
    Then Admin click button ok in form pemberitahuan pg staff

  Scenario: Admin Add Modul Esai Free Text Leader
    When Admin click button add modul esai free text leader
    And Admin insert nama modul esai free text leader
    And Admin choose tipe modul esai free text leader
    And Admin insert waktu pengerjaan esai free text leader
    And Admin insert jumlah soal esai free text leader
    And Admin choose kategori modul esai free text leader
    And Admin insert deskripsi soal esai free text leader
    And Admin choose status modul esai free text leader
    And Admin click button save modul esai free text leader
    And Admin choose and click button ok in form pemberitahuan esai free text leader
    Then Admin click button ok in form pemberitahuan esai free text leader

  Scenario: Admin Add Modul Esai Free Text Staff
    When Admin click button add modul esai free text staff
    And Admin insert nama modul esai free text staff
    And Admin choose tipe modul esai free text staff
    And Admin insert waktu pengerjaan esai free text staff
    And Admin insert jumlah soal esai free text staff
    And Admin choose kategori modul esai free text staff
    And Admin insert deskripsi soal esai free text staff
    And Admin choose status modul esai free text staff
    And Admin click button save modul esai free text staff
    And Admin choose and click button ok in form pemberitahuan esai free text staff
    Then Admin click button ok in form pemberitahuan esai free text staff

  Scenario: Admin Add Modul Enum (YA/TIDAK) Leader
    When Admin click button add modul enum ya tidak leader
    And Admin insert nama modul enum ya tidak leader
    And Admin choose tipe modul enum ya tidak leader
    And Admin insert waktu pengerjaan enum ya tidak leader
    And Admin insert jumlah soal enum ya tidak leader
    And Admin choose kategori modul enum ya tidak leader
    And Admin insert deskripsi soal enum ya tidak leader
    And Admin choose status modul enum ya tidak leader
    And Admin click button save modul enum ya tidak leader
    And Admin choose and click button ok in form pemberitahuan enum ya tidak leader
    Then Admin click button ok in form pemberitahuan enum ya tidak leader

  Scenario: Admin Add Modul Enum (YA/TIDAK) Staff
    When Admin click button add modul enum ya tidak staff
    And Admin insert nama modul enum ya tidak staff
    And Admin choose tipe modul enum ya tidak leader
    And Admin insert waktu pengerjaan enum ya tidak staff
    And Admin insert jumlah soal enum ya tidak staff
    And Admin choose kategori modul enum ya tidak staff
    And Admin insert deskripsi soal enum ya tidak staff
    And Admin choose status modul enum ya tidak staff
    And Admin click button save modul enum ya tidak staff
    And Admin choose and click button ok in form pemberitahuan enum ya tidak staff
    Then Admin click button ok in form pemberitahuan enum ya tidak staff

  Scenario: Admin Add Modul Esai Length Leader
    When Admin click button add modul esai length leader
    And Admin insert nama modul esai length leader
    And Admin choose tipe modul esai length leader
    And Admin insert waktu pengerjaan esai length leader
    And Admin insert jumlah soal esai length leader
    And Admin choose kategori modul esai length leader
    And Admin insert deskripsi soal esai length leader
    And Admin choose status modul esai length leader
    And Admin click button save modul esai length leader
    And Admin choose and click button ok in form pemberitahuan esai length leader
    Then Admin click button ok in form pemberitahuan esai length leader

  Scenario: Admin Add Modul Esai Length Staff
    When Admin click button add modul esai length staff
    And Admin insert nama modul esai length staff
    And Admin choose tipe modul esai length staff
    And Admin insert waktu pengerjaan esai length staff
    And Admin insert jumlah soal esai length staff
    And Admin choose kategori modul esai length staff
    And Admin insert deskripsi soal esai length staff
    And Admin choose status modul esai length staff
    And Admin click button save modul esai length staff
    And Admin choose and click button ok in form pemberitahuan esai length staff
    Then Admin click button ok in form pemberitahuan esai length staff

  Scenario: Admin Add Modul Pilihan A/B Leader
    When Admin click button add modul pilihan a b leader
    And Admin insert nama modul pilihan a b leader
    And Admin choose tipe modul pilihan a b leader
    And Admin insert waktu pengerjaan pilihan a b leader
    And Admin insert jumlah soal pilihan a b leader
    And Admin choose kategori modul pilihan a b leader
    And Admin insert deskripsi soal pilihan a b leader
    And Admin choose status modul pilihan a b leader
    And Admin click button save modul pilihan a b leader
    And Admin choose and click button ok in form pemberitahuan pilihan a b leader
    Then Admin click button ok in form pemberitahuan pilihan a b leader

  Scenario: Admin Add Modul Pilihan A/B Staff
    When Admin click button add modul pilihan a b staff
    And Admin insert nama modul pilihan a b staff
    And Admin choose tipe modul pilihan a b staff
    And Admin insert waktu pengerjaan pilihan a b staff
    And Admin insert jumlah soal pilihan a b staff
    And Admin choose kategori modul pilihan a b staff
    And Admin insert deskripsi soal pilihan a b staff
    And Admin choose status modul pilihan a b staff
    And Admin click button save modul pilihan a b staff
    And Admin choose and click button ok in form pemberitahuan pilihan a b staff
    Then Admin click button ok in form pemberitahuan pilihan a b staff

  Scenario: Admin Search Modul
    When Admin choose show page 25
    And Admin search modul Test SQA Batch 10 Leader
    Then Admin click button search modul Test SQA Batch 10 Leader

  Scenario: Admin Add Soal PG dengan gambar
    When Admin click button form template soal
    And Admin insert soal PG no 1
    And Admin insert jawaban PG A
    And Admin insert jawaban PG B
    And Admin insert jawaban PG C
    And Admin insert jawaban PG D
    And Admin insert jawaban PG E
    And Admin choose kunci jawaban PG
    And Admin click button choose file
    And Admin click button upload gambar
    And Admin click button cek
    And Admin click button ADD
    Then Admin click button OK

  Scenario: Admin Add Soal PG tanpa gambar
    When Admin insert soal PG no 2
    And Admin insert jawaban PG A no 2
    And Admin insert jawaban PG B no 2
    And Admin insert jawaban PG C no 2
    And Admin insert jawaban PG D no 2
    And Admin insert jawaban PG E no 2
    And Admin choose kunci jawaban PG no 2
    And Admin click button ADD no 2
    Then Admin click button OK no 2

  Scenario: Admin Edit Soal
    When Admin click button edit soal no 2
    And Admin edit jawaban PG E no 2
    And Admin edit pilihan kunci jawaban PG no 2
    And Admin click button update soal no 2
    And Admin click close form pemberitahuan update soal no 2
    Then Admin click button close form soal

  Scenario: Admin Add Soal PG STAFF dengan gambar
    When Admin click button form template soal pg staff
    And Admin insert soal PG staff no 1
    And Admin insert jawaban PG staff A
    And Admin insert jawaban PG staff B
    And Admin insert jawaban PG staff C
    And Admin insert jawaban PG staff D
    And Admin insert jawaban PG staff E
    And Admin choose kunci jawaban PG staff
    And Admin click button choose file PG staff
    And Admin click button upload gambar PG staff
    And Admin click button cek PG staff
    And Admin click button ADD PG staff
    Then Admin click button OK PG staff

  Scenario: Admin Add Soal PG STAFF tanpa gambar
    When Admin insert soal PG staff no 2
    And Admin insert jawaban PG staff A no 2
    And Admin insert jawaban PG staff B no 2
    And Admin insert jawaban PG staff C no 2
    And Admin insert jawaban PG staff D no 2
    And Admin insert jawaban PG staff E no 2
    And Admin choose kunci jawaban PG staff no 2
    And Admin click button ADD no 2 PG staff
    Then Admin click button OK no 2 PG staff

  Scenario: Admin Edit Soal STAFF
    When Admin click button edit soal pg staff no 2
    And Admin edit jawaban PG staff E no 2
    And Admin edit pilihan kunci jawaban PG staff no 2
    And Admin click button update soal PG staff no 2
    And Admin click close form pemberitahuan update soal PG staff no 2
    Then Admin click button close form soal PG staff

  Scenario: Admin Add Soal ESAI FREE TEXT LEADER dengan gambar
    And Admin click button form template soal esai free text leader
    And Admin insert soal esai free text leader no 1
    And Admin click button choose file esai free text leader
    And Admin click button upload gambar esai free text leader
    And Admin click button cek esai free text leader
    And Admin click button ADD esai free text leader
    Then Admin click button OK esai free text leader

  Scenario: Admin Add Soal ESAI FREE TEXT LEADER tanpa gambar
    When Admin insert soal esai free text leader no 2
    And Admin click button ADD no 2 esai free text leader
    Then Admin click button OK no 2 esai free text leader

  Scenario: Admin Edit ESAI FREE TEXT LEADER
    When Admin click button edit soal esai free text leader no 2
    And Admin edit soal esai free text leader no 2 clear
    And Admin edit soal esai free text leader no 2
    And Admin click button update soal esai free text leader no 2
    And Admin click close form pemberitahuan update soal esai free text leader no 2
    Then Admin click button close form soal esai free text leader

  Scenario: Admin Add Soal ESAI FREE TEXT STAFF dengan gambar
    And Admin click button form template soal esai free text staff
    And Admin insert soal esai free text staff no 1
    And Admin click button choose file esai free text staff
    And Admin click button upload gambar esai free text staff
    And Admin click button cek esai free text staff
    And Admin click button ADD esai free text staff
    Then Admin click button OK esai free text staff

  Scenario: Admin Add Soal ESAI FREE TEXT STAFF tanpa gambar
    When Admin insert soal esai free text staff no 2
    And Admin click button ADD no 2 esai free text staff
    Then Admin click button OK no 2 esai free text staff

  Scenario: Admin Edit ESAI FREE TEXT STAFF
    When Admin click button edit soal esai free text staff no 2
    And Admin edit soal esai free text staff no 2 clear
    And Admin edit soal esai free text staff no 2
    And Admin click button update soal esai free text staff no 2
    And Admin click close form pemberitahuan update soal esai free text staff no 2
    Then Admin click button close form soal esai free text staff

  Scenario: Admin Add Soal ENUM (YA/TIDAK) LEADER dengan gambar
    When Admin click button form template soal enum ya tidak leader
    And Admin insert soal enum ya tidak leader no 1
    And Admin choose kunci jawaban enum ya tidak leader
    And Admin click button choose file enum ya tidak leader
    And Admin click button upload gambar enum ya tidak leader
    And Admin click button cek enum ya tidak leader
    And Admin click button ADD enum ya tidak leader
    Then Admin click button OK enum ya tidak leader

  Scenario: Admin Add Soal ENUM (YA/TIDAK) LEADER tanpa gambar
    When Admin insert soal enum ya tidak leader no 2
    And Admin choose kunci jawaban enum ya tidak leader no 2
    And Admin click button ADD no 2 enum ya tidak leader
    Then Admin click button OK no 2 enum ya tidak leader

  Scenario: Admin Edit ENUM (YA/TIDAK) LEADER
    When Admin click button edit soal enum ya tidak leader no 2
    And Admin edit pilihan kunci jawaban enum ya tidak leader no 2
    And Admin click button update soal enum ya tidak leader no 2
    And Admin click close form pemberitahuan update soal enum ya tidak leader no 2
    Then Admin click button close form soal enum ya tidak leader

  Scenario: Admin Add Soal ENUM (YA/TIDAK) STAFF dengan gambar
    When Admin click button form template soal enum ya tidak staff
    And Admin insert soal enum ya tidak staff no 1
    And Admin choose kunci jawaban enum ya tidak staff
    And Admin click button choose file enum ya tidak staff
    And Admin click button upload gambar enum ya tidak staff
    And Admin click button cek enum ya tidak staff
    And Admin click button ADD enum ya tidak staff
    Then Admin click button OK enum ya tidak staff

  Scenario: Admin Add Soal ENUM (YA/TIDAK) STAFF tanpa gambar
    When Admin insert soal enum ya tidak staff no 2
    And Admin choose kunci jawaban enum ya tidak staff no 2
    And Admin click button ADD no 2 enum ya tidak staff
    Then Admin click button OK no 2 enum ya tidak staff

  Scenario: Admin Edit ENUM (YA/TIDAK) STAFF
    When Admin click button edit soal enum ya tidak staff no 2
    And Admin edit pilihan kunci jawaban enum ya tidak staff no 2
    And Admin click button update soal enum ya tidak staff no 2
    And Admin click close form pemberitahuan update soal enum ya tidak staff no 2
    Then Admin click button close form soal enum ya tidak staff

  Scenario: Admin Add Soal ESAI LENGTH LEADER dengan gambar
    When Admin click button form template soal esai length leader
    And Admin insert soal esai length leader no 1
    And Admin choose maks score esai length leader
    And Admin click button choose file esai length leader
    And Admin click button upload gambar esai length leader
    And Admin click button cek esai length leader
    And Admin click button ADD esai length leader
    Then Admin click button OK esai length leader

  Scenario: Admin Add Soal ESAI LENGTH LEADER tanpa gambar
    When Admin insert soal esai length leader no 2
    And Admin choose maks score esai length leader no 2
    And Admin click button ADD no 2 esai length leader
    Then Admin click button OK no 2 esai length leader

  Scenario: Admin Edit ESAI LENGTH LEADER
    When Admin click button edit soal esai length leader no 2
    And Admin edit soal esai length leader no 2 clear
    And Admin edit soal esai length leader no 2
    And Admin edit maks score esai length no 2
    And Admin click button update soal esai length leader no 2
    And Admin click close form pemberitahuan update soal esai length leader no 2
    Then Admin click button close form soal esai length leader

  Scenario: Admin Add Soal ESAI LENGTH STAFF dengan gambar
    When Admin click button form template soal esai length staff
    And Admin insert soal esai length staff no 1
    And Admin choose maks score esai length staff
    And Admin click button choose file esai length staff
    And Admin click button upload gambar esai length staff
    And Admin click button cek esai length staff
    And Admin click button ADD esai length staff
    Then Admin click button OK esai length staff

  Scenario: Admin Add Soal ESAI LENGTH STAFF tanpa gambar
    When Admin insert soal esai length staff no 2
    And Admin choose maks score esai staff staff no 2
    And Admin click button ADD no 2 esai length staff
    Then Admin click button OK no 2 esai length staff

  Scenario: Admin Edit ESAI LENGTH STAFF
    When Admin click button edit soal esai length staff no 2
    And Admin edit soal esai length staff no 2 clear
    And Admin edit soal esai length staff no 2
    And Admin edit maks score esai length staff no 2
    And Admin click button update soal esai length staff no 2
    And Admin click close form pemberitahuan update soal esai length staff no 2
    Then Admin click button close form soal esai length staff

  Scenario: Admin Add Soal PILIHAN (A/B) LEADER dengan gambar
    When Admin click button form template soal Pilihan A B leader
    ##And Admin insert soal Pilihan A B leader no 1
    And Admin insert jawaban Pilihan A B leader A
    And Admin insert jawaban Pilihan A B leader B
    And Admin choose kunci jawaban Pilihan A B leader
    And Admin click button choose file Pilihan A B leader
    And Admin click button upload gambar Pilihan A B leader
    And Admin click button cek Pilihan A B leader
    And Admin click button ADD Pilihan A B leader
    Then Admin click button OK Pilihan A B leader

  Scenario: Admin Add Soal PILIHAN (A/B) LEADER tanpa gambar
    ##When Admin insert soal Pilihan A B leader no 2
    And Admin insert jawaban A Pilihan A B leader no 2
    And Admin insert jawaban B Pilihan A B leader no 2
    And Admin choose kunci jawaban Pilihan A B leader no 2
    And Admin click button ADD no 2 Pilihan A B leader
    Then Admin click button OK no 2 Pilihan A B leader

  Scenario: Admin Edit PILIHAN (A/B) LEADER
    ##When Admin click button edit soal  Pilihan A B leader no 2
    And Admin edit jawaban Pilihan A B leader no 2
    And Admin edit pilihan kunci jawaban Pilihan A B leader no 2
    And Admin click button update soal Pilihan A B leader no 2
    And Admin click close form pemberitahuan update soal Pilihan A B leader no 2
    Then Admin click button close form soal Pilihan A B leader no 2

  Scenario: Admin Add Soal PILIHAN (A/B) STAFF dengan gambar
    When Admin click button form template soal Pilihan A B staff
    #And Admin insert soal Pilihan A B staff no 1
    And Admin insert jawaban Pilihan A B staff A
    And Admin insert jawaban Pilihan A B staff B
    And Admin choose kunci jawaban Pilihan A B staff
    And Admin click button choose file Pilihan A B staff
    And Admin click button upload gambar Pilihan A B staff
    And Admin click button cek Pilihan A B staff
    And Admin click button ADD Pilihan A B staff
    Then Admin click button OK Pilihan A B staff

  Scenario: Admin Add Soal PILIHAN (A/B) STAFF tanpa gambar
    #When Admin insert soal Pilihan A B staff no 2
    And Admin insert jawaban A Pilihan A B staff no 2
    And Admin insert jawaban B Pilihan A B staff no 2
    And Admin choose kunci jawaban Pilihan A B staff no 2
    And Admin click button ADD no 2 Pilihan A B staff
    Then Admin click button OK no 2 Pilihan A B staff

  Scenario: Admin Edit PILIHAN (A/B) STAFF
    #When Admin click button edit soal  Pilihan A B staff no 2
    And Admin edit jawaban Pilihan A B staff no 2
    And Admin edit pilihan kunci jawaban Pilihan A B staff no 2
    And Admin click button update soal Pilihan A B staff no 2
    And Admin click close form pemberitahuan update soal Pilihan A B staff no 2
    Then Admin click button close form soal Pilihan A B staff no 2

  Scenario: Admin Add Deskripsi dan Ketentuan Soal PG LEADER
    When Admin click button form add deskripsi dan ketentuan modul PG leader
    And Admin edit Deskripsi Modul PG leader
    And Admin edit Ketentuan Soal PG leader
    And Admin click button ADD deskripsi dan ketentuan pg leader
    Then Admin click button close form deskripsi dan ketentuan pg leader

  Scenario: Admin Add Deskripsi dan Ketentuan Soal PG STAFF
    When Admin click button form add deskripsi dan ketentuan modul PG staff
    And Admin edit Deskripsi Modul PG staff
    And Admin edit Ketentuan Soal PG staff
    And Admin click button ADD deskripsi dan ketentuan pg staff
    Then Admin click button close form deskripsi dan ketentuan pg staff

  Scenario: Admin Add Deskripsi dan Ketentuan Soal ESAI FREE TEXT LEADER
    When Admin click button form add deskripsi dan ketentuan modul esai free text leader
    And Admin edit Deskripsi Modul esai free text leader
    And Admin edit Ketentuan Soal esai free text leader
    And Admin click button ADD deskripsi dan ketentuan esai free text leader
    Then Admin click button close form deskripsi dan ketentuan esai free text leader

  Scenario: Admin Add Deskripsi dan Ketentuan Soal ESAI FREE TEXT STAFF
    When Admin click button form add deskripsi dan ketentuan modul esai free text staff
    And Admin edit Deskripsi Modul esai free text staff
    And Admin edit Ketentuan Soal esai free text staff
    And Admin click button ADD deskripsi dan ketentuan esai free text staff
    Then Admin click button close form deskripsi dan ketentuan esai free text staff

  Scenario: Admin Add Deskripsi dan Ketentuan Soal Enum (Ya/Tidak) LEADER
    When Admin click button form add deskripsi dan ketentuan modul enum ya tidak leader
    And Admin edit Deskripsi Modul enum ya tidak leader
    And Admin edit Ketentuan Soal enum ya tidak leader
    And Admin click button ADD deskripsi dan ketentuan enum ya tidak leader
    Then Admin click button close form deskripsi dan ketentuan enum ya tidak leader

  Scenario: Admin Add Deskripsi dan Ketentuan Soal Enum (Ya/Tidak) STAFF
    When Admin click button form add deskripsi dan ketentuan modul enum ya tidak staff
    And Admin edit Deskripsi Modul enum ya tidak staff
    And Admin edit Ketentuan Soal enum ya tidak staff
    And Admin click button ADD deskripsi dan ketentuan enum ya tidak staff
    Then Admin click button close form deskripsi dan ketentuan enum ya tidak staff

  Scenario: Admin Add Deskripsi dan Ketentuan Soal ESAI LENGTH LEADER
    When Admin click button form add deskripsi dan ketentuan modul esai length leader
    And Admin edit Deskripsi Modul esai length leader
    And Admin edit Ketentuan Soal esai length leader
    And Admin click button ADD deskripsi dan ketentuan esai length leader
    Then Admin click button close form deskripsi dan ketentuan esai length leader

  Scenario: Admin Add Deskripsi dan Ketentuan Soal ESAI LENGTH STAFF
    When Admin click button form add deskripsi dan ketentuan modul esai length staff
    And Admin edit Deskripsi Modul esai length staff
    And Admin edit Ketentuan Soal esai length staff
    And Admin click button ADD deskripsi dan ketentuan esai length staff
    Then Admin click button close form deskripsi dan ketentuan esai length staff

  Scenario: Admin Add Deskripsi dan Ketentuan Soal PILIHAN (A/B) LEADER
    When Admin click button form add deskripsi dan ketentuan modul pilihan a b leader
    And Admin edit Deskripsi Modul pilihan a b leader
    And Admin edit Ketentuan Soal pilihan a b leader
    And Admin click button ADD deskripsi dan ketentuan pilihan a b leader
    Then Admin click button close form deskripsi dan ketentuan pilihan a b leader

  Scenario: Admin Add Deskripsi dan Ketentuan Soal PILIHAN (A/B) STAFF
    When Admin click button form add deskripsi dan ketentuan modul pilihan a b staff
    And Admin edit Deskripsi Modul pilihan a b staff
    And Admin edit Ketentuan Soal pilihan a b staff
    And Admin click button ADD deskripsi dan ketentuan pilihan a b staff
    Then Admin click button close form deskripsi dan ketentuan pilihan a b staff

  Scenario: Admin Edit Modul PG Leader
    When Admin click button edit modul PG leader
    And Admin edit status modul PG leader
    And Admin click button UPDATE pg leader
    Then Admin click button OK pemberitahuan pg leader

  Scenario: Admin Edit Modul PG Staff
    When Admin click button edit modul PG staff
    And Admin edit status modul PG staff
    And Admin click button UPDATE pg staff
    Then Admin click button OK pemberitahuan pg staff

  Scenario: Admin Edit Modul Esai Free Text Leader
    When Admin click button edit modul esai free text leader
    And Admin edit status modul esai free text leader
    And Admin click button UPDATE esai free text leader
    Then Admin click button OK pemberitahuan esai free text leader

  Scenario: Admin Edit Modul Esai Free Text Staff
    When Admin click button edit modul esai free text staff
    And Admin edit status modul esai free text staff
    And Admin click button UPDATE esai free text staff
    Then Admin click button OK pemberitahuan esai free text staff

  Scenario: Admin Edit Modul ENUM (YA/TIDAK) Leader
    When Admin click button edit modul enum ya tidak leader
    And Admin edit status modul enum leader
    And Admin click button UPDATE enum ya tidak leader
    Then Admin click button OK pemberitahuan enum ya tidak leader

  Scenario: Admin Edit Modul ENUM (YA/TIDAK) Staff
    When Admin click button edit modul enum ya tidak staff
    And Admin edit status modul enum staff
    And Admin click button UPDATE enum ya tidak staff
    Then Admin click button OK pemberitahuan enum ya tidak staff

  Scenario: Admin Edit Modul ESAI LENGTH Leader
    When Admin click button edit modul esai length leader
    And Admin edit status modul esai length leader
    And Admin click button UPDATE esai length leader
    Then Admin click button OK pemberitahuan esai length leader

  Scenario: Admin Edit Modul ESAI LENGTH Staff
    When Admin click button edit modul esai length staff
    And Admin edit status modul esai length staff
    And Admin click button UPDATE esai length staff
    Then Admin click button OK pemberitahuan esai length staff

  Scenario: Admin Edit Modul PILIHAN (A/B) Leader
    When Admin click button edit modul pilihan a b leader
    And Admin edit status modul pilihan a b leader
    And Admin click button UPDATE pilihan a b leader
    Then Admin click button OK pemberitahuan pilihan a b leader

  Scenario: Admin Edit Modul PILIHAN (A/B) Staff
    When Admin click button edit modul pilihan a b staff
    And Admin edit status modul pilihan a b staff
    And Admin click button UPDATE pilihan a b staff
    Then Admin click button OK pemberitahuan pilihan a b staff



































