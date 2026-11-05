/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.StringBuilder;

/**
 *
 * @author HYPE AMD
 */
public class SembilanPemisahRibuanStringBuilder {
    public static void main(String[] args) {
        String angka = "1234567";
        StringBuilder sb = new StringBuilder(angka);

        
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, "."); 
        }

        System.out.println("Angka Asli   : " + angka);
        System.out.println("Format Ribuan: " + sb.toString());
    }
}
