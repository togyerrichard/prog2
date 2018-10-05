/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Main {
    public static void main(String[] args) {
      //1. feladat
        Pont a = new Pont(2,4);
        Pont b = new Pont(3,5);
        Pont c = new Pont(6,8);
        Pont d = new Pont(7,9);
        a.setY(a.getY()+5);
        b.setY(b.getY()+5);
        c.setX(c.getX()-3.4);
        d.setX(d.getX()-3.4);
        System.out.println(+a.getY());
        System.out.println(+b.getY());
        System.out.println(+c.getX());
        System.out.println(+d.getX());
      //1. feladat vége
        
    }

  
    
}
