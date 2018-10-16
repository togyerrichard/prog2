/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elso;

/**
 *
 * @author Togyi
 */
public class Teszt {
    public static Katona megkuzd(Katona k1,Katona k2) {
            
        Katona win=new Katona();
            if(k1.getTámadóerő()> k2.getVédőerő()) {
                
                win=k1;
            }   
            else if(k2.getTámadóerő()> k1.getVédőerő()) {
                
                win=k2;
            }
            else if(k1.getTámadóerő()== k2.getTámadóerő()) {
                
                win=k1;
            }
            
            
        return win;
    }
    
    
    public static void main(String[] args) {
        
      Nyilas k1=new Nyilas(85,49,43);
      Nyilas k2=new Nyilas(66,55,44);
      Lándzsás k3=new Lándzsás(91,72);
        
        
        System.out.println("Csatázik: "+k1+", "+k2);
        Katona winner=megkuzd(k1,k2);
        System.out.println("Nyertes: "+ winner);
        
        System.out.println("Csatázik: "+winner+", "+k3);
        Katona winner2=megkuzd(winner,k3);
        System.out.println("Túlélte: "+ winner2);
            
    }
}
