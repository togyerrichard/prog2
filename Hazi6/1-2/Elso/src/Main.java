/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        List<Tartos> li = new ArrayList<>();
        List<Tartos> li2 = new ArrayList<>();
        
        try {
            
            FileReader fr = new FileReader(new File("be.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            
            while((sor=br.readLine())!=null) {
                String[] st = sor.split(";");
                
            if(st.length>5) {
                Elelmiszer e1 = new Elelmiszer(st[0],st[1],Integer.parseInt(st[2]),st[3],Integer.parseInt(st[4]),Integer.parseInt(st[5]));
                li.add(e1);
            }else {
                Tartos t1 = new Tartos(st[0],st[1],Integer.parseInt(st[2]),st[3],Integer.parseInt(st[4]));
                li.add(t1);
            }
            }
          br.close();  
        }catch(IOException e) {
            System.out.println("File hiba!");
        }
        
       /* try {
            FileWriter fw = new FileWriter(new File("ki.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String[] tmp = a.split(";");
            
            if(tmp.length>5) {
                Elelmiszer e2 = new Elelmiszer(tmp[0],tmp[1],Integer.parseInt(tmp[2]),tmp[3],Integer.parseInt(tmp[4]),Integer.parseInt(tmp[5]));    
                for(int i=0;i<li.size();i++) 
                    if(li.get(i).equals(e2))
                        li.get(i).setMennyiseg(li.get(i).getMennyiseg()+1);
                else
                        li.add(e2);
                
            }else {
                Tartos t2 = new Tartos(tmp[0],tmp[1],Integer.parseInt(tmp[2]),tmp[3],Integer.parseInt(tmp[4]));    
                for(int i=0;i<li.size();i++) 
                    if(li.get(i).equals(t2))
                        li.get(i).setMennyiseg(li.get(i).getMennyiseg()+1);
                else
                        li.add(t2);
            }
            bw.close();
        }catch(IOException e) {
            System.out.println("mmm");
        }
        */
        try {
            FileWriter fw = new FileWriter(new File("ki.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(Tartos i:li) {
                bw.write(i.toString());
                bw.newLine();
            }
        bw.close();
        }catch(IOException e) {
            System.out.println("File hiba!");
        }
        
        
        
    } 
}