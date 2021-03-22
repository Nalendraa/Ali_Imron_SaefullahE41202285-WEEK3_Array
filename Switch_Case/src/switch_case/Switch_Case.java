/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_case;

/**
 *
 * @author Ganggayaksa
 */

import java.util.Scanner;
public class Switch_Case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String kondisi;
    Scanner input = new Scanner(System.in);
    
        System.out.println("Masukkan keadaan kondisi     :       ");
        kondisi = input.nextLine();
        
            switch (kondisi)    {
                case "lapar" :
                    System.out.println("Indomie Goreng plus Telur");
                    break;
                case "hujan-hujan" :
                    System.out.println("Indomie Kuah");
                    break;
                case "kenyang" :
                    System.out.println("Indomie terossss");
                    break;
                default :
                    System.out.println("yang bener dong");
            }
    
    }
    
}
