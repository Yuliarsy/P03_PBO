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
public class Project1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi ();
        
        int LuasTotal ;
        LuasTotal = persegi.hitungLuas(42)+(2 * lingkaran.hitungLuas(21));
        System.out.println("Luas Luas Bangun tersebut adalah "+LuasTotal+" cm^2");
    }
    
}
