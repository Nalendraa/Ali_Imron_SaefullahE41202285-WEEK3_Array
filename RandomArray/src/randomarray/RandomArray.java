/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Current list is " + list);
            System.out.println("Add more? (y/n)");
            if (stdin.next().startsWith("y")) {
                System.out.println("Enter : ");
                list.add(stdin.next());
            } else {
                break;
            }
        } while (true);
        stdin.close();
        System.out.println("List is " + list);
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array is " + Arrays.toString(arr));
    }
    
}
