/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F13;

/**
 *
 * @author Togyi
 */
public class OsztályPénz implements Comparable<OsztályPénz> {

    private String név;
    private int pénz;

    public OsztályPénz(String név, int pénz) {
        this.név = név;
        this.pénz = pénz;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPénz() {
        return pénz;
    }

    public void setPénz(int pénz) {
        this.pénz = pénz;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OsztályPénz)) {
            return false;
        }
        OsztályPénz o = (OsztályPénz) obj;

        return this.név.equals(o.getNév());
    }

    @Override
    public int compareTo(OsztályPénz t) {
        if (this.pénz == t.getPénz()) {
            return this.név.compareTo(t.getNév());
        } else {
            return (-1) * Integer.compare(pénz, t.getPénz());
        }
    }

    @Override
    public String toString() {
        return this.név+";"+this.pénz;
    }
    

}
