/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_elseif;

/**
 *
 * @author Ganggayaksa
 */
import java.util.Scanner;
public class If_ElseIf {


    public static void main(String[] args) {
        String kondisi; 
        Scanner input = new Scanner (System.in);
        
        int nilai;
        System.out.print(" Masukkan Nilai   :   " );
        nilai=input.nextInt();
        
        if (nilai>=90){
            System.out.println("Sangat Baik");
        }else if (nilai>=80){
            System.out.println("Baik");
        }else if (nilai>=70){
            System.out.println("Cukup");
        }else if (nilai>=60){
            System.out.println("Kurang");
        }else if (nilai<=50){
            System.out.println("Yookk, Sana Belajar Lagi!!!");
        }
     }
}     
 
    
    

