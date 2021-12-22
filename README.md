# MODUL 9 : EXCEPTION

## Dasar Teori

Exception adalah kondisi abnormal saat menjalankan program. Karena dalam java semuanya merupakan objek, maka exception direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut.

Contohnya pada pembagian dengan bilangan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi.

Terdapat 2 penanganan exception, yaitu :
1. Menangani sendiri exception tersebut.
2. Meneruskan keluar dengan cara membuat objek exception tersebut kemudian dilempar atau throw keluar, dan akan ditangani oleh kode yang memanggil method.

Exception juga memiliki 5 keyword yang digunakan untuk menangani exception yaitu try, catch, finally, throw dan throws.

* Tipe-tipe Exception

Pada exception, superclass tertinggi yaitu class Throwable,
tetapi kita hampir tidak pernah menggunakan class ini secara langsung.
Dibawah class Throwable terdapat dua subclass yaitu class Error dan
class Exception.

* Blok try-catch

Penggunaan try-catch yaitu dengan meletakan kode program yang memungkinkan terjadinya exception didalam blok
try, diikuti dengan blok catch yang menentukan jenis exception yang
ingin ditangani.\
Contoh :
```java
public class Percobaan2 {
    public static void main(String[] args) { 
    int a[] = new int[5];
        try{
            a[5] = 100 ;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks Array melebihi batas");
        }
        System.out.println("Setelah blok try-catch"); 
    }
}
```
Output :
```
Terjadi exception karena Indeks Array melebihi batas Setelah blok try-catch
```
Kode yang terdapat dalam blok try mengakibatkan lebih dari satu exception. Kita dapat menuliskan lebih dari satu blok catch.\
Contoh :
```java
public class Percobaan5 {
    public static void main(String[] args) {
        int bil=10;
        String b[] = {"a","b","c"};
        try{
            System.out.println(bil/0);
            System.out.println(b[3]);
        } catch(ArithmeticException e){
            System.out.println("Error Aritmetik");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Kapasitas Array Melebihi Batas");
        } catch(Exception e){
            System.out.println("Terdapat Error");
        }
    }
}
```

* Finally

Finally bisa dibilang sama saja dengan menutup file.\
Contoh :
```java
public class Percobaan2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try{
            a[5] = 100 ;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception karena Indeks Array melebihi batas");
        } finally{
            System.out.println("Selalu Dijalankan");
        } System.out.println("Setelah blok try-catch");
    }
}
```

* Throw dan Throws

Throw digunakan untuk melempat exception dari program menggunakan keyword "throw". Sedangkan "throws" digunakan jika exception merupakan checked exception.\
Contoh :
```java
import java.io.FileNotFoundException;
public class Percobaan6 {
    public static void method1() throws
            FileNotFoundException { 
        throw new FileNotFoundException("File Tidak Ada");
    } public static void main(String[] args) {
        try {
            method1(); 
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());}
    }
}
```
