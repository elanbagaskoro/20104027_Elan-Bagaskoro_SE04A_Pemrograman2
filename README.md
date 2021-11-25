# MODUL 7 : OVERLOADING DAN OVERRIDING

## Dasar Teori
* Overloading

Overloading adalah suatu keadaan dimana sebuah method memiliki nama yang sama pada suatu class tapi dengan parameter yang berbeda.

Ciri-ciri overloading :
1. Nama method sama
2. Daftar parameter berbeda
3. Return type boleh sama, boleh berbeda

Contoh :
```java
public void print( String temp ) {
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade) System.out.println("Name:" + name);
    System.out.println("Math Grade:" + mGrade);
    System.out.println("English Grade:" + eGrade);
    System.out.println("Science Grade:" + sGrade);
}
```

* Overriding

Overriding adalah mekanisme yang dimana sebuah metode dapat dideklarasikan ulang pada kelas turunannya.

Ciri-ciri overriding :
1. Nama method sama
2. Daftar parameter sama
3. Return type sama

Contoh :
```java
class Dulu {
    public String RupiahVsDolar() {
    System.out.println(“Rp 10.000”);
  }
}
class Sekarang extends Dulu {
    public String RupiahVsDolar() {
    System.out.println(“Rp 14.000”);
  }
}
```
