/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F06;

import java.util.Random;

/**
 *
 * @author Togyi
 */
public class Hallgato {

    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    

    public Dolgozat dolgozatotIr() {
        int pontszam=0;
        Dolgozat d=new Dolgozat(pontszam);
       
        
        if (sokatTanul == true) {
            Random rnd = new Random();
            int a = rnd.nextInt(4) + 4;
            d.setPontszam(a * this.mennyitKeszult);
            return d;
        }
        if (sokatTanul == false) {
            Random rnd = new Random();
            int a = rnd.nextInt(6) + 0;
            d.setPontszam(a * this.mennyitKeszult);
            return d;
        }
         
         return d;

    }

}
