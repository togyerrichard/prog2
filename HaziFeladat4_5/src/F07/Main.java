/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F07;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Togyi
 */
public class Main {

    public static List<Lakohaz> számol(List<Lakohaz> lista, double térfogat) {
        List<Lakohaz> eredmeny = new ArrayList();

        for (Lakohaz i : lista) {
            if (i.légköbméter() > térfogat) {
                eredmeny.add(i);
            }
        }
        return eredmeny;
    }

    public static void main(String[] args) {
        List<Lakohaz> li = new ArrayList();

        li.add(new Lakohaz("Egy", 28, 16.5));
        li.add(new Lakohaz("Ketto", 55, 10.2));
        li.add(new Lakohaz("Harom", 50, 100));
        li.add(new Lakohaz("Negy", 42, 69.9));

        List<Lakohaz> l2 = számol(li, 4500);
        Collections.sort(l2);
        for (Lakohaz i : l2) {
            System.out.println(i);
        }

    }

}
