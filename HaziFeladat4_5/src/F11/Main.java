/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F11;

import java.util.Scanner;

/**
 *
 * @author Togyi
 */
public class Main {
    

    public static void main(String[] args) {
        Személy sz = new Személy("Egyeske", 22, false);
        System.out.println(sz+"\n");
        Hallgató h=new Hallgató("Ketteske", 29, true, 3);
        System.out.println(h.joE());

        Scanner sc = new Scanner(System.in);
        Személy[] személy=new Személy[4];
        for(int i=0;i<2;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            személy[i]=new Hallgató(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), Double.parseDouble(st[3]));
        }
        for(int i=2;i<4;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            személy[i]=new Oktató(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), st[3]);
        }
                
        for(Személy i:személy){
            System.out.println(i);
        }
    }
}
