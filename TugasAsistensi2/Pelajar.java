/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi2;

/**
 *
 * @author USER
 */
public class Pelajar {

    private int nrp;
    private String nama;
    private double nilaiUjian1;
    private double nilaiUjian2;
    private double nilaiTugas;

//    public Pelajar(int nrp, String nm, double nu1, double nu2, double t) {
//        this.nrp = nrp;
//        this.nama = nm;
//        this.nilaiUjian1 = nu1;
//        this.nilaiUjian2 = nu2;
//        this.nilaiTugas = t;
//    }

    public void setNRP(int nrp) {
        this.nrp = nrp;
    }

    public int getNRP() {
        return nrp;
    }

    public void setNama(String nm) {
        this.nama = nm;
    }

    public String getNama() {
        return nama;
    }

    public void setNilaiUjian1(double nu1) {
        this.nilaiUjian1 = nu1;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian2(double nu2) {
        this.nilaiUjian2 = nu2;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiTugas(double t) {
        this.nilaiTugas = t;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double nilaiAkhir() {
        double nilaiAkhir = 0.4 * getNilaiUjian1() + 0.4 * getNilaiUjian2() + 0.2 * getNilaiTugas();
        return nilaiAkhir;
    }

    public String isLulus() {
        String status;
        if (nilaiAkhir() >= 60) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }
        return status;
    }

    public void status() {
        System.out.println("NRP\t\t  : " + getNRP());
        System.out.println("Nama\t\t  : " + getNama());
        System.out.println("Nilai Ujian 1\t  : " + getNilaiUjian1());
        System.out.println("Nilai Ujian 2\t  : " + getNilaiUjian2());
        System.out.println("Nilai Tugas\t  : " + getNilaiTugas());
        System.out.println("Keterangan\t  : " +isLulus());
    }
}
