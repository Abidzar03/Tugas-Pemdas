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
        
        
        StringBuilder sb = new StringBuilder(kalimatAsli);

        
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
            }
        }

        System.out.println("Kalimat Asli : " + kalimatAsli);
        System.out.println("Hasil        : " + sb.toString());
    }
}
