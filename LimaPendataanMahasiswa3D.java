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

        String[][][] dataMahasiswa = new String[3][3][5];
        String[] namaProdi = {"Teknik Informatika", "Sistem Informasi", "Teknik Komputer"};
        String[] namaKelas = {"Kelas A", "Kelas B", "Kelas C"};

        for (int prodi = 0; prodi < dataMahasiswa.length; prodi++) {
            for (int kelas = 0; kelas < dataMahasiswa[prodi].length; kelas++) {
                for (int mhs = 0; mhs < dataMahasiswa[prodi][kelas].length; mhs++) {
                   
                    dataMahasiswa[prodi][kelas][mhs] = "Mahasiswa " + (mhs + 1);
                }
            }
        }


        System.out.println("=== DATA MAHASISWA ===");
        
        for (int prodi = 0; prodi < dataMahasiswa.length; prodi++) {
            System.out.println("Program Studi: " + namaProdi[prodi]);
            
            for (int kelas = 0; kelas < dataMahasiswa[prodi].length; kelas++) {
                System.out.println("  " + namaKelas[kelas] + ":");
                
                for (int mhs = 0; mhs < dataMahasiswa[prodi][kelas].length; mhs++) {
                    
                    System.out.println("    - " + dataMahasiswa[prodi][kelas][mhs]);
                }
            }
            System.out.println(); 
        }
    }
}
