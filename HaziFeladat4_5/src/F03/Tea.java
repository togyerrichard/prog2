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
public class Tea implements Rendezheto<Tea> {   
    public String név;   
    public int ár;   
    
    
    public Tea(String s,int j) {    
        név=s;    
        ár=j;    
    } 

    @Override
    public boolean egyenlo(Tea o) {
        if(this.ár==o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        if(this.ár>o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean kisebbMint(Tea o) {
        if(this.ár<o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

   
} 