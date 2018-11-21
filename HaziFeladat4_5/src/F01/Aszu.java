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
public class Aszu extends Bor {
    
    private int puttonySzam;

    public Aszu(int puttonySzam, String termoTerulet, double alkoholTartalom) {
        super(null, termoTerulet, null, alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }
            
    public int hanyPuttonyos(){
        return puttonySzam;
        
    }

    public int getPuttonySzam() {
        return puttonySzam;
    }

    public void setPuttonySzam(int puttonySzam) {
        this.puttonySzam = puttonySzam;
    }
    
       
    @Override
    public String toString() {
        return "puttonySzam: " + puttonySzam;
    }
    
    
    
}