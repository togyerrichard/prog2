/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendeglatas;

/**
 *
 * @author Togyi
 */
public class VendeglatoIpariEgyseg {
    private String név;
    private int férőhelyekSzáma;
    private boolean dohányzó;

    public VendeglatoIpariEgyseg(String név, int férőhelyekSzáma, boolean dohányzó) {
        this.név = név;
        this.férőhelyekSzáma = férőhelyekSzáma;
        this.dohányzó = dohányzó;
    }

    public String getNév() {
        return this.név;
    }

    public int getFérőhelyekSzáma() {
        return this.férőhelyekSzáma;
    }

    public void setDohányzó(boolean dohányzó) {
        this.dohányzó = dohányzó;
    }

    @Override
    public String toString() {
        return "VendeglatoIpariEgyseg{" + "n\u00e9v=" + név + ", f\u00e9r\u0151helyekSz\u00e1ma=" + férőhelyekSzáma + ", doh\u00e1nyz\u00f3=" + dohányzó + '}';
    }
    
    public boolean isDohányzó(){
        return this.dohányzó;
    }

    
}
