/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2d;

/**
 *
 * @author Ali Imron SaefullahE41202285 - WEEK 3 Array 2Dimensi
 */
public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [ ] [ ] angka = {{1, 3, 5, 7}, {9, 11, 13, 15}, {2, 4, 6, 8}};
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++){
                System.out.print (angka[baris] [kolom]+"   ") ;
            }
            System.out.println("");
        }
    }
    
}
