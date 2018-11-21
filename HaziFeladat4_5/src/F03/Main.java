/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F03;

/**
 *
 * @author Togyi
 */
public class Main {
    
    public static void main(String[] args) {
        
        Tea k=new Tea("Egy",400);
        Tea l=new Tea("Ketto", 300);
        
        if(k.egyenlo(l)) {
            System.out.println("Egyenlő");
        }
        if(k.kisebbMint(l)){
            System.out.println("Kisebb");
        }
        if(k.nagyobbMint(l)) {
            System.out.println("Nagyobb");
        }
        
    }
    
}