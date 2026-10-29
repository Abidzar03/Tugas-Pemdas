/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.StringBuilder;

/**
 *
 * @author HYPE AMD
 */
public class DelapanHapusSpasiStringBuilder {
    public static void main(String[] args) {
        String kalimatAsli = "Belajar Pemrograman Java Sangat Seru";
        
        // Membuat objek StringBuilder dengan isi kalimat asli
        StringBuilder sb = new StringBuilder(kalimatAsli);

        // Menelusuri kalimat dari karakter terakhir ke awal
        // (Iterasi mundur digunakan agar indeks tidak bergeser saat ada karakter yang dihapus)
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i); // Menghapus karakter spasi pada indeks ke-i
            }
        }

        System.out.println("Kalimat Asli : " + kalimatAsli);
        System.out.println("Hasil        : " + sb.toString());
    }
}