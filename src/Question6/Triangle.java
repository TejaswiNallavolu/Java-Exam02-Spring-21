/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Triangle extends GeometricObject {
     private double s1;
    private double s2;
    private double s3;
    private boolean filledOrNot;
    private String color;

    public Triangle(double s1, double s2, double s3,
            boolean isFilled, String triangleColor) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.filledOrNot = filledOrNot;
        this.color = color;
    }

    double perimeter() {
        return this.s1 + this.s2 + this.s3;
    }

    double area() {
        double s = this.perimeter() / 2;
        return Math.sqrt(Math.abs(s * (s - s1)
                * (s - s2) * (s - s3)));
    }

    @Override
    public String toString() {
        return "Triangle properties: \nArea is "
                + Math.round(this.area() * 100) / 100.0
                + "\nPerimeter is " + this.perimeter()
                + "\nThe Triangle is "
                + (filledOrNot ? "Filled" : "Not Filled ")
                + "\nTriangle Color is " + color;
    }


}
