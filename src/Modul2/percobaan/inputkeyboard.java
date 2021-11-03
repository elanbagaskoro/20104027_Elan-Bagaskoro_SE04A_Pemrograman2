package Modul2.percobaan;

import java.util.Scanner;

public class inputkeyboard {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int var_a;
        int var_b;
        System.out.println("Masukan nilai var_a : ");
        var_a = masukan.nextInt();
        System.out.println("Masukan nilai var_b : ");
        var_b = masukan.nextInt();
        System.out.println("Variabel tang terdapat dalam program");
        System.out.println("var_a : " + var_a);
        System.out.println("var_b : " + var_b);
    }
}
