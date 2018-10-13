/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author Togyi
 */
public class Orarend {
    private String nap;
   private Ora [] t;
   private int számláló;

    public Orarend(String nap) {
        this.nap = nap;
        this.számláló=0;
        this.t=new Ora[12];
        
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getT() {
        return t;
    }

    public void setT(Ora[] t) {
        this.t = t;
    }

    public int getSzámláló() {
        return számláló;
    }

    public void setSzámláló(int számláló) {
        this.számláló = számláló;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", óraszám=" + számláló + '}';
    }
    
    
    public boolean oratHozzaad(Ora or){
        
        if(számláló>=12){
            return false;
        }
        
        for(int i=0;i<this.számláló;i++){
            if(this.t[i].getKezdet()==or.getKezdet()){
                return false;
            }
        }
        
        this.t[this.számláló]=or;
        this.számláló++;
        
        return true;
        
        
    }
    
     public void kiirat(){
    	System.out.println(this);
    	for (int i =0; i<this.számláló; i++) {
    		System.out.println(this.t[i]);
    	}
    }
}
