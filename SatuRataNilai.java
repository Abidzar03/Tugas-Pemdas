/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.ArrrayMultidimensi;

/**
 *
 * @author HYPE AMD
 */
public class SatuRataNilai {
    public static void main(String[] args) {

        int[][] nilai = {
            {80, 85, 90, 88}, 
            {75, 70, 85, 90}, 
            {90, 95, 92, 89}  
        };

        System.out.println("--- Hasil Rata-rata Nilai ---");

        for (int i = 0; i < nilai.length; i++) {
            double total = 0; 
            
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            
            double rataRata = total / nilai[i].length;
            
            System.out.println("Rata-rata Mahasiswa " + (i + 1) + ": " + rataRata);
        }
    }
}

