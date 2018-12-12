/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
import java.util.Objects;

public class Tartos{

    private String kezdo;
    private String nev;
    private int egysegar;
    private String megyseg;
    private int mennyiseg;
    
    public Tartos(String kezdo, String nev, int egysegar, String megyseg, int mennyiseg) {
        this.kezdo = kezdo;
        this.nev = nev;
        this.egysegar = egysegar;
        this.megyseg = megyseg;
        this.mennyiseg = mennyiseg;
    }

    public String getKezdo() {
        return kezdo;
    }
    
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getEgysegar() {
        return egysegar;
    }

    public void setEgysegar(int egysegar) {
        this.egysegar = egysegar;
    }

    public String getMegyseg() {
        return megyseg;
    }

    public void setMegyseg(String megyseg) {
        this.megyseg = megyseg;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Tartos))
            return false;
        
        Tartos t = (Tartos) obj;
        
        return this.nev.equals(t.getNev()) && this.egysegar==t.getEgysegar();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.kezdo).append("helloka").append(this.nev).append(";").append(this.egysegar).append(";").append(this.megyseg).append(";");
        sb.append(this.mennyiseg);
        return sb.toString();
    }
}