/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F21;

/**
 *
 * @author Togyi
 */
public class Színész implements Comparable<Színész> {

    private String név;
    private int szülD;

    public Színész(String név, int szülD) {
        this.név = név;
        this.szülD = szülD;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getSzülD() {
        return szülD;
    }

    public void setSzülD(int szülD) {
        this.szülD = szülD;
    }

    @Override
    public int compareTo(Színész t) {
        if (this.szülD == this.szülD) {
            return this.név.compareTo(t.getNév());
        } else {
            return Integer.compare(this.szülD, t.getSzülD());
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Színész)){
            return false;
        }
        Színész sz =(Színész)obj;
        
        return this.név.equals(sz.getNév()) && this.szülD==sz.getSzülD();
    }
    

    @Override
    public String toString() {
        return this.szülD + ": " + this.név;
    }

}
