/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

/**
 *
 * @author Togyi
 */
public class NemesGaz extends KemiaiElem {
    
    public NemesGaz(String vegyjel, int rendszám, int főcsoport) {
        super(vegyjel, rendszám, főcsoport);
        
        try{
            if(super.getFőcsoport()==8);
        
        }catch(Exception e){
            
        }
    }
    
    public boolean reakcioKepes(KemiaiElem k){
       if(super.getFőcsoport()+k.getFőcsoport()%8==0)
           return true;
       
       else{
           return false;
       }
    }
    
}
