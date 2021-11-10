# MODUL 5 : MENGELOLA CLASS

## Dasar Teori 
* Package\
Package adalah suatu cara untuk menage class yang dibuat, package akan bermanfaat jika class yang dibuat memiliki jumlah yang banyak. berikut adalah sintak pernyataan package untuk meletakan hasil kompilasi sebuah class kedalam package :
```java
package nama-paket;
<identifier> class <nama_class sama dengan package>
Contoh : package Utama;
public class Utama{ }
```
* Import Class\
Import adalah suatu perintah unruk memberitahu kepada program untuk mengacu pada class yang terdapat dalam package.

Deklarasi import class :
```java
import <nama_package>.*;
Contoh : import matematik.*;
```
Deklarasi import class :
```java
import <nama_package>.<nama_class>;
Contoh : import matematik.bilangan;
```
Contoh penggunaan import :
```java
import matematik.bilangan;
class Utama {
  public static void main(String[] args) {
    Bilangan x = new Bilangan(); x.setDesimal(- 44);
    System.out.println("Bilangan biner dari "+ x.getDesimal() + " adalah "+ x.biner()); 
  }
}
```
* Kata kunci\
Kata kunci adalah suatu yang digunakan dalam sebuah class untuk menyatakan object sekarang. Berikut format pernulisannya :
1. this.data_member       = merujuk pada data member
2. this.function_member() = merujuk pada function member
3. this()                 = merujuk pada konsturktor

<hr>

## Praktikum
Soal : 
Transformasikan class diagram diatas ke dalam bentuk program! Tulislah
listing program berikut ini sebagai pengetesan.

Jawaban :
* [Transformasi program Nasabah](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul5/src/Modul5/latihan/Nasabah.java)
* [Transformasi program Tabungan](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul5/src/Modul5/latihan/Tabungan.java)
* [Program TesLatihan](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul5/src/Modul5/latihan/TesLatihan.java)
* Hasil running :
```java
Nasabah atas nama : Agus Daryanto
Saldo awal : 5000
Jumlah uang yang disimpan : 3000
Jumlah uang yang diambil : 6000 ok
Jumlah uang yang disimpan : 3500
Jumlah uang yang diambil : 4000 ok
Jumlah uang yang diambil : 1600 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 3500
```
