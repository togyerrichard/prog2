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
public class Lándzsás extends Katona{
    public Lándzsás(int támadóerő, int védőerő) {
        super(támadóerő, védőerő);
    }

    @Override
    public String toString() {
        return "Lándzsás " + "TE:"+super.getTámadóerő()+",VE:"+super.getVédőerő();
    }
}
