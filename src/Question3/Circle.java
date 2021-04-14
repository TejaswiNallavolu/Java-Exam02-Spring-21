/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Circle {
    private double radius;
    private double area;
    private double circumference;

    public Circle(double radius, double area,double circumference) {
        this.radius = radius;
        this.area = area;
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return "Circle is of radius "+ radius+ " and it has an area of "+ 
                area  + " and it's circumference is "+ circumference;
    }
    
    
}


