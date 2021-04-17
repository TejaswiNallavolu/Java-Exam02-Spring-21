/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class PineApple extends Fruits {
    private boolean wormsArePresent;  

    public PineApple(boolean wormsArePresent, boolean rotten, String ripen) {
        super(rotten, ripen);
        this.wormsArePresent = wormsArePresent;
    }
    
    @Override
    public String toString() {
        System.out.println("PineApple is my favourite fruit");
        return super.toString() +" It is "+ wormsArePresent + " that fruits which have worms are rotten";
     
    }

    
}