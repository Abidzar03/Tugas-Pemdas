package tugas.String;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HYPE AMD
 */
public class LimaHitungJumlahKata {
    public static void main(String[] args) {
       
        String kalimat = "Belajar pemrograman Java itu sangat menyenangkan";

        System.out.println("Kalimat: \"" + kalimat + "\"");

    
        String[] kumpulanKata = kalimat.trim().split("\\s+");

       
        int jumlahKata = kumpulanKata.length;

        
        if (kalimat.trim().isEmpty()) {
            jumlahKata = 0;
        }

        System.out.println("Jumlah kata: " + jumlahKata);
    }
}
