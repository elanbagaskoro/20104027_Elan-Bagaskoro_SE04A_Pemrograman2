package Modul3.latihan;

public class tabungan {
    public int saldo;
    public tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if ((saldo - jumlah) < 0)
            return false;
        else
            saldo -= jumlah;
        return true;
    }
}
