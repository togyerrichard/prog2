
import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static sun.nio.cs.Surrogate.is;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Teszt {
    public static void main(String[] args) {
      //Sokszöges feladat
        RegularPolygon egyes = new RegularPolygon();
        RegularPolygon kettes = new RegularPolygon(6,4);
        RegularPolygon harmas = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(egyes.toString());
        System.out.println(kettes.toString());
        System.out.println(harmas.toString());
      //Téglalapos feladat
        Rectangle ötös = new Rectangle(4,40);
        Rectangle hatos = new Rectangle(3.5,35.9);
        System.out.println(ötös.toString());
        System.out.println(hatos.toString());
      //2x2-es lineáris egyenletrendszer
        LinearEquation hetes= new LinearEquation(0, 0, 0, 0, 0, 0);
        LinearEquation nyolcas= new LinearEquation(2, 3, 4, 5, 6, 7);
        LinearEquation kilences= new LinearEquation(6, -3.4, 2, 5.1, -6, -7);
        if (hetes.isSolvable()) {
            System.out.println("x: "+hetes.getX() +",y: "+hetes.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
        if (nyolcas.isSolvable()) {
            System.out.println("x: "+nyolcas.getX() +",y: "+nyolcas.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
        if (kilences.isSolvable()) {
            System.out.println("x: "+kilences.getX() +",y: "+kilences.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
