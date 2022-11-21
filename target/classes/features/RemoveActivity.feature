Feature: RemoveActivity user

Scenario: User search
  When User go to Web Psikotest Online
  And TCC.PO.020 menginput alamat email tanpa gmail dari data
  And TCC.PO.027 Mencari dan menampilkan data alamat email tanpa gmail dari data
  And TCC.PO.021 menginput alamat gmail lengkap dari data
  And TCC.PO.028 Mencari dan Menampilkan alamat gmail lengkap dari data
  And TCC.PO.022 menginput 4 angka nomor telepon dari data
  And TCC.PO.031 Mencari dan menampilkan data dengan 4 no telepon
  And TCC.PO.023 menginput angka nomor telepon lengkap dan menampilkan data
  And TCC.PO.032 Mencari dan menampilkan data dengan nomor telepon lengkap
  And TCC.PO.024 menginput 2 inisial nama user dari nama lengkap dari data nya
  And TCC.PO.029 Mencari dan menampilkan beberapa data dengan inisial 2 huruf
  And TCC.PO.025 menginput nama lengkap user dari tampilan  datanya
  And TCC.PO.030 Mencari dan Menampilkan beberapa data dengan nama yang lengkap
  And TCC.PO.026 menginput huruf kapital yang di dalam datanya
  And TCC.PO.033 Mencari dan menampilkan data dengan huruf kapital

  Scenario: User pages
    And TCC.PO.034 menambahkan tampilan data yang yang ingin dilihat dari 10
    And TCC.PO.035 menambahkan tampilan data yang yang ingin dilihat dari 25
    And TCC.PO.036 menambahkan tampilan data yang ingin dilihat dari 50
    And TCC.PO.037 menambahkan tampilan data yang yang ingin dilihat dari 100
    And TCC.PO.038 menambahkan tampilan data yang yang ingin dilihat dari 500

    Scenario: User delete
  And TCC.PO.039 Info pemberitahuan ingin di hapus atau tidak
  And TCC.PO.040 memilih status iya untuk menghapus
  Then TCC.PO.041 memilih status tidak untuk kembali