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
public class Loan {

    private String name;
    private double amount;
    private double APR;

    public Loan(String name, double amount, double APR) {
        this.name = name;
        this.amount = amount;
        this.APR = APR;
    }

    @Override
    public String toString() {
    return "The Mr/Ms" + name + " has applied for a loan of amount $ " + amount
                + "and the Annual Payment Rate is  "
                + APR + "%";
    }

}
