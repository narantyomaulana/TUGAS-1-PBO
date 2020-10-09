package com.narantyo.tugas.Modul1;

public class BiodataKaryawan {
    private static String nama = "Mang Oleh";
    private static String ttl = "BANDUNG, 12 Desember 1999";
    private static String Kewarganegaraan = "Indonesia";
    private static String TinggiBadan = "173";
    private static String BeratBadan = "62";
    private static String alamat = "Jln. Pandjaitan Purwokerto";
    private static String kelamin = "Laki-Laki";
    private static String riwayat= "S1 Biomedis";
    private static String email = "mangoleh@gmail.com";
    private static String nomer = "0812992345";

    public static void main(String[] args) {

        // Output Biodata Karyawan
        System.out.println(" *** Biodata Karyawan  *** ");
        System.out.println("Nama Lengkap\t\t : " + nama);
        System.out.println("TTL\t\t\t\t\t : " + ttl);
        System.out.println("Kewarganegaraan\t\t : " + Kewarganegaraan);
        System.out.println("Tinggi Badan\t\t : " + TinggiBadan);
        System.out.println("Berat Badan\t\t\t : " + BeratBadan);
        System.out.println("Alamat\t\t\t\t : " + alamat);
        System.out.println("Jenis Kelamin\t\t : " + kelamin);
        System.out.println("Pendidikan Terakhir\t : " + riwayat);
        System.out.println("Email\t\t\t\t : " + email);
        System.out.println("Nomer HP\t\t\t : " + nomer);
    }
}