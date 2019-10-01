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
public class BukuMain {

    public static void main(String[] args) {
        System.out.println("INFORMASI BUKU");
        Buku b1 = new Buku();
        b1.infoBuku();
        
        System.out.println("");
        System.out.println("INFORMASI BUKU");
        
        Buku b2 = new Buku("Megan Mulry", "Royal Pain", 2015, 1, 20000);
        b2.infoBuku();
        

    }
}
