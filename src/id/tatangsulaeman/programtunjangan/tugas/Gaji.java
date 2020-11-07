/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.programtunjangan.tugas;

import java.util.Scanner;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan proses hitung gaji
 */
public class Gaji {
    Scanner scanner = new Scanner(System.in);
    Double gajiPokok,gajiTotal;
    String status;
    
    public double inputGajiPokok() {
       System.out.print("Berapa gaji pokok anda perbulan?: ");
       gajiPokok = scanner.nextDouble();
       return gajiPokok;
    }
    
    public String inputUserStatus() {
       System.out.print("Status anda? (Menikah/Belum): ");
       status = scanner.next();
       return status;
    }
    
    public double hitungTunjangan(){
        double tunjangan;
        if (status.equals("menikah") || status.equals("Menikah")) {
           tunjangan = 0.35 * gajiPokok;
        } else {
           tunjangan = 0 ;
        }
        return tunjangan;
    }
    
    public double hitungGajiTotal(){
        gajiTotal = hitungTunjangan() + gajiPokok;
        return gajiTotal;
    }
}

