/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Togyi
 */
public class BudapestKupa1 {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int db=Integer.parseInt(sc.nextLine());
        
        int össztáv;
        int k=0;
        
        Túra[] túrák=new Túra[db];
        
        for (int i=0; i<túrák.length; ++i){
            össztáv = 0;
            String[] sor=sc.nextLine().split(";");
            túrák[i] = new Túra(Integer.parseInt(sor[0]),
            Integer.parseInt(sor[1]), Integer.parseInt(sor[2]), sor[3]);
            
            for(int j=4; j<sor.length; ++j){
                össztáv += Integer.parseInt(sor[j]);
            }
            
            túrák[i].táv=össztáv;
        }
        
        Arrays.sort(túrák);
        
        while((k<túrák.length) && (túrák[k].táv==túrák[0].táv)){
            System.out.printf("%d;%02d;%02d;%s\n", túrák[k].év, túrák[k].hónap,túrák[k].nap, túrák[k].név);
            ++k;
        }
    }
}
