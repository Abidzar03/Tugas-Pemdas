/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.ArrrayMultidimensi;

/**
 *
 * @author HYPE AMD
 */
public class LimaPendataanMahasiswa3D {
    public static void main(String[] args) {
        // Deklarasi array 3 Dimensi
        // Dimensi 1: 3 Program Studi
        // Dimensi 2: 3 Kelas per Program Studi
        // Dimensi 3: 5 Mahasiswa per Kelas
        String[][][] dataMahasiswa = new String[3][3][5];

        // Nama-nama program studi (hanya untuk tampilan agar lebih rapi)
        String[] namaProdi = {"Teknik Informatika", "Sistem Informasi", "Teknik Komputer"};
        String[] namaKelas = {"Kelas A", "Kelas B", "Kelas C"};

        // 1. MENGISI DATA (Populate Data)
        // Menggunakan 3 nested loop untuk menelusuri array 3D
        for (int prodi = 0; prodi < dataMahasiswa.length; prodi++) {
            for (int kelas = 0; kelas < dataMahasiswa[prodi].length; kelas++) {
                for (int mhs = 0; mhs < dataMahasiswa[prodi][kelas].length; mhs++) {
                    // Mengisi dengan data dummy (contoh: "Mahasiswa 1")
                    dataMahasiswa[prodi][kelas][mhs] = "Mahasiswa " + (mhs + 1);
                }
            }
        }

        // 2. MENAMPILKAN DATA
        System.out.println("=== DATA MAHASISWA ===");
        
        for (int prodi = 0; prodi < dataMahasiswa.length; prodi++) {
            System.out.println("Program Studi: " + namaProdi[prodi]);
            
            for (int kelas = 0; kelas < dataMahasiswa[prodi].length; kelas++) {
                System.out.println("  " + namaKelas[kelas] + ":");
                
                for (int mhs = 0; mhs < dataMahasiswa[prodi][kelas].length; mhs++) {
                    // Menampilkan nama tiap mahasiswa di kelas tersebut
                    System.out.println("    - " + dataMahasiswa[prodi][kelas][mhs]);
                }
            }
            System.out.println(); // Jarak antar prodi
        }
    }
}