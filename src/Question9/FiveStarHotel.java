/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class FiveStarHotel implements Hotel {

    private double annualIncome;

    public FiveStarHotel(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getannualIncome() {
        return annualIncome;
    }

    public double tax() {
        return this.annualIncome * (0.11);
    }

    @Override
    public String toString() {
        return "------FiveStarHotel------\n"
                + "The yearly income is " + annualIncome + "\n"
                + "The Tax is " + tax();
    }

}
