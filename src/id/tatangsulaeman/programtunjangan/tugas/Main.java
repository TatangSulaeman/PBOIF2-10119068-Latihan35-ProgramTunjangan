/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.programtunjangan.tugas;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan proses hitung gaji
 */
public class Main {
    public static void main(String[] args){
        System.out.println("----------Program Tunjangan----------");
        Gaji dataGaji = new Gaji();
        
        dataGaji.inputGajiPokok();
        dataGaji.inputUserStatus();
        
        System.out.println("----------Hasil Perhitungan Gaji Anda----------");
        System.out.println("Gaji Pokok\t : " + dataGaji.gajiPokok);
        System.out.println("Tunjangan\t : " + dataGaji.hitungTunjangan());
        System.out.println("Total Gaji\t : " + dataGaji.hitungGajiTotal());
        
    }
}

