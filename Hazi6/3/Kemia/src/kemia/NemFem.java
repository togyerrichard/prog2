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
public class NemFem extends KemiaiElem{
    
    public NemFem(String vegyjel, int rendszám, int főcsoport) {
        super(vegyjel, rendszám, főcsoport);
    }
    
    public boolean reakcioKepes(KemiaiElem k){
        return true;
    }
}