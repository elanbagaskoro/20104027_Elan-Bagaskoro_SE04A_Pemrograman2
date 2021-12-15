# MODUL 8 : POLIMORFISME

## Dasar Teori
Polymorphism atau Polimorfisme adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda.

VMI (Virtual Method Invocation) bisa terjadi jika terjadi polimorfisme dan overriding. Dan berikut Contohnya :
```java
class Parent {
    int x = 5;
    public void Info() {
    System.out.println(“Ini class Parent”);
  }
}
class Child extends Parent {
    int x = 10;
    public void Info() {
    System.out.println(“Ini class Child”);
  }
}
public class Tes {
    public static void main(String args[]) {
    Parent tes=new Child();
    System.out.println(“Nilai x = “ + tes.x);
    tes.Info();
  }
}
```
Hasil runningnya sebagai berikut :
```
Nilai x = 5
Ini class Child
```
Polymorphic arguments adalah tipe suatu parameter yang menerima nilai yang bertipe subclassnya. Berikut contohnya :
```java
class Pegawai {
    ...
}
class Manajer extends Pegawai {
    ...
}
public class Tes {
    public static void Proses(Pegawai peg) {
    ...
}
public static void main(String args[]) {
    Manajer man = new
    Manajer(); 
    Proses(man);
}
```
Pernyataan instanceof berguna untuk mengetahui tipe asal dari suatu polymorphic arguments. Berikut contoh yang sudah sedikit dimodifikasi :
```java
...
class Kurir extends Pegawai {
    ...
}
public class Tes {
    public static void Proses(Pegawai peg) {
    if (peg instanceof Manajer) {
    ...lakukan tugas-tugas manajer...
    } else if (peg instanceof Kurir) {
    ...lakukan tugas-tugas kurir...
    } else {
    ...lakukan tugas-tugas lainnya...
  }
}
public static void main(String args[]) {
    Manajer man = new
    Manajer();
    Kurir kur = new Kurir(); Proses(man);
    Proses(kur);
}
```
Berikut contoh casting object ke tipe asalnya :
```java
...
if (peg instanceof Manajer) {
  Manajer man = (Manajer) peg;
  ...lakukan tugas-tugas manajer...
}
```
