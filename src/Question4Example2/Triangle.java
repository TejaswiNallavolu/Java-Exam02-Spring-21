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
public class Triangle extends Shapes {

    public Triangle(double height, double width) {
        super(height, width);
    }

    public double getArea() {
        return (super.getHeight() * super.getWidth()) / 2;
    }

    @Override
    public String toString() {
        System.out.println("Calculating the area of a Triangle: ");
        return super.toString() + " Area of an Triangle is: " + getArea();
    }
}
