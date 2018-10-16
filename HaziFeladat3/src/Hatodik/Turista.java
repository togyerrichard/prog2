/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatodik;

/**
 *
 * @author Togyi
 */
public class Turista implements Comparable<Turista> {
    
    private String név;
    private int kék;
    private int helyi;

    public Turista(String név, String útvonal) {
        this.név=név;
        char[] út=útvonal.toCharArray();
        this.kék=0;
        this.helyi=0;
        
        for (int i=0; i<út.length; ++i){
            
            switch(út[i]) {
                case 'K':
                    ++this.kék;
                    break;
                    
                case 'P':
                case 'S':
                case 'Z':
                    ++this.helyi;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return név;
    }

    @Override
    public int compareTo(Turista t) {
        int különbség=t.kék-this.kék;
        if(különbség!=0) {
            return különbség;
        }
        
        különbség=t.helyi-this.helyi;
        
        if(különbség!=0) {
            return különbség;
        }
        
        System.out.println("\n");
        return this.név.compareTo(t.név);
    }

}