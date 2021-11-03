package Modul4.percobaan;

public class main {
    public static void main(String[] args) {
        tabungan saya = new tabungan("Barca", 50410420, 1000000, 12345);
        System.out.println("Nama \t : " + saya.getNama());
        System.out.println("noRekening \t : " + saya.getNoRekening());
        System.out.println("saldo \t : " + saya.getSaldo());
        System.out.println("pin \t : " + saya.getPin());
    }
}
