package Modul2.latihan;

import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan jumlah testcase : ");
        int test = masukan.nextInt();
        for (int i = 0; i < test; i++) {
            System.out.print("Masukan nilai A" + (i+1) + ": ");
            int a = masukan.nextInt();
            System.out.print("Masukan nilai B" + (i+1) + ": ");
            int b = masukan.nextInt();
            System.out.print("Masukan nilai C" + (i+1) + ": ");
            int c = masukan.nextInt();
            int[] aa = new int[test];
            int[] bb = new int[test];
            int[] cc = new int[test];
            aa[i] = a;
            bb[i] = b;
            cc[i] = c;
            int d = aa[i] + bb[i] - cc[i];
            System.out.println(d);
        }
    }
}
