package Modul3.percobaan;

public class tabungan {
    int saldo;

    tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambilUang(int saldo) {
        this.saldo = this.saldo - saldo;
    }
}
