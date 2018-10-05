/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Test {
    public static void main(String[] args) {
        
    QuadraticEquation egy = new QuadraticEquation(-3.2, 4, 2.2);
    if (egy.getDiscriminant()>0)
        System.out.println(egy.toString());
    else if (egy.getDiscriminant()<0)
            System.out.println("The equation has no roots.");
    else
            System.out.println("Az egyenlet egyetlen gyöke: "+egy.getRoot1());
    
    QuadraticEquation ketto = new QuadraticEquation(-3.2, 4, 2.2);
    if (ketto.getDiscriminant()>0)
        System.out.println(ketto.toString());
    else if (ketto.getDiscriminant()<0)
            System.out.println("The equation has no roots.");
    else
            System.out.println("Az egyenlet egyetlen gyöke: "+ketto.getRoot1());
    
    QuadraticEquation harom = new QuadraticEquation(3.5, 3, 2.9);
    if (harom.getDiscriminant()>0)
        System.out.println(harom.toString());
    else if (harom.getDiscriminant()<0)
            System.out.println("The equation has no roots.");
    else
            System.out.println("Az egyenlet egyetlen gyöke: "+harom.getRoot1());
    }
}
