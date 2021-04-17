/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7Example2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public enum DifferentSeasons {
    SUMMER("Climate is too hot"), WINTER("Climate is too cold"), SPRING("Daylight saving starts");
    private String Climate;

    private DifferentSeasons(String Climate) {
        this.Climate = Climate;
    }

    public String getClimate() {
        return Climate;
    }
    
}
