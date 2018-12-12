/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Posta implements Comparable{

    private String címzett_neve;
    private int irányítószám;
    private String település;
    private String utca;
    private int házszám;
    private int csomag_értéke;

    public Posta(String címzett_neve, int irányítószám, String település, String utca, int házszám, int csomag_értéke) {
        this.címzett_neve = címzett_neve;
        this.irányítószám = irányítószám;
        this.település = település;
        this.utca = utca;
        this.házszám = házszám;
        this.csomag_értéke = csomag_értéke;
    }

    public String getCímzett_neve() {
        return címzett_neve;
    }

    public void setCímzett_neve(String címzett_neve) {
        this.címzett_neve = címzett_neve;
    }

    public int getIrányítószám() {
        return irányítószám;
    }

    public void setIrányítószám(int irányítószám) {
        this.irányítószám = irányítószám;
    }

    public String getTelepülés() {
        return település;
    }

    public void setTelepülés(String település) {
        this.település = település;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getHázszám() {
        return házszám;
    }

    public void setHázszám(int házszám) {
        this.házszám = házszám;
    }

    public int getCsomag_értéke() {
        return csomag_értéke;
    }

    public void setCsomag_értéke(int csomag_értéke) {
        this.csomag_értéke = csomag_értéke;
    }

  
    @Override
    public String toString(){
        return this.getTelepülés() + ", " + this.getUtca() + " " + this.getHázszám() + "., " + this.getCímzett_neve() + ", " + this.getCsomag_értéke() + " Ft";
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Posta)){
            return false;
        }
        
        Posta p = (Posta) obj;
        
        return this.getCímzett_neve().equals(p.getCímzett_neve()) && this.getIrányítószám() == p.getIrányítószám() && this.getTelepülés().equals(p.getTelepülés()) && this.getUtca().equals(p.getUtca()) && this.getHázszám() == p.getHázszám() && this.getCsomag_értéke() == p.getCsomag_értéke();
    }
    
    @Override
    public int compareTo(Object obj){
        Posta p = (Posta) obj;
        
        if (this.getTelepülés().equals(p.getTelepülés())){
            
            if (this.getUtca().equals(p.getUtca())){
                
                if (this.getHázszám() == (p.getHázszám())){
             
                    if (this.getCímzett_neve().equals(p.getCímzett_neve())){
                        return -1 * (Integer.compare(this.getCsomag_értéke(),p.getCsomag_értéke()));
                    } 
        else {
              return this.getCímzett_neve().compareTo(p.getCímzett_neve());
                    }
                    
            } else {
                    return Integer.compare(this.getHázszám(), p.getHázszám());
                }
                
                } else {
                        return this.getUtca().compareTo(p.getUtca());
            }
            
                    } else {
                            return this.getTelepülés().compareTo(p.getTelepülés());
        }
    }
    
}
