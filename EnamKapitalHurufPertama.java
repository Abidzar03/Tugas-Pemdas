/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.String;

/**
 *
 * @author HYPE AMD
 */
public class EnamKapitalHurufPertama {
    public static void main(String[] args) {
        
        String kalimat = "belajar pemrograman java itu sangat menyenangkan";
        System.out.println("Kalimat asli: " + kalimat);

       
        String[] kumpulanKata = kalimat.split(" ");
        String hasil = "";

        
        for (String kata : kumpulanKata) {
          
            if (kata.length() > 0) {
               
                String hurufPertama = kata.substring(0, 1).toUpperCase();
                
                
                String sisaHuruf = kata.substring(1).toLowerCase();
                
                
                hasil += hurufPertama + sisaHuruf + " ";
            }
        }

        // Menghapus spasi tambahan di akhir kalimat menggunakan trim()
        hasil = hasil.trim();
        
        System.out.println("Hasil       : " + hasil);
    }
}
