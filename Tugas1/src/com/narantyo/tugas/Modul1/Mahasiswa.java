package com.narantyo.tugas.Modul1;

public class Mahasiswa {
    String nama, ttl, alamat, agama, kelamin, pilJurusan, email;
    int nilairapot, hp;

    // Constractor
    public Mahasiswa(String nama, String ttl, String alamat, String agama, String kelamin, String pilJurusan, String email, int hp, int nilairapot) {
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.agama = agama;
        this.kelamin = kelamin;
        this.pilJurusan = pilJurusan;
        this.email = email;
        this.hp = hp;
        this.nilairapot = nilairapot;
    }
}