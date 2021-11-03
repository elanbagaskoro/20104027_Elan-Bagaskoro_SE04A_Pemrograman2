# MODUL 4 : DASAR PEMROGRAMAN BERIORIENTASI OBJEK

## Dasar Teori
* Information Hiding merupakan cara menyembunyikan atribut dan method dari objek lain. Salah satu caranya yaitu dengan memberikan akses "private" ketika mendeklarasikan suatu atribut dan method. Contoh :
```java
private int nilai;
```
* Encapsulation merupakan cara untuk menyembunyikan implementasi yang lebih detail dari suatu class. 2 hal dasar dari Encapsulation adalah sbb :
1. Information hiding.
2. Menyediakan suatu perantara (method) untuk pengaksesan data.

Contoh :
```java
public class Siswa {
private int nilai;
public void setnilai(int n) {
nilai=n; }
}
```
* Contructor adalah method yang pertama dijalankan ketika pembuatan objek. Berikut karakteristik dari Constructor :
1. Harus memiliki nama yang sama dengan class.
2. Tidak mengembalikan suatu nilai.
3. Satu class memiliki lebih dari 1 constructor.
4. Dapat ditambahkan akses modifier public, private, protected atau default.
5. Dapat dipanggil oleh constructor lain.
```java
Class Nama_kelas {
Nama_kelas() //ini adalah constructor
{
//isi konstruktor
}
//isi dari kelas }
```
Contoh :
```java
public class Siswa {
private int nilai;
private String nama;
public Siswa(int n, String m) {
nilai= n;
nama= m;} }
```
* Overloading Constructor merupakan class yang memiliki lebih dari 1 constructor, tetapi parameter tidak boleh sama. Contoh :
```java
public class Siswa {
```
```java
private int nilai;
public Siswa() {
nilai=0;}
public Siswa(int n) {
nilai=n;}
}
```

<hr>

## Praktikum
Soal :\
Buatlah 2 class dalam project kalian kemudia beri nama dan isi sebagai
berikut :
* [StudentRecord](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul4/src/Modul4/latihan/StudentRecord.java)
* [StudentRecordExample](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul4/src/Modul4/latihan/StudentRecordExample.java)

Hasil running :
```java
Wahyu
Hitung=0
```
Analisa :\
Program diatas menggunakan konsep Encapsulation yang dimana saat membuat variable, variable yang digunakan merupakan variable yang disembunyikan atau "private".\
Lalu program tersebut memiliki hasil running "Wahyu, Hitung=0" dikarenakan pada line ke-13 di class StudentRecordExample yaitu System.out.println(Wahyu.getName()) yang dimana line tersebut memanggil Wahyu.getName(). Lalu pada output "Hitung=0" terjadi karena program memanggil StudentRecord.getStudentCount() yang dimana getStudentCount() melakukan return kepada studentCount yang dimana studentCount berisi 0.

