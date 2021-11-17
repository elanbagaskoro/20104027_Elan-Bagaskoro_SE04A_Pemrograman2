# MODUL 6 : KONSEP INHERITANCE

## Dasar Teori 
Dalam konsep inheritance, sebuah class bisa memiliki class turunan. Class yang menjadi inti class atau yang mempunyai turunan dinamakan "parent" class atau "base" class. Sedangkan turunannya dinamakan "child" class atau "subclass".\
Dalam Java, untuk mendeklarasikan suuatu subclass bisa dengan menambahkan kunci extends diikuti dengan nama parent class, seperti contoh berikut :
```java
public class B extends A {
...
}
```
Ada juga kata kunci *super* yang dipakai untuk merujuk pada member dari parent class. Ada beberapa hal yang harus diingat ketika menggunakan pemanggil construktur super, diantaranya :
1. super() harus dijadikan pernyataan pertama.
2. super() hanya dapat digunakan dalam definisi constructor.
3. this() dan super() tidak boleh disatukan dalam constructor yang sama.
