/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1d;

/**
 *
 * @author Ali Imron SaefullahE41202285 - WEEK 3 Array 1Dimensi
 */
public class Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] angka = {4, 7, 8, 11, 13, 17, 18, 19, 21,};
        String[] teks = {"Saya", "Mahasiswa", "POLIJE", "Prodi","Tif"};
        
        for (int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for (int j=0; j<teks.length; j++){
            System.out.print (teks[j]);
            System.out.print (" ");
        }
  }
    
}
