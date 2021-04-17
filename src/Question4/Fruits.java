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
public class Fruits {
   private boolean rotten;  
   private String ripen;

    public Fruits(boolean rotten, String ripen) {
        this.rotten = rotten;
        this.ripen = ripen;
       
    }

    public boolean isRotten() {
        return rotten;
    }

    public String isRipen() {
        return ripen;
    }
    

    public void setRipen(String ripen) {
        this.ripen = ripen;
    }
   
  
   public void setRotten(boolean hasRotted) {
       rotten = hasRotted;
   }

    @Override
    public String toString() {
         System.out.println("Some of the known facts about fruits: ");
        return "It is "+rotten+ " that fruits which are extremely "+ isRipen() +" are rotted & Also"; 
    }
   
} 

