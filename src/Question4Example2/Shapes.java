/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4Example2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Shapes {

    private double height;
    private double width;

    public Shapes(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        System.out.println("Paramters of a Triangle");
        return "Height: " + height + " width: " + width;
    }

}
