package Modul4.percobaan;

public class tabungan {
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    tabungan(String nama, int noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
    }

    tabungan(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String getNama() {
        return nama;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
