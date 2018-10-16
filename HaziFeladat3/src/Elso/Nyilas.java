/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elso;

/**
 *
 * @author Togyi
 */
public class Nyilas extends Katona{
    private int lőtáv;
   
    public Nyilas(int támadóerő, int védőerő, int lőtáv) {
        super(támadóerő, védőerő);
        this.lőtáv = lőtáv;
    }

    public Nyilas(int lőtáv) {
        this.lőtáv = lőtáv;
    }
    
    public int getLőtáv() {
        return lőtáv;
    }
    
    public int getTámadóerő() {
        return super.getTámadóerő()+ lőtáv;
    }
    
    
    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas " + "TE:"+super.getTámadóerő()+",VE:"+super.getVédőerő();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Nyilas)) {
            return false;
        }
        
        Nyilas ny=(Nyilas) obj;
        return this.getTámadóerő()==ny.getTámadóerő();
       
    }
}
