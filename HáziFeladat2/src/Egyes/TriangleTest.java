/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egyes;

/**
 *
 * @author Togyi
 */
public class TriangleTest {
    public static void main(String[] args) {
        Triangle haromszog=new Triangle(2.0,3.0,3.0);
        haromszog.setColor("yellow");
        System.out.println("Terület: "+haromszog.getArea());
        System.out.println("Kerület "+haromszog.getPerimeter());
        System.out.println("Színe "+haromszog.getColor());
        System.out.println("Ki van-e töltve? " + haromszog.isFilled());
    }
}
