/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public enum Orchards {
    APPLE("RED"),MANGO("YELLOW"),GRAPEVINE("GREEN");
    
    private String color;
    
    private Orchards(String color){
        this.color=color;
        }

    public String getColor() {
        return color;
    }
    
}
