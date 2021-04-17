/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        boolean flag = false;
        double s1 = 0, s2 = 0, s3 = 0;
        do {
            flag = false;
            System.out.print("Enter s1 of triangle: ");
            s1 = scan.nextDouble();
            System.out.print("Enter s2 of triangle: ");
            s2 = scan.nextDouble();
            System.out.print("Enter s3 of triangle: ");
            s3 = scan.nextDouble();
            if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
                System.out.println("The sum of 2 sides should be greater than "
                        + "the third side");
                flag = true;
            }
        } while (flag == true);
        Triangle triangle = new Triangle(s1, s2, s3, true, "Red");

        System.out.println(triangle);

    }
}
    

