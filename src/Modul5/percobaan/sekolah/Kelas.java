package Modul5.percobaan.sekolah;

import Modul5.percobaan.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama) {
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mahasiswa = mhs;
    }
}
