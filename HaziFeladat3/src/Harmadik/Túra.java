/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik;

/**
 *
 * @author Togyi
 */
public class Túra implements Comparable<Túra>{

    public int év;
    public int hónap;
    public int nap;
    public int táv;
    public String név;

    public Túra(int év, int hónap, int nap, String név){
        this.év=év;
        this.hónap=hónap;
        this.nap=nap;
        this.név=név;
    }

    @Override
    public int compareTo(Túra t){
        int különbség=t.táv-this.táv;
        
        if (különbség!=0) {
            return különbség;
        }
        
        különbség=this.év-t.év;
        if (különbség !=0) {
            return különbség;
        }
        
        különbség=this.hónap-t.hónap;
        if (különbség !=0) {
            return különbség;
        }
        
        különbség=this.nap-t.nap;
        if (különbség !=0) {
            return különbség;
        }
        
        System.out.println("\n");
        
        különbség=this.név.compareTo(t.név);
        
        return különbség;
    }
}
