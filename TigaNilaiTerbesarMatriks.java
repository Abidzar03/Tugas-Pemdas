/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.ArrrayMultidimensi;

/**
 *
 * @author HYPE AMD
 */
public class TigaNilaiTerbesarMatriks {
    public static void main(String[] args) {
       
        int[][] matriks = {
            {10, 45, 20},
            {99, 15, 75},
            {33, 80, 50}
        };

        
        int max = matriks[0][0];
        int baris = 0;
        int kolom = 0;

       
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
               
                if (matriks[i][j] > max) {
                    max = matriks[i][j]; 
                    baris = i;           
                    kolom = j;          
                }
            }
        }

       
        System.out.println("--- Matriks ---");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

       
        System.out.println("\n--- Hasil Pencarian ---");
        System.out.println("Nilai terbesar  : " + max);
        System.out.println("Posisi          : Baris ke-" + baris + ", Kolom ke-" + kolom);
    }
}
