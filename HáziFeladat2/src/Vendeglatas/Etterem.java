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
public class Etterem extends VendeglatoIpariEgyseg{
    private final String[] étlap;

    public Etterem(String név, int férőhelyekSzáma,String[] étlap) {
        super(név, férőhelyekSzáma, false);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return this.étlap;
    }

    @Override
   public String toString() {
        return "Étterem{" + "étlap=" + Arrays.toString(étlap) + '}';
    }
    
    
}
