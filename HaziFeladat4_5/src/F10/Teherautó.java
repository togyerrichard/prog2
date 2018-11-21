/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F10;

/**
 *
 * @author Togyi
 */
public class Teherautó extends Autó{

    private int teherbírás;
    
    public Teherautó(String rendszám, int teljesítmény, boolean automata,int teherbírás) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás=teherbírás;
        
    }

    public int getTeherbírás() {
        return teherbírás;
    }

    public void setTeherbírás(int teherbírás) {
        this.teherbírás = teherbírás;
    }
    

    @Override
    public String toString() {
        return  "Teherautó: "+"Rendszám: "+ super.getRendszám()+", Teljesítmény: "+super.getTeljesítmény()+", Autómata: "+super.isAutomata()+", Teherbírás: "+ teherbírás;
    }
    
    
    
    
    
}
