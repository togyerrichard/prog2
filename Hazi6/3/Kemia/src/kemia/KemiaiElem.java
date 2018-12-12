/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

/**
 *
 * @author Togyi
 */
public class KemiaiElem implements ReakcioKepes {

    private String vegyjel;
    private int rendszám;
    private int főcsoport;
    
    public KemiaiElem(String vegyjel, int rendszám, int főcsoport) {
        this.vegyjel = vegyjel;
        this.rendszám = rendszám;
        this.főcsoport = főcsoport;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public int getRendszám() {
        return rendszám;
    }

    public void setRendszám(int rendszam) {
        this.rendszám = rendszám;
    }

    public int getFőcsoport() {
        return főcsoport;
    }

    public void setFőcsoport(int főcsoport) {
        this.főcsoport = főcsoport;
    }

    @Override
    public boolean reakciobaLephet() {
        return true;
    }

    @Override
    public boolean reakciobaLephet(ReakcioKepes o) {
        return false;
    }
    
    
    
}
