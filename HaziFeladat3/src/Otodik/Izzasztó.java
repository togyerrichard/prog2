/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otodik;

import java.util.Scanner;

/**
 *
 * @author Togyi
 */
public class Izzasztó {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] első=sc.nextLine().split(" ");
        
        int db=Integer.parseInt(első[0]);
        String keresendő=első[1];
        Települések[] tömb=new Települések[db];
        
        for(int i=0; i<tömb.length; ++i){
            String[] többi = sc.nextLine().split(":");
            tömb[i] = new Települések(többi[0], Integer.parseInt(többi[1]));
        }
        
        int index=-1;
        for (int i=0; i<tömb.length; ++i){
            
            if (tömb[i].név.equals(keresendő)){
                index = i;
                break;
            }
        }
        
        if(index>-1) {
            for(int i=(index+1); i<tömb.length; ++i) {
                
                if(tömb[i].hőmérséklet > tömb[index].hőmérséklet){
                    System.out.println(tömb[i]);
                }
            }
        } 
        
        else {
            System.out.println("Missing data");
        }
    }
}
