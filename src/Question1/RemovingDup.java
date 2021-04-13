/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class RemovingDup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        ArrayList<Integer> proposedArray = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            proposedArray.add(scan.nextInt());
        }
        removeDuplicate(proposedArray);

    }
    
    public static void removeDuplicate(ArrayList<Integer> myList) {
        ArrayList<Integer> finalArray = new ArrayList<>();
        for (Integer no : myList) {
            if (!(finalArray.contains(no))) {
                finalArray.add(no);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer uniq : finalArray) {
            System.out.print(uniq + " ");
        }
    }
    
    
    
}
