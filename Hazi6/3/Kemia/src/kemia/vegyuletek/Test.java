/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia.vegyuletek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Togyi
 */
public class Test {
   
    public static void main(String[] args) {
         List<Vegyulet> v = new ArrayList<>();
         String[] Nemesgazok={"He","Ar","Kr","Xe","Rn"};
        
         try{
            FileReader fr=new FileReader(new File("sample1.txt"));
            BufferedReader br=new BufferedReader(fr);
            
            String sor;
            
            while((sor=br.readLine())!=null){
            
                String[] tmp=sor.split("\t");
           
                if(tmp[tmp.length-3].equals(Nemesgazok)){
                    kemia.NemesGaz g= new kemia.NemesGaz(tmp[tmp.length-3],Integer.parseInt(tmp[tmp.length-2]),Integer.parseInt(tmp[tmp.length-1]));
                }

            
            }
    }catch(IOException e){
            System.out.println("File Hiba!");
            }}
}
    

