# MODUL 2 : DASAR PEMROGRAMAN JAVA

## Dasar Teori 
* Keyword dalam java\
Keyword adalah kata kunci yang digunakan dalam bahasa pemrograman. salah satunya adalah java, kata kunci ini digunakan pada sebuah class/variable/method/konstruktor, untuk menentukan sifat, jenis atau hak akses yang digunakan, didalam java terdapat banyak sekali jeni keyword yang bisa kita gunakan, terdapat 50 jenis kata kunci pada Java.
* Tipe Dasar\
Tipe Dasar pada java terdapat 8 tipe dasarm yaitu boolean, char, byte, short, int, long, float, dan double.
* Variabel\
Variabel pada java mrmiliki tipe data dan nama. Dan variabel sendiri adalah sebuah item yang digunakan untuk menyimpan suatu objek.
* Casting dan Promotion\
Casting adalah proses mengkonversi suatu tipe data ke tipe data yang lebih kecil/panjang. Sedangkan promotion adalah proses terjadinya sebuah casting.\
Contoh :
```java
int p = (int) 10L;
long i = 10;
```

<hr>

## Praktikum
Soal :
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A+B+C

Jawaban :
1. [Soal 1](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul2/src/Modul2/latihan/biginteger.java)
```java
long p = 2147483648;
```
Program diatas akan mengalami error jika dijalankan dan akan menampilkan "Integer number too large". Maka untuk mengatasinya bisa dengan menambahkan huruf(suffix) "L" dibelakang angka.\
Contoh :
```java
long p = 2147483648L;
```
2. [Soal 2](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul2/src/Modul2/latihan/anakayam.java)
Hasil output :
```java
Anak ayam turun 10
Mati 1 tinggal 9
Anak ayam turun 9
Mati 1 tinggal 8
Anak ayam turun 8
Mati 1 tinggal 7
Anak ayam turun 7
Mati 1 tinggal 6
Anak ayam turun 6
Mati 1 tinggal 5
Anak ayam turun 5
Mati 1 tinggal 4
Anak ayam turun 4
Mati 1 tinggal 3
Anak ayam turun 3
Mati 1 tinggal 2
Mati 1 tinggal induknya
```
3. [Soal 3](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul2/src/Modul2/latihan/abc.java)
Hasil output :
```java
Masukan jumlah testcase : 2
Masukan nilai A1: 2
Masukan nilai B1: 3
Masukan nilai C1: 4
1
Masukan nilai A2: -1
Masukan nilai B2: -3
Masukan nilai C2: -7
3
```
