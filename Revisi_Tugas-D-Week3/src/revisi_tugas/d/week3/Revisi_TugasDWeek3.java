/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi_tugas.d.week3;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

public class Revisi_TugasDWeek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner a = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                            TOKO LOKAL");
        System.out.println("              Selamat Datang, Selamat Berbelanja");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Masukkan Nama Pembeli");
            String nama = a.nextLine();
        System.out.print ("Ada kartu member?");
        String card = a.nextLine();
            int[] barang = new int[5];
            int total = 0;
            for (int i = 0; i<barang.length; i++){
                System.out.print("Harga barang ke-" + (i +1) + " : ");
                barang[i] = a.nextInt();
                total = total + barang[i];
            }
            
         System.out.println("Total harga pembelian atas nama" + nama + "sebesar Rp. " + total);
         
            //Diskon//
            int diskon;
             if (card.equalsIgnoreCase ("yes") ) {
            if (total > 200000) {
                diskon = 10500;
             } else if (total > 100000) {
                 diskon = 5000;
             } else {
                 diskon = 0;
            }
            
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("               Terima Kasih telah berbelanja di Toko Lokal");
        System.out.println("                             Selamat Menikmati");


         }
     }
}
    

