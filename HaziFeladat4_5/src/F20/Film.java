/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F20;

/**
 *
 * @author Togyi
 */
public class Film implements Comparable<Film>{
    private String cím;
    private int évszám;

    public Film(String cím, int évszám) {
        this.cím = cím;
        this.évszám = évszám;
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public int getÉvszám() {
        return évszám;
    }

    public void setÉvszám(int évszám) {
        this.évszám = évszám;
    }

    @Override
    public int compareTo(Film t) {
        if(this.évszám==t.getÉvszám()){
            return this.cím.compareTo(t.getCím());
        }else{
            return Integer.compare(this.évszám, t.getÉvszám());
        }
    }

    @Override
    public String toString() {
       return évszám+": "+cím;
        
    }
    
    
    
    
}
