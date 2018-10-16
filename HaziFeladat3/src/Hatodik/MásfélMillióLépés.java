/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatodik;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Togyi
 */
public class MásfélMillióLépés {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        Turista[] tömb = new Turista[db];
        
        for(int i=0; i<tömb.length; ++i) {
            String[] sor = sc.nextLine().split(";");
           
            tömb[i] = new Turista(sor[0], sor[1]);
        }
        
        Arrays.sort(tömb);
        
        for (Turista t : tömb){
            System.out.println(t);
        }
    }
}

