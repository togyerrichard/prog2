
import Vendeglatas.Etterem;
import Vendeglatas.Kocsma;
import Vendeglatas.VendeglatoIpariEgyseg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package Vendeglatas;

/**
 *
 * @author Togyi
 */
public class Teszt {
    public static void main(String[] args) {
        VendeglatoIpariEgyseg[] t= new VendeglatoIpariEgyseg[]{
            new Etterem("Étterem1", 100, new String[]{"Pörkölt","Krémes"}),
            new Etterem("Étterem2", 200, new String[]{"Húsleves", "Pizza"}),       
            new Etterem("Étterem3", 70, new String[]{"Töltött káposzta","Torta"}),    
            new Etterem("Étterem4", 80, new String[]{"Gulyás"}),
            new Etterem("Étterem5", 90, new String[]{"Rántotthús", "Húsleves"}),
        
            new Kocsma("Kocsma1", 56, new String[]{"Sör", "Fütyülős"}),
            new Kocsma("Kocsma2", 91, new String[]{"Sör","Vodka"}),
            new Kocsma("Kocsma3", 44, new String[]{"Gin", "Sör","Bor"}),
            new Kocsma("Kocsma4", 33, new String[]{"Rézangyal", "Rum"}),
            new Kocsma("Kocsma5", 77, new String[]{"Tequila", "Bor"})    
        };
         
      Kocsma[] kocsm= adottItaltKínálóKocsmák("Sör", t);
      
      for(Kocsma k:kocsm){
          System.out.println(k);
      }
      
    } 
    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendeglatoIpariEgyseg[] t){
        int count=0;
        
        for(int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma){
                Kocsma k=(Kocsma)t[i];
                
                for(int j=0; j<k.getSörlap().length; j++){
                    if(k.getSörlap()[j].equals(ital)){
                        count++;
                    }
                }
            }
        }

       Kocsma[] kocsma= new Kocsma[count];
       
       int db=0;
        for(int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma){
                Kocsma k=(Kocsma)t[i];
                
                for(int j=0; j<k.getSörlap().length; j++){
                    if(k.getSörlap()[j].equals(ital)){
                        kocsma[db]=k;
                        db++;
                    }
                }
            }
        }
        
        return kocsma;
        
    }
 }
