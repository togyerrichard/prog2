/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F01;

/**
 *
 * @author Togyi
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }
    
    public double mennyiAlkoholtTartalmaz(){
        return alkoholTartalom;
    }
    
    public String milyenIzu(){
        return iz;
    }

    @Override
    public String toString() {
        return "iz: " + iz + ", alkoholTartalom: " + alkoholTartalom;
    }
}
