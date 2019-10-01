/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi2;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PelajarMain {
    public static void main(String[] args) {
        int nrp;
        String nama;
        double nilaiUjian1;
        double nilaiUjian2;
        double nilaiTugas;

        Scanner input = new Scanner(System.in);

        System.out.println("Identitas Mahasiswa : ");
        System.out.print("NRP\t\t : ");
        nrp = input.nextInt();
        System.out.print("Nama\t\t : ");
        nama = input.next();
        System.out.print("Nilai Ujian1\t : ");
        nilaiUjian1 = input.nextDouble();
        System.out.print("Nilai Ujian2\t : ");
        nilaiUjian2 = input.nextDouble();
        System.out.print("Nilai Tugas\t : ");
        nilaiTugas = input.nextDouble();

        System.out.println("=================================================");
        System.out.println("KETERANGAN");
        Pelajar p2 = new Pelajar();
        p2.status();
        
    }
}
