/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F12;

/**
 *
 * @author Togyi
 */
public class KaracsonyiHozzavalok implements Comparable<KaracsonyiHozzavalok>{
    private String termékNév;
    private int mennyiség;
    private int ömenny;

    public KaracsonyiHozzavalok(String termékNév, int mennyiség) {
        this.termékNév = termékNév;
        this.mennyiség = mennyiség;
    }

    public String getTermékNév() {
        return termékNév;
    }

    public void setTermékNév(String termékNév) {
        this.termékNév = termékNév;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public int getÖmenny() {
        return ömenny;
    }
    

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    public void setÖmenny(int ömenny) {
        this.ömenny = ömenny;
    }

    @Override
    public String toString() {
        return this.termékNév+";"+this.mennyiség;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof KaracsonyiHozzavalok)){
            return false;
        }
        
        KaracsonyiHozzavalok h=(KaracsonyiHozzavalok)obj;
        
        return this.termékNév.equals(h.getMennyiség());
    }

    @Override
    public int compareTo(KaracsonyiHozzavalok t) {
        
        if(this.mennyiség==t.getMennyiség()){
            return this.termékNév.compareTo(t.getTermékNév());
        }else{
            return (-1)*Integer.compare(mennyiség, t.getMennyiség());
        }
        
        
    }

  
    
    
    
    
    
    
}
