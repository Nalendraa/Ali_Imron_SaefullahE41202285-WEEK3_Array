/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi_tugas.e.week3;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

public class Revisi_TugasEWeek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in);
        
        System.out.println("                        Warkop MbahAli");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                        MENU UTAMA");
        System.out.println(" 1. Es Kopi Arabika");
        System.out.println(" 2. Kopi Panas");
        System.out.println(" 3. Es Rasa-Rasa");
        System.out.println(" 4. Indomie Goreng");
        System.out.println(" 5. Indomie Kuah");
        System.out.println("----------------------------------------------------------------");
        
        System.out.println("Masukkan No. Pesanan : ");
        short no = scan.nextShort();
        System.out.println(" Pilih Menu :   ");
        
            int mu = scan.nextInt();
            String pilih ="";
            
                switch(mu) {
                    case 1:
                        pilih = "Es Kopi Arabika";
                        break;
                    case 2:
                        pilih = "Kopi Panas";
                        break;
                    case 3:
                        pilih = "Es Ras-Rasa";
                        break;      
                    case 4:
                        pilih = "Indomie Goreng";
                        break;
                   case 5:
                        pilih = "Indomie Kuah";
                        break;     
                   default:
                       System.out.println("Menu Tidak Ditemukan");
                       break;
                }
                
         System.out.println("Anda memesan : "    + pilih);
         System.out.println("Pesanan anda segera di proses");
         System.out.println("Terimaksaih Sudah memesan di MbahAli");
    }
    
}
