/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Elelmiszer extends Tartos{

    private int szavatossag;

    public Elelmiszer(String kezdo, String nev, int egysegar, String megyseg, int szavatossag, int mennyiseg) {
        super(kezdo, nev, egysegar, megyseg, mennyiseg);
        this.szavatossag = szavatossag;
    }
    
    public int getSzavatossag() {
        return szavatossag;
    }

    public void setSzavatossag(int szavatossag) {
        this.szavatossag = szavatossag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getKezdo()).append(";").append(super.getNev()).append(";").append(super.getEgysegar()).append(";").append(super.getMegyseg()).append(";");
        sb.append(this.szavatossag).append(";").append(super.getMennyiseg());
        return sb.toString();
    }
}