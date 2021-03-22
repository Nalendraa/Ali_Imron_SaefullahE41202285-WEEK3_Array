/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

/**
 *
 * @author GanggayaksaMarket
 */
import java.util.Scanner;

public class Kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int purchase, discount, payment;
        String card;
        Scanner scan = new Scanner(System.in);
        
        // input
        System.out.print ("Is there a member card:  ");
        card = scan.nextLine();
        System.out.print("Total Payment:    ");
        purchase = scan.nextInt();
        
        // proses
        if (card.equalsIgnoreCase ("yes") ) {
            if (purchase > 500000) {
                discount = 34700;
             } else if (purchase > 350000) {
                 discount = 21200;
             } else {
                 discount = 0;
            }
            
            
        } else {
            if (purchase > 350000) {
                discount = 7000;
            } else {
                discount = 0;
            }
        }
            // total has to be paid
            payment = purchase - discount;
            
            //output
            System.out.println ("Total Payment: $ " + payment );
        
    }
    
}
