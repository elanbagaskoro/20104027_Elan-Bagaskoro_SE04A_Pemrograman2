# MODUL 7 : OVERLOADING DAN OVERRIDING

## Dasar Teori
Overloading adalah suatu keadaan dimana sebuah method memiliki nama yang sama pada suatu class tapi dengan parameter yang berbeda. Contoh :
```java
public void print( String temp ){
System.out.println("Name:" + name);
System.out.println("Address:" +
address); System.out.println("Age:" +
age);
}
public void print(double eGrade, double mGrade, double
sGrade) System.out.println("Name:" + name);
System.out.println("Math Grade:" + mGrade);
System.out.println("English Grade:" + eGrade);
System.out.println("Science Grade:" + sGrade);
}
```
