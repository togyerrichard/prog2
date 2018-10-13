/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendeglatas;

import java.util.Arrays;

/**
 *
 * @author Togyi
 */
public class Kocsma extends VendeglatoIpariEgyseg{
    private final String[] sörlap;

    public Kocsma(String név, int férőhelyekSzáma, String sörlap[]) {
        super(név, férőhelyekSzáma, true);
        this.sörlap = sörlap;
    }

    public String[] getSörlap() {
        return this.sörlap;
    }

    @Override
    public String toString() {
        return super.toString()+"Kocsma"+Arrays.toString(sörlap);
    }
    
    
}
