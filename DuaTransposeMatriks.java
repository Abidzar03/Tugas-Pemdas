/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.ArrrayMultidimensi;

/**
 *
 * @author HYPE AMD
 */
public class DuaTransposeMatriks {
    public static void main(String[] args) {
        // Mendeklarasikan matriks 3x3
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("--- Matriks Asli ---");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--- Hasil Transpose Matriks ---");
        // Transpose: menukar baris menjadi kolom dan sebaliknya
        // Loop luar (i) sekarang membaca batas kolom matriks asli
        for (int i = 0; i < matriks[0].length; i++) {
            // Loop dalam (j) sekarang membaca batas baris matriks asli
            for (int j = 0; j < matriks.length; j++) {
                // Menampilkan elemen dengan indeks dibalik: [baris][kolom] menjadi [kolom][baris]
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }
    }
}