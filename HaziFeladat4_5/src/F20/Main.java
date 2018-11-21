/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Togyi
 */
public class Main {
    public static void main(String[] args) {
         List<Színész> sz= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        //addig olvasson amíg nem olvasok üres sort
        while(sor.length()>0){
            String[] d=sor.split("[:(),]");
            for(int i=3;i<d.length;i++){
                Színész szn = new Színész(d[i]);
                if(sz.contains(szn)){
                    sz.get(sz.indexOf(szn)).getFilm().add(new Film(d[0],Integer.parseInt(d[1])));
                    
                } else {
                    szn.getFilm().add(new Film(d[0],Integer.parseInt(d[1])));
                    sz.add(szn);
                }
            }
            sor=sc.nextLine();
        }
        Collections.sort(sz);
        for(Színész i:sz){
            System.out.println(i);
        }
    }
}
