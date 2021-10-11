/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Yulia Rakhmah
 */
public class Project2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        
        int LingkaranBesar = lingkaran.hitungLuas(14)/2;
        int LingkaranKecil = lingkaran.hitungLuas(7);
        int LuasTotal = LingkaranBesar - LingkaranKecil;
        System.out.println("Luas Bangun yang diarsir adalah "+LuasTotal+" cm^2");
    }
    
}
