package Modul3.percobaan;

public class testTabungan {
    public static void main(String[] args) {
        tabungan t = new tabungan(5000);
        System.out.println("Saldo awal tabungan anda : " + t.saldo);
        t.ambilUang(1500);
        System.out.println("Jumlah uang yang diambil : 1500");
        System.out.println("Saldo tabungan anda sekarang adalah : " + t.saldo);
    }
}
