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
public class Buku {

    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;
    
    public Buku () {
         this.namaPengarang = "Rene Suhardono";
        this.judulBuku = "UltimateU";
        this.tahunTerbit = 2016;
        this.cetakanKe = 1;
        this.hargaJual = 25000;
    }

    public Buku(String np, String jb, int tt,
            int ck, double hj) {
        this.namaPengarang = np;
        this.judulBuku = jb;
        this.tahunTerbit = tt;
        this.cetakanKe = ck;
        this.hargaJual = hj;
    }

    public void setNamaPengarang(String np) {
        this.namaPengarang = np;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setJudulBuku(String jb) {
        this.judulBuku = jb;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setTahunTerbit(int tt) {
        this.tahunTerbit = tt;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setCetakanKe(int ck) {
        this.cetakanKe = ck;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setHargaJual(double hj) {
        this.hargaJual = hj;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void infoBuku() {
        System.out.println("Nama Pengarang : " + getNamaPengarang());
        System.out.println("Judul buku : " + getJudulBuku());
        System.out.println("Tahun Terbit : " + getTahunTerbit());
        System.out.println("Cetakan ke : " + getCetakanKe());
        System.out.println("Harga Jual : " + getHargaJual());
    }
}
