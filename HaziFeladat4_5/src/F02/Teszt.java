/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F02;

/**
 *
 * @author Togyi
 */
public class Teszt {
    
    public static void main(String[] args) {
       
        Ital [] ital=new Ital [] {
                new Ital("Ice Tea","0.5",250),
                new Ital("Narancs","0.4",340),
                new Ital("Alma","0.4",340),
                new SzeszesItal("Sör", "0.5", 450, 5),
                new SzeszesItal("Bor", "0.7", 2700, 11),
                new SzeszesItal("Cooler", "0.6", 880, 7),
                new SzeszesItal("Jager", "0.05", 700, 40),
                new SzeszesItal("Palinka", "0.05", 990, 52),
                new SzeszesItal("Whiskey", "0.05", 600, 39)
            
        };
        
        
        SzeszesItal [] t=Dolgozat.metodus(ital);
        for (SzeszesItal a : t) {
            System.out.println(a);    
        }
    }
   
}
    