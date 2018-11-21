/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F02;

/**
 *
 * @author Togyi
 */
public class SzeszesItal extends Ital{
    
    private double alkoholTartalom;
    
    public SzeszesItal(String név, String kiszerelés, int ár, double alkoholTartalom) {       
        super(név,kiszerelés,ár);
        this.alkoholTartalom=alkoholTartalom;
    }
   

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public void setAlkoholTartalom(double alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }
    
    

        @Override
    public String toString() {
        return  alkoholTartalom+"% alkoholtartalmú "+név+", " +kiszerelés+" l, "+ár+" Ft";
    }


}
