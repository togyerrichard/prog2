/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Objects;

/**
 *
 * @author Togyi
 */
public class Ora {
    private int kód;
    private String név;
    private int kezdet;
    
    public Ora(int kód, String név, int kezdet) {
        this.kód = kód;
        this.név = név;
        this.kezdet = kezdet;
        if(kezdet<8){
            this.kezdet=8;
        }
        if(kezdet>19){
            this.kezdet=19;
        }
    }

    public int getKód() {
        return kód;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "kód: " + kód + " név: " + név + " kezdet: " + kezdet;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ora other = (Ora) obj;
        if (this.kód != other.kód) {
            return false;
        }
        if (this.kezdet != other.kezdet) {
            return false;
        }
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        return true;
    }
}