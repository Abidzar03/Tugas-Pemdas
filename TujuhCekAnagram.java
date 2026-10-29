/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.String;

/**
 *
 * @author HYPE AMD
 */
import java.util.Arrays;

public class TujuhCekAnagram {
    public static void main(String[] args) {
        // Dua kata yang akan dicek
        String kata1 = "listen";
        String kata2 = "silent";

        System.out.println("Kata 1: " + kata1);
        System.out.println("Kata 2: " + kata2);

        // Langkah 1: Hapus spasi (jika ada) dan ubah ke huruf kecil semua
        // Ini agar pengecekan tidak sensitif terhadap huruf besar/kecil
        String k1 = kata1.replaceAll("\\s", "").toLowerCase();
        String k2 = kata2.replaceAll("\\s", "").toLowerCase();

        // Langkah 2: Cek apakah panjang kedua kata sama
        if (k1.length() != k2.length()) {
            System.out.println("\nHasil: BUKAN Anagram (Panjang kata berbeda)");
        } else {
            // Langkah 3: Ubah string menjadi array karakter (char[])
            char[] arrayChar1 = k1.toCharArray();
            char[] arrayChar2 = k2.toCharArray();

            // Langkah 4: Urutkan array karakter sesuai abjad (A-Z)
            Arrays.sort(arrayChar1);
            Arrays.sort(arrayChar2);

            // Langkah 5: Bandingkan apakah kedua array yang sudah diurutkan tersebut sama persis
            boolean isAnagram = Arrays.equals(arrayChar1, arrayChar2);

            if (isAnagram) {
                System.out.println("\nHasil: KEDUA KATA ADALAH ANAGRAM!");
            } else {
                System.out.println("\nHasil: BUKAN Anagram (Huruf tidak cocok)");
            }
        }
    }
}