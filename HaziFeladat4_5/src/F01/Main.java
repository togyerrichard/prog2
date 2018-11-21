/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F01;

/**
 *
 * @author Togyi
 */
public class Main {
    
     public static Aszu[] puttony(Bor [] b){                
        int szamol=0;
        for(int i=0;i<b.length;i++){                
            if(b[i] instanceof Aszu) {                      
                Aszu a=(Aszu) b[i];                         
                if(a.getPuttonySzam()==5) {
                    szamol++;                                
                }
            }
        }
        
        Aszu[] vissza=new Aszu [szamol];                     
        int index=0;                                        
        for(int i=0;i<b.length;i++){
            if(b[i] instanceof Aszu) {
                Aszu a=(Aszu) b[i];
                if(a.getPuttonySzam()==5) {
                    vissza[index]=a;                        
                    index++;                                
                }
            }     
        }
        return vissza;

    }
    
    
    public static void main(String[] args) {
        
        Bor [] bor=new Bor []{
            new Bor("fehér","5 hold","édes",10),
            new Bor("fehér","5 hold","édes",12),
            new Bor("vörös","10 hold","száraz",15),
            new Bor("vörös","15 hold","száraz",10),
            new Aszu(9,"22 hold",6),
            new Aszu(6,"15 hold",7),
            new Aszu(4,"15 hold",5)

    };
    
            Aszu[] tomb=puttony(bor);                      
            for (Aszu a : tomb) {
                System.out.println(a);
        }

        
    }
    
   
}

