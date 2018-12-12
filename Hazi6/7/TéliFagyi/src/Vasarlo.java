
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Vasarlo {
     private String nev;
    private List<Fagyi> fagylaltok;

    public Vasarlo(String nev) {
        this.nev = nev;
        this.fagylaltok = new ArrayList<Fagyi>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Fagyi> getFagylaltok() {
        return fagylaltok;
    }

    public void setFagylaltok(List<Fagyi> fagylaltok) {
        this.fagylaltok = fagylaltok;
    }

    @Override
    public String toString() {
        return "Vasarlo{" + "nev=" + nev + ", fagylaltok=" + fagylaltok + '}';
    }
}