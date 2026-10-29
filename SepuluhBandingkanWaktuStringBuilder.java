/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.StringBuilder;

/**
 *
 * @author HYPE AMD
 */
public class SepuluhBandingkanWaktuStringBuilder {
    public static void main(String[] args) {
        int jumlahLoop = 100000;

        // 1. UJI COBA MENGGUNAKAN STRING (+=)
        long startTimeString = System.nanoTime();
        String str = "";
        for (int i = 0; i < jumlahLoop; i++) {
            str += i; // Membuat objek String baru di memori setiap kali iterasi
        }
        long endTimeString = System.nanoTime();
        long durasiString = endTimeString - startTimeString;

        // 2. UJI COBA MENGGUNAKAN STRINGBUILDER (.append)
        long startTimeSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jumlahLoop; i++) {
            sb.append(i); // Mengubah/menambah buffer internal tanpa membuat objek baru
        }
        long endTimeSB = System.nanoTime();
        long durasiSB = endTimeSB - startTimeSB;

        // TAMPILKAN HASIL DALAM MILIDETIK (ms) & NANODETIK (ns)
        System.out.println("--- Hasil Pengujian (100.000 Angka) ---");
        System.out.println("Waktu String (+=)           : " + (durasiString / 1_000_000.0) + " ms (" + durasiString + " ns)");
        System.out.println("Waktu StringBuilder (append): " + (durasiSB / 1_000_000.0) + " ms (" + durasiSB + " ns)");
        
        System.out.println("\nKesimpulan: StringBuilder jauh lebih cepat karena bersifat mutable (dapat diubah langsung tanpa alokasi memori berulang).");
    }
}