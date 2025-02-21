Aplikasi Perhitungan Diskon

Deskripsi

Aplikasi ini digunakan untuk menghitung total harga setelah diberikan diskon berdasarkan input harga dan persentase diskon yang dimasukkan oleh pengguna. Aplikasi ini menggunakan Material Design untuk tampilan yang lebih menarik dan responsif.

Fitur

Input harga dan diskon dengan validasi otomatis.

Menampilkan harga asli, diskon yang diterapkan, dan total harga setelah diskon.

Menggunakan Material Components untuk tampilan modern.

Jika input harga atau diskon kosong, otomatis diatur menjadi 0.

Validasi input untuk memastikan diskon tidak lebih dari 100% dan harga tidak negatif.

Teknologi yang Digunakan

Bahasa Pemrograman: Java

Framework: Android SDK

UI Components: Material Components, CardView

IDE: Android Studio

Cara Menggunakan

Masukkan harga produk di kolom "Masukkan Harga".

Masukkan persentase diskon di kolom "Masukkan Diskon (%)".

Tekan tombol "Hitung Diskon".

Hasil perhitungan akan ditampilkan di bawah dalam CardView.

Struktur Proyek

/app
 ├── java/com/example/ukkfauzan
 │   ├── MainActivity.java
 │
 ├── res/
 │   ├── layout/
 │   │   ├── activity_main.xml
 │   ├── values/
 │   │   ├── colors.xml
 │   │   ├── strings.xml
 │
 ├── AndroidManifest.xml

Dependencies

Tambahkan dependensi berikut ke build.gradle (Module: app):

implementation 'com.google.android.material:material:1.9.0'

Catatan Tambahan

Pastikan menggunakan AndroidX.

Gunakan emulator atau perangkat fisik dengan Android 6.0+ untuk kompatibilitas optimal.

Jangan lupa untuk mengatur android:theme ke Theme.MaterialComponents di AndroidManifest.xml agar UI tetap konsisten.

Lisensi

Aplikasi ini bersifat open-source dan dapat digunakan serta dimodifikasi sesuai kebutuhan.
