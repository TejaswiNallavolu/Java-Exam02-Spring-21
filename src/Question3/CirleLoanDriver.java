/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class CirleLoanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> objectArray = new ArrayList<>();
        Circle circles = new Circle(10, 314.2, 62.85 );
        Loan loans = new Loan("Teju", 2000, 14);
        String newString = "Tejaswi Reddy Nallavolu";
        Date newDate = new Date();
        objectArray.add(circles);
        objectArray.add(loans);
        objectArray.add(newString);
        objectArray.add(newDate);

        for (Object Ntr : objectArray) {
            System.out.println(Ntr);
        }
    }

}

    