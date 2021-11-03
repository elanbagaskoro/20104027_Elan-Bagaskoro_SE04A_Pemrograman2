# MODUL 3 : PENGENALAN PEMROGRAMAN BERIORIENTASI OBJEK

## Dasar Teori 
* Pemrograman Berorientasi Objek\
Pemrograman Berorientasi Objek atau Object Oriented Programming(OOP) adalah suatu metode pemrograman yang berorientasi pada objek. Program-program yang telah ada merupakan gabungan dari beberapa komponen-komponen kecil yang sudah ada sebelumnya.
* Mendeklarasikan suatu class\
Mendeklarasikan suatu class beertujuan untuk menjadi wadah yang berisi abstraksi dari suatu fungsi objek.
```java
<modifier> class <nama_class> {
[isi class]
}
Contoh : public class Mobil{ }
```
* Mendeklarasikan suatu atribut\
Mendeklarasikan suatu artibut bertujuan untuk merepresentasikan karakteristik dari suatu objek.
```java
<modifier> <tipe> <nama_atribut> ;
Contoh : public String warna;
```
* Mendeklarasikan suatu metode\
Mendeklarasikan suatu metode bertujuan untuk menentukan apa yang terjadi ketika objek itu dibuat serta berbagai operasi yang dapat dilakukan objek.
```java
<modifier> <return_type> <nama_metode>
([daftar_argumen])
[<statement>]
}
Contoh : public void info(){
System.out.println(warna);}
```
* Mengakses anggota suatu obyek\
Mengakses anggota suatu obyek bertujuan untuk dapat mengakses anggota-anggota dari suatu obyek
```java
public class Mobil {
public static void main(String args[])
{ Mobil m=new Mobil();
m.warna=”hitam”;
m.no_Plat=”KT 2837 UE”;
m.info();
}
}
```

<hr>

## Praktikum
Soal : 
Mengimplementasikan UML class diagram dalam program untuk class Tabungan

Jawaban :
* [Transformasi class diagram ke dalam bentuk program](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul3/src/Modul3/latihan/tabungan.java)
* [Program pengetesan](https://github.com/elanbagaskoro/20104027_Elan-Bagaskoro_SE04A_Pemrograman2/blob/Modul3/src/Modul3/latihan/testabungan.java)
* Hasil running :
```java
Saldo awal : 10000
Jumlah uang yang disimpan : 8000
Jumlah uang yang diambil : 7000 ok
Jumlah uang yang disimpan : 1000
Jumlah uang yang diambil : 10000 ok
Jumlah uang yang diambil : 2500 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 4000
```
